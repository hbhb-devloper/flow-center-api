package com.hbhb.cw.flowcenter.vo;

import com.hbhb.api.core.bean.SelectVO;

import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 流程节点详情
 *
 * @author xiaokang
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NodeInfoVO implements Serializable {
    private static final long serialVersionUID = 3598551845872731439L;

    @Schema(description = "业务流程表id")
    private Long id;

    @Schema(description = "业务id（各业务流程表中的业务id）")
    private Long businessId;

    @Schema(description = "节点id")
    private String flowNodeId;

    @Schema(description = "审批人角色名称")
    private String approverRole;

    @Schema(description = "审批人角色描述")
    private String roleDesc;

    @Schema(description = "审批人姓名")
    private String nickName;

    @Schema(description = "审批人")
    private NodeApproverVO approver;

    @Schema(description = "操作按钮（同意/拒绝）")
    private NodeOperationVO operation;

    @Schema(description = "审批意见")
    private NodeSuggestionVO suggestion;

    @Schema(description = "是否能够自定义流程（0-不能、1-能）")
    private Boolean controlAccess;

    @Schema(description = "是否允许被设置不参与流程（0-不参与、1-参与）")
    private Boolean isJoin;

    @Schema(description = "审批人下拉框选项")
    private List<SelectVO> approverSelect;

    @Schema(description = "审批时间")
    private String approveTime;

    @Schema(description = "可编辑字段列表")
    private List<String> filedList;
}
