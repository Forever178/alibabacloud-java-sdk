// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ListVpcEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcEndpointsResponseBody body;

    public static ListVpcEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointsResponse self = new ListVpcEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcEndpointsResponse setBody(ListVpcEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcEndpointsResponseBody getBody() {
        return this.body;
    }

}
