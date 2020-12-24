package com.hbhb.cw.flowcenter.vo;

import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wxg
 * @since 2020-09-08
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlowApproveVO implements Serializable {
    private static final long serialVersionUID = -7832144508987931719L;

    @Schema(description = "业务流程id")
    private Long id;

    @Schema(description = "操作")
    private Integer operation;

    @Schema(description = "审批意见")
    private String suggestion;

    @Schema(description = "所有节点对应的审批人（必非空、按节点顺序）")
    private List<NodeApproverReqVO> approvers;
}
