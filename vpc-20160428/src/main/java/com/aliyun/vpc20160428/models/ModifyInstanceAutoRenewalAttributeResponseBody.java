// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewalAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAutoRenewalAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewalAttributeResponseBody self = new ModifyInstanceAutoRenewalAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewalAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
