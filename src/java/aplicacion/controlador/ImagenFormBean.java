/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import aplicacion.modelo.ListadoI;
import aplicacion.modelo.ListadoI;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author PC-Gamer
 */
@ManagedBean
@SessionScoped
public class ImagenFormBean implements Serializable {
private transient UploadedFile file = null;
private byte[] imagen;
private byte[] nuevaImagen;
private ListadoI listadoImagenes;
private String fecha;

    /**
     * Creates a new instance of ImagenFormBean
     */

    public ImagenFormBean()  {
        listadoImagenes=new ListadoI();
    }
    
    public void agregarImagen() throws ParseException{
        setImagen(getFile().getContents());
        getListadoImagenes().llenarListado(getImagen());
        FacesMessage message = new FacesMessage("Exito!", getFile().getFileName() + " ha sido subido");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public StreamedContent getImagenSubida() throws IOException{
        FacesContext context=FacesContext.getCurrentInstance();
        if(context.getCurrentPhaseId()==PhaseId.RENDER_RESPONSE){
            return new DefaultStreamedContent();
        }
        else{
            if(getImagen()==null){
                return null;
            }
            else{
                return new DefaultStreamedContent(new ByteArrayInputStream(getImagen()));
            }
        }
    }
    
    /**
     * @return the file
     */
    public UploadedFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(UploadedFile file) {
        this.file = file;
    }

    /**
     * @return the imagen
     */
    public byte[] getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the nuevaImagen
     */
    public byte[] getNuevaImagen() {
        return nuevaImagen;
    }

    /**
     * @param nuevaImagen the nuevaImagen to set
     */
    public void setNuevaImagen(byte[] nuevaImagen) {
        this.nuevaImagen = nuevaImagen;
    }

    /**
     * @return the listadoImagenes
     */
    public ListadoI getListadoImagenes() {
        return listadoImagenes;
    }

    /**
     * @param listadoImagenes the listadoImagenes to set
     */
    public void setListadoImagenes(ListadoI listadoImagenes) {
        this.listadoImagenes = listadoImagenes;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
