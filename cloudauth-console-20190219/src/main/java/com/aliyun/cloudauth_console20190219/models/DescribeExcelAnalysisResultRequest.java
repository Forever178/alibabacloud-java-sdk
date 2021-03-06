// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeExcelAnalysisResultRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Key")
    public String key;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeExcelAnalysisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcelAnalysisResultRequest self = new DescribeExcelAnalysisResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExcelAnalysisResultRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeExcelAnalysisResultRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeExcelAnalysisResultRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
