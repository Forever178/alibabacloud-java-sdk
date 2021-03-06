// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetAuthorizationUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuthorizationUrlResponseBody body;

    public static GetAuthorizationUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationUrlResponse self = new GetAuthorizationUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorizationUrlResponse setBody(GetAuthorizationUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorizationUrlResponseBody getBody() {
        return this.body;
    }

}
