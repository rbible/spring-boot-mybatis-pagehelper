-- noinspection SqlNoDataSourceInspectionForFile

DROP TABLE IF EXISTS user;

CREATE TABLE user
(
  id            BIGINT (20) NOT NULL COMMENT '主键ID',
  nick          VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
  sex           INT (11) NULL DEFAULT NULL COMMENT ' 性别',
  city          VARCHAR(50) NULL DEFAULT NULL COMMENT ' 城市',
  status        INT (11) NULL DEFAULT NULL COMMENT '状态',
  phone         VARCHAR(50) NULL DEFAULT NULL COMMENT '电话',
  avatar        VARCHAR(50) NULL DEFAULT NULL COMMENT '头像',
  create_time    Date NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (id)
);