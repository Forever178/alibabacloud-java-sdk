// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateRouteTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateRouteTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateRouteTableResponseBody self = new AssociateRouteTableResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateRouteTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
