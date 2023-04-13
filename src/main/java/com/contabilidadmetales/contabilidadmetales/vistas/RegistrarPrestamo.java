/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.contabilidadmetales.contabilidadmetales.vistas;

import com.contabilidadmetales.contabilidadmetales.controlador.CPrestamos;
import com.contabilidadmetales.contabilidadmetales.modelo.Prestamos;
import javax.accessibility.AccessibleContext;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author narut
 */
public class RegistrarPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarPrestamo
     */
    private JTable j;
    public RegistrarPrestamo(JTable j) {
        initComponents();
        this.j=j;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel32 = new javax.swing.JLabel();
        ValorPrestamo = new javax.swing.JTextField();
        NombrePersona = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        RegistrarPrestamo = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescripcionPrestamo = new javax.swing.JTextArea();
        RegistrarPrestamo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel32.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel32.setText("Valor");

        ValorPrestamo.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        ValorPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorPrestamoActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel33.setText("Descripcion");

        RegistrarPrestamo.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        RegistrarPrestamo.setText("Registar Prestamo");
        RegistrarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarPrestamoActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel35.setText("Registrar Prestamo");

        jLabel36.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel36.setText("Nombre Persona");

        DescripcionPrestamo.setColumns(20);
        DescripcionPrestamo.setRows(5);
        jScrollPane1.setViewportView(DescripcionPrestamo);

        RegistrarPrestamo1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        RegistrarPrestamo1.setText("Cancelar Prestamo ");
        RegistrarPrestamo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarPrestamo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel36))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NombrePersona, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(ValorPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegistrarPrestamo)
                .addGap(27, 27, 27)
                .addComponent(RegistrarPrestamo1)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(ValorPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RegistrarPrestamo1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegistrarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabel33)
                        .addGap(219, 219, 219))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void RegistrarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarPrestamoActionPerformed
        // TODO add your handling code here:
        String nombre=NombrePersona.getText();
        Double Valor=Double.parseDouble(ValorPrestamo.getText());
        String Descripcion=DescripcionPrestamo.getText();
        CPrestamos c=new CPrestamos();
        c.RegistrarPrestamo(nombre, Valor, Descripcion);
        DefaultTableModel model=(DefaultTableModel)j.getModel();
        String[]s={nombre,Valor.toString(),Descripcion};
        model.addRow(s);
        this.dispose();
    }//GEN-LAST:event_RegistrarPrestamoActionPerformed

    private void ValorPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorPrestamoActionPerformed

    private void RegistrarPrestamo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarPrestamo1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_RegistrarPrestamo1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescripcionPrestamo;
    private javax.swing.JTextField NombrePersona;
    private javax.swing.JButton RegistrarPrestamo;
    private javax.swing.JButton RegistrarPrestamo1;
    private javax.swing.JTextField ValorPrestamo;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}