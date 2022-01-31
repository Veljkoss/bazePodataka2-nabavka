/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen.objekat.entiteti;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Veljko
 */
public class CenaProizvoda {
    private Date datumOd;
    private Proizvod proizvod;
    private Date datumDo;
    private double iznos;

    public CenaProizvoda(Date datumOd, Proizvod proizvod, Date datumDo, double iznos) {
        this.datumOd = datumOd;
        this.proizvod = proizvod;
        this.datumDo = datumDo;
        this.iznos = iznos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CenaProizvoda other = (CenaProizvoda) obj;
        if (this.proizvod != other.proizvod) {
            return false;
        }
        if (Double.doubleToLongBits(this.iznos) != Double.doubleToLongBits(other.iznos)) {
            return false;
        }
        if (!Objects.equals(this.datumOd, other.datumOd)) {
            return false;
        }
        if (!Objects.equals(this.datumDo, other.datumDo)) {
            return false;
        }
        return true;
    }
    
    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }



    public Date getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public Proizvod getProizvodId() {
        return proizvod;
    }

    public void setProizvodId(Proizvod proizvodId) {
        this.proizvod = proizvodId;
    }
    
    
}
