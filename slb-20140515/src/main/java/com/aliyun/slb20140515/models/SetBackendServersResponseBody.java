// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetBackendServersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("BackendServers")
    public java.util.List<SetBackendServersResponseBodyBackendServers> backendServers;

    public static SetBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetBackendServersResponseBody self = new SetBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public SetBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetBackendServersResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetBackendServersResponseBody setBackendServers(java.util.List<SetBackendServersResponseBodyBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<SetBackendServersResponseBodyBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public static class SetBackendServersResponseBodyBackendServers extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public String weight;

        @NameInMap("Description")
        public String description;

        @NameInMap("ServerId")
        public String serverId;

        public static SetBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            SetBackendServersResponseBodyBackendServers self = new SetBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public SetBackendServersResponseBodyBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SetBackendServersResponseBodyBackendServers setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

        public SetBackendServersResponseBodyBackendServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SetBackendServersResponseBodyBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

}