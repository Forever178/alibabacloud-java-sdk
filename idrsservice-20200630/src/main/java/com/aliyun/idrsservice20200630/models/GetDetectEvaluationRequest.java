// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetDetectEvaluationRequest extends TeaModel {
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static GetDetectEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectEvaluationRequest self = new GetDetectEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectEvaluationRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetDetectEvaluationRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
