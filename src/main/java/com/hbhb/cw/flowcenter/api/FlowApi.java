package com.hbhb.cw.flowcenter.api;


import com.hbhb.cw.flowcenter.model.Flow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author wangxiaogang
 */
public interface FlowApi {

    @GetMapping("/info/{flowId}")
    Flow getFlowById(@PathVariable("flowId") Long flowId);

    @GetMapping("/name/by-node")
    String getNameByNodeId(@RequestParam("nodeId") String nodeId);

    @GetMapping("/info/by-type")
    List<Flow> getFlowsByTypeId(@RequestParam("typeId") Long typeId);

    @GetMapping("/map/flow-name")
    Map<Long, String> getFlowMapName(@RequestParam("typeId") Long typeId);

}
