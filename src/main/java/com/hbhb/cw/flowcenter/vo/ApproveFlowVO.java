package com.hbhb.cw.flowcenter.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wangxiaogang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApproveFlowVO implements Serializable {
    private static final long serialVersionUID = 1144429682481518481L;

    @Schema(description = "流程节点id")
    private String flowNodeId;

    @Schema(description = "审批人id")
    private Integer userId;
}
