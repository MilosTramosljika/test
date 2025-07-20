package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "konverzacija")
public class Konverzacija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdKonverzacije", nullable = false)
    private Integer id;

    @Column(name = "NazivKonverzacije", nullable = false, length = 500)
    private String nazivKonverzacije;

    @Column(name = "DatumKreiranja", nullable = false)
    private Instant datumKreiranja;

    @ManyToMany
    @JoinTable(name = "korisnik_has_konverzacija",
            joinColumns = @JoinColumn(name = "IdKonverzacije"),
            inverseJoinColumns = @JoinColumn(name = "IdKorisnika"))
    private Set<org.unibl.etf.huntech2.models.entities.Korisnik> korisniks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idKonverzacije")
    private Set<org.unibl.etf.huntech2.models.entities.Poruka> porukas = new LinkedHashSet<>();

}