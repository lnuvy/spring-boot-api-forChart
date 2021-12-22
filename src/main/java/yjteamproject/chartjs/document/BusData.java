package yjteamproject.chartjs.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "buses")
public class BusData {

    @Id
    private String _id;

    @Field("년월")
    private String monthYear;

    @Field("노선")
    private String busNumber;

    @Field("구분")
    private String sort;

    @Field("05시")
    private String five;
    @Field("06시")
    private String six;
    @Field("07시")
    private String seven;
    @Field("08시")
    private String eight;
    @Field("09시")
    private String nine;
    @Field("10시")
    private String ten;
    @Field("11시")
    private String eleven;
    @Field("12시")
    private String twelve;
    @Field("13시")
    private String thirteen;
    @Field("14시")
    private String fourteen;
    @Field("15시")
    private String fifteen;
    @Field("16시")
    private String sixteen;
    @Field("17시")
    private String seventeen;
    @Field("18시")
    private String eighteen;
    @Field("19시")
    private String nineteen;
    @Field("20시")
    private String twenty;
    @Field("21시")
    private String twentyOne;
    @Field("22시")
    private String twentyTwo;
    @Field("23시")
    private String twentyThree;

    @Field("합계")
    private String total;


}
