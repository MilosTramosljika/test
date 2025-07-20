package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "aktivnost_divljaci")
public class AktivnostDivljaci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdAktivnostiDivljaci", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdGrupe", nullable = false)
    private org.unibl.etf.huntech2.models.entities.Grupa idGrupe;

    @Lob
    @Column(name = "Tip", nullable = false)
    private String tip;

    @Column(name = "Putanja", nullable = false, length = 400)
    private String putanja;

}