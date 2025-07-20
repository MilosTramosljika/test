package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "lokacija")
public class Lokacija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdLokacije", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdGrupe", nullable = false)
    private Grupa idGrupe;

    @Column(name = "GeografskaSirina", nullable = false)
    private Double geografskaSirina;

    @Column(name = "GeografskaDuzina", nullable = false)
    private Double geografskaDuzina;

}