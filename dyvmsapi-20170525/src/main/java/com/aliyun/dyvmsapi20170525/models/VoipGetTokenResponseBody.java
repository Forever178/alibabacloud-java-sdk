// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class VoipGetTokenResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Module")
    public String module;

    @NameInMap("Code")
    public String code;

    public static VoipGetTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VoipGetTokenResponseBody self = new VoipGetTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public VoipGetTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VoipGetTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VoipGetTokenResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public VoipGetTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
