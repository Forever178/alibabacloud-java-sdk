// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBgpGroupsResponseBody body;

    public static DescribeBgpGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpGroupsResponse self = new DescribeBgpGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBgpGroupsResponse setBody(DescribeBgpGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBgpGroupsResponseBody getBody() {
        return this.body;
    }

}
