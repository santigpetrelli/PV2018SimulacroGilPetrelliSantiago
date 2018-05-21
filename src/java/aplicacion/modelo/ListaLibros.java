/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo;

import aplicacion.modelo.Libro;
import java.util.ArrayList;

/**
 *
 * @author PC-Gamer
 */
public class ListaLibros {
    private ArrayList <Libro> listaLibro;

    public ListaLibros() {
        listaLibro=new ArrayList();
    }

    public ListaLibros(ArrayList<Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }

    /**
     * @return the listaLibro
     */
    public ArrayList <Libro> getListaLibro() {
        return listaLibro;
    }

    /**
     * @param listaLibro the listaLibro to set
     */
    public void setListaLibro(ArrayList <Libro> listaLibro) {
        this.listaLibro = listaLibro;
    }

    
}
