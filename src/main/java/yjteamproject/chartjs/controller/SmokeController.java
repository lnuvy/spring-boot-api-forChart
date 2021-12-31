package yjteamproject.chartjs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yjteamproject.chartjs.document.CsvData;
import yjteamproject.chartjs.repository.CsvRepository;

import java.util.List;
@RestController
public class SmokeController {

    // data_visualization 의 smokes 컬렉션
    @Autowired
    CsvRepository csvRepository;


    @RequestMapping("/test")
    public ResponseEntity<?> requestParam(
            @RequestParam(required = false) String sex,
            @RequestParam(required = false) String smoker,
            @RequestParam(required = false) String age
            /* CsvData csvData */
    ) {
        List<CsvData> dataList = null;

        if(sex != null && smoker == null) {
            dataList = csvRepository.findBySex(sex);

        } else if(sex == null && smoker != null) {
            dataList = csvRepository.findBySmoker(smoker);

        } else if(sex == null && smoker == null) {
            dataList = csvRepository.findAll();
        } else {
//            dataList = csvRepository.findBySexAndSmoker(sex, smoker);
        }
        /* List<CsvData> dataList = csvRepository.findAllByAge(csvData.getAge()); */

        return new ResponseEntity<>(dataList, HttpStatus.OK);
    }
}

