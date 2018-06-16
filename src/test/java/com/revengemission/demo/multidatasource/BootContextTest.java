package com.revengemission.demo.multidatasource;

import com.revengemission.demo.multidatasource.persistence.entity.DayStat;
import com.revengemission.demo.multidatasource.persistence.entity.DayStatExample;
import com.revengemission.demo.multidatasource.persistence.entity2.MonthStat;
import com.revengemission.demo.multidatasource.persistence.mapper.DayStatMapper;
import com.revengemission.demo.multidatasource.persistence.mapper2.MonthStatMapper;
import com.github.pagehelper.PageHelper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootContextTest {

    @Autowired
    DayStatMapper dayStatMapper;

    @Autowired
    MonthStatMapper valueTableFloatMapper;

    @Test
    @Ignore
    public void testInsert() throws Exception {
        DayStat dayStat = new DayStat();
        dayStat.setValue(new BigDecimal("2.2"));
        dayStatMapper.insert(dayStat);
    }

    @Test
    @Ignore
    public void testSelectDataSource1() throws Exception {

        PageHelper.startPage(1, 10);
        List<DayStat> dayStatList = dayStatMapper.selectByExample(new DayStatExample());
        System.out.println("size " + dayStatList.size());
    }

    @Test
    @Ignore
    public void testCountDataSource1() throws Exception {
        long a = dayStatMapper.countByExample(new DayStatExample());
        System.out.println("a " + a);
    }

    @Test
    @Ignore
    public void testSelectDataSource2() throws Exception {
        String tableName = "month_stat";
        PageHelper.startPage(1, 10);
        List<MonthStat> valueTableFloatList = valueTableFloatMapper.select(tableName);
        System.out.println("size " + valueTableFloatList.size());
    }

    @Test
    @Ignore
    public void testCountDataSource2() throws Exception {

        String tableName = "month_stat";
        long a = valueTableFloatMapper.count(tableName);
        System.out.println("a " + a);
    }
}
