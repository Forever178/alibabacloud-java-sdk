// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DbInstance")
    public DescribeDrdsDBClusterResponseBodyDbInstance dbInstance;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBClusterResponseBody self = new DescribeDrdsDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDBClusterResponseBody setDbInstance(DescribeDrdsDBClusterResponseBodyDbInstance dbInstance) {
        this.dbInstance = dbInstance;
        return this;
    }
    public DescribeDrdsDBClusterResponseBodyDbInstance getDbInstance() {
        return this.dbInstance;
    }

    public DescribeDrdsDBClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsDBClusterResponseBodyDbInstanceEndpointsEndpoint extends TeaModel {
        @NameInMap("ReadWeight")
        public Integer readWeight;

        @NameInMap("NodeIds")
        public String nodeIds;

        @NameInMap("EndpointId")
        public String endpointId;

        public static DescribeDrdsDBClusterResponseBodyDbInstanceEndpointsEndpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBClusterResponseBodyDbInstanceEndpointsEndpoint self = new DescribeDrdsDBClusterResponseBodyDbInstanceEndpointsEndpoint();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBClusterResponseBodyDbInstanceEndpointsEndpoint setReadWeight(Integer readWeight) {
            this.readWeight = readWeight;
            return this;
        }
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstanceEndpointsEndpoint setNodeIds(String nodeIds) {
            this.nodeIds = nodeIds;
            return this;
        }
        public String getNodeIds() {
            return this.nodeIds;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstanceEndpointsEndpoint setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

    }

    public static class DescribeDrdsDBClusterResponseBodyDbInstanceEndpoints extends TeaModel {
        @NameInMap("Endpoint")
        public java.util.List<DescribeDrdsDBClusterResponseBodyDbInstanceEndpointsEndpoint> endpoint;

        public static DescribeDrdsDBClusterResponseBodyDbInstanceEndpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBClusterResponseBodyDbInstanceEndpoints self = new DescribeDrdsDBClusterResponseBodyDbInstanceEndpoints();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBClusterResponseBodyDbInstanceEndpoints setEndpoint(java.util.List<DescribeDrdsDBClusterResponseBodyDbInstanceEndpointsEndpoint> endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public java.util.List<DescribeDrdsDBClusterResponseBodyDbInstanceEndpointsEndpoint> getEndpoint() {
            return this.endpoint;
        }

    }

    public static class DescribeDrdsDBClusterResponseBodyDbInstanceDBNodesDBNode extends TeaModel {
        @NameInMap("DBNodeRole")
        public String DBNodeRole;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("DBNodeId")
        public String DBNodeId;

        @NameInMap("DBNodeStatus")
        public String DBNodeStatus;

        public static DescribeDrdsDBClusterResponseBodyDbInstanceDBNodesDBNode build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBClusterResponseBodyDbInstanceDBNodesDBNode self = new DescribeDrdsDBClusterResponseBodyDbInstanceDBNodesDBNode();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBClusterResponseBodyDbInstanceDBNodesDBNode setDBNodeRole(String DBNodeRole) {
            this.DBNodeRole = DBNodeRole;
            return this;
        }
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstanceDBNodesDBNode setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstanceDBNodesDBNode setDBNodeId(String DBNodeId) {
            this.DBNodeId = DBNodeId;
            return this;
        }
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstanceDBNodesDBNode setDBNodeStatus(String DBNodeStatus) {
            this.DBNodeStatus = DBNodeStatus;
            return this;
        }
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

    }

    public static class DescribeDrdsDBClusterResponseBodyDbInstanceDBNodes extends TeaModel {
        @NameInMap("DBNode")
        public java.util.List<DescribeDrdsDBClusterResponseBodyDbInstanceDBNodesDBNode> DBNode;

        public static DescribeDrdsDBClusterResponseBodyDbInstanceDBNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBClusterResponseBodyDbInstanceDBNodes self = new DescribeDrdsDBClusterResponseBodyDbInstanceDBNodes();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBClusterResponseBodyDbInstanceDBNodes setDBNode(java.util.List<DescribeDrdsDBClusterResponseBodyDbInstanceDBNodesDBNode> DBNode) {
            this.DBNode = DBNode;
            return this;
        }
        public java.util.List<DescribeDrdsDBClusterResponseBodyDbInstanceDBNodesDBNode> getDBNode() {
            return this.DBNode;
        }

    }

    public static class DescribeDrdsDBClusterResponseBodyDbInstance extends TeaModel {
        @NameInMap("Endpoints")
        public DescribeDrdsDBClusterResponseBodyDbInstanceEndpoints endpoints;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("DBInstanceStatus")
        public String DBInstanceStatus;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("EngineVersion")
        public String engineVersion;

        @NameInMap("DBNodes")
        public DescribeDrdsDBClusterResponseBodyDbInstanceDBNodes DBNodes;

        @NameInMap("RdsInstType")
        public String rdsInstType;

        @NameInMap("RemainDays")
        public String remainDays;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DbInstType")
        public String dbInstType;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("ReadMode")
        public String readMode;

        public static DescribeDrdsDBClusterResponseBodyDbInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBClusterResponseBodyDbInstance self = new DescribeDrdsDBClusterResponseBodyDbInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setEndpoints(DescribeDrdsDBClusterResponseBodyDbInstanceEndpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public DescribeDrdsDBClusterResponseBodyDbInstanceEndpoints getEndpoints() {
            return this.endpoints;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setDBInstanceStatus(String DBInstanceStatus) {
            this.DBInstanceStatus = DBInstanceStatus;
            return this;
        }
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setDBNodes(DescribeDrdsDBClusterResponseBodyDbInstanceDBNodes DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }
        public DescribeDrdsDBClusterResponseBodyDbInstanceDBNodes getDBNodes() {
            return this.DBNodes;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setRdsInstType(String rdsInstType) {
            this.rdsInstType = rdsInstType;
            return this;
        }
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setRemainDays(String remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public String getRemainDays() {
            return this.remainDays;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setDbInstType(String dbInstType) {
            this.dbInstType = dbInstType;
            return this;
        }
        public String getDbInstType() {
            return this.dbInstType;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDrdsDBClusterResponseBodyDbInstance setReadMode(String readMode) {
            this.readMode = readMode;
            return this;
        }
        public String getReadMode() {
            return this.readMode;
        }

    }

}
