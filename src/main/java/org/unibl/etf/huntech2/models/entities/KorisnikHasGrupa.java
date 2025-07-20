package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "korisnik_has_grupa")
public class KorisnikHasGrupa {
    @EmbeddedId
    private KorisnikHasGrupaId id;

    @MapsId("idKorisnika")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnika", nullable = false)
    private Korisnik idKorisnika;

    @MapsId("idGrupe")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdGrupe", nullable = false)
    private Grupa idGrupe;

    @Lob
    @Column(name = "StatusZaClanstvo", nullable = false)
    private String statusZaClanstvo;

    @Column(name = "DatumUclanjivanja")
    private LocalDate datumUclanjivanja;

    @Lob
    @Column(name = "TipZahtjeva", nullable = false)
    private String tipZahtjeva;

}