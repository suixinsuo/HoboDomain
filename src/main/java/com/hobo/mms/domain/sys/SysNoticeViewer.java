package com.hobo.mms.domain.sys;

public class SysNoticeViewer extends SysNoticeViewerKey {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}