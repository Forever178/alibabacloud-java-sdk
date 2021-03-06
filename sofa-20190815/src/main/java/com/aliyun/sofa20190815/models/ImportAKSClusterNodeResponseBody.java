// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportAKSClusterNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Id")
    public String id;

    public static ImportAKSClusterNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportAKSClusterNodeResponseBody self = new ImportAKSClusterNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportAKSClusterNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportAKSClusterNodeResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportAKSClusterNodeResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ImportAKSClusterNodeResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
