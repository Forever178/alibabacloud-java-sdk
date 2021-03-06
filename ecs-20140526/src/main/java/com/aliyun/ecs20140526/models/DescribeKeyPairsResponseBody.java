// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeKeyPairsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("KeyPairs")
    public DescribeKeyPairsResponseBodyKeyPairs keyPairs;

    public static DescribeKeyPairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeyPairsResponseBody self = new DescribeKeyPairsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKeyPairsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeKeyPairsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKeyPairsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKeyPairsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeKeyPairsResponseBody setKeyPairs(DescribeKeyPairsResponseBodyKeyPairs keyPairs) {
        this.keyPairs = keyPairs;
        return this;
    }
    public DescribeKeyPairsResponseBodyKeyPairs getKeyPairs() {
        return this.keyPairs;
    }

    public static class DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag self = new DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class DescribeKeyPairsResponseBodyKeyPairsKeyPairTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag> tag;

        public static DescribeKeyPairsResponseBodyKeyPairsKeyPairTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseBodyKeyPairsKeyPairTags self = new DescribeKeyPairsResponseBodyKeyPairsKeyPairTags();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPairTags setTag(java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPairTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeKeyPairsResponseBodyKeyPairsKeyPair extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Tags")
        public DescribeKeyPairsResponseBodyKeyPairsKeyPairTags tags;

        @NameInMap("KeyPairFingerPrint")
        public String keyPairFingerPrint;

        public static DescribeKeyPairsResponseBodyKeyPairsKeyPair build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseBodyKeyPairsKeyPair self = new DescribeKeyPairsResponseBodyKeyPairsKeyPair();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setTags(DescribeKeyPairsResponseBodyKeyPairsKeyPairTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeKeyPairsResponseBodyKeyPairsKeyPairTags getTags() {
            return this.tags;
        }

        public DescribeKeyPairsResponseBodyKeyPairsKeyPair setKeyPairFingerPrint(String keyPairFingerPrint) {
            this.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }
        public String getKeyPairFingerPrint() {
            return this.keyPairFingerPrint;
        }

    }

    public static class DescribeKeyPairsResponseBodyKeyPairs extends TeaModel {
        @NameInMap("KeyPair")
        public java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPair> keyPair;

        public static DescribeKeyPairsResponseBodyKeyPairs build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeyPairsResponseBodyKeyPairs self = new DescribeKeyPairsResponseBodyKeyPairs();
            return TeaModel.build(map, self);
        }

        public DescribeKeyPairsResponseBodyKeyPairs setKeyPair(java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPair> keyPair) {
            this.keyPair = keyPair;
            return this;
        }
        public java.util.List<DescribeKeyPairsResponseBodyKeyPairsKeyPair> getKeyPair() {
            return this.keyPair;
        }

    }

}
