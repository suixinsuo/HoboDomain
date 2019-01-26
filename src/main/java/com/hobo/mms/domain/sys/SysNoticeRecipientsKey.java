package com.hobo.mms.domain.sys;

public class SysNoticeRecipientsKey {
    private String noticeid;

    private String recipientstype;

    public String getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(String noticeid) {
        this.noticeid = noticeid == null ? null : noticeid.trim();
    }

    public String getRecipientstype() {
        return recipientstype;
    }

    public void setRecipientstype(String recipientstype) {
        this.recipientstype = recipientstype == null ? null : recipientstype.trim();
    }
}