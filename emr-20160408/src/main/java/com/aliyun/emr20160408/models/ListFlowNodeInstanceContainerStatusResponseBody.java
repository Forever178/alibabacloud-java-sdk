// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowNodeInstanceContainerStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("ContainerStatusList")
    public ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusList containerStatusList;

    public static ListFlowNodeInstanceContainerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodeInstanceContainerStatusResponseBody self = new ListFlowNodeInstanceContainerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlowNodeInstanceContainerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlowNodeInstanceContainerStatusResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowNodeInstanceContainerStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowNodeInstanceContainerStatusResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListFlowNodeInstanceContainerStatusResponseBody setContainerStatusList(ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusList containerStatusList) {
        this.containerStatusList = containerStatusList;
        return this;
    }
    public ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusList getContainerStatusList() {
        return this.containerStatusList;
    }

    public static class ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusListContainerStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ApplicationId")
        public String applicationId;

        public static ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusListContainerStatus build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusListContainerStatus self = new ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusListContainerStatus();
            return TeaModel.build(map, self);
        }

        public ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusListContainerStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusListContainerStatus setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusListContainerStatus setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusListContainerStatus setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

    }

    public static class ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusList extends TeaModel {
        @NameInMap("ContainerStatus")
        public java.util.List<ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusListContainerStatus> containerStatus;

        public static ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusList build(java.util.Map<String, ?> map) throws Exception {
            ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusList self = new ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusList();
            return TeaModel.build(map, self);
        }

        public ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusList setContainerStatus(java.util.List<ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusListContainerStatus> containerStatus) {
            this.containerStatus = containerStatus;
            return this;
        }
        public java.util.List<ListFlowNodeInstanceContainerStatusResponseBodyContainerStatusListContainerStatus> getContainerStatus() {
            return this.containerStatus;
        }

    }

}
