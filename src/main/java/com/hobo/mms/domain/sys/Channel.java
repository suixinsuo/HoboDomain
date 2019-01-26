package com.hobo.mms.domain.sys;

import java.util.Date;

public class Channel {
    private String channelcode;

    private String channelname;

    private String status;

    private Date createdate;

    private String settlemode;

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode == null ? null : channelcode.trim();
    }

    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname == null ? null : channelname.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getSettlemode() {
        return settlemode;
    }

    public void setSettlemode(String settlemode) {
        this.settlemode = settlemode == null ? null : settlemode.trim();
    }
}