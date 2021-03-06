// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DescribeReplicationJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeReplicationJobsResponseBody body;

    public static DescribeReplicationJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationJobsResponse self = new DescribeReplicationJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeReplicationJobsResponse setBody(DescribeReplicationJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeReplicationJobsResponseBody getBody() {
        return this.body;
    }

}
