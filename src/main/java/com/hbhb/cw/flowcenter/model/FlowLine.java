package com.hbhb.cw.flowcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlowLine implements Serializable {
    private static final long serialVersionUID = 54337719841823496L;

    @AutoID
    private String id;

    private Long flowId;

    private String fromNodeId;

    private String toNodeId;

    private String label;
}