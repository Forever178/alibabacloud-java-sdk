// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeArtifactsmanagementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeArtifactsmanagementResponseBody body;

    public static DeleteLinkeantcodeAntcodeArtifactsmanagementResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeArtifactsmanagementResponse self = new DeleteLinkeantcodeAntcodeArtifactsmanagementResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeArtifactsmanagementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeArtifactsmanagementResponse setBody(DeleteLinkeantcodeAntcodeArtifactsmanagementResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeArtifactsmanagementResponseBody getBody() {
        return this.body;
    }

}
