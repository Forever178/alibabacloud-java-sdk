// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDamageRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeVehicleDamageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDamageRequest self = new RecognizeVehicleDamageRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleDamageRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
