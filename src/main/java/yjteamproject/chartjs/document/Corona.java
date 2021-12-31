package yjteamproject.chartjs.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "coronas")
public class Corona {

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

}
