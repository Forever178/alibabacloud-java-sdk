// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateGlobalDistributeCacheRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("SeedSubInstanceId")
    public String seedSubInstanceId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateGlobalDistributeCacheRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalDistributeCacheRequest self = new CreateGlobalDistributeCacheRequest();
        return TeaModel.build(map, self);
    }

    public CreateGlobalDistributeCacheRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateGlobalDistributeCacheRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateGlobalDistributeCacheRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateGlobalDistributeCacheRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateGlobalDistributeCacheRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateGlobalDistributeCacheRequest setSeedSubInstanceId(String seedSubInstanceId) {
        this.seedSubInstanceId = seedSubInstanceId;
        return this;
    }
    public String getSeedSubInstanceId() {
        return this.seedSubInstanceId;
    }

    public CreateGlobalDistributeCacheRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
