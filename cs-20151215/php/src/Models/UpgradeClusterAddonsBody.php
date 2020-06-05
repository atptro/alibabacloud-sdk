<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\CS\V20151215\Models;

use AlibabaCloud\Tea\Model;

class UpgradeClusterAddonsBody extends Model {
    protected $_name = [
        'componentName' => 'component_name',
        'version' => 'version',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        $res['component_name'] = $this->componentName;
        $res['version'] = $this->version;
        return $res;
    }
    /**
     * @param array $map
     * @return UpgradeClusterAddonsBody
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['component_name'])){
            $model->componentName = $map['component_name'];
        }
        if(isset($map['version'])){
            $model->version = $map['version'];
        }
        return $model;
    }
    /**
     * @description component_name
     * @var string
     */
    public $componentName;

    /**
     * @description version
     * @var string
     */
    public $version;

}
