package com.hbhb.cw.flowcenter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yzc
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlowNode implements Serializable {

    private String id;

    private Long flowId;

    private String nodeType;

    private String nodeName;

    private String pLeft;

    private String pTop;

    private String ico;

    private String state;

    private Integer sortNum;
}