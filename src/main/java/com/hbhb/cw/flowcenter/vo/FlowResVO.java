package com.hbhb.cw.flowcenter.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author xiaokang
 * @since 2020-07-04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlowResVO implements Serializable {
    private static final long serialVersionUID = 2385730811455569211L;

    @Schema(description = "流程id")
    private Long flowId;

    @Schema(description = "流程类型id")
    private Long flowTypeId;

    @Schema(description = "流程类型名称")
    private String flowTypeName;

    @Schema(description = "流程名称")
    private String flowName;

    @Schema(description = "显示顺序")
    private Integer sortNum;

    @Schema(description = "备注")
    private String remark;

    @Schema(description = "创建时间")
    private Date createTime;
}
