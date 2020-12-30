// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRouteEntryResponseBody body;

    public static DeleteRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntryResponse self = new DeleteRouteEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteEntryResponse setBody(DeleteRouteEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteEntryResponseBody getBody() {
        return this.body;
    }

}
