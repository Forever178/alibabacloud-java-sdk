// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DeleteDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDataSetResponseBody body;

    public static DeleteDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSetResponse self = new DeleteDataSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataSetResponse setBody(DeleteDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataSetResponseBody getBody() {
        return this.body;
    }

}
