// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateVerifySettingRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("Solution")
    public String solution;

    @NameInMap("GuideStep")
    public Boolean guideStep;

    @NameInMap("PrivacyStep")
    public Boolean privacyStep;

    @NameInMap("ResultStep")
    public Boolean resultStep;

    public static UpdateVerifySettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVerifySettingRequest self = new UpdateVerifySettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVerifySettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateVerifySettingRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateVerifySettingRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public UpdateVerifySettingRequest setSolution(String solution) {
        this.solution = solution;
        return this;
    }
    public String getSolution() {
        return this.solution;
    }

    public UpdateVerifySettingRequest setGuideStep(Boolean guideStep) {
        this.guideStep = guideStep;
        return this;
    }
    public Boolean getGuideStep() {
        return this.guideStep;
    }

    public UpdateVerifySettingRequest setPrivacyStep(Boolean privacyStep) {
        this.privacyStep = privacyStep;
        return this;
    }
    public Boolean getPrivacyStep() {
        return this.privacyStep;
    }

    public UpdateVerifySettingRequest setResultStep(Boolean resultStep) {
        this.resultStep = resultStep;
        return this;
    }
    public Boolean getResultStep() {
        return this.resultStep;
    }

}
