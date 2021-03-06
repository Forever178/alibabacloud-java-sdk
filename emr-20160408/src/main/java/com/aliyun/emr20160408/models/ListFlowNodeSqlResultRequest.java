// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListFlowNodeSqlResultRequest extends TeaModel {
    @NameInMap("NodeInstanceId")
    public String nodeInstanceId;

    @NameInMap("SqlIndex")
    public Integer sqlIndex;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("Length")
    public Integer length;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    public static ListFlowNodeSqlResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodeSqlResultRequest self = new ListFlowNodeSqlResultRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowNodeSqlResultRequest setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    public ListFlowNodeSqlResultRequest setSqlIndex(Integer sqlIndex) {
        this.sqlIndex = sqlIndex;
        return this;
    }
    public Integer getSqlIndex() {
        return this.sqlIndex;
    }

    public ListFlowNodeSqlResultRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListFlowNodeSqlResultRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public ListFlowNodeSqlResultRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFlowNodeSqlResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
