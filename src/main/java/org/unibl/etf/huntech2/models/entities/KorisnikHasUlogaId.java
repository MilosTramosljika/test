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
public class KorisnikHasUlogaId implements Serializable {
    private static final long serialVersionUID = 4731593964266281698L;
    @Column(name = "IdKorisnika", nullable = false)
    private Integer idKorisnika;

    @Column(name = "IdUloge", nullable = false)
    private Integer idUloge;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        KorisnikHasUlogaId entity = (KorisnikHasUlogaId) o;
        return Objects.equals(this.idUloge, entity.idUloge) &&
                Objects.equals(this.idKorisnika, entity.idKorisnika);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUloge, idKorisnika);
    }

}