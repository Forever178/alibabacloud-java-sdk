// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeletePolicyVersionRequest extends TeaModel {
    @NameInMap("PolicyName")
    @Validation(required = true)
    public String policyName;

    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    public static DeletePolicyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyVersionRequest self = new DeletePolicyVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyVersionRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public DeletePolicyVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
