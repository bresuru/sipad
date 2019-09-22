/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Ramliw
 */
@Entity
@Table(name = "horario_has_nivel")
@NamedQueries({
    @NamedQuery(name = "HorarioHasNivel.findAll", query = "SELECT h FROM HorarioHasNivel h")
    , @NamedQuery(name = "HorarioHasNivel.findByIdHorarioNivel", query = "SELECT h FROM HorarioHasNivel h WHERE h.idHorarioNivel = :idHorarioNivel")})
public class HorarioHasNivel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_horario_nivel")
    private Integer idHorarioNivel;
    @JoinColumn(name = "id_horario", referencedColumnName = "id_horario_entrenamiento")
    @ManyToOne(fetch = FetchType.LAZY)
    private HorarioEntrenamiento idHorario;
    @JoinColumn(name = "id_nivel", referencedColumnName = "Id_Nivel")
    @ManyToOne(fetch = FetchType.LAZY)
    private NivelCategoria idNivel;

    public HorarioHasNivel() {
    }

    public HorarioHasNivel(Integer idHorarioNivel) {
        this.idHorarioNivel = idHorarioNivel;
    }

    public Integer getIdHorarioNivel() {
        return idHorarioNivel;
    }

    public void setIdHorarioNivel(Integer idHorarioNivel) {
        this.idHorarioNivel = idHorarioNivel;
    }

    public HorarioEntrenamiento getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(HorarioEntrenamiento idHorario) {
        this.idHorario = idHorario;
    }

    public NivelCategoria getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(NivelCategoria idNivel) {
        this.idNivel = idNivel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHorarioNivel != null ? idHorarioNivel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HorarioHasNivel)) {
            return false;
        }
        HorarioHasNivel other = (HorarioHasNivel) object;
        if ((this.idHorarioNivel == null && other.idHorarioNivel != null) || (this.idHorarioNivel != null && !this.idHorarioNivel.equals(other.idHorarioNivel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sipad.sena.entidades.HorarioHasNivel[ idHorarioNivel=" + idHorarioNivel + " ]";
    }
    
}
