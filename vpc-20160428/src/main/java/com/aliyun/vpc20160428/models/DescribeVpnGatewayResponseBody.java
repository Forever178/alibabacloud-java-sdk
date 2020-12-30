// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewayResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("IpsecVpn")
    public String ipsecVpn;

    @NameInMap("SslVpn")
    public String sslVpn;

    @NameInMap("VpnType")
    public String vpnType;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnableBgp")
    public Boolean enableBgp;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("AutoPropagate")
    public Boolean autoPropagate;

    @NameInMap("BusinessStatus")
    public String businessStatus;

    @NameInMap("Name")
    public String name;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("InternetIp")
    public String internetIp;

    @NameInMap("VpnGatewayId")
    public String vpnGatewayId;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("SslMaxConnections")
    public Long sslMaxConnections;

    @NameInMap("Tags")
    public DescribeVpnGatewayResponseBodyTags tags;

    @NameInMap("ReservationData")
    public DescribeVpnGatewayResponseBodyReservationData reservationData;

    public static DescribeVpnGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewayResponseBody self = new DescribeVpnGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewayResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVpnGatewayResponseBody setIpsecVpn(String ipsecVpn) {
        this.ipsecVpn = ipsecVpn;
        return this;
    }
    public String getIpsecVpn() {
        return this.ipsecVpn;
    }

    public DescribeVpnGatewayResponseBody setSslVpn(String sslVpn) {
        this.sslVpn = sslVpn;
        return this;
    }
    public String getSslVpn() {
        return this.sslVpn;
    }

    public DescribeVpnGatewayResponseBody setVpnType(String vpnType) {
        this.vpnType = vpnType;
        return this;
    }
    public String getVpnType() {
        return this.vpnType;
    }

    public DescribeVpnGatewayResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeVpnGatewayResponseBody setEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }
    public Boolean getEnableBgp() {
        return this.enableBgp;
    }

    public DescribeVpnGatewayResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeVpnGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpnGatewayResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public DescribeVpnGatewayResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeVpnGatewayResponseBody setAutoPropagate(Boolean autoPropagate) {
        this.autoPropagate = autoPropagate;
        return this;
    }
    public Boolean getAutoPropagate() {
        return this.autoPropagate;
    }

    public DescribeVpnGatewayResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeVpnGatewayResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVpnGatewayResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeVpnGatewayResponseBody setInternetIp(String internetIp) {
        this.internetIp = internetIp;
        return this;
    }
    public String getInternetIp() {
        return this.internetIp;
    }

    public DescribeVpnGatewayResponseBody setVpnGatewayId(String vpnGatewayId) {
        this.vpnGatewayId = vpnGatewayId;
        return this;
    }
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public DescribeVpnGatewayResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeVpnGatewayResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeVpnGatewayResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeVpnGatewayResponseBody setSslMaxConnections(Long sslMaxConnections) {
        this.sslMaxConnections = sslMaxConnections;
        return this;
    }
    public Long getSslMaxConnections() {
        return this.sslMaxConnections;
    }

    public DescribeVpnGatewayResponseBody setTags(DescribeVpnGatewayResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeVpnGatewayResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeVpnGatewayResponseBody setReservationData(DescribeVpnGatewayResponseBodyReservationData reservationData) {
        this.reservationData = reservationData;
        return this;
    }
    public DescribeVpnGatewayResponseBodyReservationData getReservationData() {
        return this.reservationData;
    }

    public static class DescribeVpnGatewayResponseBodyTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVpnGatewayResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayResponseBodyTagsTag self = new DescribeVpnGatewayResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewayResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpnGatewayResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpnGatewayResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVpnGatewayResponseBodyTagsTag> tag;

        public static DescribeVpnGatewayResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayResponseBodyTags self = new DescribeVpnGatewayResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewayResponseBodyTags setTag(java.util.List<DescribeVpnGatewayResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpnGatewayResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVpnGatewayResponseBodyReservationData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        @NameInMap("ReservationIpsec")
        public String reservationIpsec;

        @NameInMap("ReservationSpec")
        public String reservationSpec;

        @NameInMap("ReservationSsl")
        public String reservationSsl;

        @NameInMap("ReservationMaxConnections")
        public Integer reservationMaxConnections;

        @NameInMap("ReservationEndTime")
        public String reservationEndTime;

        public static DescribeVpnGatewayResponseBodyReservationData build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpnGatewayResponseBodyReservationData self = new DescribeVpnGatewayResponseBodyReservationData();
            return TeaModel.build(map, self);
        }

        public DescribeVpnGatewayResponseBodyReservationData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationIpsec(String reservationIpsec) {
            this.reservationIpsec = reservationIpsec;
            return this;
        }
        public String getReservationIpsec() {
            return this.reservationIpsec;
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationSpec(String reservationSpec) {
            this.reservationSpec = reservationSpec;
            return this;
        }
        public String getReservationSpec() {
            return this.reservationSpec;
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationSsl(String reservationSsl) {
            this.reservationSsl = reservationSsl;
            return this;
        }
        public String getReservationSsl() {
            return this.reservationSsl;
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationMaxConnections(Integer reservationMaxConnections) {
            this.reservationMaxConnections = reservationMaxConnections;
            return this;
        }
        public Integer getReservationMaxConnections() {
            return this.reservationMaxConnections;
        }

        public DescribeVpnGatewayResponseBodyReservationData setReservationEndTime(String reservationEndTime) {
            this.reservationEndTime = reservationEndTime;
            return this;
        }
        public String getReservationEndTime() {
            return this.reservationEndTime;
        }

    }

}
