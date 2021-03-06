// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("LogUrl")
    public String logUrl;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Result")
    public String result;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Timestamp")
    public Long timestamp;

    public static QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody self = new QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody setLogUrl(String logUrl) {
        this.logUrl = logUrl;
        return this;
    }
    public String getLogUrl() {
        return this.logUrl;
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeantcodeAntcodeAciprojectsidpipelinesexecrerunfailedexecidResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
