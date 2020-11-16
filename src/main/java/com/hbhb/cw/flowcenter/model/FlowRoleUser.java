package com.hbhb.cw.flowcenter.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yzc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlowRoleUser implements Serializable {

    private static final long serialVersionUID = -8034557924675498107L;

    @Schema(description = "流程角色用户关联id")
    private Long id;

    @Schema(description = "流程角色id")
    private Long flowRoleId;

    @Schema(description = "用户id")
    private Integer userId;
}