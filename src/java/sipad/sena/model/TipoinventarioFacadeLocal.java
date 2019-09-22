/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.model;

import java.util.List;
import javax.ejb.Local;
import sipad.sena.entidades.Tipoinventario;

/**
 *
 * @author Ramliw
 */
@Local
public interface TipoinventarioFacadeLocal {

    void create(Tipoinventario tipoinventario);

    void edit(Tipoinventario tipoinventario);

    void remove(Tipoinventario tipoinventario);

    Tipoinventario find(Object id);

    List<Tipoinventario> findAll();

    List<Tipoinventario> findRange(int[] range);

    int count();
    
}
