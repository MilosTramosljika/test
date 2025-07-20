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
public class KorisnikHasGrupaId implements Serializable {
    private static final long serialVersionUID = -6255173196905479145L;
    @Column(name = "IdKorisnika", nullable = false)
    private Integer idKorisnika;

    @Column(name = "IdGrupe", nullable = false)
    private Integer idGrupe;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        KorisnikHasGrupaId entity = (KorisnikHasGrupaId) o;
        return Objects.equals(this.idGrupe, entity.idGrupe) &&
                Objects.equals(this.idKorisnika, entity.idKorisnika);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGrupe, idKorisnika);
    }

}