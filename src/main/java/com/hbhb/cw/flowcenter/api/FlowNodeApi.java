package com.hbhb.cw.flowcenter.api;


import com.hbhb.cw.flowcenter.vo.FlowNodePropVO;
import com.hbhb.cw.flowcenter.vo.SelectVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangxiaogang
 */
public interface FlowNodeApi {
    /**
     * 流程节点名称列表
     *
     * @param flowId 流程id
     * @return 节点列表
     */
    @GetMapping("/name/{flowId}")
    List<SelectVO> getFlowNodeName(@PathVariable("flowId") Long flowId);

    /**
     * 获取流程的节点数
     *
     * @param flowId 流程id
     * @return 节点数量
     */
    @GetMapping("/count")
    int countFlowNode(@RequestParam("flowId") Long flowId);

    /**
     *  获取节点属性
     *
     * @param flowId 流程id
     * @return 节点属性详情
     */
    @GetMapping("/list/{flowId}")
    List<FlowNodePropVO> getFlowProp(Long flowId);
}
