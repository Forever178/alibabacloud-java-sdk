// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetlnterationsRequest extends TeaModel {
    @NameInMap("ArchDomainId")
    public String archDomainId;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutWebapigetlnterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetlnterationsRequest self = new GetLinkeBahamutWebapigetlnterationsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetlnterationsRequest setArchDomainId(String archDomainId) {
        this.archDomainId = archDomainId;
        return this;
    }
    public String getArchDomainId() {
        return this.archDomainId;
    }

    public GetLinkeBahamutWebapigetlnterationsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public GetLinkeBahamutWebapigetlnterationsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetLinkeBahamutWebapigetlnterationsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
