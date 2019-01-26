package com.hobo.mms.domain.sys;

public class SysNoticeViewerKey {
    private String noticeid;

    private String viewerid;

    public String getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(String noticeid) {
        this.noticeid = noticeid == null ? null : noticeid.trim();
    }

    public String getViewerid() {
        return viewerid;
    }

    public void setViewerid(String viewerid) {
        this.viewerid = viewerid == null ? null : viewerid.trim();
    }
}