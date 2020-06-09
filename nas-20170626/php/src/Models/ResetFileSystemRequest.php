<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\NAS\V20170626\Models;

use AlibabaCloud\Tea\Model;

class ResetFileSystemRequest extends Model {
    protected $_name = [
        'fileSystemId' => 'FileSystemId',
        'snapshotId' => 'SnapshotId',
    ];
    public function validate() {
        Model::validateRequired('fileSystemId', $this->fileSystemId, true);
        Model::validateRequired('snapshotId', $this->snapshotId, true);
    }
    public function toMap() {
        $res = [];
        $res['FileSystemId'] = $this->fileSystemId;
        $res['SnapshotId'] = $this->snapshotId;
        return $res;
    }
    /**
     * @param array $map
     * @return ResetFileSystemRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['FileSystemId'])){
            $model->fileSystemId = $map['FileSystemId'];
        }
        if(isset($map['SnapshotId'])){
            $model->snapshotId = $map['SnapshotId'];
        }
        return $model;
    }
    /**
     * @description volume
     * @var string
     */
    public $fileSystemId;

    /**
     * @description snapshotId
     * @var string
     */
    public $snapshotId;

}
