// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class UninstallSoftwareRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Application")
    public String application;

    public static UninstallSoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallSoftwareRequest self = new UninstallSoftwareRequest();
        return TeaModel.build(map, self);
    }

    public UninstallSoftwareRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UninstallSoftwareRequest setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

}
