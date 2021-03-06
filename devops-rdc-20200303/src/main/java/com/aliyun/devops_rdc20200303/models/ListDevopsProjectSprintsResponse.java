// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectSprintsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDevopsProjectSprintsResponseBody body;

    public static ListDevopsProjectSprintsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectSprintsResponse self = new ListDevopsProjectSprintsResponse();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectSprintsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDevopsProjectSprintsResponse setBody(ListDevopsProjectSprintsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDevopsProjectSprintsResponseBody getBody() {
        return this.body;
    }

}
