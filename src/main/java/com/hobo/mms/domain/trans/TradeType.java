package com.hobo.mms.domain.trans;

public class TradeType {
    private String tradetypeid;

    private String tradetypename;

    public String getTradetypeid() {
        return tradetypeid;
    }

    public void setTradetypeid(String tradetypeid) {
        this.tradetypeid = tradetypeid == null ? null : tradetypeid.trim();
    }

    public String getTradetypename() {
        return tradetypename;
    }

    public void setTradetypename(String tradetypename) {
        this.tradetypename = tradetypename == null ? null : tradetypename.trim();
    }
}