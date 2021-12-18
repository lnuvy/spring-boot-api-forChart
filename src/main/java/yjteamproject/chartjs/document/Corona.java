package yjteamproject.chartjs.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "coronas")
public class Corona {

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    @Id
    private String _id;

    @Field("기준일")
    private String day;

    @Field("확진자 수")
    private String decide;

    @Field("사망자 수")
    private String death;

    @Field("일일 확진자수")
    private String dayDecide;

    @Field("일일 사망자수")
    private String dayDeath;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDecide() {
        return decide;
    }

    public void setDecide(String decide) {
        this.decide = decide;
    }

    public String getDeath() {
        return death;
    }

    public void setDeath(String death) {
        this.death = death;
    }

    public String getDayDecide() {
        return dayDecide;
    }

    public void setDayDecide(String dayDecide) {
        this.dayDecide = dayDecide;
    }

    public String getDayDeath() {
        return dayDeath;
    }

    public void setDayDeath(String dayDeath) {
        this.dayDeath = dayDeath;
    }
}
