// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CloneFlowRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RegionId")
    public String regionId;

    public static CloneFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneFlowRequest self = new CloneFlowRequest();
        return TeaModel.build(map, self);
    }

    public CloneFlowRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CloneFlowRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CloneFlowRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
