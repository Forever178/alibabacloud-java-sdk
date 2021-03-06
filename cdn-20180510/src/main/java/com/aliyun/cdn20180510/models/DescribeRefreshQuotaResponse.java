// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeRefreshQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRefreshQuotaResponseBody body;

    public static DescribeRefreshQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRefreshQuotaResponse self = new DescribeRefreshQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRefreshQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRefreshQuotaResponse setBody(DescribeRefreshQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRefreshQuotaResponseBody getBody() {
        return this.body;
    }

}
