/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sipad.sena.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Ramliw
 */
@Entity
@Table(name = "nivel_categoria")
@NamedQueries({
    @NamedQuery(name = "NivelCategoria.findAll", query = "SELECT n FROM NivelCategoria n")
    , @NamedQuery(name = "NivelCategoria.findByIdNivel", query = "SELECT n FROM NivelCategoria n WHERE n.idNivel = :idNivel")
    , @NamedQuery(name = "NivelCategoria.findByNombreNivel", query = "SELECT n FROM NivelCategoria n WHERE n.nombreNivel = :nombreNivel")
    , @NamedQuery(name = "NivelCategoria.findByObjetivos", query = "SELECT n FROM NivelCategoria n WHERE n.objetivos = :objetivos")
    , @NamedQuery(name = "NivelCategoria.findByLugarIdLugar", query = "SELECT n FROM NivelCategoria n WHERE n.lugarIdLugar = :lugarIdLugar")
    , @NamedQuery(name = "NivelCategoria.findByIdProfesor", query = "SELECT n FROM NivelCategoria n WHERE n.idProfesor = :idProfesor")})
public class NivelCategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Nivel")
    private Integer idNivel;
    @Size(max = 30)
    @Column(name = "Nombre_Nivel")
    private String nombreNivel;
    @Size(max = 200)
    @Column(name = "Objetivos")
    private String objetivos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "lugar_Id_Lugar")
    private int lugarIdLugar;
    @Column(name = "Id_Profesor")
    private Integer idProfesor;
    @OneToMany(mappedBy = "idNivel", fetch = FetchType.LAZY)
    private List<HorarioHasNivel> horarioHasNivelList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nivelcategoriaIdNivel", fetch = FetchType.LAZY)
    private List<Alumno> alumnoList;
    @JoinColumn(name = "categoria_deportiva_Id_Categoria", referencedColumnName = "Id_Categoria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CategoriaDeportiva categoriadeportivaIdCategoria;

    public NivelCategoria() {
    }

    public NivelCategoria(Integer idNivel) {
        this.idNivel = idNivel;
    }

    public NivelCategoria(Integer idNivel, int lugarIdLugar) {
        this.idNivel = idNivel;
        this.lugarIdLugar = lugarIdLugar;
    }

    public Integer getIdNivel() {
        return idNivel;
    }

    public void setIdNivel(Integer idNivel) {
        this.idNivel = idNivel;
    }

    public String getNombreNivel() {
        return nombreNivel;
    }

    public void setNombreNivel(String nombreNivel) {
        this.nombreNivel = nombreNivel;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public int getLugarIdLugar() {
        return lugarIdLugar;
    }

    public void setLugarIdLugar(int lugarIdLugar) {
        this.lugarIdLugar = lugarIdLugar;
    }

    public Integer getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Integer idProfesor) {
        this.idProfesor = idProfesor;
    }

    public List<HorarioHasNivel> getHorarioHasNivelList() {
        return horarioHasNivelList;
    }

    public void setHorarioHasNivelList(List<HorarioHasNivel> horarioHasNivelList) {
        this.horarioHasNivelList = horarioHasNivelList;
    }

    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    public CategoriaDeportiva getCategoriadeportivaIdCategoria() {
        return categoriadeportivaIdCategoria;
    }

    public void setCategoriadeportivaIdCategoria(CategoriaDeportiva categoriadeportivaIdCategoria) {
        this.categoriadeportivaIdCategoria = categoriadeportivaIdCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNivel != null ? idNivel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NivelCategoria)) {
            return false;
        }
        NivelCategoria other = (NivelCategoria) object;
        if ((this.idNivel == null && other.idNivel != null) || (this.idNivel != null && !this.idNivel.equals(other.idNivel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sipad.sena.entidades.NivelCategoria[ idNivel=" + idNivel + " ]";
    }
    
}
