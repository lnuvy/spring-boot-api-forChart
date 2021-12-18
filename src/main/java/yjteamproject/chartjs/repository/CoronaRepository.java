package yjteamproject.chartjs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import yjteamproject.chartjs.document.Corona;

import java.util.List;

@Repository
public interface CoronaRepository extends MongoRepository<Corona, String> {
    List<Corona> findAll();
    List<Corona> findAllByDayBetween(String start, String end);
}
