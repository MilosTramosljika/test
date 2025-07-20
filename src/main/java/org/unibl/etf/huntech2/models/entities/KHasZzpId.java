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
public class KHasZzpId implements Serializable {
    private static final long serialVersionUID = -9148198464244989267L;
    @Column(name = "IdKorisnika", nullable = false)
    private Integer idKorisnika;

    @Column(name = "IdZahtjevaZaPromjenuStatusa", nullable = false)
    private Integer idZahtjevaZaPromjenuStatusa;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        KHasZzpId entity = (KHasZzpId) o;
        return Objects.equals(this.idKorisnika, entity.idKorisnika) &&
                Objects.equals(this.idZahtjevaZaPromjenuStatusa, entity.idZahtjevaZaPromjenuStatusa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKorisnika, idZahtjevaZaPromjenuStatusa);
    }

}