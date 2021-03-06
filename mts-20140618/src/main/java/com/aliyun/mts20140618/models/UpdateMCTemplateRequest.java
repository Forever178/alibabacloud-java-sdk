// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMCTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Porn")
    public String porn;

    @NameInMap("Terrorism")
    public String terrorism;

    @NameInMap("Politics")
    public String politics;

    @NameInMap("Ad")
    public String ad;

    @NameInMap("Qrcode")
    public String qrcode;

    @NameInMap("Live")
    public String live;

    @NameInMap("Logo")
    public String logo;

    @NameInMap("Abuse")
    public String abuse;

    @NameInMap("Contraband")
    public String contraband;

    @NameInMap("spam")
    public String spam;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static UpdateMCTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMCTemplateRequest self = new UpdateMCTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMCTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMCTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateMCTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateMCTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateMCTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMCTemplateRequest setPorn(String porn) {
        this.porn = porn;
        return this;
    }
    public String getPorn() {
        return this.porn;
    }

    public UpdateMCTemplateRequest setTerrorism(String terrorism) {
        this.terrorism = terrorism;
        return this;
    }
    public String getTerrorism() {
        return this.terrorism;
    }

    public UpdateMCTemplateRequest setPolitics(String politics) {
        this.politics = politics;
        return this;
    }
    public String getPolitics() {
        return this.politics;
    }

    public UpdateMCTemplateRequest setAd(String ad) {
        this.ad = ad;
        return this;
    }
    public String getAd() {
        return this.ad;
    }

    public UpdateMCTemplateRequest setQrcode(String qrcode) {
        this.qrcode = qrcode;
        return this;
    }
    public String getQrcode() {
        return this.qrcode;
    }

    public UpdateMCTemplateRequest setLive(String live) {
        this.live = live;
        return this;
    }
    public String getLive() {
        return this.live;
    }

    public UpdateMCTemplateRequest setLogo(String logo) {
        this.logo = logo;
        return this;
    }
    public String getLogo() {
        return this.logo;
    }

    public UpdateMCTemplateRequest setAbuse(String abuse) {
        this.abuse = abuse;
        return this;
    }
    public String getAbuse() {
        return this.abuse;
    }

    public UpdateMCTemplateRequest setContraband(String contraband) {
        this.contraband = contraband;
        return this;
    }
    public String getContraband() {
        return this.contraband;
    }

    public UpdateMCTemplateRequest setSpam(String spam) {
        this.spam = spam;
        return this;
    }
    public String getSpam() {
        return this.spam;
    }

    public UpdateMCTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
