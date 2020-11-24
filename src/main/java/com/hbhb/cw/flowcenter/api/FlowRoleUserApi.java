package com.hbhb.cw.flowcenter.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangxiaogang
 */
public interface FlowRoleUserApi {
    /**
     * 跟据单位id角色id获取单位下某一角色对应用户
     *
     * @param roleName 单位id
     * @return 用户id
     */
    @GetMapping("/role-list")
    List<Integer> getFlowRoleUserList(@RequestParam("roleName") String roleName);

    /**
     * 通过用户id得到流程角色
     *
     * @param userId 用户id
     * @return 角色id
     */
    @GetMapping("/role-ids")
    List<Long> getFlowRoleIdByUserId(Integer userId);
}
