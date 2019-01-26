package com.hobo.mms.domain.trans;

import java.math.BigDecimal;
import java.util.Date;

public class Transfer {
    private String id;

    private String transfertype;

    private Date applydate;

    private String accountid;

    private String applyuserid;

    private String dealuserid;

    private Date dealdate;

    private String transferstatus;

    private String memo;

    private String receivebankcode;

    private String banksubbranch;

    private String unitebankid;

    private String receiveaccount;

    private String receiveaccountname;

    private BigDecimal transfermoney;

    private BigDecimal charges;

    private String channelcode;

    private BigDecimal channelcharges;

    private String channeltransferid;

    private Date channeltransferdate;

    private String failedreason;

    private String merchanttransferid;

    private String feetype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTransfertype() {
        return transfertype;
    }

    public void setTransfertype(String transfertype) {
        this.transfertype = transfertype == null ? null : transfertype.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid == null ? null : accountid.trim();
    }

    public String getApplyuserid() {
        return applyuserid;
    }

    public void setApplyuserid(String applyuserid) {
        this.applyuserid = applyuserid == null ? null : applyuserid.trim();
    }

    public String getDealuserid() {
        return dealuserid;
    }

    public void setDealuserid(String dealuserid) {
        this.dealuserid = dealuserid == null ? null : dealuserid.trim();
    }

    public Date getDealdate() {
        return dealdate;
    }

    public void setDealdate(Date dealdate) {
        this.dealdate = dealdate;
    }

    public String getTransferstatus() {
        return transferstatus;
    }

    public void setTransferstatus(String transferstatus) {
        this.transferstatus = transferstatus == null ? null : transferstatus.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getReceivebankcode() {
        return receivebankcode;
    }

    public void setReceivebankcode(String receivebankcode) {
        this.receivebankcode = receivebankcode == null ? null : receivebankcode.trim();
    }

    public String getBanksubbranch() {
        return banksubbranch;
    }

    public void setBanksubbranch(String banksubbranch) {
        this.banksubbranch = banksubbranch == null ? null : banksubbranch.trim();
    }

    public String getUnitebankid() {
        return unitebankid;
    }

    public void setUnitebankid(String unitebankid) {
        this.unitebankid = unitebankid == null ? null : unitebankid.trim();
    }

    public String getReceiveaccount() {
        return receiveaccount;
    }

    public void setReceiveaccount(String receiveaccount) {
        this.receiveaccount = receiveaccount == null ? null : receiveaccount.trim();
    }

    public String getReceiveaccountname() {
        return receiveaccountname;
    }

    public void setReceiveaccountname(String receiveaccountname) {
        this.receiveaccountname = receiveaccountname == null ? null : receiveaccountname.trim();
    }

    public BigDecimal getTransfermoney() {
        return transfermoney;
    }

    public void setTransfermoney(BigDecimal transfermoney) {
        this.transfermoney = transfermoney;
    }

    public BigDecimal getCharges() {
        return charges;
    }

    public void setCharges(BigDecimal charges) {
        this.charges = charges;
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode == null ? null : channelcode.trim();
    }

    public BigDecimal getChannelcharges() {
        return channelcharges;
    }

    public void setChannelcharges(BigDecimal channelcharges) {
        this.channelcharges = channelcharges;
    }

    public String getChanneltransferid() {
        return channeltransferid;
    }

    public void setChanneltransferid(String channeltransferid) {
        this.channeltransferid = channeltransferid == null ? null : channeltransferid.trim();
    }

    public Date getChanneltransferdate() {
        return channeltransferdate;
    }

    public void setChanneltransferdate(Date channeltransferdate) {
        this.channeltransferdate = channeltransferdate;
    }

    public String getFailedreason() {
        return failedreason;
    }

    public void setFailedreason(String failedreason) {
        this.failedreason = failedreason == null ? null : failedreason.trim();
    }

    public String getMerchanttransferid() {
        return merchanttransferid;
    }

    public void setMerchanttransferid(String merchanttransferid) {
        this.merchanttransferid = merchanttransferid == null ? null : merchanttransferid.trim();
    }

    public String getFeetype() {
        return feetype;
    }

    public void setFeetype(String feetype) {
        this.feetype = feetype == null ? null : feetype.trim();
    }
}