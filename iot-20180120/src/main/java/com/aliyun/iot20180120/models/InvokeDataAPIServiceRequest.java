// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeDataAPIServiceRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("ApiSrn")
    public String apiSrn;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("Param")
    public java.util.List<InvokeDataAPIServiceRequestParam> param;

    public static InvokeDataAPIServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        InvokeDataAPIServiceRequest self = new InvokeDataAPIServiceRequest();
        return TeaModel.build(map, self);
    }

    public InvokeDataAPIServiceRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public InvokeDataAPIServiceRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public InvokeDataAPIServiceRequest setApiSrn(String apiSrn) {
        this.apiSrn = apiSrn;
        return this;
    }
    public String getApiSrn() {
        return this.apiSrn;
    }

    public InvokeDataAPIServiceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public InvokeDataAPIServiceRequest setParam(java.util.List<InvokeDataAPIServiceRequestParam> param) {
        this.param = param;
        return this;
    }
    public java.util.List<InvokeDataAPIServiceRequestParam> getParam() {
        return this.param;
    }

    public static class InvokeDataAPIServiceRequestParam extends TeaModel {
        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamType")
        public String paramType;

        @NameInMap("ParamValue")
        public String paramValue;

        @NameInMap("ListParamType")
        public String listParamType;

        @NameInMap("ListParamValue")
        public java.util.List<String> listParamValue;

        public static InvokeDataAPIServiceRequestParam build(java.util.Map<String, ?> map) throws Exception {
            InvokeDataAPIServiceRequestParam self = new InvokeDataAPIServiceRequestParam();
            return TeaModel.build(map, self);
        }

        public InvokeDataAPIServiceRequestParam setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public InvokeDataAPIServiceRequestParam setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public InvokeDataAPIServiceRequestParam setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

        public InvokeDataAPIServiceRequestParam setListParamType(String listParamType) {
            this.listParamType = listParamType;
            return this;
        }
        public String getListParamType() {
            return this.listParamType;
        }

        public InvokeDataAPIServiceRequestParam setListParamValue(java.util.List<String> listParamValue) {
            this.listParamValue = listParamValue;
            return this;
        }
        public java.util.List<String> getListParamValue() {
            return this.listParamValue;
        }

    }

}
