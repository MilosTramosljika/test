package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "zahtjev_za_registraciju")
public class ZahtjevZaRegistraciju {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdZahtjeva", nullable = false)
    private Integer id;

    @Column(name = "urlPdfDokumenta", length = 45)
    private String urlPdfDokumenta;

    @ManyToMany
    private Set<Korisnik> korisniks = new LinkedHashSet<>();

}