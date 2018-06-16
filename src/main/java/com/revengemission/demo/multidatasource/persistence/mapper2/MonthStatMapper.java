package com.revengemission.demo.multidatasource.persistence.mapper2;

import com.revengemission.demo.multidatasource.persistence.entity2.MonthStat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MonthStatMapper {
    long count(@Param("tableName") String tableName);

    List<MonthStat> select(@Param("tableName") String tableName);
}