// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateFlowlogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowLogId")
    public String flowLogId;

    @NameInMap("Success")
    public String success;

    public static CreateFlowlogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowlogResponseBody self = new CreateFlowlogResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowlogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowlogResponseBody setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

    public CreateFlowlogResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
