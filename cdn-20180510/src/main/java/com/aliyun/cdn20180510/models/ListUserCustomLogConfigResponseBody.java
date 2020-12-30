// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListUserCustomLogConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConfigIds")
    public ListUserCustomLogConfigResponseBodyConfigIds configIds;

    public static ListUserCustomLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserCustomLogConfigResponseBody self = new ListUserCustomLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserCustomLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserCustomLogConfigResponseBody setConfigIds(ListUserCustomLogConfigResponseBodyConfigIds configIds) {
        this.configIds = configIds;
        return this;
    }
    public ListUserCustomLogConfigResponseBodyConfigIds getConfigIds() {
        return this.configIds;
    }

    public static class ListUserCustomLogConfigResponseBodyConfigIds extends TeaModel {
        @NameInMap("ConfigId")
        public java.util.List<String> configId;

        public static ListUserCustomLogConfigResponseBodyConfigIds build(java.util.Map<String, ?> map) throws Exception {
            ListUserCustomLogConfigResponseBodyConfigIds self = new ListUserCustomLogConfigResponseBodyConfigIds();
            return TeaModel.build(map, self);
        }

        public ListUserCustomLogConfigResponseBodyConfigIds setConfigId(java.util.List<String> configId) {
            this.configId = configId;
            return this;
        }
        public java.util.List<String> getConfigId() {
            return this.configId;
        }

    }

}