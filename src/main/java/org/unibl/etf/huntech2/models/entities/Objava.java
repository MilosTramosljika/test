package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "objava")
public class Objava {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdObjave", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdGrupe", nullable = false)
    private Grupa idGrupe;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnika", nullable = false)
    private Korisnik idKorisnika;

    @Lob
    @Column(name = "TipObjave", nullable = false)
    private String tipObjave;

    @Column(name = "DatumObjavljivanja", nullable = false)
    private LocalDate datumObjavljivanja;

    @Column(name = "Lajk", nullable = false)
    private Integer lajk;

    @Column(name = "Dislajk", nullable = false)
    private Integer dislajk;

    @OneToMany(mappedBy = "idObjave")
    private Set<Komentar> komentars = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idObjave")
    private Set<org.unibl.etf.huntech2.models.entities.SlikaZaObjavu> slikaZaObjavus = new LinkedHashSet<>();

}