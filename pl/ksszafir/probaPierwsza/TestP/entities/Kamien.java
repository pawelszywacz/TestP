package pl.ksszafir.probaPierwsza.TestP.entities;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "kamien")
public class Kamien {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name = "idkamien")
    private Long id;

    @Column(name = "rozmiar_kamienia")
    private BigDecimal rozmiarKamienia;

    @Column(name = "cena")
    private BigDecimal cena;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idobraczki", nullable = false)
    private Obraczki obraczki;

    public Kamien(){

    }
    public Kamien(Long idkamien, BigDecimal rozmiarKamienia, BigDecimal cena){
        this.id = idkamien;
        this.rozmiarKamienia = rozmiarKamienia;
        this.cena = cena;

    }

    public Long getId(){return id;}

    public void setId(Long id){this.id = id;}

    public BigDecimal getRozmiarKamienia(){return rozmiarKamienia;}

    public void setRozmiarKamienia(BigDecimal rozmiarKamienia){this.rozmiarKamienia = rozmiarKamienia;}

    public BigDecimal getCena(){return cena;}

    public void setCena(BigDecimal cena){this.cena = cena;}

    public Obraczki getObraczki(){return obraczki;}

    public void setObraczki(Obraczki obraczki){this.obraczki = obraczki;}



}
