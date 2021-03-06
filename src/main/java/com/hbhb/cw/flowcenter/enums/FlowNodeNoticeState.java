package com.hbhb.cw.flowcenter.enums;

public enum FlowNodeNoticeState {

    /**
     * 默认提醒
     */
    DEFAULT_REMINDER(10),
    /**
     * 不同意
     */
    REJECT_REMINDER(20),
    /**
     * 流程完成
     */
    COMPLETE_REMINDER(30),
    ;

    private final Integer value;

    FlowNodeNoticeState(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }
}
