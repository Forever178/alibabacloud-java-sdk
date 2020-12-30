// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGlobalAccelerationInstancesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GlobalAccelerationInstances")
    public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances globalAccelerationInstances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeGlobalAccelerationInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalAccelerationInstancesResponseBody self = new DescribeGlobalAccelerationInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalAccelerationInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGlobalAccelerationInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGlobalAccelerationInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalAccelerationInstancesResponseBody setGlobalAccelerationInstances(DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances globalAccelerationInstances) {
        this.globalAccelerationInstances = globalAccelerationInstances;
        return this;
    }
    public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances getGlobalAccelerationInstances() {
        return this.globalAccelerationInstances;
    }

    public DescribeGlobalAccelerationInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress extends TeaModel {
        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("AllocationId")
        public String allocationId;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses extends TeaModel {
        @NameInMap("PublicIpAddress")
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress> publicIpAddress;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses setPublicIpAddress(java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress> publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddressesPublicIpAddress> getPublicIpAddress() {
            return this.publicIpAddress;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer extends TeaModel {
        @NameInMap("ServerIpAddress")
        public String serverIpAddress;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerType")
        public String serverType;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setServerIpAddress(String serverIpAddress) {
            this.serverIpAddress = serverIpAddress;
            return this;
        }
        public String getServerIpAddress() {
            return this.serverIpAddress;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer> backendServer;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers setBackendServer(java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance extends TeaModel {
        @NameInMap("PublicIpAddresses")
        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses publicIpAddresses;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("BackendServers")
        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers backendServers;

        @NameInMap("BandwidthType")
        public String bandwidthType;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("GlobalAccelerationInstanceId")
        public String globalAccelerationInstanceId;

        @NameInMap("ServiceLocation")
        public String serviceLocation;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("AccelerationLocation")
        public String accelerationLocation;

        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("Description")
        public String description;

        @NameInMap("Bandwidth")
        public String bandwidth;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("Name")
        public String name;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setPublicIpAddresses(DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses publicIpAddresses) {
            this.publicIpAddresses = publicIpAddresses;
            return this;
        }
        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstancePublicIpAddresses getPublicIpAddresses() {
            return this.publicIpAddresses;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setBackendServers(DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }
        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstanceBackendServers getBackendServers() {
            return this.backendServers;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
            this.globalAccelerationInstanceId = globalAccelerationInstanceId;
            return this;
        }
        public String getGlobalAccelerationInstanceId() {
            return this.globalAccelerationInstanceId;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setServiceLocation(String serviceLocation) {
            this.serviceLocation = serviceLocation;
            return this;
        }
        public String getServiceLocation() {
            return this.serviceLocation;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setAccelerationLocation(String accelerationLocation) {
            this.accelerationLocation = accelerationLocation;
            return this;
        }
        public String getAccelerationLocation() {
            return this.accelerationLocation;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances extends TeaModel {
        @NameInMap("GlobalAccelerationInstance")
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance;

        public static DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances self = new DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstances setGlobalAccelerationInstance(java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance> globalAccelerationInstance) {
            this.globalAccelerationInstance = globalAccelerationInstance;
            return this;
        }
        public java.util.List<DescribeGlobalAccelerationInstancesResponseBodyGlobalAccelerationInstancesGlobalAccelerationInstance> getGlobalAccelerationInstance() {
            return this.globalAccelerationInstance;
        }

    }

}
