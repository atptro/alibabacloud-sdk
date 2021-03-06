<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Polardb\V20170801\Models\DescribeDBClustersResponse\items;

use AlibabaCloud\SDK\Polardb\V20170801\Models\DescribeDBClustersResponse\items\DBCluster\DBNodes;
use AlibabaCloud\SDK\Polardb\V20170801\Models\DescribeDBClustersResponse\items\DBCluster\tags;
use AlibabaCloud\Tea\Model;

class DBCluster extends Model
{
    /**
     * @description dbClusterId
     *
     * @var string
     */
    public $DBClusterId;

    /**
     * @description dbClusterDescription
     *
     * @var string
     */
    public $DBClusterDescription;

    /**
     * @description payType
     *
     * @var string
     */
    public $payType;

    /**
     * @description clusterNetworkType
     *
     * @var string
     */
    public $DBClusterNetworkType;

    /**
     * @description regionId
     *
     * @var string
     */
    public $regionId;

    /**
     * @description zoneId
     *
     * @var string
     */
    public $zoneId;

    /**
     * @description expireTime
     *
     * @var string
     */
    public $expireTime;

    /**
     * @description expired
     *
     * @var string
     */
    public $expired;

    /**
     * @description dbClusterStatus
     *
     * @var string
     */
    public $DBClusterStatus;

    /**
     * @description engine
     *
     * @var string
     */
    public $engine;

    /**
     * @description dbType
     *
     * @var string
     */
    public $DBType;

    /**
     * @description dbVersion
     *
     * @var string
     */
    public $DBVersion;

    /**
     * @description lockMode
     *
     * @var string
     */
    public $lockMode;

    /**
     * @description deletionLock
     *
     * @var int
     */
    public $deletionLock;

    /**
     * @description gmtCreated
     *
     * @var string
     */
    public $createTime;

    /**
     * @description vpcId
     *
     * @var string
     */
    public $vpcId;

    /**
     * @description instanceNum
     *
     * @var int
     */
    public $DBNodeNumber;

    /**
     * @description rwInstanceClass
     *
     * @var string
     */
    public $DBNodeClass;

    /**
     * @description usedStorage
     *
     * @var int
     */
    public $storageUsed;

    /**
     * @description resourceGroupId
     *
     * @var string
     */
    public $resourceGroupId;

    /**
     * @description dbInstanceList
     *
     * @var DBNodes
     */
    public $DBNodes;

    /**
     * @description tags
     *
     * @var tags
     */
    public $tags;
    protected $_name = [
        'DBClusterId'          => 'DBClusterId',
        'DBClusterDescription' => 'DBClusterDescription',
        'payType'              => 'PayType',
        'DBClusterNetworkType' => 'DBClusterNetworkType',
        'regionId'             => 'RegionId',
        'zoneId'               => 'ZoneId',
        'expireTime'           => 'ExpireTime',
        'expired'              => 'Expired',
        'DBClusterStatus'      => 'DBClusterStatus',
        'engine'               => 'Engine',
        'DBType'               => 'DBType',
        'DBVersion'            => 'DBVersion',
        'lockMode'             => 'LockMode',
        'deletionLock'         => 'DeletionLock',
        'createTime'           => 'CreateTime',
        'vpcId'                => 'VpcId',
        'DBNodeNumber'         => 'DBNodeNumber',
        'DBNodeClass'          => 'DBNodeClass',
        'storageUsed'          => 'StorageUsed',
        'resourceGroupId'      => 'ResourceGroupId',
        'DBNodes'              => 'DBNodes',
        'tags'                 => 'Tags',
    ];

    public function validate()
    {
        Model::validateRequired('DBClusterId', $this->DBClusterId, true);
        Model::validateRequired('DBClusterDescription', $this->DBClusterDescription, true);
        Model::validateRequired('payType', $this->payType, true);
        Model::validateRequired('DBClusterNetworkType', $this->DBClusterNetworkType, true);
        Model::validateRequired('regionId', $this->regionId, true);
        Model::validateRequired('zoneId', $this->zoneId, true);
        Model::validateRequired('expireTime', $this->expireTime, true);
        Model::validateRequired('expired', $this->expired, true);
        Model::validateRequired('DBClusterStatus', $this->DBClusterStatus, true);
        Model::validateRequired('engine', $this->engine, true);
        Model::validateRequired('DBType', $this->DBType, true);
        Model::validateRequired('DBVersion', $this->DBVersion, true);
        Model::validateRequired('lockMode', $this->lockMode, true);
        Model::validateRequired('deletionLock', $this->deletionLock, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('vpcId', $this->vpcId, true);
        Model::validateRequired('DBNodeNumber', $this->DBNodeNumber, true);
        Model::validateRequired('DBNodeClass', $this->DBNodeClass, true);
        Model::validateRequired('storageUsed', $this->storageUsed, true);
        Model::validateRequired('resourceGroupId', $this->resourceGroupId, true);
        Model::validateRequired('DBNodes', $this->DBNodes, true);
        Model::validateRequired('tags', $this->tags, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->DBClusterId) {
            $res['DBClusterId'] = $this->DBClusterId;
        }
        if (null !== $this->DBClusterDescription) {
            $res['DBClusterDescription'] = $this->DBClusterDescription;
        }
        if (null !== $this->payType) {
            $res['PayType'] = $this->payType;
        }
        if (null !== $this->DBClusterNetworkType) {
            $res['DBClusterNetworkType'] = $this->DBClusterNetworkType;
        }
        if (null !== $this->regionId) {
            $res['RegionId'] = $this->regionId;
        }
        if (null !== $this->zoneId) {
            $res['ZoneId'] = $this->zoneId;
        }
        if (null !== $this->expireTime) {
            $res['ExpireTime'] = $this->expireTime;
        }
        if (null !== $this->expired) {
            $res['Expired'] = $this->expired;
        }
        if (null !== $this->DBClusterStatus) {
            $res['DBClusterStatus'] = $this->DBClusterStatus;
        }
        if (null !== $this->engine) {
            $res['Engine'] = $this->engine;
        }
        if (null !== $this->DBType) {
            $res['DBType'] = $this->DBType;
        }
        if (null !== $this->DBVersion) {
            $res['DBVersion'] = $this->DBVersion;
        }
        if (null !== $this->lockMode) {
            $res['LockMode'] = $this->lockMode;
        }
        if (null !== $this->deletionLock) {
            $res['DeletionLock'] = $this->deletionLock;
        }
        if (null !== $this->createTime) {
            $res['CreateTime'] = $this->createTime;
        }
        if (null !== $this->vpcId) {
            $res['VpcId'] = $this->vpcId;
        }
        if (null !== $this->DBNodeNumber) {
            $res['DBNodeNumber'] = $this->DBNodeNumber;
        }
        if (null !== $this->DBNodeClass) {
            $res['DBNodeClass'] = $this->DBNodeClass;
        }
        if (null !== $this->storageUsed) {
            $res['StorageUsed'] = $this->storageUsed;
        }
        if (null !== $this->resourceGroupId) {
            $res['ResourceGroupId'] = $this->resourceGroupId;
        }
        if (null !== $this->DBNodes) {
            $res['DBNodes'] = null !== $this->DBNodes ? $this->DBNodes->toMap() : null;
        }
        if (null !== $this->tags) {
            $res['Tags'] = null !== $this->tags ? $this->tags->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DBCluster
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['DBClusterId'])) {
            $model->DBClusterId = $map['DBClusterId'];
        }
        if (isset($map['DBClusterDescription'])) {
            $model->DBClusterDescription = $map['DBClusterDescription'];
        }
        if (isset($map['PayType'])) {
            $model->payType = $map['PayType'];
        }
        if (isset($map['DBClusterNetworkType'])) {
            $model->DBClusterNetworkType = $map['DBClusterNetworkType'];
        }
        if (isset($map['RegionId'])) {
            $model->regionId = $map['RegionId'];
        }
        if (isset($map['ZoneId'])) {
            $model->zoneId = $map['ZoneId'];
        }
        if (isset($map['ExpireTime'])) {
            $model->expireTime = $map['ExpireTime'];
        }
        if (isset($map['Expired'])) {
            $model->expired = $map['Expired'];
        }
        if (isset($map['DBClusterStatus'])) {
            $model->DBClusterStatus = $map['DBClusterStatus'];
        }
        if (isset($map['Engine'])) {
            $model->engine = $map['Engine'];
        }
        if (isset($map['DBType'])) {
            $model->DBType = $map['DBType'];
        }
        if (isset($map['DBVersion'])) {
            $model->DBVersion = $map['DBVersion'];
        }
        if (isset($map['LockMode'])) {
            $model->lockMode = $map['LockMode'];
        }
        if (isset($map['DeletionLock'])) {
            $model->deletionLock = $map['DeletionLock'];
        }
        if (isset($map['CreateTime'])) {
            $model->createTime = $map['CreateTime'];
        }
        if (isset($map['VpcId'])) {
            $model->vpcId = $map['VpcId'];
        }
        if (isset($map['DBNodeNumber'])) {
            $model->DBNodeNumber = $map['DBNodeNumber'];
        }
        if (isset($map['DBNodeClass'])) {
            $model->DBNodeClass = $map['DBNodeClass'];
        }
        if (isset($map['StorageUsed'])) {
            $model->storageUsed = $map['StorageUsed'];
        }
        if (isset($map['ResourceGroupId'])) {
            $model->resourceGroupId = $map['ResourceGroupId'];
        }
        if (isset($map['DBNodes'])) {
            $model->DBNodes = DBNodes::fromMap($map['DBNodes']);
        }
        if (isset($map['Tags'])) {
            $model->tags = tags::fromMap($map['Tags']);
        }

        return $model;
    }
}
