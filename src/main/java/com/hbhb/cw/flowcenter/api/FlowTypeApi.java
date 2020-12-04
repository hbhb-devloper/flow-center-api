package com.hbhb.cw.flowcenter.api;

import com.hbhb.cw.flowcenter.model.Flow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangxiaogang
 */
public interface FlowTypeApi {

    /**
     * 通过节点id得到流程类型
     *
     * @param flowNodeId 节点id
     * @return 流程类型id
     */
    @GetMapping("/type-id")
    Long getIdByNodeId(@RequestParam("flowNodeId") String flowNodeId);

    /**
     * 通过流程类型id得到流程id
     *
     * @param flowTypeId 流程类型id
     * @return 流程id集合
     */
    @GetMapping("/type-ids")
    List<Flow> getFlowsByTypeId(@RequestParam("flowTypeId") Long flowTypeId);
}
