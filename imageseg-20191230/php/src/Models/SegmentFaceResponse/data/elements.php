<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Imageseg\V20191230\Models\SegmentFaceResponse\data;

use AlibabaCloud\Tea\Model;

class elements extends Model
{
    /**
     * @description uri
     *
     * @var string
     */
    public $imageURL;

    /**
     * @description x
     *
     * @var int
     */
    public $x;

    /**
     * @description y
     *
     * @var int
     */
    public $y;

    /**
     * @description w
     *
     * @var int
     */
    public $width;

    /**
     * @description h
     *
     * @var int
     */
    public $height;
    protected $_name = [
        'imageURL' => 'ImageURL',
        'x'        => 'X',
        'y'        => 'Y',
        'width'    => 'Width',
        'height'   => 'Height',
    ];

    public function validate()
    {
        Model::validateRequired('imageURL', $this->imageURL, true);
        Model::validateRequired('x', $this->x, true);
        Model::validateRequired('y', $this->y, true);
        Model::validateRequired('width', $this->width, true);
        Model::validateRequired('height', $this->height, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->imageURL) {
            $res['ImageURL'] = $this->imageURL;
        }
        if (null !== $this->x) {
            $res['X'] = $this->x;
        }
        if (null !== $this->y) {
            $res['Y'] = $this->y;
        }
        if (null !== $this->width) {
            $res['Width'] = $this->width;
        }
        if (null !== $this->height) {
            $res['Height'] = $this->height;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return elements
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ImageURL'])) {
            $model->imageURL = $map['ImageURL'];
        }
        if (isset($map['X'])) {
            $model->x = $map['X'];
        }
        if (isset($map['Y'])) {
            $model->y = $map['Y'];
        }
        if (isset($map['Width'])) {
            $model->width = $map['Width'];
        }
        if (isset($map['Height'])) {
            $model->height = $map['Height'];
        }

        return $model;
    }
}
