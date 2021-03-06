// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteStackRequest extends TeaModel {
    @NameInMap("StackId")
    @Validation(required = true)
    public String stackId;

    @NameInMap("RetainAllResources")
    public Boolean retainAllResources;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RetainResources")
    public java.util.List<String> retainResources;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    public static DeleteStackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStackRequest self = new DeleteStackRequest();
        return TeaModel.build(map, self);
    }

}
