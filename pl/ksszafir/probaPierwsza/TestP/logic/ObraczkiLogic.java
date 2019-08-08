package pl.ksszafir.probaPierwsza.TestP.logic;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.ksszafir.probaPierwsza.TestP.entities.DTO.ObraczkiDTO;
import pl.ksszafir.probaPierwsza.TestP.entities.Obraczki;
import pl.ksszafir.probaPierwsza.TestP.repository.ObraczkiInterface;

import java.util.ArrayList;

@Component
public class ObraczkiLogic {

    @Autowired
    ObraczkiInterface obraczkiInterface;

//    public void save(Obraczki obraczki){

//    }
//
//    }
//    public List<Obraczki> findAll(){return obraczkiInterface.findAll();}


//    public List<ObraczkiDTO> findAllDTO(){
//        List<ObraczkiDTO> list = new ArrayList<>();
//        for (Obraczki obraczki: obraczkiInterface.findAll()){
//            list.add(new ObraczkiDTO(obraczki));
//        }
//    }

    public Obraczki findById(Long idobraczki){
        Obraczki obraczki = obraczkiInterface.findById(idobraczki).get();
        return obraczki;
    }

}
