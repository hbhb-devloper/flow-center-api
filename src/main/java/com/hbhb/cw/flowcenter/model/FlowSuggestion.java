package com.hbhb.cw.flowcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlowSuggestion implements Serializable {
    private static final long serialVersionUID = -7426779773806503139L;

    @AutoID
    private Long id;

    private String suggestion;

    private Integer orderNumber;

    private Date createTime;

    private String createBy;
}