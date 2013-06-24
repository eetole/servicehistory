/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.tle.servicehistory.ejb;

import fi.tle.servicehistory.entities.ServiceHistoryEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author toni
 */
@Stateless
public class ServiceHistoryEntityFacade extends AbstractFacade<ServiceHistoryEntity> {
    @PersistenceContext(unitName = "ServiceHistoryPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServiceHistoryEntityFacade() {
        super(ServiceHistoryEntity.class);
    }
    
}
