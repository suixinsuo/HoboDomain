package com.hobo.mms.domain.sys;

import java.math.BigDecimal;

public class TransferConfig {
    private String transfertype;

    private BigDecimal rate;

    private BigDecimal mincharge;

    private BigDecimal maxcharge;

    private BigDecimal minmoney;

    private BigDecimal maxmoney;

    public String getTransfertype() {
        return transfertype;
    }

    public void setTransfertype(String transfertype) {
        this.transfertype = transfertype == null ? null : transfertype.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getMincharge() {
        return mincharge;
    }

    public void setMincharge(BigDecimal mincharge) {
        this.mincharge = mincharge;
    }

    public BigDecimal getMaxcharge() {
        return maxcharge;
    }

    public void setMaxcharge(BigDecimal maxcharge) {
        this.maxcharge = maxcharge;
    }

    public BigDecimal getMinmoney() {
        return minmoney;
    }

    public void setMinmoney(BigDecimal minmoney) {
        this.minmoney = minmoney;
    }

    public BigDecimal getMaxmoney() {
        return maxmoney;
    }

    public void setMaxmoney(BigDecimal maxmoney) {
        this.maxmoney = maxmoney;
    }
}