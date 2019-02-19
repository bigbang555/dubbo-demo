package com.deepexi.user.domain.eo;

import com.deepexi.util.mapper.SuperEntity;

public class Component extends SuperEntity {

    private String name;

    private String category;

    private String version;

    private String status;


    public Component() {
    }

    public Component(final String name, final String category, final String version,
            final String status) {
        this.name = name;
        this.category = category;
        this.version = version;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }
}
