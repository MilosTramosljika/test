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
@Table(name = "objava_na_lovacki_dnevnik")
public class ObjavaNaLovackiDnevnik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdObjaveNaLD", nullable = false)
    private Integer id;

    @Column(name = "Datum", nullable = false)
    private Instant datum;

    @Column(name = "Sadrzaj", nullable = false, length = 400)
    private String sadrzaj;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnika", nullable = false)
    private Korisnik idKorisnika;

    @OneToMany(mappedBy = "idObjaveNaLD")
    private Set<org.unibl.etf.huntech2.models.entities.SlikaZaObjavuNaLd> slikaZaObjavuNaLds = new LinkedHashSet<>();

}