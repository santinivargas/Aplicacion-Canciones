/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 *
 * @author Usuario
 */
@Table("Canciones")
public class Cancion implements Comparable<Cancion>{
    @Id
    @Column("id")
    private int id;
    @Column("nombre")
    private String nombre;
    @Column("autor")
    private String autor;
    @Column("duracion")
    private Double  duracion;
    @Column("album")
    private String album;
/**
 * Creamos un constructor vacio por si la lista no tiene parametros
 */
    public Cancion() {
    }
/**
 * creamos un constructor con todos los parametros, este constructor nos va a servir para actualizar la tabla
 * @param id
 * @param NombreCancion
 * @param NombreAutor 
 * @param duracion
 * @param nombreAlbum 
 */
    public Cancion(int id, String nombre, String autor, double duracion, String album) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
        this.album = album;
    }
/**
 * creamos este constructor con solo 4 parametros que nos va a servir posteriormente a crear
 * @param NombreCancion
 * @param NombreAutor 
 * @param duracion
 * @param nombreAlbum 
 */
    public Cancion(String nombre, String autor, double duracion, String album) {
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
        this.album = album;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    @Override
    public int compareTo(Cancion cancion) {
        return this.duracion.compareTo(cancion.getDuracion());
    }
}
