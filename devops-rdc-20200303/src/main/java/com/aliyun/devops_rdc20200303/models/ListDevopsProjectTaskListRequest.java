// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectTaskListRequest extends TeaModel {
    @NameInMap("OrgId")
    public String orgId;

    @NameInMap("ProjectId")
    public String projectId;

    public static ListDevopsProjectTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectTaskListRequest self = new ListDevopsProjectTaskListRequest();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectTaskListRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public ListDevopsProjectTaskListRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
