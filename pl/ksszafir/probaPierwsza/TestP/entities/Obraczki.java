package pl.ksszafir.probaPierwsza.TestP.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "obraczki")
public class Obraczki {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "kolor")
    private String kolor;

    @Column(name = "kamienie")
    private Long kamienie;

    /*
    próba
    przekru
    nazwa
    opis
    cena
     */


    public Obraczki(){

    }

    public Obraczki(Long id, String kolor, Long kamienie){
        this.id = id;
        this.kolor = kolor;
        this.kamienie = kamienie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Long getKamienie() {
        return kamienie;
    }

    public void setKamienie(Long kamienie) {
        this.kamienie = kamienie;
    }
}
