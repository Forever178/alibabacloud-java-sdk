// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryAccountBalanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAccountBalanceResponseBody body;

    public static QueryAccountBalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountBalanceResponse self = new QueryAccountBalanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountBalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAccountBalanceResponse setBody(QueryAccountBalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAccountBalanceResponseBody getBody() {
        return this.body;
    }

}
