<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\Eci\V20180808\Models\ExportContainerGroupTemplateResponse\template\spec\initContainers;

use AlibabaCloud\Tea\Model;

class ports extends Model
{
    /**
     * @description name
     *
     * @var string
     */
    public $name;

    /**
     * @description protocol
     *
     * @var string
     */
    public $protocol;

    /**
     * @description port
     *
     * @var int
     */
    public $containerPort;
    protected $_name = [
        'name'          => 'Name',
        'protocol'      => 'Protocol',
        'containerPort' => 'ContainerPort',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('protocol', $this->protocol, true);
        Model::validateRequired('containerPort', $this->containerPort, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['Name'] = $this->name;
        }
        if (null !== $this->protocol) {
            $res['Protocol'] = $this->protocol;
        }
        if (null !== $this->containerPort) {
            $res['ContainerPort'] = $this->containerPort;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ports
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['Name'])) {
            $model->name = $map['Name'];
        }
        if (isset($map['Protocol'])) {
            $model->protocol = $map['Protocol'];
        }
        if (isset($map['ContainerPort'])) {
            $model->containerPort = $map['ContainerPort'];
        }

        return $model;
    }
}
