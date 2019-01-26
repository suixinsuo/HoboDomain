package com.hobo.mms.domain.merchant;

import java.math.BigDecimal;

public class MerchantBusiness extends MerchantBusinessKey {
    private String chargetype;

    private BigDecimal rate;

    private String settletype;

    private Short settlevalue;

    private String gatewayid;

    private String status;

    public String getChargetype() {
        return chargetype;
    }

    public void setChargetype(String chargetype) {
        this.chargetype = chargetype == null ? null : chargetype.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getSettletype() {
        return settletype;
    }

    public void setSettletype(String settletype) {
        this.settletype = settletype == null ? null : settletype.trim();
    }

    public Short getSettlevalue() {
        return settlevalue;
    }

    public void setSettlevalue(Short settlevalue) {
        this.settlevalue = settlevalue;
    }

    public String getGatewayid() {
        return gatewayid;
    }

    public void setGatewayid(String gatewayid) {
        this.gatewayid = gatewayid == null ? null : gatewayid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}