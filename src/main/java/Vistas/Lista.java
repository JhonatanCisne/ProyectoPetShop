package Vistas;
import Modelo.crud;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;



public class Lista extends javax.swing.JFrame {
      private String usuario;
      public void setUsuario(String admin){
      this.usuario=admin;
        }
    public Lista() {
        initComponents();
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonAgregarEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTable();
        Cargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1150, 620));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Lista");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        botonRegistro.setBackground(new java.awt.Color(0, 153, 153));
        botonRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistro.setText("Registro");
        botonRegistro.setBorderPainted(false);
        botonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistroMouseClicked(evt);
            }
        });
        botonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistroActionPerformed(evt);
            }
        });

        botonActualizar.setBackground(new java.awt.Color(0, 153, 153));
        botonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizar.setText("Actualizar");
        botonActualizar.setBorderPainted(false);
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonActualizarMouseClicked(evt);
            }
        });
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        botonAgregarEliminar.setBackground(new java.awt.Color(0, 153, 153));
        botonAgregarEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonAgregarEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarEliminar.setText("Agregar/Eliminar");
        botonAgregarEliminar.setBorderPainted(false);
        botonAgregarEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarEliminarMouseClicked(evt);
            }
        });

        Lista.setBackground(new java.awt.Color(255, 255, 255));
        Lista.setForeground(new java.awt.Color(0, 0, 0));
        Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Tipo", "Medida", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Lista);
        if (Lista.getColumnModel().getColumnCount() > 0) {
            Lista.getColumnModel().getColumn(0).setPreferredWidth(60);
            Lista.getColumnModel().getColumn(0).setMaxWidth(80);
            Lista.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        Cargar.setBackground(new java.awt.Color(0, 0, 0));
        Cargar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cargar.setForeground(new java.awt.Color(255, 255, 255));
        Cargar.setText("Cargar");
        Cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarMouseClicked(evt);
            }
        });
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cargar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(botonAgregarEliminar)
                            .addGap(34, 34, 34)
                            .addComponent(botonActualizar)
                            .addGap(35, 35, 35)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(botonRegistro)
                    .addComponent(botonAgregarEliminar)
                    .addComponent(botonActualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cargar)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMouseClicked
        String sql = "SELECT " +
        "p.id_producto AS ID, " +
        "pn.nombreprod AS Nombre, " +
        "tp.tipo AS Tipo, " +
        "mp.medida AS Medida, " +
        "p.cantidad AS Cantidad, " +
        "p.precio AS Precio " +
        "FROM Producto p " +
        "JOIN Producto_Nombre pn ON p.id_nombreprod = pn.id_nombreprod " +
        "JOIN Tipo_Producto tp ON p.id_tipoprod = tp.id_tipoprod " +
        "JOIN Medida_Producto mp ON p.id_medidaprod = mp.id_medidaprod";  
        String[] columnas = {"ID", "Nombre", "Tipo", "Medida", "Cantidad", "Precio"};
        DefaultTableModel modeloTabla = new DefaultTableModel(null, columnas);  
        Lista.setModel(modeloTabla);
        Connection con = crud.getConexion();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {        
            stmt = con.prepareStatement(sql);        
            rs = stmt.executeQuery();
            modeloTabla.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("ID"), 
                    rs.getString("Nombre"), 
                    rs.getString("Tipo"),  
                    rs.getString("Medida"),  
                    rs.getInt("Cantidad"),  
                    rs.getDouble("Precio")  
                };
            modeloTabla.addRow(fila);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }    
    }//GEN-LAST:event_CargarMouseClicked

    private void botonAgregarEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarEliminarMouseClicked
        AgregarEliminar ae=new AgregarEliminar();
        ae.setUsuario(usuario);  
        ae.setVisible(true); 
        this.dispose();     
    }//GEN-LAST:event_botonAgregarEliminarMouseClicked

    private void botonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseClicked
        Actualizar ac=new Actualizar();
        ac.setUsuario(usuario);  
        ac.setVisible(true); 
        this.dispose();     
    }//GEN-LAST:event_botonActualizarMouseClicked

    private void botonRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistroMouseClicked
        Registro re=new Registro();
        re.setUsuario(usuario);  
        re.setVisible(true); 
        this.dispose();     
    }//GEN-LAST:event_botonRegistroMouseClicked

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargarActionPerformed

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
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    public javax.swing.JTable Lista;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregarEliminar;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
