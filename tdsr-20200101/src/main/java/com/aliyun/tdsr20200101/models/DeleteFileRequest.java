// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DeleteFileRequest extends TeaModel {
    @NameInMap("ParamFile")
    public String paramFile;

    @NameInMap("SubSceneUuid")
    public String subSceneUuid;

    public static DeleteFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileRequest self = new DeleteFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFileRequest setParamFile(String paramFile) {
        this.paramFile = paramFile;
        return this;
    }
    public String getParamFile() {
        return this.paramFile;
    }

    public DeleteFileRequest setSubSceneUuid(String subSceneUuid) {
        this.subSceneUuid = subSceneUuid;
        return this;
    }
    public String getSubSceneUuid() {
        return this.subSceneUuid;
    }

}
