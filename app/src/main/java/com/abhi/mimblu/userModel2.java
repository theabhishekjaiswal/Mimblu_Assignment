package com.abhi.mimblu;

public class userModel2 {
    int id;
    String plan_id;
    String title;
    String company_name;
    String description;
    String video_description;
    String duration;
    String weekly_price;
    String discounted_price;
    int discounted_price_calculated;
    String tax_price;
    String tax_percentage;
    String final_price;
    String total_price;
    int incentive_days;
    int no_of_free_trial_days;
    int no_of_video_session;
    int plan_type;
    int is_recommended;
    int state_id;
    int type_id;
    String created_on;
    int created_by_id;
    String currency_code;

    public userModel2(int id, String plan_id, String title, String company_name, String description, String video_description, String duration, String weekly_price, String discounted_price, int discounted_price_calculated, String tax_price, String tax_percentage, String final_price, String total_price, int incentive_days, int no_of_free_trial_days, int no_of_video_session, int plan_type, int is_recommended, int state_id, int type_id, String created_on, int created_by_id, String currency_code) {
        this.id = id;
        this.plan_id = plan_id;
        this.title = title;
        this.company_name = company_name;
        this.description = description;
        this.video_description = video_description;
        this.duration = duration;
        this.weekly_price = weekly_price;
        this.discounted_price = discounted_price;
        this.discounted_price_calculated = discounted_price_calculated;
        this.tax_price = tax_price;
        this.tax_percentage = tax_percentage;
        this.final_price = final_price;
        this.total_price = total_price;
        this.incentive_days = incentive_days;
        this.no_of_free_trial_days = no_of_free_trial_days;
        this.no_of_video_session = no_of_video_session;
        this.plan_type = plan_type;
        this.is_recommended = is_recommended;
        this.state_id = state_id;
        this.type_id = type_id;
        this.created_on = created_on;
        this.created_by_id = created_by_id;
        this.currency_code = currency_code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(String plan_id) {
        this.plan_id = plan_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVideo_description() {
        return video_description;
    }

    public void setVideo_description(String video_description) {
        this.video_description = video_description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getWeekly_price() {
        return weekly_price;
    }

    public void setWeekly_price(String weekly_price) {
        this.weekly_price = weekly_price;
    }

    public String getDiscounted_price() {
        return discounted_price;
    }

    public void setDiscounted_price(String discounted_price) {
        this.discounted_price = discounted_price;
    }

    public int getDiscounted_price_calculated() {
        return discounted_price_calculated;
    }

    public void setDiscounted_price_calculated(int discounted_price_calculated) {
        this.discounted_price_calculated = discounted_price_calculated;
    }

    public String getTax_price() {
        return tax_price;
    }

    public void setTax_price(String tax_price) {
        this.tax_price = tax_price;
    }

    public String getTax_percentage() {
        return tax_percentage;
    }

    public void setTax_percentage(String tax_percentage) {
        this.tax_percentage = tax_percentage;
    }

    public String getFinal_price() {
        return final_price;
    }

    public void setFinal_price(String final_price) {
        this.final_price = final_price;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public int getIncentive_days() {
        return incentive_days;
    }

    public void setIncentive_days(int incentive_days) {
        this.incentive_days = incentive_days;
    }

    public int getNo_of_free_trial_days() {
        return no_of_free_trial_days;
    }

    public void setNo_of_free_trial_days(int no_of_free_trial_days) {
        this.no_of_free_trial_days = no_of_free_trial_days;
    }

    public int getNo_of_video_session() {
        return no_of_video_session;
    }

    public void setNo_of_video_session(int no_of_video_session) {
        this.no_of_video_session = no_of_video_session;
    }

    public int getPlan_type() {
        return plan_type;
    }

    public void setPlan_type(int plan_type) {
        this.plan_type = plan_type;
    }

    public int getIs_recommended() {
        return is_recommended;
    }

    public void setIs_recommended(int is_recommended) {
        this.is_recommended = is_recommended;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getCreated_on() {
        return created_on;
    }

    public void setCreated_on(String created_on) {
        this.created_on = created_on;
    }

    public int getCreated_by_id() {
        return created_by_id;
    }

    public void setCreated_by_id(int created_by_id) {
        this.created_by_id = created_by_id;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }
}
