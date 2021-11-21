/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.uc.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelAutor = new javax.swing.JPanel();
        labelNombre = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textoAutor = new javax.swing.JTextField();
        labelDuracion = new javax.swing.JLabel();
        textoDuracion = new javax.swing.JTextField();
        labelAlbum = new javax.swing.JLabel();
        textoAlbum = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        labelID = new javax.swing.JLabel();
        textoID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCanciones = new javax.swing.JTable();
        botonBorrar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonInforme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Bienvenidos a la app de canciones");

        labelAutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Nueva Canción"));

        labelNombre.setText("Nombre");

        jLabel2.setText("Autor");

        labelDuracion.setText("Duración");

        labelAlbum.setText("Albúm");

        botonAgregar.setText("Agregar Canción");

        labelID.setText("ID");

        javax.swing.GroupLayout labelAutorLayout = new javax.swing.GroupLayout(labelAutor);
        labelAutor.setLayout(labelAutorLayout);
        labelAutorLayout.setHorizontalGroup(
            labelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelAutorLayout.createSequentialGroup()
                .addGroup(labelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(labelAutorLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(labelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre)
                            .addComponent(jLabel2)
                            .addComponent(labelDuracion)
                            .addComponent(labelAlbum)
                            .addComponent(labelID))
                        .addGap(62, 62, 62)
                        .addGroup(labelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(textoAlbum)
                            .addComponent(textoAutor)
                            .addComponent(textoNombre)
                            .addComponent(textoID)))
                    .addGroup(labelAutorLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(botonAgregar)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        labelAutorLayout.setVerticalGroup(
            labelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(labelAutorLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(labelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(labelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addGap(18, 18, 18)
                .addGroup(labelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(labelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDuracion))
                .addGap(18, 18, 18)
                .addGroup(labelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAlbum)
                    .addComponent(textoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAgregar)
                .addGap(6, 6, 6))
        );

        tablaCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID", "Nombre", "Autor", "Duración", "Albúm"
            }
        ));
        jScrollPane1.setViewportView(tablaCanciones);

        botonBorrar.setText("Borrar");

        botonActualizar.setText("Actualizar");

        botonInforme.setText("Informe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonBorrar)
                                .addGap(57, 57, 57)
                                .addComponent(botonActualizar)
                                .addGap(72, 72, 72)
                                .addComponent(botonInforme)
                                .addGap(116, 116, 116))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(labelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBorrar)
                    .addComponent(botonActualizar)
                    .addComponent(botonInforme))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonInforme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAlbum;
    private javax.swing.JPanel labelAutor;
    private javax.swing.JLabel labelDuracion;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JTable tablaCanciones;
    private javax.swing.JTextField textoAlbum;
    private javax.swing.JTextField textoAutor;
    private javax.swing.JTextField textoDuracion;
    private javax.swing.JTextField textoID;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables

    public JButton getBotonActualizar() {
        return botonActualizar;
    }

    public JButton getBotonAgregar() {
        return botonAgregar;
    }

    public JButton getBotonBorrar() {
        return botonBorrar;
    }

    public JButton getBotonInforme() {
        return botonInforme;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JLabel getLabelAlbum() {
        return labelAlbum;
    }

    public JPanel getLabelAutor() {
        return labelAutor;
    }

    public JLabel getLabelDuracion() {
        return labelDuracion;
    }

    public JLabel getLabelID() {
        return labelID;
    }

    public JLabel getLabelNombre() {
        return labelNombre;
    }

    public JTable getTablaCanciones() {
        return tablaCanciones;
    }

    public JTextField getTextoAlbum() {
        return textoAlbum;
    }

    public JTextField getTextoAutor() {
        return textoAutor;
    }

    public JTextField getTextoDuracion() {
        return textoDuracion;
    }

    public JTextField getTextoID() {
        return textoID;
    }

    public JTextField getTextoNombre() {
        return textoNombre;
    }

   
}
