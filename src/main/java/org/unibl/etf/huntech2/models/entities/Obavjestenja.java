package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "obavjestenja")
public class Obavjestenja {
    @Id
    @Column(name = "IdObavjestenja", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnika", nullable = false)
    private Korisnik idKorisnika;

    @Lob
    @Column(name = "TipObavjestenja")
    private String tipObavjestenja;

    @Column(name = "Sadrzaj", length = 500)
    private String sadrzaj;

}