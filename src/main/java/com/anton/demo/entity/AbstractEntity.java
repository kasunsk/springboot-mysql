package com.anton.demo.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
@SuppressWarnings("serial")
public class AbstractEntity {

    @Version
    @Column(name = "VERSION")
    protected Long version;

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
