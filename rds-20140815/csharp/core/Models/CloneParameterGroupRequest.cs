// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AlibabaCloud.SDK.Rds20140815.Models
{
    public class CloneParameterGroupRequest : TeaModel {
        [NameInMap("AccessKeyId")]
        [Validation(Required=false)]
        public string AccessKeyId { get; set; }

        [NameInMap("OwnerId")]
        [Validation(Required=false)]
        public long OwnerId { get; set; }

        [NameInMap("ResourceOwnerAccount")]
        [Validation(Required=false)]
        public string ResourceOwnerAccount { get; set; }

        [NameInMap("ResourceOwnerId")]
        [Validation(Required=false)]
        public long ResourceOwnerId { get; set; }

        [NameInMap("RegionId")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        [NameInMap("TargetRegionId")]
        [Validation(Required=true)]
        public string TargetRegionId { get; set; }

        [NameInMap("ParameterGroupId")]
        [Validation(Required=true)]
        public string ParameterGroupId { get; set; }

        [NameInMap("ParameterGroupName")]
        [Validation(Required=true)]
        public string ParameterGroupName { get; set; }

        [NameInMap("ParameterGroupDesc")]
        [Validation(Required=false)]
        public string ParameterGroupDesc { get; set; }

    }

}
