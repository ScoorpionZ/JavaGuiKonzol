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
public class UgyessegComparator implements Comparator<Harcos>{

    @Override
    public int compare(Harcos t, Harcos t1) {
        Collator col=Collator.getInstance();
        return col.compare(t.getUgyesseg(), t1.getUgyesseg());
    }
    
}
