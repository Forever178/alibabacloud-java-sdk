// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMSDssIdcRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMSDssIdcRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMSDssIdcRequest self = new ListMSDssIdcRequest();
        return TeaModel.build(map, self);
    }

    public ListMSDssIdcRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
