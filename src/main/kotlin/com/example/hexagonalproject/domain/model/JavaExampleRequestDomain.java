package com.example.hexagonalproject.domain.model;

public class JavaExampleRequestDomain {
    private long id;
    private String desc;

    public JavaExampleRequestDomain(long id, String desc) {
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