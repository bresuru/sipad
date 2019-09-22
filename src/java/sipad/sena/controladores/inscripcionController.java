//BSSR
package sipad.sena.controladores;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import sipad.sena.model.*;
import sipad.sena.entidades.*;

@Named
@RequestScoped
public class inscripcionController {
    
    @EJB
    private UsuarioFacadeLocal usuarioFL;
    private Usuario usuario;
    
    @EJB
    private AlumnoFacadeLocal alumnoFL;
    private Alumno alumno;
    
    @EJB
    private TipoSangreFacadeLocal tiposSangreFL;
    private TipoSangre tipoSangre;
    private List<TipoSangre> tipoSangreL;
    
    @EJB
    private TipodocumentoFacadeLocal tipoDocFL;
    private Tipodocumento tipoDoc;
    private List<Tipodocumento> tipoDocL;
    
    @EJB
    private EpsFacadeLocal epsFL;
    private Eps eps;
    private List<Eps> epsL;
    
    
    @PostConstruct
    private void init(){
        usuario =  new Usuario();
        alumno = new Alumno();
        tipoDoc = new Tipodocumento();
        tipoSangre =  new TipoSangre();
        eps =  new Eps();
                
        tipoDocL = tipoDocFL.findAll();
        tipoSangreL = tiposSangreFL.findAll();
        epsL = epsFL.findAll();
    }
    
    //Getther y Setthers
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public List<TipoSangre> getTipoSangreL() {
        return tipoSangreL;
    }

    public void setTipoSangreL(List<TipoSangre> tipoSangreL) {
        this.tipoSangreL = tipoSangreL;
    }

    public Tipodocumento getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(Tipodocumento tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public List<Tipodocumento> getTipoDocL() {
        return tipoDocL;
    }

    public void setTipoDocL(List<Tipodocumento> tipoDocL) {
        this.tipoDocL = tipoDocL;
    }

    public Eps getEps() {
        return eps;
    }

    public void setEps(Eps eps) {
        this.eps = eps;
    }

    public List<Eps> getEpsL() {
        return epsL;
    }

    public void setEpsL(List<Eps> epsL) {
        this.epsL = epsL;
    }
    
    
    
}
