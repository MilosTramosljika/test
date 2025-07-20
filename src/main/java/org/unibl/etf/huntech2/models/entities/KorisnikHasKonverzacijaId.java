package org.unibl.etf.huntech2.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class KorisnikHasKonverzacijaId implements Serializable {
    private static final long serialVersionUID = 3991017977798803398L;
    @Column(name = "IdKorisnika", nullable = false)
    private Integer idKorisnika;

    @Column(name = "IdKonverzacije", nullable = false)
    private Integer idKonverzacije;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        KorisnikHasKonverzacijaId entity = (KorisnikHasKonverzacijaId) o;
        return Objects.equals(this.idKorisnika, entity.idKorisnika) &&
                Objects.equals(this.idKonverzacije, entity.idKonverzacije);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKorisnika, idKonverzacije);
    }

}