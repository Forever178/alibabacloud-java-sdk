// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyInstanceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    @NameInMap("DBProxyInstanceNum")
    public String DBProxyInstanceNum;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("EffectiveSpecificTime")
    public String effectiveSpecificTime;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDBProxyInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyInstanceRequest self = new ModifyDBProxyInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBProxyInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBProxyInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBProxyInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyInstanceRequest setDBProxyInstanceType(String DBProxyInstanceType) {
        this.DBProxyInstanceType = DBProxyInstanceType;
        return this;
    }
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    public ModifyDBProxyInstanceRequest setDBProxyInstanceNum(String DBProxyInstanceNum) {
        this.DBProxyInstanceNum = DBProxyInstanceNum;
        return this;
    }
    public String getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    public ModifyDBProxyInstanceRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyDBProxyInstanceRequest setEffectiveSpecificTime(String effectiveSpecificTime) {
        this.effectiveSpecificTime = effectiveSpecificTime;
        return this;
    }
    public String getEffectiveSpecificTime() {
        return this.effectiveSpecificTime;
    }

    public ModifyDBProxyInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
