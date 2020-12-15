package com.hbhb.cw.flowcenter.model;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlowNotice implements Serializable {
    private static final long serialVersionUID = -7553452180366330556L;

    private Long id;
    private String content;
    private String remark;
    private Date createTime;
    private String createBy;
}