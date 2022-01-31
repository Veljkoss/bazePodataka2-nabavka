/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen.objekat.entiteti;

import domen.objekat.DomenskiObjekat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Veljko
 */
public class Ponuda extends DomenskiObjekat{

    private long ponudaId;
    private String opstiUslovi;
    private Date datum;
    private ZahtevZaDostavljanjePonude zahtevZaDostavljanjePonude;
    private Preduzece preduzece;
    private ArrayList<StavkaPonude> stavkePonude;

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Ponuda other = (Ponuda) obj;
        if (this.ponudaId != other.ponudaId) {
            return false;
        }
        if (!Objects.equals(this.opstiUslovi, other.opstiUslovi)) {
            return false;
        }
        if (!Objects.equals(this.datum, other.datum)) {
            return false;
        }
        if (!Objects.equals(this.zahtevZaDostavljanjePonude, other.zahtevZaDostavljanjePonude)) {
            return false;
        }
        if (!Objects.equals(this.preduzece, other.preduzece)) {
            return false;
        }
        if (!Objects.equals(this.stavkePonude, other.stavkePonude)) {
            return false;
        }
        return true;
    }
    
        
    
    @Override
    public String getTableName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAllColumnNames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInsertColumnNames() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUpdateClause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getWhereIdClause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUpdateWhereClause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDeleteWhereClause() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DomenskiObjekat> getObjectsFromResultSet(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOrderByColumn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public long getPonudaId() {
        return ponudaId;
    }

    public void setPonudaId(long ponudaId) {
        this.ponudaId = ponudaId;
    }

    public String getOpstiUslovi() {
        return opstiUslovi;
    }

    public void setOpstiUslovi(String opstiUslovi) {
        this.opstiUslovi = opstiUslovi;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public ZahtevZaDostavljanjePonude getZahtevZaDostavljanjePonude() {
        return zahtevZaDostavljanjePonude;
    }

    public void setZahtevZaDostavljanjePonude(ZahtevZaDostavljanjePonude zahtevZaDostavljanjePonude) {
        this.zahtevZaDostavljanjePonude = zahtevZaDostavljanjePonude;
    }

    public Preduzece getPreduzece() {
        return preduzece;
    }

    public void setPreduzece(Preduzece preduzece) {
        this.preduzece = preduzece;
    }

    public ArrayList<StavkaPonude> getStavkePonude() {
        return stavkePonude;
    }

    public void setStavkePonude(ArrayList<StavkaPonude> stavkePonude) {
        this.stavkePonude = stavkePonude;
    }
    
}
