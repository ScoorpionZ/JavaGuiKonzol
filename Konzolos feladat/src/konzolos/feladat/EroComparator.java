/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konzolos.feladat;

import java.util.Comparator;

/**
 *
 * @author varad
 */
public class EroComparator implements Comparator<Harcos>{

    @Override
    public int compare(Harcos t, Harcos t1) {
       return t.getEro()-t1.getEro();
    }

}
