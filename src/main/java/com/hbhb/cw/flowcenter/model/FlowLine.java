package com.hbhb.cw.flowcenter.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlowLine implements Serializable {
    private static final long serialVersionUID = 54337719841823496L;

    private String id;

    private Long flowId;

    private String fromNodeId;

    private String toNodeId;

    private String label;
}