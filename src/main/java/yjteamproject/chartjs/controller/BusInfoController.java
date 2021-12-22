package yjteamproject.chartjs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yjteamproject.chartjs.document.BusData;
import yjteamproject.chartjs.dto.BusDto;
import yjteamproject.chartjs.repository.BusRepository;

import java.util.List;


@RequestMapping("/bus")
@RestController
public class BusInfoController {

    @Autowired
    BusRepository busRepository;

    @GetMapping("/test")
    public ResponseEntity<?> requestInfo(BusDto busDto) {
        List<BusData> dataList;

        if (busDto.getSelect() == null ) {
            dataList = busRepository.findAll();
        } else {
            dataList = busRepository.findAllByMonthYear(busDto.getSelect());
        }
        return new ResponseEntity<>(dataList, HttpStatus.OK);
    }

}
