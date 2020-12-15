package com.hbhb.cw.flowcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangxiaogang
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlowType implements Serializable {
    private static final long serialVersionUID = -7709560147170632216L;

    @AutoID
    private Long id;
    @Schema(description = "流程类型名称")
    private String flowTypeName;
    @Schema(description = "显示顺序")
    private Integer sortNum;
    @Schema(description = "所属功能模块")
    private String module;
    @Schema(description = "备注")
    private String remark;
    @Schema(description = "创建时间")
    private Date createTime;
}