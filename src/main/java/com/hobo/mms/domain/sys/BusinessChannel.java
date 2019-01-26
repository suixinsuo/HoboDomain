package com.hobo.mms.domain.sys;

import java.math.BigDecimal;
import java.util.Date;

public class BusinessChannel {
    private String id;

    private String businessid;

    private String bankcode;

    private BigDecimal mincharge;

    private BigDecimal maxcharge;

    private BigDecimal rate;

    private String name;

    private Date createdate;

    private String status;

    private String channelcode;

    private String descript;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid == null ? null : businessid.trim();
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode == null ? null : bankcode.trim();
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

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode == null ? null : channelcode.trim();
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }
}