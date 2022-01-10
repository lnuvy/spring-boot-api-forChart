package yjteamproject.chartjs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CsvRepository extends MongoRepository<CsvData, String> {

    List<CsvData> findBySex(String sex);
    List<CsvData> findByAge(String age);
    List<CsvData> findBySmoker(String smoker);

    /* List<CsvData> findAllByAge(String age);
    List<CsvData> findAllBySex(String sex);
    List<CsvData> findAllBySmoker(String Smoker); */
}