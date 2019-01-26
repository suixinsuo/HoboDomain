package com.hobo.mms.domain.agent;

import java.math.BigDecimal;

public class AgentBusiness {
    private String agentid;

    private String businessid;

    private BigDecimal returnrate;

    private Short settlevalue;

    private String status;

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

    public BigDecimal getReturnrate() {
        return returnrate;
    }

    public void setReturnrate(BigDecimal returnrate) {
        this.returnrate = returnrate;
    }

    public Short getSettlevalue() {
        return settlevalue;
    }

    public void setSettlevalue(Short settlevalue) {
        this.settlevalue = settlevalue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}