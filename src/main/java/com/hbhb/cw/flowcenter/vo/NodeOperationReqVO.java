package com.hbhb.cw.flowcenter.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaokang
 * @since 2020-08-02
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NodeOperationReqVO implements Serializable {
    private static final long serialVersionUID = -4263652849464947154L;

    private String flowNodeId;
    private Integer operation;
}
