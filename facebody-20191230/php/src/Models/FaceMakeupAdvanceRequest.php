<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Facebody\V20191230\Models;

use AlibabaCloud\Tea\Model;

class FaceMakeupAdvanceRequest extends Model
{
    /**
     * @description ImageURLObject
     *
     * @var Stream
     */
    public $imageURLObject;

    /**
     * @description makeupType
     *
     * @var string
     */
    public $makeupType;

    /**
     * @description resourceType
     *
     * @var string
     */
    public $resourceType;

    /**
     * @description strength
     *
     * @var float
     */
    public $strength;
    protected $_name = [
        'imageURLObject' => 'ImageURLObject',
        'makeupType'     => 'MakeupType',
        'resourceType'   => 'ResourceType',
        'strength'       => 'Strength',
    ];

    public function validate()
    {
        Model::validateRequired('imageURLObject', $this->imageURLObject, true);
        Model::validateRequired('makeupType', $this->makeupType, true);
        Model::validateRequired('resourceType', $this->resourceType, true);
        Model::validateRequired('strength', $this->strength, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->imageURLObject) {
            $res['ImageURLObject'] = $this->imageURLObject;
        }
        if (null !== $this->makeupType) {
            $res['MakeupType'] = $this->makeupType;
        }
        if (null !== $this->resourceType) {
            $res['ResourceType'] = $this->resourceType;
        }
        if (null !== $this->strength) {
            $res['Strength'] = $this->strength;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FaceMakeupAdvanceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ImageURLObject'])) {
            $model->imageURLObject = $map['ImageURLObject'];
        }
        if (isset($map['MakeupType'])) {
            $model->makeupType = $map['MakeupType'];
        }
        if (isset($map['ResourceType'])) {
            $model->resourceType = $map['ResourceType'];
        }
        if (isset($map['Strength'])) {
            $model->strength = $map['Strength'];
        }

        return $model;
    }
}
