// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupNotifyPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMonitorGroupNotifyPolicyResponseBody body;

    public static DeleteMonitorGroupNotifyPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupNotifyPolicyResponse self = new DeleteMonitorGroupNotifyPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupNotifyPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMonitorGroupNotifyPolicyResponse setBody(DeleteMonitorGroupNotifyPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMonitorGroupNotifyPolicyResponseBody getBody() {
        return this.body;
    }

}
