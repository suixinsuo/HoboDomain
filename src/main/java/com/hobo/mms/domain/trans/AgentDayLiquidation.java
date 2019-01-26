package com.hobo.mms.domain.trans;

import java.math.BigDecimal;

public class AgentDayLiquidation extends AgentDayLiquidationKey {
    private BigDecimal transamount;

    private BigDecimal agentcharges;

    private String settlestatus;

    public BigDecimal getTransamount() {
        return transamount;
    }

    public void setTransamount(BigDecimal transamount) {
        this.transamount = transamount;
    }

    public BigDecimal getAgentcharges() {
        return agentcharges;
    }

    public void setAgentcharges(BigDecimal agentcharges) {
        this.agentcharges = agentcharges;
    }

    public String getSettlestatus() {
        return settlestatus;
    }

    public void setSettlestatus(String settlestatus) {
        this.settlestatus = settlestatus == null ? null : settlestatus.trim();
    }
}