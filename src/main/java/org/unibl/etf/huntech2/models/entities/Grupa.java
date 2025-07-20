package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "grupa")
public class Grupa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdGrupe", nullable = false)
    private Integer id;

    @Column(name = "NazivGrupe", nullable = false, length = 100)
    private String nazivGrupe;

    @Column(name = "Opis", nullable = false, length = 500)
    private String opis;

    @Column(name = "Slika", nullable = false)
    private byte[] slika;

    @OneToMany(mappedBy = "idGrupe")
    private Set<AktivnostDivljaci> aktivnostDivljacis = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idGrupe")
    private Set<org.unibl.etf.huntech2.models.entities.KorisnikHasGrupa> korisnikHasGrupas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idGrupe")
    private Set<org.unibl.etf.huntech2.models.entities.Lokacija> lokacijas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idGrupe")
    private Set<org.unibl.etf.huntech2.models.entities.Objava> objavas = new LinkedHashSet<>();

}