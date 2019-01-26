package com.hobo.mms.domain.trans;

import java.math.BigDecimal;
import java.util.Date;

public class OrderSettleInfo {
    private String orderid;

    private Date paydate;

    private String paychannelid;

    private String businessid;

    private String merchantid;

    private BigDecimal ordermoney;

    private BigDecimal charges;

    private String settlestatus;

    private Date settledate;

    private String settleid;

    private String settleday;

    private String payday;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public String getPaychannelid() {
        return paychannelid;
    }

    public void setPaychannelid(String paychannelid) {
        this.paychannelid = paychannelid == null ? null : paychannelid.trim();
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid == null ? null : businessid.trim();
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid == null ? null : merchantid.trim();
    }

    public BigDecimal getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(BigDecimal ordermoney) {
        this.ordermoney = ordermoney;
    }

    public BigDecimal getCharges() {
        return charges;
    }

    public void setCharges(BigDecimal charges) {
        this.charges = charges;
    }

    public String getSettlestatus() {
        return settlestatus;
    }

    public void setSettlestatus(String settlestatus) {
        this.settlestatus = settlestatus == null ? null : settlestatus.trim();
    }

    public Date getSettledate() {
        return settledate;
    }

    public void setSettledate(Date settledate) {
        this.settledate = settledate;
    }

    public String getSettleid() {
        return settleid;
    }

    public void setSettleid(String settleid) {
        this.settleid = settleid == null ? null : settleid.trim();
    }

    public String getSettleday() {
        return settleday;
    }

    public void setSettleday(String settleday) {
        this.settleday = settleday == null ? null : settleday.trim();
    }

    public String getPayday() {
        return payday;
    }

    public void setPayday(String payday) {
        this.payday = payday == null ? null : payday.trim();
    }
}