// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBgpGroupAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBgpGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBgpGroupAttributeResponseBody self = new ModifyBgpGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBgpGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
