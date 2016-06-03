package com.cnblogs.yjmyzz.sharding.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangjunming on 5/1/16.
 */
public class ListUtil {

    /**
     * 将list按元素的指定属性分拆成Map结构
     *
     * @param list
     * @param keyPropertyName
     * @param <T>
     * @return
     */
    public static <T> Map<String, List<T>> getMapByKeyProperty(List<T> list, String keyPropertyName) {
        if (list == null && list.size() <= 0) {
            return null;
        }

        Map<String, List<T>> mapResult = new HashMap<String, List<T>>();

        for (int i = 0; i < list.size(); i++) {
            T item = list.get(i);
            String key = ReflectionUtil.getFieldValue(item, keyPropertyName).toString();
            addToMap(mapResult, item, key);
        }
        return mapResult;
    }


    public static <T> Map<String, List<T>> getMapByModKeyProperty(List<T> list, String keyPropertyName, int modNumber) {
        if (list == null && list.size() <= 0) {
            return null;
        }

        Map<String, List<T>> mapResult = new HashMap<String, List<T>>();

        for (int i = 0; i < list.size(); i++) {
            T item = list.get(i);
            Long propertyValue = Long.parseLong(ReflectionUtil.getFieldValue(item, keyPropertyName).toString());
            String key = (propertyValue % modNumber) + "";
            addToMap(mapResult, item, key);
        }
        return mapResult;
    }

    private static <T> void addToMap(Map<String, List<T>> mapResult, T item, String key) {
        if (mapResult.containsKey(key)) {
            List<T> t = mapResult.get(key);
            t.add(item);
        } else {
            List<T> t = new ArrayList<T>();
            t.add(item);
            mapResult.put(key, t);
        }
    }
}
