package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "k_has_zzps")
public class KHasZzp {
    @EmbeddedId
    private KHasZzpId id;

    @MapsId("idKorisnika")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnika", nullable = false)
    private org.unibl.etf.huntech2.models.entities.Korisnik idKorisnika;

    @MapsId("idZahtjevaZaPromjenuStatusa")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdZahtjevaZaPromjenuStatusa", nullable = false)
    private org.unibl.etf.huntech2.models.entities.ZahtjevZaPromjenuStatusa idZahtjevaZaPromjenuStatusa;

    @Column(name = "DatumObrade")
    private LocalDate datumObrade;

}