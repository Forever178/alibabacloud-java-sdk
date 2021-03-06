// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ListBandwidthPackagesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("BandwidthPackages")
    public java.util.List<ListBandwidthPackagesResponseBodyBandwidthPackages> bandwidthPackages;

    public static ListBandwidthPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBandwidthPackagesResponseBody self = new ListBandwidthPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBandwidthPackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListBandwidthPackagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBandwidthPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBandwidthPackagesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBandwidthPackagesResponseBody setBandwidthPackages(java.util.List<ListBandwidthPackagesResponseBodyBandwidthPackages> bandwidthPackages) {
        this.bandwidthPackages = bandwidthPackages;
        return this;
    }
    public java.util.List<ListBandwidthPackagesResponseBodyBandwidthPackages> getBandwidthPackages() {
        return this.bandwidthPackages;
    }

    public static class ListBandwidthPackagesResponseBodyBandwidthPackages extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("BandwidthType")
        public String bandwidthType;

        @NameInMap("State")
        public String state;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("CbnGeographicRegionIdA")
        public String cbnGeographicRegionIdA;

        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Accelerators")
        public java.util.List<String> accelerators;

        @NameInMap("CbnGeographicRegionIdB")
        public String cbnGeographicRegionIdB;

        @NameInMap("Name")
        public String name;

        @NameInMap("BillingType")
        public String billingType;

        public static ListBandwidthPackagesResponseBodyBandwidthPackages build(java.util.Map<String, ?> map) throws Exception {
            ListBandwidthPackagesResponseBodyBandwidthPackages self = new ListBandwidthPackagesResponseBodyBandwidthPackages();
            return TeaModel.build(map, self);
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setBandwidthType(String bandwidthType) {
            this.bandwidthType = bandwidthType;
            return this;
        }
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setCbnGeographicRegionIdA(String cbnGeographicRegionIdA) {
            this.cbnGeographicRegionIdA = cbnGeographicRegionIdA;
            return this;
        }
        public String getCbnGeographicRegionIdA() {
            return this.cbnGeographicRegionIdA;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setAccelerators(java.util.List<String> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public java.util.List<String> getAccelerators() {
            return this.accelerators;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setCbnGeographicRegionIdB(String cbnGeographicRegionIdB) {
            this.cbnGeographicRegionIdB = cbnGeographicRegionIdB;
            return this;
        }
        public String getCbnGeographicRegionIdB() {
            return this.cbnGeographicRegionIdB;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBandwidthPackagesResponseBodyBandwidthPackages setBillingType(String billingType) {
            this.billingType = billingType;
            return this;
        }
        public String getBillingType() {
            return this.billingType;
        }

    }

}
