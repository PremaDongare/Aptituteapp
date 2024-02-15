package com.example.myapplication1;

public class Model {
    private String codeName,description;
    private boolean expandable;

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public Model(String codeName, String description) {
        this.codeName = codeName;
        this.description = description;
        this.expandable = false;

    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Model{" +
                "codeName='" + codeName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }



}
