package com.hobo.mms.domain.trans;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String orderid;

    private Date orderdate;

    private String paychannelid;

    private String gatewayid;

    private String businessid;

    private String channelcode;

    private String paychannelorderid;

    private Date paychannelpaydate;

    private String paychannelreturncode;

    private String paychannelreturninfo;

    private String merchantid;

    private String merchantorderid;

    private Date merchantorderdate;

    private String merchanturl;

    private String merchantnotifyurl;

    private String merchantreturnparam;

    private BigDecimal ordermoney;

    private BigDecimal channelcharges;

    private BigDecimal charges;

    private String paymentstatus;

    private Date paydate;

    private String orderstatus;

    private String version;

    private String redoflag;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getPaychannelid() {
        return paychannelid;
    }

    public void setPaychannelid(String paychannelid) {
        this.paychannelid = paychannelid == null ? null : paychannelid.trim();
    }

    public String getGatewayid() {
        return gatewayid;
    }

    public void setGatewayid(String gatewayid) {
        this.gatewayid = gatewayid == null ? null : gatewayid.trim();
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid == null ? null : businessid.trim();
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode == null ? null : channelcode.trim();
    }

    public String getPaychannelorderid() {
        return paychannelorderid;
    }

    public void setPaychannelorderid(String paychannelorderid) {
        this.paychannelorderid = paychannelorderid == null ? null : paychannelorderid.trim();
    }

    public Date getPaychannelpaydate() {
        return paychannelpaydate;
    }

    public void setPaychannelpaydate(Date paychannelpaydate) {
        this.paychannelpaydate = paychannelpaydate;
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

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid == null ? null : merchantid.trim();
    }

    public String getMerchantorderid() {
        return merchantorderid;
    }

    public void setMerchantorderid(String merchantorderid) {
        this.merchantorderid = merchantorderid == null ? null : merchantorderid.trim();
    }

    public Date getMerchantorderdate() {
        return merchantorderdate;
    }

    public void setMerchantorderdate(Date merchantorderdate) {
        this.merchantorderdate = merchantorderdate;
    }

    public String getMerchanturl() {
        return merchanturl;
    }

    public void setMerchanturl(String merchanturl) {
        this.merchanturl = merchanturl == null ? null : merchanturl.trim();
    }

    public String getMerchantnotifyurl() {
        return merchantnotifyurl;
    }

    public void setMerchantnotifyurl(String merchantnotifyurl) {
        this.merchantnotifyurl = merchantnotifyurl == null ? null : merchantnotifyurl.trim();
    }

    public String getMerchantreturnparam() {
        return merchantreturnparam;
    }

    public void setMerchantreturnparam(String merchantreturnparam) {
        this.merchantreturnparam = merchantreturnparam == null ? null : merchantreturnparam.trim();
    }

    public BigDecimal getOrdermoney() {
        return ordermoney;
    }

    public void setOrdermoney(BigDecimal ordermoney) {
        this.ordermoney = ordermoney;
    }

    public BigDecimal getChannelcharges() {
        return channelcharges;
    }

    public void setChannelcharges(BigDecimal channelcharges) {
        this.channelcharges = channelcharges;
    }

    public BigDecimal getCharges() {
        return charges;
    }

    public void setCharges(BigDecimal charges) {
        this.charges = charges;
    }

    public String getPaymentstatus() {
        return paymentstatus;
    }

    public void setPaymentstatus(String paymentstatus) {
        this.paymentstatus = paymentstatus == null ? null : paymentstatus.trim();
    }

    public Date getPaydate() {
        return paydate;
    }

    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus == null ? null : orderstatus.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getRedoflag() {
        return redoflag;
    }

    public void setRedoflag(String redoflag) {
        this.redoflag = redoflag == null ? null : redoflag.trim();
    }
}