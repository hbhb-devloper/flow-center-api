package com.hbhb.cw.flowcenter.enums;

public enum FlowNodeNoticeTemp {

    TITLE("{title}"),

    APPROVE("{approve}"),

    CAUSE("{cause}"),
    ;

    private final String value;

    FlowNodeNoticeTemp(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
