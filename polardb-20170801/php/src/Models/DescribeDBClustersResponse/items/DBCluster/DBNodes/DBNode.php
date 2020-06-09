<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Polardb\V20170801\Models\DescribeDBClustersResponse\items\DBCluster\DBNodes;

use AlibabaCloud\Tea\Model;

class DBNode extends Model {
    protected $_name = [
        'DBNodeId' => 'DBNodeId',
        'DBNodeClass' => 'DBNodeClass',
        'DBNodeRole' => 'DBNodeRole',
        'regionId' => 'RegionId',
        'zoneId' => 'ZoneId',
    ];
    public function validate() {
        Model::validateRequired('DBNodeId', $this->DBNodeId, true);
        Model::validateRequired('DBNodeClass', $this->DBNodeClass, true);
        Model::validateRequired('DBNodeRole', $this->DBNodeRole, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('zoneId', $this->zoneId, true);
    }
    public function toMap() {
        $res = [];
        $res['DBNodeId'] = $this->DBNodeId;
        $res['DBNodeClass'] = $this->DBNodeClass;
        $res['DBNodeRole'] = $this->DBNodeRole;
        $res['RegionId'] = $this->regionId;
        $res['ZoneId'] = $this->zoneId;
        return $res;
    }
    /**
     * @param array $map
     * @return DBNode
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['DBNodeId'])){
            $model->DBNodeId = $map['DBNodeId'];
        }
        if(isset($map['DBNodeClass'])){
            $model->DBNodeClass = $map['DBNodeClass'];
        }
        if(isset($map['DBNodeRole'])){
            $model->DBNodeRole = $map['DBNodeRole'];
        }
        if(isset($map['RegionId'])){
            $model->regionId = $map['RegionId'];
        }
        if(isset($map['ZoneId'])){
            $model->zoneId = $map['ZoneId'];
        }
        return $model;
    }
    /**
     * @description dbInstanceId
     * @var string
     */
    public $DBNodeId;

    /**
     * @description dbInstanceClass
     * @var string
     */
    public $DBNodeClass;

    /**
     * @description dbInstanceType
     * @var string
     */
    public $DBNodeRole;

    /**
     * @description regionId
     * @var string
     */
    public $regionId;

    /**
     * @description zoneId
     * @var string
     */
    public $zoneId;

}
