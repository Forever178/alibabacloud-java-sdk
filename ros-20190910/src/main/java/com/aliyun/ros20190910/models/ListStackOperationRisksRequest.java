// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackOperationRisksRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StackId")
    public String stackId;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RetainAllResources")
    public Boolean retainAllResources;

    @NameInMap("RetainResources")
    public java.util.List<String> retainResources;

    public static ListStackOperationRisksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackOperationRisksRequest self = new ListStackOperationRisksRequest();
        return TeaModel.build(map, self);
    }

    public ListStackOperationRisksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListStackOperationRisksRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public ListStackOperationRisksRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ListStackOperationRisksRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListStackOperationRisksRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public ListStackOperationRisksRequest setRetainAllResources(Boolean retainAllResources) {
        this.retainAllResources = retainAllResources;
        return this;
    }
    public Boolean getRetainAllResources() {
        return this.retainAllResources;
    }

    public ListStackOperationRisksRequest setRetainResources(java.util.List<String> retainResources) {
        this.retainResources = retainResources;
        return this;
    }
    public java.util.List<String> getRetainResources() {
        return this.retainResources;
    }

}
