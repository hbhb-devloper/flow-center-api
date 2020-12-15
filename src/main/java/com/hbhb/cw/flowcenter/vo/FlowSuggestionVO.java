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
public class FlowSuggestionVO implements Serializable {

    private static final long serialVersionUID = 6619168773671392156L;
    @Schema(description = "审批人id")
    private String value;
    @Schema(description = "审批人是否只读（true-只读、false-可编辑）")
    private Boolean readOnly;
}
