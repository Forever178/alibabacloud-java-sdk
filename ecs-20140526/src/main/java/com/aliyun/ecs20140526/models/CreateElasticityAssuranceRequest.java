// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateElasticityAssuranceRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public CreateElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("AssuranceTimes")
    public String assuranceTimes;

    @NameInMap("InstanceAmount")
    public Integer instanceAmount;

    @NameInMap("InstanceCpuCoreCount")
    public Integer instanceCpuCoreCount;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Platform")
    public String platform;

    @NameInMap("PackageType")
    public String packageType;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ZoneId")
    public java.util.List<String> zoneId;

    @NameInMap("InstanceType")
    public java.util.List<String> instanceType;

    public static CreateElasticityAssuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticityAssuranceRequest self = new CreateElasticityAssuranceRequest();
        return TeaModel.build(map, self);
    }

    public CreateElasticityAssuranceRequest setPrivatePoolOptions(CreateElasticityAssuranceRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public CreateElasticityAssuranceRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public CreateElasticityAssuranceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateElasticityAssuranceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateElasticityAssuranceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateElasticityAssuranceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateElasticityAssuranceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateElasticityAssuranceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateElasticityAssuranceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateElasticityAssuranceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateElasticityAssuranceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateElasticityAssuranceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateElasticityAssuranceRequest setAssuranceTimes(String assuranceTimes) {
        this.assuranceTimes = assuranceTimes;
        return this;
    }
    public String getAssuranceTimes() {
        return this.assuranceTimes;
    }

    public CreateElasticityAssuranceRequest setInstanceAmount(Integer instanceAmount) {
        this.instanceAmount = instanceAmount;
        return this;
    }
    public Integer getInstanceAmount() {
        return this.instanceAmount;
    }

    public CreateElasticityAssuranceRequest setInstanceCpuCoreCount(Integer instanceCpuCoreCount) {
        this.instanceCpuCoreCount = instanceCpuCoreCount;
        return this;
    }
    public Integer getInstanceCpuCoreCount() {
        return this.instanceCpuCoreCount;
    }

    public CreateElasticityAssuranceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateElasticityAssuranceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateElasticityAssuranceRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public CreateElasticityAssuranceRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public CreateElasticityAssuranceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateElasticityAssuranceRequest setZoneId(java.util.List<String> zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public java.util.List<String> getZoneId() {
        return this.zoneId;
    }

    public CreateElasticityAssuranceRequest setInstanceType(java.util.List<String> instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public java.util.List<String> getInstanceType() {
        return this.instanceType;
    }

    public static class CreateElasticityAssuranceRequestPrivatePoolOptions extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static CreateElasticityAssuranceRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateElasticityAssuranceRequestPrivatePoolOptions self = new CreateElasticityAssuranceRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public CreateElasticityAssuranceRequestPrivatePoolOptions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateElasticityAssuranceRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

}
