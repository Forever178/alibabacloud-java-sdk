// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QuerySessionByClientIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OnlineStatus")
    public Boolean onlineStatus;

    public static QuerySessionByClientIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionByClientIdResponseBody self = new QuerySessionByClientIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySessionByClientIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySessionByClientIdResponseBody setOnlineStatus(Boolean onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }
    public Boolean getOnlineStatus() {
        return this.onlineStatus;
    }

}
