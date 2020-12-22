package com.hbhb.cw.flowcenter.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangxiaogang
 */
public interface FlowNodeNoticeApi {

    @GetMapping("/inform")
    String getInform(@RequestParam("flowNodeId") String flowNodeId,
                     @RequestParam("state") Integer state);
}
