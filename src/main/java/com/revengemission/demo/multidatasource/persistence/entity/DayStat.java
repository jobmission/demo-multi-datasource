package com.revengemission.demo.multidatasource.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DayStat implements Serializable {
    private Long id;
    private Date valueDate;
    private BigDecimal value;


    private int version;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}