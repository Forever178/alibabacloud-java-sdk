// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDashboardResponseBody body;

    public static ListDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardResponse self = new ListDashboardResponse();
        return TeaModel.build(map, self);
    }

    public ListDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDashboardResponse setBody(ListDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDashboardResponseBody getBody() {
        return this.body;
    }

}
