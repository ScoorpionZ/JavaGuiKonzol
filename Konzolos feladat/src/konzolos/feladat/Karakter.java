/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konzolos.feladat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author varad
 */
 public  abstract class Karakter implements Comparable<Eszkoz>{
    private String nev, faj;
     ArrayList < Eszkoz > eszkozok ;

    public Karakter(String nev, String faj) {
//        this.nev = nev;
        this.faj = faj;
        this. eszkozok = new  ArrayList <>();
        if(this.nev.length()<3){
            try {
                throw new NevKivetelkezeles(nev);
            } catch (Exception e) {
                System.out.println("A név legalább 3 karakter lenyen");
            }
        }else{
            this.nev=nev;
        }
        
        
    }
    
    public void eszkozFelvetel(Eszkoz eszkoz){
       eszkozok.add(eszkoz);
    
    }
    
    public void eszkozEldob(int index){
       eszkozok.remove(index);
    }
    
    public void eldobEszkoz(Eszkoz esz) {
        boolean marVolt = false;
        for (int i = 0; i < eszkozok.size(); i++) {
            if (eszkozok.get(i).getNev().equals(esz.getNev()) && !marVolt) {
                if (eszkozok.get(i).getSuly() == esz.getSuly()) {
                    eszkozEldob(i);
                    marVolt = true;
                }
            }
        }
    }

    public String getNev() {
        return nev;
    }

    public String getFaj() {
        return faj;
    }

    public ArrayList<Eszkoz> getEszkozok() {
        return eszkozok;
    }
    
    public ArrayList<Eszkoz> rendezesEsMasolasa(){
        Collections.sort(eszkozok,new NevComparator());
        return (ArrayList<Eszkoz>) eszkozok.clone();
    }

    @Override
    public String toString() {
        StringBuilder szoveg=new StringBuilder();
        
        szoveg.append("Teljes Neve="+nev);
        szoveg.append("Faj="+faj);
        szoveg.append("Eszközök="+faj);
        szoveg.append(rendezesEsMasolasa());
        return szoveg.toString();
    }
    
    
    
    
}
