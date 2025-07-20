package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "komentar")
public class Komentar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdKomentara", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdObjave", nullable = false)
    private org.unibl.etf.huntech2.models.entities.Objava idObjave;

    @Column(name = "Sadrzaj", length = 400)
    private String sadrzaj;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdKorisnika", nullable = false)
    private org.unibl.etf.huntech2.models.entities.Korisnik idKorisnika;

    @OneToMany(mappedBy = "idKomentara")
    private Set<org.unibl.etf.huntech2.models.entities.Podkomentar> podkomentars = new LinkedHashSet<>();

}