package com.hbhb.cw.flowcenter.api;

import com.hbhb.cw.flowcenter.vo.FlowNodePropVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface FlowNodePropApi {

    @GetMapping("/list")
    List<FlowNodePropVO> getNodeProps(@RequestParam("flowId") Long flowId);
}
