package com.hbhb.cw.flowcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yzc
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlowRoleUser implements Serializable {
    private static final long serialVersionUID = -8034557924675498107L;

    @AutoID
    private Long id;
    @Schema(description = "流程角色id")
    private Long flowRoleId;
    @Schema(description = "用户id")
    private Integer userId;
}