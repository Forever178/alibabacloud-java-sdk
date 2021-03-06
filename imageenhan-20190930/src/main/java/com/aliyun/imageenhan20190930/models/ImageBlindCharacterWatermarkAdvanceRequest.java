// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImageBlindCharacterWatermarkAdvanceRequest extends TeaModel {
    @NameInMap("OriginImageURLObject")
    @Validation(required = true)
    public java.io.InputStream originImageURLObject;

    @NameInMap("FunctionType")
    @Validation(required = true)
    public String functionType;

    @NameInMap("Text")
    public String text;

    @NameInMap("WatermarkImageURL")
    public String watermarkImageURL;

    @NameInMap("OutputFileType")
    public String outputFileType;

    @NameInMap("QualityFactor")
    @Validation(required = true)
    public Integer qualityFactor;

    public static ImageBlindCharacterWatermarkAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageBlindCharacterWatermarkAdvanceRequest self = new ImageBlindCharacterWatermarkAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setOriginImageURLObject(java.io.InputStream originImageURLObject) {
        this.originImageURLObject = originImageURLObject;
        return this;
    }
    public java.io.InputStream getOriginImageURLObject() {
        return this.originImageURLObject;
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setWatermarkImageURL(String watermarkImageURL) {
        this.watermarkImageURL = watermarkImageURL;
        return this;
    }
    public String getWatermarkImageURL() {
        return this.watermarkImageURL;
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setOutputFileType(String outputFileType) {
        this.outputFileType = outputFileType;
        return this;
    }
    public String getOutputFileType() {
        return this.outputFileType;
    }

    public ImageBlindCharacterWatermarkAdvanceRequest setQualityFactor(Integer qualityFactor) {
        this.qualityFactor = qualityFactor;
        return this;
    }
    public Integer getQualityFactor() {
        return this.qualityFactor;
    }

}
