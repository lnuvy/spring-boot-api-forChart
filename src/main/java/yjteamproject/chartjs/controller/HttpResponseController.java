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

import static java.lang.Integer.parseInt;

@Log4j2
@RequestMapping("/api")
@RestController
public class HttpResponseController {

    @Autowired
    CoronaRepository coronaRepository;

    @GetMapping("/corona")
    public ResponseEntity<?> requestParam(CoronaDto coronaDto) {
        List<Corona> dataList;

        if(coronaDto.getStart() == null && coronaDto.getEnd() == null) {
            dataList = coronaRepository.findAll();
        } else if(coronaDto.getEnd() == null) {
            dataList = coronaRepository.findAllByDayBetween(String.valueOf(parseInt(coronaDto.getStart())-1), "20211131" );
        } else if(coronaDto.getStart() == null) {
            dataList = coronaRepository.findAllByDayBetween( "20200101", String.valueOf(parseInt(coronaDto.getEnd())+1) );
        } else {
            String startDay = coronaDto.getStart();
            String endDay = coronaDto.getEnd();

            int start = parseInt(startDay) -1;
            int end = parseInt(endDay) +1;

            dataList = coronaRepository.findAllByDayBetween(String.valueOf(start), String.valueOf(end));
        }
        return new ResponseEntity<>(dataList, HttpStatus.OK);
    }
}