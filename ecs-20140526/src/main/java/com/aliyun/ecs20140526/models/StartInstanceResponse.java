// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StartInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceResponse self = new StartInstanceResponse();
        return TeaModel.build(map, self);
    }

}
