package com.cnblogs.yjmyzz.sharding.entity.single;

import javax.persistence.*;

@Table(name = "t_demo")
public class DemoEntity {
    @Id
    @Column(name = "demo_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer demoId;

    @Column(name = "demo_name")
    private String demoName;

    /**
     * @return demo_id
     */
    public Integer getDemoId() {
        return demoId;
    }

    /**
     * @param demoId
     */
    public void setDemoId(Integer demoId) {
        this.demoId = demoId;
    }

    /**
     * @return demo_name
     */
    public String getDemoName() {
        return demoName;
    }

    /**
     * @param demoName
     */
    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }
}