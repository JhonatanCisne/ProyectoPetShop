package Vistas;
import Controlador.ListaEnlazada;
import Modelo.crud;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Registro extends javax.swing.JFrame {
    private String usuario;
    public void setUsuario(String admin){
    this.usuario=admin;
    }
    private ListaEnlazada lista = new ListaEnlazada();
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botonLista = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonEliminarAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Registro = new javax.swing.JTable();
        Cargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1150, 620));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        botonLista.setBackground(new java.awt.Color(0, 153, 153));
        botonLista.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonLista.setForeground(new java.awt.Color(255, 255, 255));
        botonLista.setText("Lista");
        botonLista.setBorderPainted(false);
        botonLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonListaMouseClicked(evt);
            }
        });
        botonLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registro");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        botonEliminarAgregar.setBackground(new java.awt.Color(0, 153, 153));
        botonEliminarAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonEliminarAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminarAgregar.setText("Agregar/Eliminar");
        botonEliminarAgregar.setBorderPainted(false);
        botonEliminarAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarAgregarMouseClicked(evt);
            }
        });

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setForeground(new java.awt.Color(0, 0, 0));
        Registro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Usuario", "Producto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Registro);

        Cargar.setBackground(new java.awt.Color(0, 0, 0));
        Cargar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cargar.setForeground(new java.awt.Color(255, 255, 255));
        Cargar.setText("Cargar");
        Cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Cargar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonEliminarAgregar)
                        .addGap(32, 32, 32)
                        .addComponent(botonActualizar)
                        .addGap(51, 51, 51)
                        .addComponent(botonLista, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(395, 395, 395)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminarAgregar)
                    .addComponent(botonActualizar)
                    .addComponent(botonLista)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cargar)
                .addGap(20, 20, 20))
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

    private void botonListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonListaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void CargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMouseClicked
        String sql = "SELECT " +
                 "r.id_registro AS ID, " +
                 "a.nombre AS Usuario, " +
                 "pn.nombreprod AS Producto, " +
                 "r.cantidad AS Cantidad " +
                 "FROM registro r " +
                 "JOIN administrador a ON r.usuario = a.usuario " +
                 "JOIN Producto p ON r.id_producto = p.id_producto " +
                 "JOIN Producto_Nombre pn ON p.id_nombreprod = pn.id_nombreprod";   
        String[] columnas = {"ID", "Usuario", "Producto", "Cantidad"};
        DefaultTableModel modeloTabla = new DefaultTableModel(null, columnas);   
        Registro.setModel(modeloTabla);   
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
                rs.getString("Usuario"), 
                rs.getString("Producto"), 
                rs.getString("Cantidad"),  
            };
            modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_CargarMouseClicked

    private void botonEliminarAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarAgregarMouseClicked
        AgregarEliminar ae=new AgregarEliminar();
        ae.setUsuario(usuario);  
        ae.setVisible(true); 
        this.dispose();     
    }//GEN-LAST:event_botonEliminarAgregarMouseClicked

    private void botonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseClicked
        Actualizar ac=new Actualizar();
        ac.setUsuario(usuario);  
        ac.setVisible(true); 
        this.dispose();     
    }//GEN-LAST:event_botonActualizarMouseClicked

    private void botonListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListaMouseClicked
        Lista li=new Lista();
        li.setUsuario(usuario);  
        li.setVisible(true); 
        this.dispose();         }//GEN-LAST:event_botonListaMouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    public javax.swing.JTable Registro;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonEliminarAgregar;
    private javax.swing.JButton botonLista;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
