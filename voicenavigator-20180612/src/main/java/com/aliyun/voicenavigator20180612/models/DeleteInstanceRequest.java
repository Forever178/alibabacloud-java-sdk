// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DeleteInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceRequest self = new DeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
