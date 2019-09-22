/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Ramliw
 */
@Entity
@Table(name = "tipoinventario")
@NamedQueries({
    @NamedQuery(name = "Tipoinventario.findAll", query = "SELECT t FROM Tipoinventario t")
    , @NamedQuery(name = "Tipoinventario.findByIdtipoInventario", query = "SELECT t FROM Tipoinventario t WHERE t.idtipoInventario = :idtipoInventario")
    , @NamedQuery(name = "Tipoinventario.findByNombre", query = "SELECT t FROM Tipoinventario t WHERE t.nombre = :nombre")})
public class Tipoinventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipoInventario")
    private Integer idtipoInventario;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "idtipoInventario", fetch = FetchType.LAZY)
    private List<Inventario> inventarioList;

    public Tipoinventario() {
    }

    public Tipoinventario(Integer idtipoInventario) {
        this.idtipoInventario = idtipoInventario;
    }

    public Integer getIdtipoInventario() {
        return idtipoInventario;
    }

    public void setIdtipoInventario(Integer idtipoInventario) {
        this.idtipoInventario = idtipoInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Inventario> getInventarioList() {
        return inventarioList;
    }

    public void setInventarioList(List<Inventario> inventarioList) {
        this.inventarioList = inventarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoInventario != null ? idtipoInventario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoinventario)) {
            return false;
        }
        Tipoinventario other = (Tipoinventario) object;
        if ((this.idtipoInventario == null && other.idtipoInventario != null) || (this.idtipoInventario != null && !this.idtipoInventario.equals(other.idtipoInventario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sipad.sena.entidades.Tipoinventario[ idtipoInventario=" + idtipoInventario + " ]";
    }
    
}
