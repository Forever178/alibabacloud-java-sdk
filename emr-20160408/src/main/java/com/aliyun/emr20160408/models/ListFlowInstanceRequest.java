// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowInstanceRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("FlowId")
    public String flowId;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeInstanceId")
    public String nodeInstanceId;

    @NameInMap("TimeRange")
    public String timeRange;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    public static ListFlowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowInstanceRequest self = new ListFlowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowInstanceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListFlowInstanceRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ListFlowInstanceRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public ListFlowInstanceRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListFlowInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListFlowInstanceRequest setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    public ListFlowInstanceRequest setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

    public ListFlowInstanceRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListFlowInstanceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListFlowInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListFlowInstanceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFlowInstanceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowInstanceRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

}
