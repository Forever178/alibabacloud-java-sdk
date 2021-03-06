// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListProjectCustomFieldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProjectCustomFieldsResponseBody body;

    public static ListProjectCustomFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectCustomFieldsResponse self = new ListProjectCustomFieldsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectCustomFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProjectCustomFieldsResponse setBody(ListProjectCustomFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProjectCustomFieldsResponseBody getBody() {
        return this.body;
    }

}
