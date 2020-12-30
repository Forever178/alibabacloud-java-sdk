// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateHaVipResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("HaVipId")
    public String haVipId;

    public static CreateHaVipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHaVipResponseBody self = new CreateHaVipResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHaVipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHaVipResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public CreateHaVipResponseBody setHaVipId(String haVipId) {
        this.haVipId = haVipId;
        return this;
    }
    public String getHaVipId() {
        return this.haVipId;
    }

}
