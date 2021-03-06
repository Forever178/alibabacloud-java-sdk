// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateFlowJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFlowJobResponseBody body;

    public static CreateFlowJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowJobResponse self = new CreateFlowJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateFlowJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFlowJobResponse setBody(CreateFlowJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFlowJobResponseBody getBody() {
        return this.body;
    }

}
