/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uc.controller;

import com.uc.modelo.Cancion;
import com.uc.modelo.CancionRepository;
import javax.swing.table.DefaultTableModel;
import com.uc.vista.Vista;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.springframework.data.relational.core.conversion.DbActionExecutionException;

/**
 *
 * @author Usuario
 */
public class Controller implements ActionListener{
    CancionRepository repositorio;
    Vista vista;
    DefaultTableModel defaultTableModel;

    public Controller() {
        super();
    }
/**
 * Implementacion del controlador y hacer visible la tabla
 * @param repositorio
 * @param vista 
 */
    public Controller(CancionRepository repositorio, Vista vista) {
        super();
        this.repositorio = repositorio;
        this.vista = vista;
        agregarEventos();
        vista.setVisible(true);
        actualizarTabla();
    }
    /**
     * Metodo para agregar eventos
     */
    private void agregarEventos(){
    vista.getBotonAgregar().addActionListener(this);
    vista.getBotonActualizar().addActionListener(this);
    vista.getBotonBorrar().addActionListener(this);
    vista.getBotonInforme().addActionListener(this);
    vista.getTablaCanciones().addMouseListener(new MouseAdapter() { 
    
        @Override
        public void mouseClicked(MouseEvent event){
            llenarCampos(event);
        }
    });
}
    /**
     * Metodo para Limpiar los campos
     */
    private void limpiarCampos(){
        vista.getTextoID().setText("");
        vista.getTextoNombre().setText("");
        vista.getTextoAutor().setText("");
        vista.getTextoDuracion().setText("");
        vista.getTextoAlbum().setText("");
        
    }
    /**
     * Metodo para validar que sea numero
     * @param numero
     * @return 
     */
    private boolean esNumero (String numero){
        try {
            Double.parseDouble(numero);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    /**
     * Metodo para validar el formulario
     * @return 
     */
    private boolean formularioValido(){
        if ("".equals(vista.getTextoNombre().getText()) ||
                "".equals(vista.getTextoAutor().getText()) ||
                "".equals(vista.getTextoDuracion().getText()) ||
                "".equals(vista.getTextoAlbum().getText())) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS");
            return false;
        }
        if (!esNumero(vista.getTextoDuracion().getText())){            
        JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS SON OBLIGATORIOS");
        return false;
    }
    return true;
}
    /**
     * Metodo para llenar los campos cuando selecciona una fila en la tabla
     * @param event 
     */
    private void llenarCampos(MouseEvent event){
        JTable target = (JTable) event.getSource();
        vista.getTextoID().setText(vista.getTablaCanciones().getModel().getValueAt(target.getSelectedRow(), 0).toString());
        vista.getTextoNombre().setText(vista.getTablaCanciones().getModel().getValueAt(target.getSelectedRow(), 1).toString());
        vista.getTextoAutor().setText(vista.getTablaCanciones().getModel().getValueAt(target.getSelectedRow(), 2).toString());
        vista.getTextoDuracion().setText(vista.getTablaCanciones().getModel().getValueAt(target.getSelectedRow(), 3).toString());
        vista.getTextoAlbum().setText(vista.getTablaCanciones().getModel().getValueAt(target.getSelectedRow(), 4).toString());

    }
    /**
     * Metodo para actualizar la tabla
     */
    private void actualizarTabla(){
        String[] titulos = new String[]{"id", "Nombre", "Autor", "Duracion", "Album"};
        defaultTableModel =new DefaultTableModel(titulos, 0);
        
        List<Cancion> listaCanciones = (List<Cancion>) repositorio.findAll();
        for (Cancion cancion: listaCanciones){
            defaultTableModel.addRow(
            new Object[]{
                cancion.getId(),
                cancion.getNombre(),
                cancion.getAutor(),
                cancion.getDuracion(),
                cancion.getAlbum()}
        );
    }
    
    vista.getTablaCanciones().setModel(defaultTableModel);
    vista.getTablaCanciones().setPreferredSize(new Dimension(350, defaultTableModel.getRowCount() *16));
}
    /**
     * Metodo para Agregar Productos
     */
    private void agregarCancion(){
        try {
            if (formularioValido()){
                Cancion cancion = new Cancion(
                        vista.getTextoNombre().getText(),
                        vista.getTextoAutor().getText(),
                        Double.parseDouble(vista.getTextoDuracion().getText()),
                        vista.getTextoAlbum().getText()
                );
                repositorio.save(cancion);
                JOptionPane.showMessageDialog(null, "LA CANCION SE AGREGO CON EXITO");
            }
        } catch (DbActionExecutionException e) {
            JOptionPane.showMessageDialog(null, "LA CANCION YA EXISTE EN LA BASE DE DATOS");
        } finally{
            limpiarCampos();
            actualizarTabla();
        }
    }
    /**
     * Metodo para Actualizar Productos
     */
    private void actualizarCancion(){
        try {
            if (formularioValido() && !"".equals(vista.getTextoID().getText())){
                Cancion producto = new Cancion(
                    Integer.parseInt(vista.getTextoID().getText()),
                    vista.getTextoNombre().getText(),
                    vista.getTextoAutor().getText(),
                    Double.parseDouble(vista.getTextoDuracion().getText()),
                    vista.getTextoAlbum().getText()
                );
                repositorio.save(producto);
                JOptionPane.showMessageDialog(null, "LA CANCIÓN SE ACTUALIZO CORRECTAMENTE");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR CANCIÓN, Alguno de los campos no fueron digitados correctamente, por favor validar");
        } finally{
            limpiarCampos();
            actualizarTabla();
        }
    }
    /**
     * Metodo para Eliminar Productos
     */
    private void eliminarCancion(){
        try {
            if (formularioValido() && !"".equals(vista.getTextoID().getText())){
                Cancion cancion = new Cancion(
                    Integer.parseInt(vista.getTextoID().getText()),
                    vista.getTextoNombre().getText(),
                    vista.getTextoAutor().getText(),
                    Double.parseDouble(vista.getTextoDuracion().getText()),
                    vista.getTextoAlbum().getText()
                );
                repositorio.delete(cancion);
                JOptionPane.showMessageDialog(null, "LA CANCIÓN SE ELIMINO CORRECTAMENTE");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "LA CANCIÓN NO SE PUDO ELIMINAR");
        } finally{
            limpiarCampos();
            actualizarTabla();
        }
    }
        /**
     * Metodo para Generar Informe
     */
    private void generarInforme(){
        
       List<Cancion> listaCanciones = (List<Cancion>) repositorio.findAll();
       Collections.sort(listaCanciones,Collections.reverseOrder());
       JOptionPane.showMessageDialog(null, 
                "LA CANCIÓN DE MAYOR DURACIÓN ES: "+NomMayor()+"\n"+
                "LA CANCIÓN DE MENOR DURACIÓN ES: "+NomMenor()+"\n"+
                "PROMEDIO DE DURACION DE LAS CANCIONES: "+Promedio()+"\n"+
                "SUMATORIA DE TIEMPO DE LAS CANCIONES ES: "+sumaCanciones()
        );
        
        //System.out.println(NomMayor()+" "+NomMenor()+" "+(String.format("%.1f",Promedio()).replace(",", ".")+" "+ValorInventario()));
    }
    private String NomMayor(){
        List<Cancion> listaCanciones = (List<Cancion>) repositorio.findAll();
        String nombrema="";
        double pmayor=0;
        for(Cancion promayor: listaCanciones){
            if(promayor.getDuracion()>pmayor){
                nombrema=promayor.getNombre();
                pmayor=promayor.getDuracion();
            }
        }
        return nombrema;
    }
    private String NomMenor(){
        List<Cancion> listaCanciones = (List<Cancion>) repositorio.findAll();
        String nombreme="";
        double pmenor=Double.MAX_VALUE;
        for(Cancion promayor:listaCanciones){
            if(promayor.getDuracion()<pmenor){
                nombreme=promayor.getNombre();
                pmenor=promayor.getDuracion();
            }
        }
        return nombreme;
    }
    private double Promedio(){
        List<Cancion> listaCanciones = (List<Cancion>) repositorio.findAll();
        double sumatoria=0;
        for (Cancion prod:listaCanciones){
            sumatoria=sumatoria+prod.getDuracion();
        }
        return sumatoria/listaCanciones.size();
    }
    private double sumaCanciones(){
        List<Cancion> listaCanciones = (List<Cancion>) repositorio.findAll();
        double sumatoria=0;
        for (Cancion prod:listaCanciones){
            sumatoria=sumatoria+prod.getDuracion();
        }
        return sumatoria;
    }
/**
 * Metodo para que los botones tengan la funcionalidad correspondiente
 * @param ae 
 */
    @Override
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==vista.getBotonAgregar()){
            agregarCancion();
        }
        if (ae.getSource()==vista.getBotonActualizar()){
            actualizarCancion();
        }
        if (ae.getSource()==vista.getBotonBorrar()){
            eliminarCancion();
        }
        if (ae.getSource()==vista.getBotonInforme()){
            generarInforme();
        }
    }
}
