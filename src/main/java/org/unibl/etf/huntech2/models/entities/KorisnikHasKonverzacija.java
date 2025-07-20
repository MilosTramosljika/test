package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "korisnik_has_konverzacija")
public class KorisnikHasKonverzacija {
    @EmbeddedId
    private KorisnikHasKonverzacijaId id;

    @MapsId("idKorisnika")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnika", nullable = false)
    private Korisnik idKorisnika;

    @MapsId("idKonverzacije")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKonverzacije", nullable = false)
    private Konverzacija idKonverzacije;

}