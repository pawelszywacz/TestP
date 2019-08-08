package pl.ksszafir.probaPierwsza.TestP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.ksszafir.probaPierwsza.TestP.entities.Kamien;

import java.util.List;

public interface KamienInterface extends JpaRepository<Kamien, Long> {

    //List<Kamien> findAllByKamienie_id;

}
