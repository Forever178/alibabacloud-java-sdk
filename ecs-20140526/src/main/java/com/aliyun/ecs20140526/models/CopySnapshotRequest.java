// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CopySnapshotRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<CopySnapshotRequestTag> tag;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DestinationRegionId")
    public String destinationRegionId;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("DestinationSnapshotName")
    public String destinationSnapshotName;

    @NameInMap("DestinationSnapshotDescription")
    public String destinationSnapshotDescription;

    @NameInMap("RetentionDays")
    public Integer retentionDays;

    public static CopySnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CopySnapshotRequest self = new CopySnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CopySnapshotRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CopySnapshotRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CopySnapshotRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CopySnapshotRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CopySnapshotRequest setTag(java.util.List<CopySnapshotRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CopySnapshotRequestTag> getTag() {
        return this.tag;
    }

    public CopySnapshotRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CopySnapshotRequest setDestinationRegionId(String destinationRegionId) {
        this.destinationRegionId = destinationRegionId;
        return this;
    }
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    public CopySnapshotRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CopySnapshotRequest setDestinationSnapshotName(String destinationSnapshotName) {
        this.destinationSnapshotName = destinationSnapshotName;
        return this;
    }
    public String getDestinationSnapshotName() {
        return this.destinationSnapshotName;
    }

    public CopySnapshotRequest setDestinationSnapshotDescription(String destinationSnapshotDescription) {
        this.destinationSnapshotDescription = destinationSnapshotDescription;
        return this;
    }
    public String getDestinationSnapshotDescription() {
        return this.destinationSnapshotDescription;
    }

    public CopySnapshotRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public static class CopySnapshotRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CopySnapshotRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CopySnapshotRequestTag self = new CopySnapshotRequestTag();
            return TeaModel.build(map, self);
        }

        public CopySnapshotRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CopySnapshotRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
