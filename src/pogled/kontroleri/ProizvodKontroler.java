/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogled.kontroleri;

import domen.objekat.entiteti.Proizvod;
import java.util.List;
import javax.swing.JFrame;
import kontroler.PLKontroler;
import pogled.forme.ProizvodForma;
import pogled.tabele.ModelTabeleProizvod;

/**
 *
 * @author Veljko
 */
public class ProizvodKontroler {
    private pogled.forme.ProizvodForma proizvodFrame;
    private List<Proizvod> proizvodi;
    
    public void initializeFrame(){
        proizvodi = loadProizvodi();
        proizvodFrame = new ProizvodForma();
        proizvodFrame.getTblProizvodi().setModel(new ModelTabeleProizvod(proizvodi));
        proizvodFrame.setVisible(true);
//        proizvodi.stream().forEach(p -> {System.out.println(p.getNaziv());});
    }

    private List<Proizvod> loadProizvodi() {
        try {
            return PLKontroler.getInstance().getAllProizvodi();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
