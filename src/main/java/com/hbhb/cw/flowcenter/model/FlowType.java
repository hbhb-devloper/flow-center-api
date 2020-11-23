package com.hbhb.cw.flowcenter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangxiaogang
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlowType implements Serializable {
    private static final long serialVersionUID = -7709560147170632216L;
    private Long id;

    private String flowTypeName;

    private Integer sortNum;

    private String remark;

    private Date createTime;
}