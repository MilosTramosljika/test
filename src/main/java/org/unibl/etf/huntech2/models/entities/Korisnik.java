package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "korisnik")
public class Korisnik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdKorisnika", nullable = false)
    private Integer id;

    @Column(name = "Ime", nullable = false, length = 45)
    private String ime;

    @Column(name = "Prezime", nullable = false, length = 45)
    private String prezime;

    @Column(name = "Username", nullable = false, length = 45)
    private String username;

    @Column(name = "Mail", nullable = false, length = 45)
    private String mail;

    @Column(name = "Lozinka", nullable = false, length = 45)
    private String lozinka;

    @ManyToMany
    private Set<org.unibl.etf.huntech2.models.entities.ZahtjevZaRegistraciju> zahtjevZaRegistracijus = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idKorisnika")
    private Set<KHasZzp> kHasZzps = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idKorisnika")
    private Set<Komentar> komentars = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idKorisnika")
    private Set<org.unibl.etf.huntech2.models.entities.KorisnikHasGrupa> korisnikHasGrupas = new LinkedHashSet<>();

    @ManyToMany
    private Set<Konverzacija> konverzacijas = new LinkedHashSet<>();

    @ManyToMany
    private Set<org.unibl.etf.huntech2.models.entities.Prijava> prijavas_admin = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idKorisnika")
    private Set<org.unibl.etf.huntech2.models.entities.KorisnikHasUloga> korisnikHasUlogas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idKorisnika")
    private Set<org.unibl.etf.huntech2.models.entities.Obavjestenja> obavjestenjas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idKorisnika")
    private Set<org.unibl.etf.huntech2.models.entities.Objava> objavas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idKorisnika")
    private Set<org.unibl.etf.huntech2.models.entities.ObjavaNaLovackiDnevnik> objavaNaLovackiDnevniks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idKorisnika")
    private Set<org.unibl.etf.huntech2.models.entities.Poruka> porukas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idKorisnikaKojiPrijavljuje")
    private Set<org.unibl.etf.huntech2.models.entities.Prijava> prijavas_korisnik = new LinkedHashSet<>();

    @OneToMany(mappedBy = "korisnikIdkorisnika")
    private Set<org.unibl.etf.huntech2.models.entities.ZahtjevZaPromjenuStatusa> zahtjevZaPromjenuStatusas = new LinkedHashSet<>();

}