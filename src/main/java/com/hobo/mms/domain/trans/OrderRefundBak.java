package com.hobo.mms.domain.trans;

import java.math.BigDecimal;
import java.util.Date;

public class OrderRefundBak {
    private String id;

    private String orderid;

    private String refundid;

    private String merchantid;

    private String businessid;

    private Date applydate;

    private String refundstatus;

    private String failedreason;

    private Date refunddate;

    private BigDecimal refundamount;

    private BigDecimal charges;

    private BigDecimal refundcharges;

    private String channelcode;

    private Date paychannelrefunddate;

    private String paychannelreturncode;

    private String paychannelreturninfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getRefundid() {
        return refundid;
    }

    public void setRefundid(String refundid) {
        this.refundid = refundid == null ? null : refundid.trim();
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid == null ? null : merchantid.trim();
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid == null ? null : businessid.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getRefundstatus() {
        return refundstatus;
    }

    public void setRefundstatus(String refundstatus) {
        this.refundstatus = refundstatus == null ? null : refundstatus.trim();
    }

    public String getFailedreason() {
        return failedreason;
    }

    public void setFailedreason(String failedreason) {
        this.failedreason = failedreason == null ? null : failedreason.trim();
    }

    public Date getRefunddate() {
        return refunddate;
    }

    public void setRefunddate(Date refunddate) {
        this.refunddate = refunddate;
    }

    public BigDecimal getRefundamount() {
        return refundamount;
    }

    public void setRefundamount(BigDecimal refundamount) {
        this.refundamount = refundamount;
    }

    public BigDecimal getCharges() {
        return charges;
    }

    public void setCharges(BigDecimal charges) {
        this.charges = charges;
    }

    public BigDecimal getRefundcharges() {
        return refundcharges;
    }

    public void setRefundcharges(BigDecimal refundcharges) {
        this.refundcharges = refundcharges;
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode == null ? null : channelcode.trim();
    }

    public Date getPaychannelrefunddate() {
        return paychannelrefunddate;
    }

    public void setPaychannelrefunddate(Date paychannelrefunddate) {
        this.paychannelrefunddate = paychannelrefunddate;
    }

    public String getPaychannelreturncode() {
        return paychannelreturncode;
    }

    public void setPaychannelreturncode(String paychannelreturncode) {
        this.paychannelreturncode = paychannelreturncode == null ? null : paychannelreturncode.trim();
    }

    public String getPaychannelreturninfo() {
        return paychannelreturninfo;
    }

    public void setPaychannelreturninfo(String paychannelreturninfo) {
        this.paychannelreturninfo = paychannelreturninfo == null ? null : paychannelreturninfo.trim();
    }
}