package com.hbhb.cw.flowcenter.vo;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wxg
 * @since 2020-09-08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlowToApproveVO implements Serializable {
    private static final long serialVersionUID = -8969310081198655138L;

    @Schema(description = "业务id")
    private Long businessId;

    @Schema(description = "流程类型id")
    private Long flowTypeId;

    @Schema(description = "流程id")
    private Long flowId;

    @Schema(description = "用户id")
    Integer userId;
}
