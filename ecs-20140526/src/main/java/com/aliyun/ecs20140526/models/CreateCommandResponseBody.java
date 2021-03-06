// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CommandId")
    public String commandId;

    public static CreateCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandResponseBody self = new CreateCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCommandResponseBody setCommandId(String commandId) {
        this.commandId = commandId;
        return this;
    }
    public String getCommandId() {
        return this.commandId;
    }

}
