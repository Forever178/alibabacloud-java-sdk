// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowCategoryRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Id")
    public String id;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeFlowCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowCategoryRequest self = new DescribeFlowCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowCategoryRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeFlowCategoryRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFlowCategoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
