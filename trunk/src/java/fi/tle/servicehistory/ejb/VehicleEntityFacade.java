/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.tle.servicehistory.ejb;

import fi.tle.servicehistory.entities.VehicleEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author
 * leppaton
 */
@Stateless
public class VehicleEntityFacade extends AbstractFacade<VehicleEntity> {
    @PersistenceContext(unitName = "ServiceHistoryPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VehicleEntityFacade() {
        super(VehicleEntity.class);
    }
    
}
