// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateStackInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OperationId")
    public String operationId;

    public static CreateStackInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStackInstancesResponseBody self = new CreateStackInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStackInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStackInstancesResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

}
