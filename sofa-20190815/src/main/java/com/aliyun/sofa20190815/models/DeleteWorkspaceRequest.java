// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceRequest extends TeaModel {
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceRequest self = new DeleteWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
