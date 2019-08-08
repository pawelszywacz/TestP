package pl.ksszafir.probaPierwsza.TestP.entities.DTO;

import pl.ksszafir.probaPierwsza.TestP.entities.Obraczki;

public class ObraczkiDTO {

    private Long id;
    private String kolor;
    private Long kamienie;

    public ObraczkiDTO(){
    }
    public ObraczkiDTO(Obraczki obraczki){
        this();
        this.id = obraczki.getId();
        this.kolor = obraczki.getKolor();
        this.kamienie = obraczki.getKamienie();
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){this.id = id;}

    public String getKolor(){return kolor;}

    public void setKolor(String kolor){this.kolor = kolor;}

    public Long getKamienie(){return kamienie;}

    public void setKamienie(Long kamienie){this.kamienie = kamienie;}



}
