package com.binance.client.model.market;

import java.math.BigDecimal;

/**
 * @author : jingjun.liu@okg.com
 * @since : 2022/03/28 22:51
 */
public class KLine {
    private long startTime;
    private BigDecimal open;
    private BigDecimal high;
    private BigDecimal low;
    private BigDecimal close;
    /**
     * 成交量
     */
    private BigDecimal volume;
    private long endTime;
    /**
     * 成交额
     */
    private BigDecimal volumeUsdt;
    /**
     * 成交笔数
     */
    private int matched;
    /**
     * 主动买入成交量
     */
    private BigDecimal initiativeBuyVolume;
    /**
     * 主动买入成交额
     */
    private BigDecimal initiativeBuyVolumeUsdt;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getVolumeUsdt() {
        return volumeUsdt;
    }

    public void setVolumeUsdt(BigDecimal volumeUsdt) {
        this.volumeUsdt = volumeUsdt;
    }

    public int getMatched() {
        return matched;
    }

    public void setMatched(int matched) {
        this.matched = matched;
    }

    public BigDecimal getInitiativeBuyVolume() {
        return initiativeBuyVolume;
    }

    public void setInitiativeBuyVolume(BigDecimal initiativeBuyVolume) {
        this.initiativeBuyVolume = initiativeBuyVolume;
    }

    public BigDecimal getInitiativeBuyVolumeUsdt() {
        return initiativeBuyVolumeUsdt;
    }

    public void setInitiativeBuyVolumeUsdt(BigDecimal initiativeBuyVolumeUsdt) {
        this.initiativeBuyVolumeUsdt = initiativeBuyVolumeUsdt;
    }
}
