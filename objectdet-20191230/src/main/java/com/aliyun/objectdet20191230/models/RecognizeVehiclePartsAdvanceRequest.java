// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehiclePartsAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeVehiclePartsAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehiclePartsAdvanceRequest self = new RecognizeVehiclePartsAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
