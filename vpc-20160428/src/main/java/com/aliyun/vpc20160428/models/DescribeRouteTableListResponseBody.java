// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteTableListResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RouterTableList")
    public DescribeRouteTableListResponseBodyRouterTableList routerTableList;

    public static DescribeRouteTableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTableListResponseBody self = new DescribeRouteTableListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTableListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRouteTableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouteTableListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouteTableListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouteTableListResponseBody setRouterTableList(DescribeRouteTableListResponseBodyRouterTableList routerTableList) {
        this.routerTableList = routerTableList;
        return this;
    }
    public DescribeRouteTableListResponseBodyRouterTableList getRouterTableList() {
        return this.routerTableList;
    }

    public static class DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag self = new DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag> tag;

        public static DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags self = new DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags setTag(java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        public java.util.List<String> vSwitchId;

        public static DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds self = new DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds setVSwitchId(java.util.List<String> vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public java.util.List<String> getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class DescribeRouteTableListResponseBodyRouterTableListRouterTableListType extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("RouterId")
        public String routerId;

        @NameInMap("Tags")
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags tags;

        @NameInMap("RouteTableId")
        public String routeTableId;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RouteTableType")
        public String routeTableType;

        @NameInMap("VSwitchIds")
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds vSwitchIds;

        @NameInMap("RouterType")
        public String routerType;

        @NameInMap("RouteTableName")
        public String routeTableName;

        public static DescribeRouteTableListResponseBodyRouterTableListRouterTableListType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouterTableListRouterTableListType self = new DescribeRouteTableListResponseBodyRouterTableListRouterTableListType();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setTags(DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeTags getTags() {
            return this.tags;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setRouteTableType(String routeTableType) {
            this.routeTableType = routeTableType;
            return this;
        }
        public String getRouteTableType() {
            return this.routeTableType;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setVSwitchIds(DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListTypeVSwitchIds getVSwitchIds() {
            return this.vSwitchIds;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public DescribeRouteTableListResponseBodyRouterTableListRouterTableListType setRouteTableName(String routeTableName) {
            this.routeTableName = routeTableName;
            return this;
        }
        public String getRouteTableName() {
            return this.routeTableName;
        }

    }

    public static class DescribeRouteTableListResponseBodyRouterTableList extends TeaModel {
        @NameInMap("RouterTableListType")
        public java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListType> routerTableListType;

        public static DescribeRouteTableListResponseBodyRouterTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouteTableListResponseBodyRouterTableList self = new DescribeRouteTableListResponseBodyRouterTableList();
            return TeaModel.build(map, self);
        }

        public DescribeRouteTableListResponseBodyRouterTableList setRouterTableListType(java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListType> routerTableListType) {
            this.routerTableListType = routerTableListType;
            return this;
        }
        public java.util.List<DescribeRouteTableListResponseBodyRouterTableListRouterTableListType> getRouterTableListType() {
            return this.routerTableListType;
        }

    }

}
