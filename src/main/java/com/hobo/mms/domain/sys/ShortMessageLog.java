package com.hobo.mms.domain.sys;

import java.util.Date;

public class ShortMessageLog {
    private String sequenceid;

    private String srcnumber;

    private String destnumber;

    private String content;

    private Integer index;

    private Date logdate;

    private String status;

    private String channelid;

    public String getSequenceid() {
        return sequenceid;
    }

    public void setSequenceid(String sequenceid) {
        this.sequenceid = sequenceid == null ? null : sequenceid.trim();
    }

    public String getSrcnumber() {
        return srcnumber;
    }

    public void setSrcnumber(String srcnumber) {
        this.srcnumber = srcnumber == null ? null : srcnumber.trim();
    }

    public String getDestnumber() {
        return destnumber;
    }

    public void setDestnumber(String destnumber) {
        this.destnumber = destnumber == null ? null : destnumber.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid == null ? null : channelid.trim();
    }
}