// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CompleteBoardRecordRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("EndTime")
    public String endTime;

    public static CompleteBoardRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteBoardRecordRequest self = new CompleteBoardRecordRequest();
        return TeaModel.build(map, self);
    }

    public CompleteBoardRecordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CompleteBoardRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CompleteBoardRecordRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public CompleteBoardRecordRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
