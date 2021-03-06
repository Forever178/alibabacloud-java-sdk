// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterOperationHostTaskLogResponseBody extends TeaModel {
    @NameInMap("Stderr")
    public String stderr;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Stdout")
    public String stdout;

    public static DescribeClusterOperationHostTaskLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterOperationHostTaskLogResponseBody self = new DescribeClusterOperationHostTaskLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterOperationHostTaskLogResponseBody setStderr(String stderr) {
        this.stderr = stderr;
        return this;
    }
    public String getStderr() {
        return this.stderr;
    }

    public DescribeClusterOperationHostTaskLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterOperationHostTaskLogResponseBody setStdout(String stdout) {
        this.stdout = stdout;
        return this;
    }
    public String getStdout() {
        return this.stdout;
    }

}
