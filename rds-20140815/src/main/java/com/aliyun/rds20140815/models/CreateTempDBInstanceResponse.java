// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateTempDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TempDBInstanceId")
    @Validation(required = true)
    public String tempDBInstanceId;

    public static CreateTempDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTempDBInstanceResponse self = new CreateTempDBInstanceResponse();
        return TeaModel.build(map, self);
    }

}
