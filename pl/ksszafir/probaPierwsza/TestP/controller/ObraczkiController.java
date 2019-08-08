package pl.ksszafir.probaPierwsza.TestP.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.ksszafir.probaPierwsza.TestP.entities.Obraczki;
import pl.ksszafir.probaPierwsza.TestP.repository.ObraczkiInterface;

@RestController
@RequestMapping(value = "obraczki")
public class ObraczkiController {

    @Autowired
    ObraczkiInterface obraczkiInterface;


    @RequestMapping(value = "addObraczke", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity addObraczke(@RequestBody Obraczki obraczki){
        try {
            obraczkiInterface.save(obraczki);
        }
        catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.CREATED);
    }





//    public ResponseEntity
//
//    @RequestMapping(value = "getAllObraczki", ReqestMethod.GET, consumes = "aplication/json")
//    public ResponseEntity getAllObraczki(){
//        try {
//
//        }
//    }
}
