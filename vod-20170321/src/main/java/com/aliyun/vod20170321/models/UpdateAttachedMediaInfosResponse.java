// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAttachedMediaInfosResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NonExistMediaIds")
    @Validation(required = true)
    public java.util.List<String> nonExistMediaIds;

    public static UpdateAttachedMediaInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttachedMediaInfosResponse self = new UpdateAttachedMediaInfosResponse();
        return TeaModel.build(map, self);
    }

}
