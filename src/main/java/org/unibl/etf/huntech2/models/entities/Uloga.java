package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "uloga")
public class Uloga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdUloge", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "NazivUloge", nullable = false)
    private String nazivUloge;

    @OneToMany(mappedBy = "idUloge")
    private Set<KorisnikHasUloga> korisnikHasUlogas = new LinkedHashSet<>();

}