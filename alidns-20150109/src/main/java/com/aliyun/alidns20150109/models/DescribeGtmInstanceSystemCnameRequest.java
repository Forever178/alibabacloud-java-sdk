// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceSystemCnameRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeGtmInstanceSystemCnameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceSystemCnameRequest self = new DescribeGtmInstanceSystemCnameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceSystemCnameRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DescribeGtmInstanceSystemCnameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGtmInstanceSystemCnameRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
