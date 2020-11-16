package com.hbhb.cw.flowcenter.api;


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

}
