/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author PC-Gamer
 */
@ManagedBean
@ViewScoped
public class PalabraFormBean {
    private ArrayList <String> listaPalabra;
    private String gpalabra;

    /**
     * Creates a new instance of PalabraFormBean
     */
    public PalabraFormBean() {
        listaPalabra = new ArrayList();
    }
    
    public void guardarPalabra(){
        getListaPalabra().add(gpalabra);
    }
    
    public void borrarLista(){
        listaPalabra = new ArrayList();
    }

    /**
     * @return the listaPalabra
     */
    public ArrayList <String> getListaPalabra() {
        return listaPalabra;
    }

    /**
     * @param listaPalabra the listaPalabra to set
     */
    public void setListaPalabra(ArrayList <String> listaPalabra) {
        this.listaPalabra = listaPalabra;
    }

    /**
     * @return the guardpalabra
     */
    public String getGpalabra() {
        return gpalabra;
    }

    /**
     * @param guardpalabra the guardpalabra to set
     */
    public void setGpalabra(String guardpalabra) {
        this.gpalabra = guardpalabra;
    }
    
}
