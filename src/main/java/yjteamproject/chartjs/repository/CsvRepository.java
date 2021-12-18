package yjteamproject.chartjs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import yjteamproject.chartjs.document.CsvData;

import java.util.List;

@Repository
public interface CsvRepository extends MongoRepository<CsvData, String> {

    List<CsvData> findAllByAge(String age);
    List<CsvData> findAllBySex(String sex);
    List<CsvData> findAllBySmoker(String Smoker);

//    List<CsvData> findAllBy
}