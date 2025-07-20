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
public class KorisnikHasPrijavaId implements Serializable {
    private static final long serialVersionUID = 5804818962740792144L;
    @Column(name = "IdKorisnika", nullable = false)
    private Integer idKorisnika;

    @Column(name = "IdPrijave", nullable = false)
    private Integer idPrijave;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        KorisnikHasPrijavaId entity = (KorisnikHasPrijavaId) o;
        return Objects.equals(this.idKorisnika, entity.idKorisnika) &&
                Objects.equals(this.idPrijave, entity.idPrijave);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKorisnika, idPrijave);
    }

}