// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxbResponseBody extends TeaModel {
    @NameInMap("SecretBindDTO")
    public BindAxbResponseBodySecretBindDTO secretBindDTO;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static BindAxbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindAxbResponseBody self = new BindAxbResponseBody();
        return TeaModel.build(map, self);
    }

    public BindAxbResponseBody setSecretBindDTO(BindAxbResponseBodySecretBindDTO secretBindDTO) {
        this.secretBindDTO = secretBindDTO;
        return this;
    }
    public BindAxbResponseBodySecretBindDTO getSecretBindDTO() {
        return this.secretBindDTO;
    }

    public BindAxbResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindAxbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindAxbResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class BindAxbResponseBodySecretBindDTO extends TeaModel {
        @NameInMap("Extension")
        public String extension;

        @NameInMap("SubsId")
        public String subsId;

        @NameInMap("SecretNo")
        public String secretNo;

        public static BindAxbResponseBodySecretBindDTO build(java.util.Map<String, ?> map) throws Exception {
            BindAxbResponseBodySecretBindDTO self = new BindAxbResponseBodySecretBindDTO();
            return TeaModel.build(map, self);
        }

        public BindAxbResponseBodySecretBindDTO setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public BindAxbResponseBodySecretBindDTO setSubsId(String subsId) {
            this.subsId = subsId;
            return this;
        }
        public String getSubsId() {
            return this.subsId;
        }

        public BindAxbResponseBodySecretBindDTO setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

    }

}
