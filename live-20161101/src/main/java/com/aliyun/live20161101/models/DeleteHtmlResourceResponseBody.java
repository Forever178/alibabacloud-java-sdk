// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteHtmlResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHtmlResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHtmlResourceResponseBody self = new DeleteHtmlResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHtmlResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
