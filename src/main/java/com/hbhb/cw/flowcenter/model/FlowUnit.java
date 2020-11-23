package com.hbhb.cw.flowcenter.model;

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
public class FlowUnit {
    private Long id;

    private Long flowId;

    private Integer unitId;


}