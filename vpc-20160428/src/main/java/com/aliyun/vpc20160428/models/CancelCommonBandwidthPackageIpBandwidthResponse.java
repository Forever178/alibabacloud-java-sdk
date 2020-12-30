// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CancelCommonBandwidthPackageIpBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelCommonBandwidthPackageIpBandwidthResponseBody body;

    public static CancelCommonBandwidthPackageIpBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCommonBandwidthPackageIpBandwidthResponse self = new CancelCommonBandwidthPackageIpBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public CancelCommonBandwidthPackageIpBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCommonBandwidthPackageIpBandwidthResponse setBody(CancelCommonBandwidthPackageIpBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCommonBandwidthPackageIpBandwidthResponseBody getBody() {
        return this.body;
    }

}
