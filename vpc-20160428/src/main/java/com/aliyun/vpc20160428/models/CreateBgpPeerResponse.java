// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpPeerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBgpPeerResponseBody body;

    public static CreateBgpPeerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpPeerResponse self = new CreateBgpPeerResponse();
        return TeaModel.build(map, self);
    }

    public CreateBgpPeerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBgpPeerResponse setBody(CreateBgpPeerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBgpPeerResponseBody getBody() {
        return this.body;
    }

}
