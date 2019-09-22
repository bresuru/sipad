/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.model;

import java.util.List;
import javax.ejb.Local;
import sipad.sena.entidades.HorarioHasNivel;

/**
 *
 * @author Ramliw
 */
@Local
public interface HorarioHasNivelFacadeLocal {

    void create(HorarioHasNivel horarioHasNivel);

    void edit(HorarioHasNivel horarioHasNivel);

    void remove(HorarioHasNivel horarioHasNivel);

    HorarioHasNivel find(Object id);

    List<HorarioHasNivel> findAll();

    List<HorarioHasNivel> findRange(int[] range);

    int count();
    
}
