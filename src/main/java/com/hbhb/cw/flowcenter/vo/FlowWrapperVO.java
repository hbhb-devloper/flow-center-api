package com.hbhb.cw.flowcenter.vo;

import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 流程封装类
 *
 * @author xiaokang
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlowWrapperVO implements Serializable {
    private static final long serialVersionUID = -4677239041536137195L;

    @Schema(description = "流程名称")
    private String name;

    @Schema(description = "当前节点序号")
    private Integer index;

    @Schema(description = "节点列表")
    private List<NodeInfoVO> nodes;
}
