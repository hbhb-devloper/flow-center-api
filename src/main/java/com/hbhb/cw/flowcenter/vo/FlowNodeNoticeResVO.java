package com.hbhb.cw.flowcenter.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangxiaogang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlowNodeNoticeResVO {

    private Long id;

    @Schema(description = "当前流程节点id")
    private String flowNodeId;

    @Schema(description = "提醒节点id")
    private String noticeNodeId;

    @Schema(description = "提醒状态")
    private Integer state;

    @Schema(description = "提醒信息")
    private String inform;


}
