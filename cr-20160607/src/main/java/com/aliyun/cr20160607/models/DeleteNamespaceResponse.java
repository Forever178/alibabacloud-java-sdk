// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class DeleteNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static DeleteNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNamespaceResponse self = new DeleteNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
