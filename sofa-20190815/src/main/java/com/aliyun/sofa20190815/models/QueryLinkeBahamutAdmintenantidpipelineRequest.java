// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAdmintenantidpipelineRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutAdmintenantidpipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAdmintenantidpipelineRequest self = new QueryLinkeBahamutAdmintenantidpipelineRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAdmintenantidpipelineRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
