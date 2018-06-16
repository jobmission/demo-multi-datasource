###

## 每日统计
CREATE TABLE day_stat
(
  id            BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  value_date  DATETIME,
  value          DECIMAL(10, 2),
  tim  VARCHAR(255),
  version       INT(11)                         DEFAULT '0'
);


