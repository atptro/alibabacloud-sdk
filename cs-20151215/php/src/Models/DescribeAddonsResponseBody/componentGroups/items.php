<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AlibabaCloud\SDK\CS\V20151215\Models\DescribeAddonsResponseBody\componentGroups;

use AlibabaCloud\Tea\Model;

class items extends Model
{
    /**
     * @description name
     *
     * @var string
     */
    public $name;

    /**
     * @description config
     *
     * @var string
     */
    public $config;

    /**
     * @description required
     *
     * @var string
     */
    public $required;

    /**
     * @description disabled
     *
     * @var bool
     */
    public $disabled;

    /**
     * @description version
     *
     * @var string
     */
    public $version;
    protected $_name = [
        'name'     => 'name',
        'config'   => 'config',
        'required' => 'required',
        'disabled' => 'disabled',
        'version'  => 'version',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('config', $this->config, true);
        Model::validateRequired('required', $this->required, true);
        Model::validateRequired('disabled', $this->disabled, true);
        Model::validateRequired('version', $this->version, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->config) {
            $res['config'] = $this->config;
        }
        if (null !== $this->required) {
            $res['required'] = $this->required;
        }
        if (null !== $this->disabled) {
            $res['disabled'] = $this->disabled;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return items
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['config'])) {
            $model->config = $map['config'];
        }
        if (isset($map['required'])) {
            $model->required = $map['required'];
        }
        if (isset($map['disabled'])) {
            $model->disabled = $map['disabled'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }

        return $model;
    }
}
