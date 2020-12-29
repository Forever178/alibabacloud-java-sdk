// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTitleIntelligenceRequest extends TeaModel {
    @NameInMap("Platform")
    public String platform;

    @NameInMap("Extra")
    public String extra;

    @NameInMap("CatLevelThreeId")
    public Long catLevelThreeId;

    @NameInMap("CatLevelTwoId")
    public Long catLevelTwoId;

    @NameInMap("Keywords")
    public String keywords;

    public static GetTitleIntelligenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTitleIntelligenceRequest self = new GetTitleIntelligenceRequest();
        return TeaModel.build(map, self);
    }

    public GetTitleIntelligenceRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GetTitleIntelligenceRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public GetTitleIntelligenceRequest setCatLevelThreeId(Long catLevelThreeId) {
        this.catLevelThreeId = catLevelThreeId;
        return this;
    }
    public Long getCatLevelThreeId() {
        return this.catLevelThreeId;
    }

    public GetTitleIntelligenceRequest setCatLevelTwoId(Long catLevelTwoId) {
        this.catLevelTwoId = catLevelTwoId;
        return this;
    }
    public Long getCatLevelTwoId() {
        return this.catLevelTwoId;
    }

    public GetTitleIntelligenceRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

}
