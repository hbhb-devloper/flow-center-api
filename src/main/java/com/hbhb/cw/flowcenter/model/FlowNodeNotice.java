package com.hbhb.cw.flowcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlowNodeNotice implements Serializable {
    private static final long serialVersionUID = 5306001146383256573L;

    @AutoID
    private Long id;

    @Schema(description = "当前流程节点id")
    private String flowNodeId;

    @Schema(description = "提醒节点id")
    private String noticeNodeId;

    @Schema(description = "提醒状态")
    private Integer state;

    @Schema(description = "提醒信息")
    private String inform;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "创建人")
    private String createBy;
}