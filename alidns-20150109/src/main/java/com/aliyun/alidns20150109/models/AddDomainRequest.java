// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static AddDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDomainRequest self = new AddDomainRequest();
        return TeaModel.build(map, self);
    }

}
