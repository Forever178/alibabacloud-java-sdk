// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenBandwidthPackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCenBandwidthPackageResponseBody body;

    public static DeleteCenBandwidthPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenBandwidthPackageResponse self = new DeleteCenBandwidthPackageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCenBandwidthPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCenBandwidthPackageResponse setBody(DeleteCenBandwidthPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCenBandwidthPackageResponseBody getBody() {
        return this.body;
    }

}
