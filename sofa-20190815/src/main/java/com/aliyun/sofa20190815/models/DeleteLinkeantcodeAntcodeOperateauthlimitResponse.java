// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeOperateauthlimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeOperateauthlimitResponseBody body;

    public static DeleteLinkeantcodeAntcodeOperateauthlimitResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeOperateauthlimitResponse self = new DeleteLinkeantcodeAntcodeOperateauthlimitResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeOperateauthlimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeOperateauthlimitResponse setBody(DeleteLinkeantcodeAntcodeOperateauthlimitResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeOperateauthlimitResponseBody getBody() {
        return this.body;
    }

}
