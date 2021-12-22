package yjteamproject.chartjs.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "smokes")
public class CsvData {

    private String _id;
    private String age;
    private String sex;
    private String bmi;
    private String children;
    private String smoker;
    private String region;
    private String charges;


    public void set_id(String _id) {
        this._id = _id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public void setSmoker(String smoker) {
        this.smoker = smoker;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCharges(String charges) {
        this.charges = charges;
    }

    public String get_id() {
        return _id;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getBmi() {
        return bmi;
    }

    public String getChildren() {
        return children;
    }

    public String getSmoker() {
        return smoker;
    }

    public String getRegion() {
        return region;
    }

    public String getCharges() {
        return charges;
    }
}
