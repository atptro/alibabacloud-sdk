<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Videoenhan\V20200320\Models;

use AlibabaCloud\Tea\Model;

class EraseVideoSubtitlesRequest extends Model
{
    /**
     * @description videoUrl
     *
     * @var string
     */
    public $videoUrl;

    /**
     * @description bx
     *
     * @var float
     */
    public $BX;

    /**
     * @description by
     *
     * @var float
     */
    public $BY;

    /**
     * @description bw
     *
     * @var float
     */
    public $BW;

    /**
     * @description bh
     *
     * @var float
     */
    public $BH;
    protected $_name = [
        'videoUrl' => 'VideoUrl',
        'BX'       => 'BX',
        'BY'       => 'BY',
        'BW'       => 'BW',
        'BH'       => 'BH',
    ];

    public function validate()
    {
        Model::validateRequired('videoUrl', $this->videoUrl, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->videoUrl) {
            $res['VideoUrl'] = $this->videoUrl;
        }
        if (null !== $this->BX) {
            $res['BX'] = $this->BX;
        }
        if (null !== $this->BY) {
            $res['BY'] = $this->BY;
        }
        if (null !== $this->BW) {
            $res['BW'] = $this->BW;
        }
        if (null !== $this->BH) {
            $res['BH'] = $this->BH;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EraseVideoSubtitlesRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['VideoUrl'])) {
            $model->videoUrl = $map['VideoUrl'];
        }
        if (isset($map['BX'])) {
            $model->BX = $map['BX'];
        }
        if (isset($map['BY'])) {
            $model->BY = $map['BY'];
        }
        if (isset($map['BW'])) {
            $model->BW = $map['BW'];
        }
        if (isset($map['BH'])) {
            $model->BH = $map['BH'];
        }

        return $model;
    }
}
