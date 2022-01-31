/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontroler;

import baza.broker.BrokerBP;
import domen.objekat.DomenskiObjekat;
import domen.objekat.entiteti.Proizvod;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Veljko
 */
public class PLKontroler {
    private static PLKontroler instance;
    protected BrokerBP brokerBP;

    public PLKontroler() {
        this.brokerBP = new BrokerBP();
    }
    
    public static PLKontroler getInstance() {
        if(instance == null){
            instance = new PLKontroler();
        }
        return instance;
    }
    
    public void add(DomenskiObjekat odo) throws SQLException, Exception {
        brokerBP.connect();
        brokerBP.insert(odo);
        brokerBP.disconnect();
    }

    public void update(DomenskiObjekat odo) throws SQLException, Exception {
        brokerBP.connect();
        brokerBP.update(odo);
        brokerBP.disconnect();
    }

    public void delete(DomenskiObjekat odo) throws SQLException, Exception {
        brokerBP.connect();
        brokerBP.delete(odo);
        brokerBP.disconnect();
    }
    
   public List<Proizvod> getAllProizvodi(){
       return null;
   } 
    
}
