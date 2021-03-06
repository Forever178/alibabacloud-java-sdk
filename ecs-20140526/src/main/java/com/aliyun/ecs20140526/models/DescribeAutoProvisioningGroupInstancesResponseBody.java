// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeAutoProvisioningGroupInstancesResponseBodyInstances instances;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeAutoProvisioningGroupInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupInstancesResponseBody self = new DescribeAutoProvisioningGroupInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupInstancesResponseBody setInstances(DescribeAutoProvisioningGroupInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeAutoProvisioningGroupInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeAutoProvisioningGroupInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAutoProvisioningGroupInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoProvisioningGroupInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutoProvisioningGroupInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("IsSpot")
        public Boolean isSpot;

        @NameInMap("CPU")
        public Integer CPU;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("IoOptimized")
        public Boolean ioOptimized;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("Memory")
        public Integer memory;

        public static DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance self = new DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setIsSpot(Boolean isSpot) {
            this.isSpot = isSpot;
            return this;
        }
        public Boolean getIsSpot() {
            return this.isSpot;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setCPU(Integer CPU) {
            this.CPU = CPU;
            return this;
        }
        public Integer getCPU() {
            return this.CPU;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setIoOptimized(Boolean ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public Boolean getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

    }

    public static class DescribeAutoProvisioningGroupInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance> instance;

        public static DescribeAutoProvisioningGroupInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutoProvisioningGroupInstancesResponseBodyInstances self = new DescribeAutoProvisioningGroupInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeAutoProvisioningGroupInstancesResponseBodyInstances setInstance(java.util.List<DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeAutoProvisioningGroupInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
