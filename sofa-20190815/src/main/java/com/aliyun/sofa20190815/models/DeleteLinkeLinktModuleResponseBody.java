// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeLinktModuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteLinkeLinktModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeLinktModuleResponseBody self = new DeleteLinkeLinktModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeLinktModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkeLinktModuleResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkeLinktModuleResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteLinkeLinktModuleResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public DeleteLinkeLinktModuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteLinkeLinktModuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkeLinktModuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteLinkeLinktModuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
