package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "prijava")
public class Prijava {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPrijave", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnikaKojiPrijavljuje", nullable = false)
    private Korisnik idKorisnikaKojiPrijavljuje;

    @Column(name = "DatumPrijave", nullable = false)
    private Instant datumPrijave;

    @Column(name = "Obrazlozenje", nullable = false, length = 500)
    private String obrazlozenje;

    @Lob
    @Column(name = "TipPrijave")
    private String tipPrijave;

    @ManyToMany(mappedBy = "prijavas_admin")
    private Set<Korisnik> korisniks = new LinkedHashSet<>();

}