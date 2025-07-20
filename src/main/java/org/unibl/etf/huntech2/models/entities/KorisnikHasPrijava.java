package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "korisnik_has_prijava")
public class KorisnikHasPrijava {
    @EmbeddedId
    private KorisnikHasPrijavaId id;

    @MapsId("idKorisnika")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnika", nullable = false)
    private Korisnik idKorisnika;

    @MapsId("idPrijave")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdPrijave", nullable = false)
    private org.unibl.etf.huntech2.models.entities.Prijava idPrijave;

}