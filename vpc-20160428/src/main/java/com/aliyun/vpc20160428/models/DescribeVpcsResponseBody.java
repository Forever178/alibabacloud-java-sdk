// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Vpcs")
    public DescribeVpcsResponseBodyVpcs vpcs;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeVpcsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcsResponseBody self = new DescribeVpcsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcsResponseBody setVpcs(DescribeVpcsResponseBodyVpcs vpcs) {
        this.vpcs = vpcs;
        return this;
    }
    public DescribeVpcsResponseBodyVpcs getVpcs() {
        return this.vpcs;
    }

    public DescribeVpcsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeVpcsResponseBodyVpcsVpcTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVpcsResponseBodyVpcsVpcTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcTagsTag self = new DescribeVpcsResponseBodyVpcsVpcTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpcsResponseBodyVpcsVpcTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeVpcsResponseBodyVpcsVpcTagsTag> tag;

        public static DescribeVpcsResponseBodyVpcsVpcTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcTags self = new DescribeVpcsResponseBodyVpcsVpcTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcTags setTag(java.util.List<DescribeVpcsResponseBodyVpcsVpcTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeVpcsResponseBodyVpcsVpcTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcUserCidrs extends TeaModel {
        @NameInMap("UserCidr")
        public java.util.List<String> userCidr;

        public static DescribeVpcsResponseBodyVpcsVpcUserCidrs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcUserCidrs self = new DescribeVpcsResponseBodyVpcsVpcUserCidrs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcUserCidrs setUserCidr(java.util.List<String> userCidr) {
            this.userCidr = userCidr;
            return this;
        }
        public java.util.List<String> getUserCidr() {
            return this.userCidr;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcNatGatewayIds extends TeaModel {
        @NameInMap("NatGatewayIds")
        public java.util.List<String> natGatewayIds;

        public static DescribeVpcsResponseBodyVpcsVpcNatGatewayIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcNatGatewayIds self = new DescribeVpcsResponseBodyVpcsVpcNatGatewayIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcNatGatewayIds setNatGatewayIds(java.util.List<String> natGatewayIds) {
            this.natGatewayIds = natGatewayIds;
            return this;
        }
        public java.util.List<String> getNatGatewayIds() {
            return this.natGatewayIds;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        public java.util.List<String> vSwitchId;

        public static DescribeVpcsResponseBodyVpcsVpcVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcVSwitchIds self = new DescribeVpcsResponseBodyVpcsVpcVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcRouterTableIds extends TeaModel {
        @NameInMap("RouterTableIds")
        public java.util.List<String> routerTableIds;

        public static DescribeVpcsResponseBodyVpcsVpcRouterTableIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcRouterTableIds self = new DescribeVpcsResponseBodyVpcsVpcRouterTableIds();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcRouterTableIds setRouterTableIds(java.util.List<String> routerTableIds) {
            this.routerTableIds = routerTableIds;
            return this;
        }
        public java.util.List<String> getRouterTableIds() {
            return this.routerTableIds;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks extends TeaModel {
        @NameInMap("SecondaryCidrBlock")
        public java.util.List<String> secondaryCidrBlock;

        public static DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks self = new DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks setSecondaryCidrBlock(java.util.List<String> secondaryCidrBlock) {
            this.secondaryCidrBlock = secondaryCidrBlock;
            return this;
        }
        public java.util.List<String> getSecondaryCidrBlock() {
            return this.secondaryCidrBlock;
        }

    }

    public static class DescribeVpcsResponseBodyVpcsVpc extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Tags")
        public DescribeVpcsResponseBodyVpcsVpcTags tags;

        @NameInMap("UserCidrs")
        public DescribeVpcsResponseBodyVpcsVpcUserCidrs userCidrs;

        @NameInMap("NatGatewayIds")
        public DescribeVpcsResponseBodyVpcsVpcNatGatewayIds natGatewayIds;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("DhcpOptionsSetStatus")
        public String dhcpOptionsSetStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("DhcpOptionsSetId")
        public String dhcpOptionsSetId;

        @NameInMap("VSwitchIds")
        public DescribeVpcsResponseBodyVpcsVpcVSwitchIds vSwitchIds;

        @NameInMap("Ipv6CidrBlock")
        public String ipv6CidrBlock;

        @NameInMap("RouterTableIds")
        public DescribeVpcsResponseBodyVpcsVpcRouterTableIds routerTableIds;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VRouterId")
        public String VRouterId;

        @NameInMap("SecondaryCidrBlocks")
        public DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks secondaryCidrBlocks;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("CenStatus")
        public String cenStatus;

        public static DescribeVpcsResponseBodyVpcsVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcsVpc self = new DescribeVpcsResponseBodyVpcsVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcsVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVpcsResponseBodyVpcsVpc setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVpcsResponseBodyVpcsVpc setTags(DescribeVpcsResponseBodyVpcsVpcTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcTags getTags() {
            return this.tags;
        }

        public DescribeVpcsResponseBodyVpcsVpc setUserCidrs(DescribeVpcsResponseBodyVpcsVpcUserCidrs userCidrs) {
            this.userCidrs = userCidrs;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcUserCidrs getUserCidrs() {
            return this.userCidrs;
        }

        public DescribeVpcsResponseBodyVpcsVpc setNatGatewayIds(DescribeVpcsResponseBodyVpcsVpcNatGatewayIds natGatewayIds) {
            this.natGatewayIds = natGatewayIds;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcNatGatewayIds getNatGatewayIds() {
            return this.natGatewayIds;
        }

        public DescribeVpcsResponseBodyVpcsVpc setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeVpcsResponseBodyVpcsVpc setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public DescribeVpcsResponseBodyVpcsVpc setDhcpOptionsSetStatus(String dhcpOptionsSetStatus) {
            this.dhcpOptionsSetStatus = dhcpOptionsSetStatus;
            return this;
        }
        public String getDhcpOptionsSetStatus() {
            return this.dhcpOptionsSetStatus;
        }

        public DescribeVpcsResponseBodyVpcsVpc setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVpcsResponseBodyVpcsVpc setDhcpOptionsSetId(String dhcpOptionsSetId) {
            this.dhcpOptionsSetId = dhcpOptionsSetId;
            return this;
        }
        public String getDhcpOptionsSetId() {
            return this.dhcpOptionsSetId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setVSwitchIds(DescribeVpcsResponseBodyVpcsVpcVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeVpcsResponseBodyVpcsVpc setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public String getIpv6CidrBlock() {
            return this.ipv6CidrBlock;
        }

        public DescribeVpcsResponseBodyVpcsVpc setRouterTableIds(DescribeVpcsResponseBodyVpcsVpcRouterTableIds routerTableIds) {
            this.routerTableIds = routerTableIds;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcRouterTableIds getRouterTableIds() {
            return this.routerTableIds;
        }

        public DescribeVpcsResponseBodyVpcsVpc setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeVpcsResponseBodyVpcsVpc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setSecondaryCidrBlocks(DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks secondaryCidrBlocks) {
            this.secondaryCidrBlocks = secondaryCidrBlocks;
            return this;
        }
        public DescribeVpcsResponseBodyVpcsVpcSecondaryCidrBlocks getSecondaryCidrBlocks() {
            return this.secondaryCidrBlocks;
        }

        public DescribeVpcsResponseBodyVpcsVpc setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeVpcsResponseBodyVpcsVpc setCenStatus(String cenStatus) {
            this.cenStatus = cenStatus;
            return this;
        }
        public String getCenStatus() {
            return this.cenStatus;
        }

    }

    public static class DescribeVpcsResponseBodyVpcs extends TeaModel {
        @NameInMap("Vpc")
        public java.util.List<DescribeVpcsResponseBodyVpcsVpc> vpc;

        public static DescribeVpcsResponseBodyVpcs build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcsResponseBodyVpcs self = new DescribeVpcsResponseBodyVpcs();
            return TeaModel.build(map, self);
        }

        public DescribeVpcsResponseBodyVpcs setVpc(java.util.List<DescribeVpcsResponseBodyVpcsVpc> vpc) {
            this.vpc = vpc;
            return this;
        }
        public java.util.List<DescribeVpcsResponseBodyVpcsVpc> getVpc() {
            return this.vpc;
        }

    }

}
