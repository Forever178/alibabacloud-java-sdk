// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutBuildconfigRequest extends TeaModel {
    @NameInMap("TenantPath")
    public String tenantPath;

    public static QueryLinkeBahamutBuildconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutBuildconfigRequest self = new QueryLinkeBahamutBuildconfigRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutBuildconfigRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

}
