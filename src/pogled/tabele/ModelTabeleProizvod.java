/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogled.tabele;

import domen.objekat.entiteti.Proizvod;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Veljko
 */
public class ModelTabeleProizvod extends AbstractTableModel{

    private final String[] columnNames = {"SIFRA_PROIZVODA","NAZIV","JEDINICA_MERE"};
    private final Class[] columnClasses = {Long.class, String.class, String.class};
    private final List<Proizvod> proizvodi;

    public ModelTabeleProizvod(List<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }
    
    @Override
    public int getRowCount() {
        return proizvodi.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proizvod proizvod = this.proizvodi.get(rowIndex);
        switch(columnIndex){
            case 0: return proizvod.getProizvodId();
            case 1: return proizvod.getNaziv();
            case 2: return proizvod.getJedinicaMere();
            default: return "N/A";
        }
    }
 
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return columnClasses[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    
    
}
