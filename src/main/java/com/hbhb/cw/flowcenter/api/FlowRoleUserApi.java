package com.hbhb.cw.flowcenter.api;


import com.hbhb.api.core.bean.SelectVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author wangxiaogang
 */
public interface FlowRoleUserApi {

    @GetMapping("/user-id")
    List<SelectVO> getUserIdByRoleName(@RequestParam("roleName") String roleName);

    @GetMapping("/role-name")
    List<String> getRoleNameByUserId(@RequestParam("userId") Integer userId);

    @GetMapping("/role-id")
    List<Long> getRoleIdByUserId(@RequestParam("roleName") Integer userId);
}
