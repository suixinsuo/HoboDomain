package com.hobo.mms.domain.trans;

import java.math.BigDecimal;
import java.util.Date;

public class AccountLine {
    private String accountseqid;

    private String accountid;

    private BigDecimal accountamountchanged;

    private BigDecimal accountfrozenamountchanged;

    private BigDecimal availableamountchanged;

    private String tradetypeid;

    private Date accountbelongtime;

    private String accountbillnumber;

    private String accountremark;

    private BigDecimal accountamount;

    private BigDecimal accountfrozenamount;

    private BigDecimal accountavailbleamount;

    public String getAccountseqid() {
        return accountseqid;
    }

    public void setAccountseqid(String accountseqid) {
        this.accountseqid = accountseqid == null ? null : accountseqid.trim();
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public BigDecimal getAccountamountchanged() {
        return accountamountchanged;
    }

    public void setAccountamountchanged(BigDecimal accountamountchanged) {
        this.accountamountchanged = accountamountchanged;
    }

    public BigDecimal getAccountfrozenamountchanged() {
        return accountfrozenamountchanged;
    }

    public void setAccountfrozenamountchanged(BigDecimal accountfrozenamountchanged) {
        this.accountfrozenamountchanged = accountfrozenamountchanged;
    }

    public BigDecimal getAvailableamountchanged() {
        return availableamountchanged;
    }

    public void setAvailableamountchanged(BigDecimal availableamountchanged) {
        this.availableamountchanged = availableamountchanged;
    }

    public String getTradetypeid() {
        return tradetypeid;
    }

    public void setTradetypeid(String tradetypeid) {
        this.tradetypeid = tradetypeid == null ? null : tradetypeid.trim();
    }

    public Date getAccountbelongtime() {
        return accountbelongtime;
    }

    public void setAccountbelongtime(Date accountbelongtime) {
        this.accountbelongtime = accountbelongtime;
    }

    public String getAccountbillnumber() {
        return accountbillnumber;
    }

    public void setAccountbillnumber(String accountbillnumber) {
        this.accountbillnumber = accountbillnumber == null ? null : accountbillnumber.trim();
    }

    public String getAccountremark() {
        return accountremark;
    }

    public void setAccountremark(String accountremark) {
        this.accountremark = accountremark == null ? null : accountremark.trim();
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

    public BigDecimal getAccountavailbleamount() {
        return accountavailbleamount;
    }

    public void setAccountavailbleamount(BigDecimal accountavailbleamount) {
        this.accountavailbleamount = accountavailbleamount;
    }
}