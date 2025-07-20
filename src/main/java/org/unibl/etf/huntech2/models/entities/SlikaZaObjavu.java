package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "slika_za_objavu")
public class SlikaZaObjavu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdSlikeZaObjavu", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdObjave", nullable = false)
    private Objava idObjave;

    @Column(name = "Slika", nullable = false, length = 500)
    private String slika;

}