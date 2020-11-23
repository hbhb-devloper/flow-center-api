package com.hbhb.cw.flowcenter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yzc
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlowNodeProp implements Serializable {

    private static final long serialVersionUID = 8973643357822057766L;

    private Integer id;

    private String flowNodeId;

    private Long flowRoleId;

    private String roleDesc;

    private Integer unitId;

    private Integer userId;

    private Long assigner;

    private Boolean controlAccess;

    private Boolean isJoin;

    private Integer enableCond;

    private BigDecimal amount;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;
}