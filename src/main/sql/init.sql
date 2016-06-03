CREATE DATABASE IF NOT EXISTS `db_0`;

CREATE TABLE IF NOT EXISTS `db_0`.`t_order_0` (
  `order_id` INT NOT NULL,
  `user_id`  INT NOT NULL,
  `status`   VARCHAR(50),
  PRIMARY KEY (`order_id`)
);

CREATE TABLE IF NOT EXISTS `db_0`.`t_order_1` (
  `order_id` INT NOT NULL,
  `user_id`  INT NOT NULL,
  `status`   VARCHAR(50),
  PRIMARY KEY (`order_id`)
);


CREATE DATABASE IF NOT EXISTS `db_1`;

CREATE TABLE IF NOT EXISTS `db_1`.`t_order_0` (
  `order_id` INT NOT NULL,
  `user_id`  INT NOT NULL,
  `status`   VARCHAR(50),
  PRIMARY KEY (`order_id`)
);

CREATE TABLE IF NOT EXISTS `db_1`.`t_order_1` (
  `order_id` INT NOT NULL,
  `user_id`  INT NOT NULL,
  `status`   VARCHAR(50),
  PRIMARY KEY (`order_id`)
);


CREATE DATABASE IF NOT EXISTS `db_2`;

CREATE TABLE IF NOT EXISTS `db_2`.`t_order_0` (
  `order_id` INT NOT NULL,
  `user_id`  INT NOT NULL,
  `status`   VARCHAR(50),
  PRIMARY KEY (`order_id`)
);

CREATE TABLE IF NOT EXISTS `db_2`.`t_order_1` (
  `order_id` INT NOT NULL,
  `user_id`  INT NOT NULL,
  `status`   VARCHAR(50),
  PRIMARY KEY (`order_id`)
);

/**
这个没啥实用,只是为了方便mybatis生成数据实体类
 */
CREATE TABLE IF NOT EXISTS `db_0`.`t_order` (
  `order_id` INT NOT NULL,
  `user_id`  INT NOT NULL,
  `status`   VARCHAR(50),
  PRIMARY KEY (`order_id`)
);
