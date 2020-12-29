// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeTraceLicenseKeyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LicenseKey")
    public String licenseKey;

    public static DescribeTraceLicenseKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceLicenseKeyResponseBody self = new DescribeTraceLicenseKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTraceLicenseKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTraceLicenseKeyResponseBody setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }
    public String getLicenseKey() {
        return this.licenseKey;
    }

}
