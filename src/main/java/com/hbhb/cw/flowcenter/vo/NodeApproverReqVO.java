package com.hbhb.cw.flowcenter.vo;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangxiaogang
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NodeApproverReqVO implements Serializable {
    private static final long serialVersionUID = 1144429682481518481L;

    @Schema(description = "业务流程id")
    private Long id;

    @Schema(description = "流程节点id")
    private String flowNodeId;

    @Schema(description = "审批人id")
    private Integer userId;
}
