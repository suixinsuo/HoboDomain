package com.hobo.mms.domain.merchant;

import java.util.Date;

public class MerchantKeys {
    private String merchantid;

    private String merchantrsapubkey;

    private String rsapubkey;

    private String rsaprikey;

    private Date edittime;

    private Date createtime;

    public String getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid == null ? null : merchantid.trim();
    }

    public String getMerchantrsapubkey() {
        return merchantrsapubkey;
    }

    public void setMerchantrsapubkey(String merchantrsapubkey) {
        this.merchantrsapubkey = merchantrsapubkey == null ? null : merchantrsapubkey.trim();
    }

    public String getRsapubkey() {
        return rsapubkey;
    }

    public void setRsapubkey(String rsapubkey) {
        this.rsapubkey = rsapubkey == null ? null : rsapubkey.trim();
    }

    public String getRsaprikey() {
        return rsaprikey;
    }

    public void setRsaprikey(String rsaprikey) {
        this.rsaprikey = rsaprikey == null ? null : rsaprikey.trim();
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}