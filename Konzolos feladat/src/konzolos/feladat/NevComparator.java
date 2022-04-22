/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konzolos.feladat;

import java.text.Collator;
import java.util.Comparator;

/**
 *
 * @author varad
 */
public class NevComparator implements Comparator<Eszkoz>{

    @Override
    public int compare(Eszkoz t, Eszkoz t1) {
        Collator col=Collator.getInstance();
        return col.compare(t.getNev(), t1.getNev());
       
    }
    
}
