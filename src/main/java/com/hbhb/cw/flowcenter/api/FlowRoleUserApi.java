package com.hbhb.cw.flowcenter.api;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author wangxiaogang
 */
public interface FlowRoleUserApi {

    /**
     * 通过用户id得到流程角色
     *
     * @param userId 用户id
     * @return 角色id
     */
    @GetMapping("/role-ids")
    List<Long> getFlowRoleIdByUserId(Integer userId);
}
