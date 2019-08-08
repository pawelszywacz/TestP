//package pl.ksszafir.probaPierwsza.TestP.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import pl.ksszafir.probaPierwsza.TestP.repository.ProduktInterface;
//
//@Controller
//@RequestMapping(value = "admin")
//public class AdminProduktController {
//
//    @Autowired
//    private ProduktInterface produktInterface;
//
//    public String addProdukt(@RequestParam String idprodukt,
//                             @RequestParam String nazwa,
//                             @RequestParam String probaZlota,
//                             @RequestParam String waga,
//                             @RequestParam String kolorZlota,
//                             @RequestParam String opis){
//        produktInterface.createNewProdukt(idprodukt, nazwa, probaZlota, waga, kolorZlota, opis);
//        return "redirect:/admin/produkt"; //Tworzy nowy reqest
//    }
//
//
//
//
//
//
//
//
//}
