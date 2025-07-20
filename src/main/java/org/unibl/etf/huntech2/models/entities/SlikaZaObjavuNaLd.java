package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "slika_za_objavu_na_ld")
public class SlikaZaObjavuNaLd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSlikeZaObjavuNaLD", nullable = false)
    private Integer id;

    @Column(name = "Datum", nullable = false)
    private Instant datum;

    @Column(name = "Slika", nullable = false, length = 500)
    private String slika;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdObjaveNaLD", nullable = false)
    private ObjavaNaLovackiDnevnik idObjaveNaLD;

}