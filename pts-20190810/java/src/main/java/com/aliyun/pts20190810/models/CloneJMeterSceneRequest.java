// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class CloneJMeterSceneRequest extends TeaModel {
    @NameInMap("SceneId")
    @Validation(required = true)
    public String sceneId;

    public static CloneJMeterSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneJMeterSceneRequest self = new CloneJMeterSceneRequest();
        return TeaModel.build(map, self);
    }

}
