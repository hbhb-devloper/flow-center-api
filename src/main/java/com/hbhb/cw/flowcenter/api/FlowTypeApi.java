package com.hbhb.cw.flowcenter.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author wangxiaogang
 */
public interface FlowTypeApi {

    @GetMapping("/name")
    String getNameById(@RequestParam("id") Long id);

    @GetMapping("/id")
    Long getTypeIdByNode(@RequestParam("flowNodeId") String flowNodeId);

    @GetMapping("/map/type-name")
    Map<Long, String> getFlowTypeMapName();
}
