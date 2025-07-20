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
@Table(name = "zahtjev_za_promjenu_statusa")
public class ZahtjevZaPromjenuStatusa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdZahtjevaZaPromjenuStatusa", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "KORISNIK_IdKorisnika", nullable = false)
    private Korisnik korisnikIdkorisnika;

    @Column(name = "Obrazlozenje", length = 400)
    private String obrazlozenje;

    @Column(name = "DatumPodnosenja", nullable = false)
    private LocalDate datumPodnosenja;

    @OneToMany(mappedBy = "idZahtjevaZaPromjenuStatusa")
    private Set<KHasZzp> kHasZzps = new LinkedHashSet<>();

}