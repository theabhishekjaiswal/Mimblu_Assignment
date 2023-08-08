package com.abhi.mimblu;

public class userModel {
    int id;
    String title;
    int state_id;
    String created_on;
    int type_id;
    Boolean is_selected;
    int created_by_id;

    public userModel(int id, String title, int state_id, String created_on, int type_id, Boolean is_selected, int created_by_id) {
        this.id = id;
        this.title = title;
        this.state_id = state_id;
        this.created_on = created_on;
        this.type_id = type_id;
        this.is_selected = is_selected;
        this.created_by_id = created_by_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public Boolean getIs_selected() {
        return is_selected;
    }

    public void setIs_selected(Boolean is_selected) {
        this.is_selected = is_selected;
    }

    public int getCreated_by_id() {
        return created_by_id;
    }

    public void setCreated_by_id(int created_by_id) {
        this.created_by_id = created_by_id;
    }
}
