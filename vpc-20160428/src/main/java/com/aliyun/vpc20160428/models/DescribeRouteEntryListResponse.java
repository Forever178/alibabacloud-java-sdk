// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouteEntryListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRouteEntryListResponseBody body;

    public static DescribeRouteEntryListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteEntryListResponse self = new DescribeRouteEntryListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouteEntryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRouteEntryListResponse setBody(DescribeRouteEntryListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouteEntryListResponseBody getBody() {
        return this.body;
    }

}
