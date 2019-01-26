package com.hobo.mms.domain.trans;

public class AccountDayLiquidationKey {
    private String transday;

    private String accountid;

    private String businessid;

    private String channelcode;

    private String tradetypeid;

    public String getTransday() {
        return transday;
    }

    public void setTransday(String transday) {
        this.transday = transday == null ? null : transday.trim();
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
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

    public String getTradetypeid() {
        return tradetypeid;
    }

    public void setTradetypeid(String tradetypeid) {
        this.tradetypeid = tradetypeid == null ? null : tradetypeid.trim();
    }
}