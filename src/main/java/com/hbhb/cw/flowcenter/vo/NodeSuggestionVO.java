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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NodeSuggestionVO implements Serializable {

    private static final long serialVersionUID = 6619168773671392156L;
    @Schema(description = "审批意见")
    private String value;
    @Schema(description = "审批人是否只读（true-只读、false-可编辑）")
    private Boolean readOnly;
}
