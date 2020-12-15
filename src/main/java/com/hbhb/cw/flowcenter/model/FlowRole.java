package com.hbhb.cw.flowcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yzc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlowRole implements Serializable {
    private static final long serialVersionUID = -103090433954612106L;

    @AutoID
    private Long id;

    private String roleName;

    private Long sortNum;

    private String remark;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    private Date createTime;
}