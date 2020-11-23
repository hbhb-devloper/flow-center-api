package com.hbhb.cw.flowcenter.api;

import com.hbhb.cw.flowcenter.vo.FlowNodeNoticeResVO;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author wangxiaogang
 */
public interface FlowNoticeApi {

    /**
     * 获取节点提醒列表
     *
     * @param flowNodeId 流程节点id
     * @return 流程节点提醒列表
     */
    @GetMapping("/notice-list")
    List<FlowNodeNoticeResVO> getFlowNodeNotice(String flowNodeId);
}
