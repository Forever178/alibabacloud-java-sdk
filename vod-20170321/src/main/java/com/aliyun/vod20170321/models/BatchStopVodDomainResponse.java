// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchStopVodDomainResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static BatchStopVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopVodDomainResponse self = new BatchStopVodDomainResponse();
        return TeaModel.build(map, self);
    }

}
