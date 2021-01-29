// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class TrimDocumentAdvanceRequest extends TeaModel {
    @NameInMap("FileURLObject")
    @Validation(required = true)
    public java.io.InputStream fileURLObject;

    @NameInMap("FileType")
    public String fileType;

    @NameInMap("OutputType")
    public String outputType;

    @NameInMap("Async")
    public Boolean async;

    public static TrimDocumentAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TrimDocumentAdvanceRequest self = new TrimDocumentAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public TrimDocumentAdvanceRequest setFileURLObject(java.io.InputStream fileURLObject) {
        this.fileURLObject = fileURLObject;
        return this;
    }
    public java.io.InputStream getFileURLObject() {
        return this.fileURLObject;
    }

    public TrimDocumentAdvanceRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public TrimDocumentAdvanceRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public TrimDocumentAdvanceRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

}
