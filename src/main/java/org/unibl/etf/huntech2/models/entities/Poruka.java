package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "poruka")
public class Poruka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPoruke", nullable = false)
    private Integer id;

    @Column(name = "Sadrzaj", nullable = false, length = 500)
    private String sadrzaj;

    @Column(name = "DatumSlanja", nullable = false)
    private Instant datumSlanja;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnika", nullable = false)
    private Korisnik idKorisnika;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKonverzacije", nullable = false)
    private Konverzacija idKonverzacije;

}