// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class PayOrderCallbackResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static PayOrderCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        PayOrderCallbackResponse self = new PayOrderCallbackResponse();
        return TeaModel.build(map, self);
    }

    public PayOrderCallbackResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
