// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVpnRouteEntryResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteVpnRouteEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpnRouteEntryResponse self = new DeleteVpnRouteEntryResponse();
        return TeaModel.build(map, self);
    }

}
