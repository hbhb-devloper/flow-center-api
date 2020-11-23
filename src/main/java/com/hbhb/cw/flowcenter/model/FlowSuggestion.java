package com.hbhb.cw.flowcenter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlowSuggestion {
    private Long id;

    private String suggestion;

    private Integer orderNumber;

    private Date createTime;

    private String createBy;


}