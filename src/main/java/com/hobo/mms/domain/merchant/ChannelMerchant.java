package com.hobo.mms.domain.merchant;

import java.util.Date;

public class ChannelMerchant {
    private String channelmerchantid;

    private String merchantid;

    private String channelmerchantname;

    private String channelmerchantkey;

    private String channelcode;

    private Date createdate;

    private String status;

    public String getChannelmerchantid() {
        return channelmerchantid;
    }

    public void setChannelmerchantid(String channelmerchantid) {
        this.channelmerchantid = channelmerchantid == null ? null : channelmerchantid.trim();
    }

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid == null ? null : merchantid.trim();
    }

    public String getChannelmerchantname() {
        return channelmerchantname;
    }

    public void setChannelmerchantname(String channelmerchantname) {
        this.channelmerchantname = channelmerchantname == null ? null : channelmerchantname.trim();
    }

    public String getChannelmerchantkey() {
        return channelmerchantkey;
    }

    public void setChannelmerchantkey(String channelmerchantkey) {
        this.channelmerchantkey = channelmerchantkey == null ? null : channelmerchantkey.trim();
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode == null ? null : channelcode.trim();
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
}