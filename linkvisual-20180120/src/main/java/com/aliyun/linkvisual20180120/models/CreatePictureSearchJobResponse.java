// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreatePictureSearchJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static CreatePictureSearchJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePictureSearchJobResponse self = new CreatePictureSearchJobResponse();
        return TeaModel.build(map, self);
    }

    public CreatePictureSearchJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePictureSearchJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreatePictureSearchJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePictureSearchJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreatePictureSearchJobResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
