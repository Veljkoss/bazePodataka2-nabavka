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
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Veljko
 */
public class Proizvod extends DomenskiObjekat{
    private long proizvodId;
    private String naziv;
    private String jedinicaMere;

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
        final Proizvod other = (Proizvod) obj;
        if (this.proizvodId != other.proizvodId) {
            return false;
        }
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        if (!Objects.equals(this.jedinicaMere, other.jedinicaMere)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String getTableName() {
        return "proizvod p";
    }

    @Override
    public String getAllColumnNames() {
        return "p.proizvod_id, p.naziv, p.jm";
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
        List<DomenskiObjekat> proizvodi = new ArrayList();
        
        while(rs.next()){
            long id = rs.getLong("proizvod_id");
            String naziv = rs.getString("naziv");
            String jedinicaMere  =rs.getString("jm");
            Proizvod p = new Proizvod();
            p.setProizvodId(id);
            p.setNaziv(naziv);
            p.setJedinicaMere(jedinicaMere);
            
            proizvodi.add(p);
        }
        
        return proizvodi;
    }

    @Override
    public String getOrderByColumn() {
        return "p.proizvod_id";
    }

    public long getProizvodId() {
        return proizvodId;
    }

    public void setProizvodId(long proizvodId) {
        this.proizvodId = proizvodId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(String jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }
    
}
