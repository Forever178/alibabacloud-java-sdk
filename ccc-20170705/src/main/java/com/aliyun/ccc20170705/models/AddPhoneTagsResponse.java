// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddPhoneTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddPhoneTagsResponseBody body;

    public static AddPhoneTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPhoneTagsResponse self = new AddPhoneTagsResponse();
        return TeaModel.build(map, self);
    }

    public AddPhoneTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPhoneTagsResponse setBody(AddPhoneTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPhoneTagsResponseBody getBody() {
        return this.body;
    }

}
