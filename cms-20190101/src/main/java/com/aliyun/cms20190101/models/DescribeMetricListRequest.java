// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricListRequest extends TeaModel {
    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    @NameInMap("MetricName")
    @Validation(required = true)
    public String metricName;

    @NameInMap("Period")
    public String period;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Dimensions")
    public String dimensions;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("Length")
    public String length;

    @NameInMap("Express")
    public String express;

    public static DescribeMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricListRequest self = new DescribeMetricListRequest();
        return TeaModel.build(map, self);
    }

}
