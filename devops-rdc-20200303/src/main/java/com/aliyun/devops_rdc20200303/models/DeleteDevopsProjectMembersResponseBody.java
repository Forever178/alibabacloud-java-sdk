// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class DeleteDevopsProjectMembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public Boolean object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static DeleteDevopsProjectMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDevopsProjectMembersResponseBody self = new DeleteDevopsProjectMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDevopsProjectMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDevopsProjectMembersResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DeleteDevopsProjectMembersResponseBody setObject(Boolean object) {
        this.object = object;
        return this;
    }
    public Boolean getObject() {
        return this.object;
    }

    public DeleteDevopsProjectMembersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteDevopsProjectMembersResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

}
