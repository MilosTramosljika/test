package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "korisnik_has_uloga")
public class KorisnikHasUloga {
    @EmbeddedId
    private KorisnikHasUlogaId id;

    @MapsId("idKorisnika")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnika", nullable = false)
    private Korisnik idKorisnika;

    @MapsId("idUloge")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdUloge", nullable = false)
    private org.unibl.etf.huntech2.models.entities.Uloga idUloge;

    @Column(name = "DatumDobijanjaUloge", nullable = false)
    private LocalDate datumDobijanjaUloge;

}