/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.trajes;
import java.awt.BorderLayout;
/**
 *
 * @author DELL
 */
public class inicio extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public inicio() {
        initComponents();
        
        insertar inser = new insertar();
        inser.setSize(500,500);
        inser.setLocation(0,0);
        content.removeAll();
        content.add(inser,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonInsertartraje = new javax.swing.JButton();
        botonActualizarTraje = new javax.swing.JButton();
        botonEliminarTraje = new javax.swing.JButton();
        botonBuscarTraje = new javax.swing.JButton();
        botonListarTraje = new javax.swing.JButton();
        botonComprarTraje = new javax.swing.JButton();
        botonAcercade = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonListarCompradosTraje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        botonInsertartraje.setBackground(new java.awt.Color(204, 204, 204));
        botonInsertartraje.setText("Insertar traje");
        botonInsertartraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonInsertartraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertartrajeActionPerformed(evt);
            }
        });

        botonActualizarTraje.setBackground(new java.awt.Color(204, 204, 204));
        botonActualizarTraje.setText("Actualizar traje");
        botonActualizarTraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonActualizarTraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarTrajeActionPerformed(evt);
            }
        });

        botonEliminarTraje.setBackground(new java.awt.Color(204, 204, 204));
        botonEliminarTraje.setText("Eliminar traje");
        botonEliminarTraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonEliminarTraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarTrajeActionPerformed(evt);
            }
        });

        botonBuscarTraje.setBackground(new java.awt.Color(204, 204, 204));
        botonBuscarTraje.setText("Buscar traje");
        botonBuscarTraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonBuscarTraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarTrajeActionPerformed(evt);
            }
        });

        botonListarTraje.setBackground(new java.awt.Color(204, 204, 204));
        botonListarTraje.setText("Listar traje");
        botonListarTraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonListarTraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarTrajeActionPerformed(evt);
            }
        });

        botonComprarTraje.setBackground(new java.awt.Color(204, 204, 204));
        botonComprarTraje.setText("Comprar traje");
        botonComprarTraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonComprarTraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarTrajeActionPerformed(evt);
            }
        });

        botonAcercade.setBackground(new java.awt.Color(204, 204, 204));
        botonAcercade.setText("Acerca de");
        botonAcercade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcercadeActionPerformed(evt);
            }
        });

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        botonListarCompradosTraje.setBackground(new java.awt.Color(204, 204, 204));
        botonListarCompradosTraje.setText("Listar comprados");
        botonListarCompradosTraje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botonListarCompradosTraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarCompradosTrajeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(botonAcercade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonComprarTraje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(botonInsertartraje, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonActualizarTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminarTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonListarTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonListarCompradosTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(botonInsertartraje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(botonActualizarTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonEliminarTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonBuscarTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(botonListarTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botonComprarTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonListarCompradosTraje, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(botonAcercade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertartrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertartrajeActionPerformed
        insertar inser = new insertar();
        inser.setSize(500,500);
        inser.setLocation(0,0);
        content.removeAll();
        content.add(inser,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonInsertartrajeActionPerformed

    private void botonActualizarTrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarTrajeActionPerformed
        actualizar actu = new actualizar();
        actu.setSize(500,500);
        actu.setLocation(0,0);
        content.removeAll();
        content.add(actu,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonActualizarTrajeActionPerformed

    private void botonEliminarTrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarTrajeActionPerformed
        eliminar elim = new eliminar();
        elim.setSize(500,500);
        elim.setLocation(0,0);
        content.removeAll();
        content.add(elim,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonEliminarTrajeActionPerformed

    private void botonBuscarTrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarTrajeActionPerformed
        buscar busc = new buscar();
        busc.setSize(500,500);
        busc.setLocation(0,0);
        content.removeAll();
        content.add(busc,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonBuscarTrajeActionPerformed

    private void botonListarTrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarTrajeActionPerformed
        listado list = new listado();
        list.setSize(500,500);
        list.setLocation(0,0);
        content.removeAll();
        content.add(list,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonListarTrajeActionPerformed

    private void botonComprarTrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarTrajeActionPerformed
        comprar comp = new comprar();
        comp.setSize(500,500);
        comp.setLocation(0,0);
        content.removeAll();
        content.add(comp,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonComprarTrajeActionPerformed

    private void botonAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcercadeActionPerformed
        acercade acerca = new acercade();
        acerca.setSize(500,500);
        acerca.setLocation(0,0);
        content.removeAll();
        content.add(acerca,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonAcercadeActionPerformed

    private void botonListarCompradosTrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarCompradosTrajeActionPerformed
        listadobuy listbuy = new listadobuy();
        listbuy.setSize(500,500);
        listbuy.setLocation(0,0);
        content.removeAll();
        content.add(listbuy,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonListarCompradosTrajeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcercade;
    private javax.swing.JButton botonActualizarTraje;
    private javax.swing.JButton botonBuscarTraje;
    private javax.swing.JButton botonComprarTraje;
    private javax.swing.JButton botonEliminarTraje;
    private javax.swing.JButton botonInsertartraje;
    private javax.swing.JButton botonListarCompradosTraje;
    private javax.swing.JButton botonListarTraje;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
