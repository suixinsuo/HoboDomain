package com.hobo.mms.domain.trans;

public class AccountSettleConfig {
    private String accountid;

    private String bankcode;

    private String bankname;

    private String unitebankid;

    private String banksubbranch;

    private String bankaccount;

    private String bankaccountname;

    private String bindingflag;

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode == null ? null : bankcode.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getUnitebankid() {
        return unitebankid;
    }

    public void setUnitebankid(String unitebankid) {
        this.unitebankid = unitebankid == null ? null : unitebankid.trim();
    }

    public String getBanksubbranch() {
        return banksubbranch;
    }

    public void setBanksubbranch(String banksubbranch) {
        this.banksubbranch = banksubbranch == null ? null : banksubbranch.trim();
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount == null ? null : bankaccount.trim();
    }

    public String getBankaccountname() {
        return bankaccountname;
    }

    public void setBankaccountname(String bankaccountname) {
        this.bankaccountname = bankaccountname == null ? null : bankaccountname.trim();
    }

    public String getBindingflag() {
        return bindingflag;
    }

    public void setBindingflag(String bindingflag) {
        this.bindingflag = bindingflag == null ? null : bindingflag.trim();
    }
}