package com.netease.nertc.beauty.module;

public enum NEAssetsEnum {
    EFFECTS("beauty"),
    FILTERS("filters"),
    MAKEUPS("makeups");

    private String assetsPath;

    NEAssetsEnum(String assetsPath) {
        this.assetsPath = assetsPath;
    }

    public String getAssetsPath() {
        return assetsPath;
    }
}
