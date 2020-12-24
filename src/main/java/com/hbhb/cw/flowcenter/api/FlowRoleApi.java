package com.hbhb.cw.flowcenter.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiaokang
 */
public interface FlowRoleApi {

    @GetMapping("/name")
    String getNameById(@RequestParam("id") Long id);
}
