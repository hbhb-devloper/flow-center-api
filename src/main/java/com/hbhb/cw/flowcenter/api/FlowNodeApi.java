package com.hbhb.cw.flowcenter.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangxiaogang
 */
public interface FlowNodeApi {

    @GetMapping("/count")
    long getNodeNum(@RequestParam("flowId") Long flowId);
}
