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
public class KHasZarId implements Serializable {
    private static final long serialVersionUID = -6848864718435910977L;
    @Column(name = "IdKorisnika", nullable = false)
    private Integer idKorisnika;

    @Column(name = "IdZahtjeva", nullable = false)
    private Integer idZahtjeva;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        KHasZarId entity = (KHasZarId) o;
        return Objects.equals(this.idKorisnika, entity.idKorisnika) &&
                Objects.equals(this.idZahtjeva, entity.idZahtjeva);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKorisnika, idZahtjeva);
    }

}