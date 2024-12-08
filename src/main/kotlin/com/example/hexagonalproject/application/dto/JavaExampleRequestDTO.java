package com.example.hexagonalproject.application.dto;

public class JavaExampleDTO {
    private long id;
    private String desc;

    public JavaExampleDTO(long id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
