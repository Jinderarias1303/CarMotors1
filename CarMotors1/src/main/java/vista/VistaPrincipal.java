/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;




public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public VistaPrincipal() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            RegistrarFacturas = new javax.swing.JButton();
            RegistrarCliente = new javax.swing.JButton();
            RegistrarProveedor = new javax.swing.JButton();
            RegistrarRepuesto = new javax.swing.JButton();
            RegistrarVehiculo = new javax.swing.JButton();
            RegistrarMantenimientos = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setResizable(false);

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            RegistrarFacturas.setText("REGISTRAR FACTURAS");
            RegistrarFacturas.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        RegistrarFacturasActionPerformed(evt);
                  }
            });
            jPanel1.add(RegistrarFacturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 210, 40));

            RegistrarCliente.setText("CLIENTES Y FACTURACIÓN");
            RegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        RegistrarClienteActionPerformed(evt);
                  }
            });
            jPanel1.add(RegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 210, 40));

            RegistrarProveedor.setText("PROVEEDORES Y COMPRAS");
            RegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        RegistrarProveedorActionPerformed(evt);
                  }
            });
            jPanel1.add(RegistrarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 210, 40));

            RegistrarRepuesto.setText("GESTIÓN DE INVENTARIOS");
            RegistrarRepuesto.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        RegistrarRepuestoActionPerformed(evt);
                  }
            });
            jPanel1.add(RegistrarRepuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 210, 40));

            RegistrarVehiculo.setText("REGISTRAR VEHICULO");
            RegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        RegistrarVehiculoActionPerformed(evt);
                  }
            });
            jPanel1.add(RegistrarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 210, 40));

            RegistrarMantenimientos.setText("REGISTRAR MANTENIMIENTOS");
            RegistrarMantenimientos.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        RegistrarMantenimientosActionPerformed(evt);
                  }
            });
            jPanel1.add(RegistrarMantenimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 210, 40));

            jLabel1.setBackground(new java.awt.Color(255, 255, 255));
            jLabel1.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setText("CarMotors");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 250, -1));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

    
      private void RegistrarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarFacturasActionPerformed
            RegistroFactura factura = new RegistroFactura();
            factura.sethome(this);
            factura.setVisible(true);
            this.setVisible(false);
      }//GEN-LAST:event_RegistrarFacturasActionPerformed

      private void RegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarClienteActionPerformed
         ClienteFacturacion cliente = new ClienteFacturacion(this);
         cliente.setVisible(true);
         this.setVisible(false);
      }//GEN-LAST:event_RegistrarClienteActionPerformed

      private void RegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarProveedorActionPerformed
        VistaPrincipal vistaPrincipal = null;
            ProveedorCompras proveedor= new ProveedorCompras(vistaPrincipal);
            proveedor.sethome(this);
            proveedor.setVisible(true);
            this.setVisible(false);
      }//GEN-LAST:event_RegistrarProveedorActionPerformed

      private void RegistrarRepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarRepuestoActionPerformed
            GestionInventario repuesto = new GestionInventario();
           repuesto.sethome(this);
            repuesto.setVisible(true);
            this.setVisible(false);
      }//GEN-LAST:event_RegistrarRepuestoActionPerformed

      private void RegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarVehiculoActionPerformed
            RegistroVehiculo vehiculo = new RegistroVehiculo();
            vehiculo.sethome(this);
            vehiculo.setVisible(true);
            this.setVisible(false);
      }//GEN-LAST:event_RegistrarVehiculoActionPerformed

      private void RegistrarMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMantenimientosActionPerformed
           RegistroMantenimiento mantenimiento = new RegistroMantenimiento();
           mantenimiento.sethome(this);
           mantenimiento.setVisible(true);
           this.setVisible(false);
      }//GEN-LAST:event_RegistrarMantenimientosActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
              new VistaPrincipal().setVisible(true);
        });
    }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton RegistrarCliente;
      private javax.swing.JButton RegistrarFacturas;
      private javax.swing.JButton RegistrarMantenimientos;
      private javax.swing.JButton RegistrarProveedor;
      private javax.swing.JButton RegistrarRepuesto;
      private javax.swing.JButton RegistrarVehiculo;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JPanel jPanel1;
      // End of variables declaration//GEN-END:variables
}
