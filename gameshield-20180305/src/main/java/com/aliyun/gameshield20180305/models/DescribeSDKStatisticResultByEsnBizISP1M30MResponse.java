// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeSDKStatisticResultByEsnBizISP1M30MResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSDKStatisticResultByEsnBizISP1M30MResponseBody body;

    public static DescribeSDKStatisticResultByEsnBizISP1M30MResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSDKStatisticResultByEsnBizISP1M30MResponse self = new DescribeSDKStatisticResultByEsnBizISP1M30MResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MResponse setBody(DescribeSDKStatisticResultByEsnBizISP1M30MResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSDKStatisticResultByEsnBizISP1M30MResponseBody getBody() {
        return this.body;
    }

}
