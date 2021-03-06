// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyCommonBandwidthPackagePayTypeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("Code")
    public String code;

    public static ModifyCommonBandwidthPackagePayTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCommonBandwidthPackagePayTypeResponseBody self = new ModifyCommonBandwidthPackagePayTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCommonBandwidthPackagePayTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyCommonBandwidthPackagePayTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCommonBandwidthPackagePayTypeResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyCommonBandwidthPackagePayTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
