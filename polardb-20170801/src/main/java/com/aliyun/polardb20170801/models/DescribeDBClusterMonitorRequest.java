// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterMonitorRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    public static DescribeDBClusterMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterMonitorRequest self = new DescribeDBClusterMonitorRequest();
        return TeaModel.build(map, self);
    }

}
