package Vistas;
import Controlador.ListaEnlazada;
import Modelo.crud;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class Actualizar extends javax.swing.JFrame {
      private String usuario;
      public void setUsuario(String admin){
      this.usuario=admin;
      }
    private ListaEnlazada lista = new ListaEnlazada();
    public Actualizar() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        content12 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        actualizarNombre = new javax.swing.JTextField();
        actualizarPrecio = new javax.swing.JTextField();
        botonActualizar = new javax.swing.JButton();
        botonLista = new javax.swing.JButton();
        botonRegistro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        botonAgregarEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1150, 620));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        content12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel61.setBackground(new java.awt.Color(0, 0, 0));
        jLabel61.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("Nombre:");

        jLabel63.setBackground(new java.awt.Color(0, 0, 0));
        jLabel63.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N

        jLabel64.setBackground(new java.awt.Color(0, 0, 0));
        jLabel64.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Precio:");

        botonAgregar.setBackground(new java.awt.Color(0, 153, 153));
        botonAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setText("CAMBIAR PRECIO");
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarMouseClicked(evt);
            }
        });
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        actualizarNombre.setBackground(new java.awt.Color(255, 255, 255));
        actualizarNombre.setForeground(new java.awt.Color(0, 0, 0));
        actualizarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarNombreActionPerformed(evt);
            }
        });

        actualizarPrecio.setBackground(new java.awt.Color(255, 255, 255));
        actualizarPrecio.setForeground(new java.awt.Color(0, 0, 0));
        actualizarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarPrecioActionPerformed(evt);
            }
        });

        botonActualizar.setBackground(new java.awt.Color(0, 153, 153));
        botonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonActualizar.setForeground(new java.awt.Color(255, 255, 255));
        botonActualizar.setText("GUARDAR");
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout content12Layout = new javax.swing.GroupLayout(content12);
        content12.setLayout(content12Layout);
        content12Layout.setHorizontalGroup(
            content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content12Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel63)
                .addGap(63, 63, 63)
                .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
                .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actualizarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
            .addGroup(content12Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(botonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        content12Layout.setVerticalGroup(
            content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(content12Layout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content12Layout.createSequentialGroup()
                        .addComponent(jLabel61)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, content12Layout.createSequentialGroup()
                        .addComponent(actualizarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addComponent(jLabel63)
                .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(actualizarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(244, 244, 244)
                .addGroup(content12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

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

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Actualizar");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(content12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botonAgregarEliminar)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2)
                        .addGap(42, 42, 42)
                        .addComponent(botonLista, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonLista)
                    .addComponent(botonRegistro)
                    .addComponent(botonAgregarEliminar)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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

    private void botonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistroActionPerformed

    private void actualizarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarNombreActionPerformed
 
    }//GEN-LAST:event_actualizarNombreActionPerformed

    private void actualizarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarPrecioActionPerformed
    }//GEN-LAST:event_actualizarPrecioActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseClicked
        Inicio ini=new Inicio();
        String nombre = actualizarNombre.getText().trim();  
        String precio = actualizarPrecio.getText().trim();  
        if (!nombre.isEmpty() && !precio.isEmpty()) {
            try {
                int precionuevo = Integer.parseInt(precio);  
                if (precionuevo <= 0) {
                    JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                 }
            String sqlActualizarPrecio ="UPDATE Producto " +
                                                        "SET precio = " + precionuevo + " " +
                                                        "WHERE id_nombreprod = (SELECT id_nombreprod FROM Producto_Nombre WHERE nombreprod = '" 
                                                        + nombre + "')";
            lista.addInstruccion(sqlActualizarPrecio); 
            JOptionPane.showMessageDialog(this, "Indicación enlistada", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del producto y el precio.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseClicked
        Connection con = crud.getConexion();  
        if (con != null) {
            lista.ejecutarInstrucciones(con); 
            JOptionPane.showMessageDialog(this, "Precios actualizados", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Error de conexión a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonActualizarMouseClicked

    private void botonAgregarEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarEliminarMouseClicked
        AgregarEliminar ae=new AgregarEliminar();
        ae.setUsuario(usuario);  
        ae.setVisible(true); 
        this.dispose();     
    }//GEN-LAST:event_botonAgregarEliminarMouseClicked

    private void botonListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonListaMouseClicked
        Lista li=new Lista();
        li.setUsuario(usuario);  
        li.setVisible(true); 
        this.dispose();     
    }//GEN-LAST:event_botonListaMouseClicked

    private void botonRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistroMouseClicked
        Registro re=new Registro();
        re.setUsuario(usuario);  
        re.setVisible(true); 
        this.dispose();     
    }//GEN-LAST:event_botonRegistroMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField actualizarNombre;
    public javax.swing.JTextField actualizarPrecio;
    private javax.swing.JButton botonActualizar;
    public javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAgregarEliminar;
    private javax.swing.JButton botonLista;
    private javax.swing.JButton botonRegistro;
    private javax.swing.JPanel content12;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
