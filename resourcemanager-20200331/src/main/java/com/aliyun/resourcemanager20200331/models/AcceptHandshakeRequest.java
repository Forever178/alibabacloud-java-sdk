// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class AcceptHandshakeRequest extends TeaModel {
    @NameInMap("HandshakeId")
    @Validation(required = true)
    public String handshakeId;

    public static AcceptHandshakeRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptHandshakeRequest self = new AcceptHandshakeRequest();
        return TeaModel.build(map, self);
    }

    public AcceptHandshakeRequest setHandshakeId(String handshakeId) {
        this.handshakeId = handshakeId;
        return this;
    }
    public String getHandshakeId() {
        return this.handshakeId;
    }

}