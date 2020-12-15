package com.hbhb.cw.flowcenter.vo;

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
public class FlowRoleResVO implements Serializable {
    private static final long serialVersionUID = -7769023440033310363L;

    @Schema(description = "流程角色用户关联id")
    private Long flowRoleUserId;

    @Schema(description = "角色id")
    private Long flowRoleId;

    @Schema(description = "单位名称")
    private String unitName;

    @Schema(description = "单位id")
    private Integer unitId;

    @Schema(description = "流程角色名称")
    private String roleName;

    @Schema(description = "用户id")
    private Integer userId;

    @Schema(description = "用户名称")
    private String nickName;
}
