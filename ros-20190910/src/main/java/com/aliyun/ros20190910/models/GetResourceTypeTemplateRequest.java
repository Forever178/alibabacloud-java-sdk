// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeTemplateRequest extends TeaModel {
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetResourceTypeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeTemplateRequest self = new GetResourceTypeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeTemplateRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
