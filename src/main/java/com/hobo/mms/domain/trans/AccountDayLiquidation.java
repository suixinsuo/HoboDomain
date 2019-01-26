package com.hobo.mms.domain.trans;

import java.math.BigDecimal;

public class AccountDayLiquidation extends AccountDayLiquidationKey {
    private String accounttype;

    private String transdirection;

    private Integer transcount;

    private BigDecimal transamount;

    private BigDecimal transcharges;

    private BigDecimal agent1charges;

    private BigDecimal agent2charges;

    private BigDecimal agent3charges;

    private BigDecimal channelcharges;

    private String agent1id;

    private String agent2id;

    private String agent3id;

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype == null ? null : accounttype.trim();
    }

    public String getTransdirection() {
        return transdirection;
    }

    public void setTransdirection(String transdirection) {
        this.transdirection = transdirection == null ? null : transdirection.trim();
    }

    public Integer getTranscount() {
        return transcount;
    }

    public void setTranscount(Integer transcount) {
        this.transcount = transcount;
    }

    public BigDecimal getTransamount() {
        return transamount;
    }

    public void setTransamount(BigDecimal transamount) {
        this.transamount = transamount;
    }

    public BigDecimal getTranscharges() {
        return transcharges;
    }

    public void setTranscharges(BigDecimal transcharges) {
        this.transcharges = transcharges;
    }

    public BigDecimal getAgent1charges() {
        return agent1charges;
    }

    public void setAgent1charges(BigDecimal agent1charges) {
        this.agent1charges = agent1charges;
    }

    public BigDecimal getAgent2charges() {
        return agent2charges;
    }

    public void setAgent2charges(BigDecimal agent2charges) {
        this.agent2charges = agent2charges;
    }

    public BigDecimal getAgent3charges() {
        return agent3charges;
    }

    public void setAgent3charges(BigDecimal agent3charges) {
        this.agent3charges = agent3charges;
    }

    public BigDecimal getChannelcharges() {
        return channelcharges;
    }

    public void setChannelcharges(BigDecimal channelcharges) {
        this.channelcharges = channelcharges;
    }

    public String getAgent1id() {
        return agent1id;
    }

    public void setAgent1id(String agent1id) {
        this.agent1id = agent1id == null ? null : agent1id.trim();
    }

    public String getAgent2id() {
        return agent2id;
    }

    public void setAgent2id(String agent2id) {
        this.agent2id = agent2id == null ? null : agent2id.trim();
    }

    public String getAgent3id() {
        return agent3id;
    }

    public void setAgent3id(String agent3id) {
        this.agent3id = agent3id == null ? null : agent3id.trim();
    }
}