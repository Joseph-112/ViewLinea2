/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.views;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

/**
 *
 * @author Joseph
 */
@Entity
@Table(name = "ViewAutorLibro")
@NamedNativeQueries({
    @NamedNativeQuery(name = "View.Listar", query = "SELECT id_autor,nombre_autor,apellido,edad,identificacion,max,cant_libros FROM public. \"ViewAutorLibro\"")
})

public class ViewAutorLibro implements Serializable{
    
    @Id
    private Integer id_autor;   
    
    @Column(name = "identificacion")
    private String identificacion;      
    
    @Column(name = "nombre_autor")
    private String nombreAutor;    
    
    @Column(name = "apellido")
    private String apellido;    
    
    @Column(name = "edad")
    private Integer edad;     
        
    
    @Column(name = "max")
    private Integer noPaginas;
    
    @Column(name = "cant_libros")
    private Integer cantidadLibros;

    public ViewAutorLibro() {
    }

    public ViewAutorLibro(String identificacion, String nombreAutor, String apellido, Integer edad, Integer noPaginas, Integer cantidadLibros) {
        this.identificacion = identificacion;
        this.nombreAutor = nombreAutor;
        this.apellido = apellido;
        this.edad = edad;
        this.noPaginas = noPaginas;
        this.cantidadLibros = cantidadLibros;
    }

    public Integer getId_autor() {
        return id_autor;
    }

    public void setId_autor(Integer id_autor) {
        this.id_autor = id_autor;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(Integer noPaginas) {
        this.noPaginas = noPaginas;
    }

    public Integer getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(Integer cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    

    
    
    
}
