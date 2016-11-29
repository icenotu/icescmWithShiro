package com.icenotu.entity;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by Administrator on 2016-11-27.
 */
public class PermissionTree implements Serializable {
    private static final long serialVersionUID = 2382618279911366549L;
    private String id;
    private String parent;
    private String text;
    private String icon;
    private Map<String,Boolean> state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Map<String, Boolean> getState() {
        return state;
    }

    public void setState(Map<String, Boolean> state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "PermissionTree{" +
                "id='" + id + '\'' +
                ", parent='" + parent + '\'' +
                ", text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", state=" + state +
                '}';
    }
}
