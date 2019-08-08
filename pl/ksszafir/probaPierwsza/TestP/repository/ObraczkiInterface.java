package pl.ksszafir.probaPierwsza.TestP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.ksszafir.probaPierwsza.TestP.entities.Obraczki;

import java.util.Optional;

public interface ObraczkiInterface extends JpaRepository <Obraczki, Long> {

    @Query("SELECT c from Obraczki c where name =?1")
    Optional<Obraczki> findById(Long id);


}
