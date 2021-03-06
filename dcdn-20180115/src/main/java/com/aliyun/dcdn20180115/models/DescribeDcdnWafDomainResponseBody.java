// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDomainResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OutPutDomains")
    public java.util.List<DescribeDcdnWafDomainResponseBodyOutPutDomains> outPutDomains;

    public static DescribeDcdnWafDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDomainResponseBody self = new DescribeDcdnWafDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDomainResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDcdnWafDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafDomainResponseBody setOutPutDomains(java.util.List<DescribeDcdnWafDomainResponseBodyOutPutDomains> outPutDomains) {
        this.outPutDomains = outPutDomains;
        return this;
    }
    public java.util.List<DescribeDcdnWafDomainResponseBodyOutPutDomains> getOutPutDomains() {
        return this.outPutDomains;
    }

    public static class DescribeDcdnWafDomainResponseBodyOutPutDomains extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("CcStatus")
        public Integer ccStatus;

        @NameInMap("AclStatus")
        public Integer aclStatus;

        @NameInMap("WafStatus")
        public Integer wafStatus;

        public static DescribeDcdnWafDomainResponseBodyOutPutDomains build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafDomainResponseBodyOutPutDomains self = new DescribeDcdnWafDomainResponseBodyOutPutDomains();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafDomainResponseBodyOutPutDomains setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDcdnWafDomainResponseBodyOutPutDomains setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDcdnWafDomainResponseBodyOutPutDomains setCcStatus(Integer ccStatus) {
            this.ccStatus = ccStatus;
            return this;
        }
        public Integer getCcStatus() {
            return this.ccStatus;
        }

        public DescribeDcdnWafDomainResponseBodyOutPutDomains setAclStatus(Integer aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }
        public Integer getAclStatus() {
            return this.aclStatus;
        }

        public DescribeDcdnWafDomainResponseBodyOutPutDomains setWafStatus(Integer wafStatus) {
            this.wafStatus = wafStatus;
            return this;
        }
        public Integer getWafStatus() {
            return this.wafStatus;
        }

    }

}
