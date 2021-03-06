// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudallstrategyRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DevStage")
    public String devStage;

    @NameInMap("Env")
    public String env;

    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("IsStandard")
    public Boolean isStandard;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("StrategyName")
    public String strategyName;

    @NameInMap("TenantId")
    public Long tenantId;

    public static QueryLinkefabricFabricCloudallstrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudallstrategyRequest self = new QueryLinkefabricFabricCloudallstrategyRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudallstrategyRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricCloudallstrategyRequest setDevStage(String devStage) {
        this.devStage = devStage;
        return this;
    }
    public String getDevStage() {
        return this.devStage;
    }

    public QueryLinkefabricFabricCloudallstrategyRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryLinkefabricFabricCloudallstrategyRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public QueryLinkefabricFabricCloudallstrategyRequest setIsStandard(Boolean isStandard) {
        this.isStandard = isStandard;
        return this;
    }
    public Boolean getIsStandard() {
        return this.isStandard;
    }

    public QueryLinkefabricFabricCloudallstrategyRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLinkefabricFabricCloudallstrategyRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public QueryLinkefabricFabricCloudallstrategyRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
