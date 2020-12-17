package com.hbhb.cw.flowcenter.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yzc
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlowNode implements Serializable {
    private static final long serialVersionUID = -5299336784151828647L;

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