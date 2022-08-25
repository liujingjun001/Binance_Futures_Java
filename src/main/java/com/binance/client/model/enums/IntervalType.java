package com.binance.client.model.enums;

/**
 * @author : jingjun.liu@okg.com
 * @since : 2022/03/28 22:49
 */
public enum IntervalType {
    MINUTE("1m"),
    HOUR("1h"),
    DAY("1d"),
    WEEK("1w"),
    MONTH("1M"),
    ;
    String desc;

    IntervalType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
