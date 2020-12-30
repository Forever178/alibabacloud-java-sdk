// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouterInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRouterInterfaceResponseBody body;

    public static DeleteRouterInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouterInterfaceResponse self = new DeleteRouterInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouterInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouterInterfaceResponse setBody(DeleteRouterInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouterInterfaceResponseBody getBody() {
        return this.body;
    }

}
