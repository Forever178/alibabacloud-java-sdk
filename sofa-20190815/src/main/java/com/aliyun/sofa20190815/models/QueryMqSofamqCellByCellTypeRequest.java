// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqCellByCellTypeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMqSofamqCellByCellTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqCellByCellTypeRequest self = new QueryMqSofamqCellByCellTypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqCellByCellTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
