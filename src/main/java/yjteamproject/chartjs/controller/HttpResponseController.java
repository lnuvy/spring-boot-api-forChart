package yjteamproject.chartjs.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import yjteamproject.chartjs.document.Corona;
import yjteamproject.chartjs.dto.CoronaDto;
import yjteamproject.chartjs.repository.CoronaRepository;

import java.util.List;

@Log4j2
@RequestMapping("/api")
@RestController
public class HttpResponseController {

//    // data_visualization 의 smokes 컬렉션
//    @Autowired
//    CsvRepository csvRepository;
//
//
//    @RequestMapping("/test")
//    public ResponseEntity<?> requestParam(
//            /*@RequestParam(required = false) String sex,
//            @RequestParam(required = false) String smoker,
//            @RequestParam(required = false) String age*/
//            CsvData csvData
//    ) {
//        /*if(sex != null && smoker == null) {
//            dataList = csvRepository.findBySex(sex);
//
//        } else if(sex == null && smoker != null) {
//            dataList = csvRepository.findBySmoker(smoker);
//
//        } else if(sex == null && smoker == null) {
//            dataList = csvRepository.findAll();
//        } else {
//            dataList = csvRepository.findBySexAndSmoker(sex, smoker);
//        }*/
//        List<CsvData> dataList = csvRepository.findAllByAge(csvData.getAge());
//
//        return new ResponseEntity<>(dataList, HttpStatus.OK);
//    }


    @Autowired
    CoronaRepository coronaRepository;

    @GetMapping("/corona")
    public ResponseEntity<?> requestParam(CoronaDto coronaDto) {
        List<Corona> dataList;

        if(coronaDto.getStart() == null || coronaDto.getEnd() == null) {
            dataList = coronaRepository.findAll();
        } else {
            dataList = coronaRepository.findAllByDayBetween(coronaDto.getStart(), coronaDto.getEnd());
        }
        return new ResponseEntity<>(dataList, HttpStatus.OK);
    }
}