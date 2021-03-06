// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasAdminConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasAdminConfigResponseBody body;

    public static CreateHasAdminConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasAdminConfigResponse self = new CreateHasAdminConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasAdminConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasAdminConfigResponse setBody(CreateHasAdminConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasAdminConfigResponseBody getBody() {
        return this.body;
    }

}
