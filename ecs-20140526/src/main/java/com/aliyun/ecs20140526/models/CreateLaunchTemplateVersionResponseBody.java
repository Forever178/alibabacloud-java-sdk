// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateLaunchTemplateVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LaunchTemplateVersionNumber")
    public Long launchTemplateVersionNumber;

    public static CreateLaunchTemplateVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLaunchTemplateVersionResponseBody self = new CreateLaunchTemplateVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLaunchTemplateVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLaunchTemplateVersionResponseBody setLaunchTemplateVersionNumber(Long launchTemplateVersionNumber) {
        this.launchTemplateVersionNumber = launchTemplateVersionNumber;
        return this;
    }
    public Long getLaunchTemplateVersionNumber() {
        return this.launchTemplateVersionNumber;
    }

}
