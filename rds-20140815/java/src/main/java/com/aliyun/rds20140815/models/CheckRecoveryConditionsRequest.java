// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckRecoveryConditionsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("BackupFile")
    public String backupFile;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static CheckRecoveryConditionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRecoveryConditionsRequest self = new CheckRecoveryConditionsRequest();
        return TeaModel.build(map, self);
    }

}
