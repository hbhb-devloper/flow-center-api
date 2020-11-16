package com.hbhb.cw.flowcenter.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yzc
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlowRoleVO implements Serializable {

    private static final long serialVersionUID = -3410316634302526899L;

    @Schema(description = "流程角色id")
    private Long id;

    @Schema(description = "流程角色名字")
    private String roleName;

    @Schema(description = "显示顺序")
    private Long sortNum;

    @Schema(description = "备注")
    private String remark;
}
