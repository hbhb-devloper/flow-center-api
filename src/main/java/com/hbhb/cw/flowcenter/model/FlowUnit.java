package com.hbhb.cw.flowcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangxiaogang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FlowUnit implements Serializable {
    private static final long serialVersionUID = 1748255674956697490L;

    @AutoID
    private Long id;

    private Long flowId;

    private Integer unitId;
}