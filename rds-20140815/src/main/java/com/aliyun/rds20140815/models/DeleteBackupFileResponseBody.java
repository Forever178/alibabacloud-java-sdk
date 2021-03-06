// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteBackupFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeletedBaksetIds")
    public DeleteBackupFileResponseBodyDeletedBaksetIds deletedBaksetIds;

    public static DeleteBackupFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupFileResponseBody self = new DeleteBackupFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackupFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteBackupFileResponseBody setDeletedBaksetIds(DeleteBackupFileResponseBodyDeletedBaksetIds deletedBaksetIds) {
        this.deletedBaksetIds = deletedBaksetIds;
        return this;
    }
    public DeleteBackupFileResponseBodyDeletedBaksetIds getDeletedBaksetIds() {
        return this.deletedBaksetIds;
    }

    public static class DeleteBackupFileResponseBodyDeletedBaksetIds extends TeaModel {
        @NameInMap("DeletedBaksetIds")
        public java.util.List<Integer> deletedBaksetIds;

        public static DeleteBackupFileResponseBodyDeletedBaksetIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteBackupFileResponseBodyDeletedBaksetIds self = new DeleteBackupFileResponseBodyDeletedBaksetIds();
            return TeaModel.build(map, self);
        }

        public DeleteBackupFileResponseBodyDeletedBaksetIds setDeletedBaksetIds(java.util.List<Integer> deletedBaksetIds) {
            this.deletedBaksetIds = deletedBaksetIds;
            return this;
        }
        public java.util.List<Integer> getDeletedBaksetIds() {
            return this.deletedBaksetIds;
        }

    }

}
