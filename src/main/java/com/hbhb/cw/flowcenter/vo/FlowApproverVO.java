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
public class FlowApproverVO implements Serializable {


    private static final long serialVersionUID = 8637947015173631875L;
    @Schema(description = "审批人id")
    private Integer value;
    @Schema(description = "审批人是否只读（true-只读、false-可编辑）")
    private Boolean readOnly;
}
