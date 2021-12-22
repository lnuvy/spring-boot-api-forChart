package yjteamproject.chartjs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import yjteamproject.chartjs.document.BusData;
import yjteamproject.chartjs.document.Corona;

import java.util.List;

@Repository
public interface BusRepository extends MongoRepository<BusData, String> {
    List<BusData> findAll();
    List<BusData> findAllByMonthYear(String select);
}
