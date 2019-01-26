package com.hobo.mms.domain.trans;

public class AgentDayLiquidationKey {
    private String transday;

    private String agentid;

    private String businessid;

    public String getTransday() {
        return transday;
    }

    public void setTransday(String transday) {
        this.transday = transday == null ? null : transday.trim();
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid == null ? null : agentid.trim();
    }

    public String getBusinessid() {
        return businessid;
    }

    public void setBusinessid(String businessid) {
        this.businessid = businessid == null ? null : businessid.trim();
    }
}