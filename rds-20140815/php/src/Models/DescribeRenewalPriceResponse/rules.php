<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\Rds\V20140815\Models\DescribeRenewalPriceResponse;

use AlibabaCloud\Tea\Model;

use AlibabaCloud\SDK\Rds\V20140815\Models\DescribeRenewalPriceResponse\rules\rule;

class rules extends Model {
    protected $_name = [
        'rule' => 'Rule',
    ];
    public function validate() {
        Model::validateRequired('rule', $this->rule, true);
    }
    public function toMap() {
        $res = [];
        $res['Rule'] = [];
        if(null !== $this->rule && is_array($this->rule)){
            $n = 0;
            foreach($this->rule as $item){
                $res['Rule'][$n++] = null !== $item ? $item->toMap() : $item;
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return rules
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['Rule'])){
            if(!empty($map['Rule'])){
                $model->rule = [];
                $n = 0;
                foreach($map['Rule'] as $item) {
                    $model->rule[$n++] = null !== $item ? rule::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @description Rule
     * @var array
     */
    public $rule;

}