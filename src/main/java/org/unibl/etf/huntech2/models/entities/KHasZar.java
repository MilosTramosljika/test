package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "k_has_zar")
public class KHasZar {
    @EmbeddedId
    private KHasZarId id;

    @MapsId("idKorisnika")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnika", nullable = false)
    private org.unibl.etf.huntech2.models.entities.Korisnik idKorisnika;

    @MapsId("idZahtjeva")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdZahtjeva", nullable = false)
    private org.unibl.etf.huntech2.models.entities.ZahtjevZaRegistraciju idZahtjeva;

}