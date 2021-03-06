// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeACLsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Acls")
    public DescribeACLsResponseBodyAcls acls;

    public static DescribeACLsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeACLsResponseBody self = new DescribeACLsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeACLsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeACLsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeACLsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeACLsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeACLsResponseBody setAcls(DescribeACLsResponseBodyAcls acls) {
        this.acls = acls;
        return this;
    }
    public DescribeACLsResponseBodyAcls getAcls() {
        return this.acls;
    }

    public static class DescribeACLsResponseBodyAclsAcl extends TeaModel {
        @NameInMap("SagCount")
        public String sagCount;

        @NameInMap("AclId")
        public String aclId;

        @NameInMap("Name")
        public String name;

        public static DescribeACLsResponseBodyAclsAcl build(java.util.Map<String, ?> map) throws Exception {
            DescribeACLsResponseBodyAclsAcl self = new DescribeACLsResponseBodyAclsAcl();
            return TeaModel.build(map, self);
        }

        public DescribeACLsResponseBodyAclsAcl setSagCount(String sagCount) {
            this.sagCount = sagCount;
            return this;
        }
        public String getSagCount() {
            return this.sagCount;
        }

        public DescribeACLsResponseBodyAclsAcl setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public DescribeACLsResponseBodyAclsAcl setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeACLsResponseBodyAcls extends TeaModel {
        @NameInMap("Acl")
        public java.util.List<DescribeACLsResponseBodyAclsAcl> acl;

        public static DescribeACLsResponseBodyAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeACLsResponseBodyAcls self = new DescribeACLsResponseBodyAcls();
            return TeaModel.build(map, self);
        }

        public DescribeACLsResponseBodyAcls setAcl(java.util.List<DescribeACLsResponseBodyAclsAcl> acl) {
            this.acl = acl;
            return this;
        }
        public java.util.List<DescribeACLsResponseBodyAclsAcl> getAcl() {
            return this.acl;
        }

    }

}
