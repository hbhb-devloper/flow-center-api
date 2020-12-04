package com.hbhb.cw.flowcenter.vo;

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
public class FlowNodePropVO implements Serializable {

    private static final long serialVersionUID = -2015324582583278172L;

    @Schema(description = "流程节点id", required = true)
    private String flowNodeId;

    @Schema(description = "单位id", required = true)
    private Integer unitId;

    @Schema(description = "角色描述")
    private String roleDesc;

    @Schema(description = "用户id")
    private Integer userId;

    @Schema(description = "流程角色id(审批角色id)", required = true)
    private Long flowRoleId;

    @Schema(description = "流程角色id(经办人)", required = true)
    private Long assigner;

    @Schema(description = "是否能够自定义流程（1为可以，0为不可以，默认为0")
    private Boolean controlAccess;

    @Schema(description = "是否允许被设置不参与流程（1为可以，0为不可以，默认为0)")
    private Boolean isJoin;

    @Schema(description = "金额阀值")
    private String amount;

    @Schema(description = "启用条件")
    private Integer enableCond;
}
