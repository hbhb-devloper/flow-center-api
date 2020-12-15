package com.hbhb.cw.flowcenter.api;

import com.hbhb.cw.flowcenter.vo.FlowNodeNoticeVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangxiaogang
 */
public interface FlowNodeNoticeApi {

    @GetMapping("/list")
    List<FlowNodeNoticeVO> getNodeNoticeList(@RequestParam("flowNodeId") String flowNodeId);
}
