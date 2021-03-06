// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class RegisterPhotoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterPhotoResponseBody body;

    public static RegisterPhotoResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterPhotoResponse self = new RegisterPhotoResponse();
        return TeaModel.build(map, self);
    }

    public RegisterPhotoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterPhotoResponse setBody(RegisterPhotoResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterPhotoResponseBody getBody() {
        return this.body;
    }

}
