package com.hobo.mms.domain.trans;

public class TransLiquidationKey {
    private String transid;

    private String tradetypeid;

    public String getTransid() {
        return transid;
    }

    public void setTransid(String transid) {
        this.transid = transid == null ? null : transid.trim();
    }

    public String getTradetypeid() {
        return tradetypeid;
    }

    public void setTradetypeid(String tradetypeid) {
        this.tradetypeid = tradetypeid == null ? null : tradetypeid.trim();
    }
}