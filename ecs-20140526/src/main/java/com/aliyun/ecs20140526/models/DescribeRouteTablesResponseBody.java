// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRouteTablesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RouteTables")
    public DescribeRouteTablesResponseBodyRouteTables routeTables;

    public static DescribeRouteTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTablesResponseBody self = new DescribeRouteTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRouteTablesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteTablesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteTablesResponseBody setRouteTables(DescribeRouteTablesResponseBodyRouteTables routeTables) {
        this.routeTables = routeTables;
        return this;
    }
    public DescribeRouteTablesResponseBodyRouteTables getRouteTables() {
        return this.routeTables;
    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop extends TeaModel {
        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("NextHopId")
        public String nextHopId;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("Enabled")
        public Integer enabled;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopId(String nextHopId) {
            this.nextHopId = nextHopId;
            return this;
        }
        public String getNextHopId() {
            return this.nextHopId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop setEnabled(Integer enabled) {
            this.enabled = enabled;
            return this;
        }
        public Integer getEnabled() {
            return this.enabled;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops extends TeaModel {
        @NameInMap("NextHop")
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> nextHop;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops setNextHop(java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> nextHop) {
            this.nextHop = nextHop;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHopsNextHop> getNextHop() {
            return this.nextHop;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("NextHopType")
        public String nextHopType;

        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("NextHops")
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops nextHops;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setNextHopType(String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }
        public String getNextHopType() {
            return this.nextHopType;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setNextHops(DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops nextHops) {
            this.nextHops = nextHops;
            return this;
        }
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntryNextHops getNextHops() {
            return this.nextHops;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys extends TeaModel {
        @NameInMap("RouteEntry")
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry> routeEntry;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys self = new DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys setRouteEntry(java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry> routeEntry) {
            this.routeEntry = routeEntry;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrysRouteEntry> getRouteEntry() {
            return this.routeEntry;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTablesRouteTable extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VRouterId")
        public String VRouterId;

        @NameInMap("RouteEntrys")
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys routeEntrys;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RouteTableType")
        public String routeTableType;

        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeRouteTablesResponseBodyRouteTablesRouteTable build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTablesRouteTable self = new DescribeRouteTablesResponseBodyRouteTablesRouteTable();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setVRouterId(String VRouterId) {
            this.VRouterId = VRouterId;
            return this;
        }
        public String getVRouterId() {
            return this.VRouterId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setRouteEntrys(DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys routeEntrys) {
            this.routeEntrys = routeEntrys;
            return this;
        }
        public DescribeRouteTablesResponseBodyRouteTablesRouteTableRouteEntrys getRouteEntrys() {
            return this.routeEntrys;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeRouteTablesResponseBodyRouteTablesRouteTable setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeRouteTablesResponseBodyRouteTables extends TeaModel {
        @NameInMap("RouteTable")
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTable> routeTable;

        public static DescribeRouteTablesResponseBodyRouteTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTablesResponseBodyRouteTables self = new DescribeRouteTablesResponseBodyRouteTables();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTablesResponseBodyRouteTables setRouteTable(java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTable> routeTable) {
            this.routeTable = routeTable;
            return this;
        }
        public java.util.List<DescribeRouteTablesResponseBodyRouteTablesRouteTable> getRouteTable() {
            return this.routeTable;
        }

    }

}
