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
public class AvansniRacun extends DomenskiObjekat{

    private long avansniRacunId;
    private Date datum;
    private String mesto;
    private Preduzece preduzece;
    private Predracun predracun;
    private Racun racun;
    private ArrayList<StavkaAvansnogRacuna> stavkeAvansnogRacuna;

    @Override
    public int hashCode() {
        int hash = 5;
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
        final AvansniRacun other = (AvansniRacun) obj;
        if (this.avansniRacunId != other.avansniRacunId) {
            return false;
        }
        if (!Objects.equals(this.mesto, other.mesto)) {
            return false;
        }
        if (!Objects.equals(this.datum, other.datum)) {
            return false;
        }
        if (!Objects.equals(this.preduzece, other.preduzece)) {
            return false;
        }
        if (!Objects.equals(this.predracun, other.predracun)) {
            return false;
        }
        if (!Objects.equals(this.racun, other.racun)) {
            return false;
        }
        if (!Objects.equals(this.stavkeAvansnogRacuna, other.stavkeAvansnogRacuna)) {
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

    public long getAvansniRacunId() {
        return avansniRacunId;
    }

    public void setAvansniRacunId(long avansniRacunId) {
        this.avansniRacunId = avansniRacunId;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public Preduzece getPreduzece() {
        return preduzece;
    }

    public void setPreduzece(Preduzece preduzece) {
        this.preduzece = preduzece;
    }

    public Predracun getPredracun() {
        return predracun;
    }

    public void setPredracun(Predracun predracun) {
        this.predracun = predracun;
    }

    public Racun getRacun() {
        return racun;
    }

    public void setRacun(Racun racun) {
        this.racun = racun;
    }

    public ArrayList<StavkaAvansnogRacuna> getStavkeAvansnogRacuna() {
        return stavkeAvansnogRacuna;
    }

    public void setStavkeAvansnogRacuna(ArrayList<StavkaAvansnogRacuna> stavkeAvansnogRacuna) {
        this.stavkeAvansnogRacuna = stavkeAvansnogRacuna;
    }
    
}
