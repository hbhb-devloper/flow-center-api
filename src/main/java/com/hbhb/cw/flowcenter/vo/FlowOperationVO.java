package com.hbhb.cw.flowcenter.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xiaokang
 * @since 2020-08-01
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlowOperationVO implements Serializable {


    private static final long serialVersionUID = -6301205006781276059L;
    @Schema(description = "操作按钮值")
    private Integer value;
    @Schema(description = "操作按钮是否显示（true-隐藏、false-显示）")
    private Boolean hidden;
}
