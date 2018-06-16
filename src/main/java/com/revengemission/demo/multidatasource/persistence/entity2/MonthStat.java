package com.revengemission.demo.multidatasource.persistence.entity2;

import java.io.Serializable;
import java.util.Date;

public class MonthStat implements Serializable {
    private int id;
    private String value;
    private Date valueDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }
}
