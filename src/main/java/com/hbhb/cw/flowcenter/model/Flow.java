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
public class Flow implements Serializable {
    private static final long serialVersionUID = -6395762435652686166L;

    private Long id;

    private Long flowTypeId;

    private String flowName;

    private Integer sortNum;

    private String remark;

    private Date createTime;

    private Integer deleteFlag;
}