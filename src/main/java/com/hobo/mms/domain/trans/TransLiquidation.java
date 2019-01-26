package com.hobo.mms.domain.trans;

import java.math.BigDecimal;
import java.util.Date;

public class TransLiquidation extends TransLiquidationKey {
    private Date createdate;

    private String businessid;

    private String channelcode;

    private String accountid;

    private String accounttype;

    private BigDecimal transamount;

    private BigDecimal charges;

    private BigDecimal channelcharges;

    private String proxy1id;

    private String proxy2id;

    private String proxy3id;

    private BigDecimal proxy1charges;

    private BigDecimal proxy2charges;

    private BigDecimal proxy3charges;

    private String transdirection;

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
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

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype == null ? null : accounttype.trim();
    }

    public BigDecimal getTransamount() {
        return transamount;
    }

    public void setTransamount(BigDecimal transamount) {
        this.transamount = transamount;
    }

    public BigDecimal getCharges() {
        return charges;
    }

    public void setCharges(BigDecimal charges) {
        this.charges = charges;
    }

    public BigDecimal getChannelcharges() {
        return channelcharges;
    }

    public void setChannelcharges(BigDecimal channelcharges) {
        this.channelcharges = channelcharges;
    }

    public String getProxy1id() {
        return proxy1id;
    }

    public void setProxy1id(String proxy1id) {
        this.proxy1id = proxy1id == null ? null : proxy1id.trim();
    }

    public String getProxy2id() {
        return proxy2id;
    }

    public void setProxy2id(String proxy2id) {
        this.proxy2id = proxy2id == null ? null : proxy2id.trim();
    }

    public String getProxy3id() {
        return proxy3id;
    }

    public void setProxy3id(String proxy3id) {
        this.proxy3id = proxy3id == null ? null : proxy3id.trim();
    }

    public BigDecimal getProxy1charges() {
        return proxy1charges;
    }

    public void setProxy1charges(BigDecimal proxy1charges) {
        this.proxy1charges = proxy1charges;
    }

    public BigDecimal getProxy2charges() {
        return proxy2charges;
    }

    public void setProxy2charges(BigDecimal proxy2charges) {
        this.proxy2charges = proxy2charges;
    }

    public BigDecimal getProxy3charges() {
        return proxy3charges;
    }

    public void setProxy3charges(BigDecimal proxy3charges) {
        this.proxy3charges = proxy3charges;
    }

    public String getTransdirection() {
        return transdirection;
    }

    public void setTransdirection(String transdirection) {
        this.transdirection = transdirection == null ? null : transdirection.trim();
    }
}