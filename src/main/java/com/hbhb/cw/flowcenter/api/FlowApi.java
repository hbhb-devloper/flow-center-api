package com.hbhb.cw.flowcenter.api;


import com.hbhb.cw.flowcenter.model.Flow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangxiaogang
 */
public interface FlowApi {
    /**
     * 跟据单位id角色id获取单位下某一角色对应用户
     *
     * @param roleName 单位id
     * @return 用户id
     */
    @GetMapping("/role-list")
    List<Integer> getFlowRoleUserList(@RequestParam("roleName") String roleName);

    /**
     * 跟据流程id获取流程信息
     *
     * @param flowId 流程id
     * @return 流程信息
     */
    @GetMapping("/flow-info")
    Flow getFlow(@RequestParam("flowId") Long flowId);

    /**
     * 通过节点id得到流程名称
     *
     * @param flowNodeId 流程节点id
     * @return 流程名称
     */
    @GetMapping("/name")
    String getNameByNodeId(@RequestParam("flowNodeId") String flowNodeId);

}
