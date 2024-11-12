package Vistas;
import javax.swing.ImageIcon;
import Modelo.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {
   
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        usuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ingresarUsuario = new javax.swing.JTextField();
        ingresarContraseña = new javax.swing.JPasswordField();
        botonIngresar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("login");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setForeground(new java.awt.Color(153, 255, 153));

        jLabel2.setFont(new java.awt.Font("Gilroy-Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("INICIAR SESIÓN");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");

        ingresarUsuario.setBorder(null);
        ingresarUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ingresarUsuario.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        ingresarUsuario.setSelectionColor(new java.awt.Color(0, 102, 102));
        ingresarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarUsuarioActionPerformed(evt);
            }
        });

        ingresarContraseña.setBorder(null);

        botonIngresar.setBackground(new java.awt.Color(0, 102, 102));
        botonIngresar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));

        botonIngresar.setText("Ingresar");
        botonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIngresarMouseClicked(evt);
            }
        });
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 102, 102));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jSeparator4.setForeground(new java.awt.Color(0, 102, 102));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout usuarioLayout = new javax.swing.GroupLayout(usuario);
        usuario.setLayout(usuarioLayout);
        usuarioLayout.setHorizontalGroup(
            usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarioLayout.createSequentialGroup()
                .addGroup(usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuarioLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1))
                    .addGroup(usuarioLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2))
                    .addGroup(usuarioLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ingresarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(usuarioLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(botonIngresar)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        usuarioLayout.setVerticalGroup(
            usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuarioLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(ingresarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(botonIngresar)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 440, 500));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        imagen.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jhonatan\\OneDrive\\driveone\\OneDrive\\Desktop\\Logo.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Gilroy-Bold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PETSHOP");

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bienvenido");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("copyright © company name All rights reserved");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(53, 53, 53)
                .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addComponent(jLabel7)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarUsuarioActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIngresarMouseClicked
        String usuarioingreso = ingresarUsuario.getText();
        char[] passwordChars = ingresarContraseña.getPassword();
        String contraseña = new String(passwordChars);
        Connection con = crud.getConexion(); 
        String sql = "SELECT * FROM administrador WHERE nombre = ? AND contraseña = ?";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
                stmt.setString(1, usuarioingreso);
                stmt.setString(2, contraseña);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    AgregarEliminar productos = new AgregarEliminar();
                    productos.setUsuario(usuarioingreso);  
                    productos.setVisible(true); 
                    this.dispose();          
                }else {
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
          } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_botonIngresarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    public javax.swing.JLabel imagen;
    private javax.swing.JPasswordField ingresarContraseña;
    private javax.swing.JTextField ingresarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    javax.swing.JPanel usuario;
    // End of variables declaration//GEN-END:variables
}


        
        
        
        
        



