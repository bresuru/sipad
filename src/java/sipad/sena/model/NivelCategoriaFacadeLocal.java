/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.model;

import java.util.List;
import javax.ejb.Local;
import sipad.sena.entidades.NivelCategoria;

/**
 *
 * @author Ramliw
 */
@Local
public interface NivelCategoriaFacadeLocal {

    void create(NivelCategoria nivelCategoria);

    void edit(NivelCategoria nivelCategoria);

    void remove(NivelCategoria nivelCategoria);

    NivelCategoria find(Object id);

    List<NivelCategoria> findAll();

    List<NivelCategoria> findRange(int[] range);

    int count();
    
}
