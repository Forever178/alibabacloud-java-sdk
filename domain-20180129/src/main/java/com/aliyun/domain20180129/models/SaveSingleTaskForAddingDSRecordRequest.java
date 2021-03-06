// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForAddingDSRecordRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("KeyTag")
    public Integer keyTag;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Algorithm")
    public Integer algorithm;

    @NameInMap("DigestType")
    public Integer digestType;

    @NameInMap("Digest")
    public String digest;

    public static SaveSingleTaskForAddingDSRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForAddingDSRecordRequest self = new SaveSingleTaskForAddingDSRecordRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForAddingDSRecordRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForAddingDSRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForAddingDSRecordRequest setKeyTag(Integer keyTag) {
        this.keyTag = keyTag;
        return this;
    }
    public Integer getKeyTag() {
        return this.keyTag;
    }

    public SaveSingleTaskForAddingDSRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SaveSingleTaskForAddingDSRecordRequest setAlgorithm(Integer algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public Integer getAlgorithm() {
        return this.algorithm;
    }

    public SaveSingleTaskForAddingDSRecordRequest setDigestType(Integer digestType) {
        this.digestType = digestType;
        return this;
    }
    public Integer getDigestType() {
        return this.digestType;
    }

    public SaveSingleTaskForAddingDSRecordRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

}
