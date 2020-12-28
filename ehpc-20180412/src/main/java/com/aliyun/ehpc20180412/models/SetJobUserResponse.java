// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SetJobUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetJobUserResponseBody body;

    public static SetJobUserResponse build(java.util.Map<String, ?> map) throws Exception {
        SetJobUserResponse self = new SetJobUserResponse();
        return TeaModel.build(map, self);
    }

    public SetJobUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetJobUserResponse setBody(SetJobUserResponseBody body) {
        this.body = body;
        return this;
    }
    public SetJobUserResponseBody getBody() {
        return this.body;
    }

}
