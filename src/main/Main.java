/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import baza.broker.DbConnection;
import pogled.kontroleri.ProizvodKontroler;

/**
 *
 * @author Veljko
 */
public class Main {
    public static void main(String[] args) {
        ProizvodKontroler pk = new ProizvodKontroler();
        pk.initializeFrame();
    }
}
