// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Result")
    public Boolean result;

    public static SetAppStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAppStatusResponseBody self = new SetAppStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAppStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetAppStatusResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public SetAppStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SetAppStatusResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SetAppStatusResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
