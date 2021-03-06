// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckServiceLinkedRoleResponseBody body;

    public static CheckServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleResponse self = new CheckServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckServiceLinkedRoleResponse setBody(CheckServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}
