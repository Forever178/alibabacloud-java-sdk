// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMcubeVhostRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("TenantId")
    @Validation(required = true)
    public String tenantId;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static QueryMcubeVhostRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMcubeVhostRequest self = new QueryMcubeVhostRequest();
        return TeaModel.build(map, self);
    }

}
