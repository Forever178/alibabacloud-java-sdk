// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static ModifySecurityIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsResponse self = new ModifySecurityIpsResponse();
        return TeaModel.build(map, self);
    }

}
