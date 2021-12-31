package yjteamproject.chartjs.document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
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

}
