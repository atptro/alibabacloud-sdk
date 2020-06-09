// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDNSSLBWeightRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    @NameInMap("Weight")
    @Validation(required = true)
    public Integer weight;

    public static UpdateDNSSLBWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDNSSLBWeightRequest self = new UpdateDNSSLBWeightRequest();
        return TeaModel.build(map, self);
    }

}
