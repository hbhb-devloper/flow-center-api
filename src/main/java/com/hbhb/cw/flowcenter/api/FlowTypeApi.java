package com.hbhb.cw.flowcenter.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
