// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlszdataconsoleurlRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ProjectId")
    public String projectId;

    public static QueryLinkefabricFabricUrlszdataconsoleurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlszdataconsoleurlRequest self = new QueryLinkefabricFabricUrlszdataconsoleurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlszdataconsoleurlRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricUrlszdataconsoleurlRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
