/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sipad.sena.entidades.Tipoinventario;

/**
 *
 * @author Ramliw
 */
@Stateless
public class TipoinventarioFacade extends AbstractFacade<Tipoinventario> implements TipoinventarioFacadeLocal {

    @PersistenceContext(unitName = "SIPAD_3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoinventarioFacade() {
        super(Tipoinventario.class);
    }
    
}
