// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppstackstenantidRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutAppstackstenantidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppstackstenantidRequest self = new GetLinkeBahamutAppstackstenantidRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppstackstenantidRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
