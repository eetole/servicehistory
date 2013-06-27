/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.tle.servicehistory.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author
 * leppaton
 */
@Entity
@Table (name = "vehicles")
public class VehicleEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column( name = "vehicle_name")
    private String vehicleName;
    
    @OneToMany(mappedBy = "vehicle")
    private List<ServiceHistoryEntity> services;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public List<ServiceHistoryEntity> getServices() {
        return services;
    }

    public void setServices(List<ServiceHistoryEntity> services) {
        this.services = services;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VehicleEntity)) {
            return false;
        }
        VehicleEntity other = (VehicleEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "fi.tle.servicehistory.entities.VehicleEntity[ id=" + id + " ]";
    }
    
}
