package com.hbhb.cw.flowcenter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlowNodeNotice {

    private Long id;

    private String flowNodeId;

    private String noticeNodeId;

    private Integer state;

    private String inform;

    private Date createTime;

    private String createBy;

}