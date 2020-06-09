// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartDBNodeRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBNodeId")
    @Validation(required = true)
    public String DBNodeId;

    public static RestartDBNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDBNodeRequest self = new RestartDBNodeRequest();
        return TeaModel.build(map, self);
    }

}
