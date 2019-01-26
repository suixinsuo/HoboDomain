package com.hobo.mms.domain.trans;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private String accountid;

    private String accounttype;

    private BigDecimal accountamount;

    private BigDecimal accountfrozenamount;

    private BigDecimal accountavailableamount;

    private Date accountlastdate;

    private Date accountopendate;

    private String accountstatus;

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype == null ? null : accounttype.trim();
    }

    public BigDecimal getAccountamount() {
        return accountamount;
    }

    public void setAccountamount(BigDecimal accountamount) {
        this.accountamount = accountamount;
    }

    public BigDecimal getAccountfrozenamount() {
        return accountfrozenamount;
    }

    public void setAccountfrozenamount(BigDecimal accountfrozenamount) {
        this.accountfrozenamount = accountfrozenamount;
    }

    public BigDecimal getAccountavailableamount() {
        return accountavailableamount;
    }

    public void setAccountavailableamount(BigDecimal accountavailableamount) {
        this.accountavailableamount = accountavailableamount;
    }

    public Date getAccountlastdate() {
        return accountlastdate;
    }

    public void setAccountlastdate(Date accountlastdate) {
        this.accountlastdate = accountlastdate;
    }

    public Date getAccountopendate() {
        return accountopendate;
    }

    public void setAccountopendate(Date accountopendate) {
        this.accountopendate = accountopendate;
    }

    public String getAccountstatus() {
        return accountstatus;
    }

    public void setAccountstatus(String accountstatus) {
        this.accountstatus = accountstatus == null ? null : accountstatus.trim();
    }
}