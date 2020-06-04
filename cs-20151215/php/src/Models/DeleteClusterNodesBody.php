<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AlibabaCloud\SDK\CS\V20151215\Models;

use AlibabaCloud\Tea\Model;

class DeleteClusterNodesBody extends Model {
    protected $_name = [
        'releaseNode' => 'release_node',
        'nodes' => 'nodes',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        $res['release_node'] = $this->releaseNode;
        $res['nodes'] = [];
        if(null !== $this->nodes){
            $res['nodes'] = $this->nodes;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteClusterNodesBody
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['release_node'])){
            $model->releaseNode = $map['release_node'];
        }
        if(isset($map['nodes'])){
            if(!empty($map['nodes'])){
                $model->nodes = [];
                $model->nodes = $map['nodes'];
            }
        }
        return $model;
    }
    /**
     * @description release_node
     * @var string
     */
    public $releaseNode;

    /**
     * @description nodes
     * @var array
     */
    public $nodes;

}
