package vistas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        generarVenta = new javax.swing.JMenu();
        RealizarVenta = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        AgregarCliente = new javax.swing.JMenuItem();
        AgregarProducto = new javax.swing.JMenuItem();
        AgregarVendedor = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home_1.png"))); // NOI18N
        jMenu1.setText("Menu");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ayuda+.png"))); // NOI18N
        jMenuItem1.setText("Ayuda");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salir_1.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        generarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ventas.png"))); // NOI18N
        generarVenta.setText("Ventas");
        generarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarVentaActionPerformed(evt);
            }
        });

        RealizarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/generar venta.png"))); // NOI18N
        RealizarVenta.setText("Generar Venta");
        RealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarVentaActionPerformed(evt);
            }
        });
        generarVenta.add(RealizarVenta);

        jMenuBar1.add(generarVenta);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mantenimiento.png"))); // NOI18N
        jMenu3.setText("Mantenimiento");

        AgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/clinte.png"))); // NOI18N
        AgregarCliente.setText("Cliente");
        AgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarClienteActionPerformed(evt);
            }
        });
        jMenu3.add(AgregarCliente);

        AgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto_1.png"))); // NOI18N
        AgregarProducto.setText("Producto");
        AgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProductoActionPerformed(evt);
            }
        });
        jMenu3.add(AgregarProducto);

        AgregarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/vendedor_1.png"))); // NOI18N
        AgregarVendedor.setText("Vendedor");
        AgregarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVendedorActionPerformed(evt);
            }
        });
        jMenu3.add(AgregarVendedor);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reportes_1.png"))); // NOI18N
        jMenu4.setText("Reportes");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reporte 1.png"))); // NOI18N
        jMenuItem4.setText("Reportes Semanal");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reporte2.png"))); // NOI18N
        jMenuItem5.setText("Reportes Mensual");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void generarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarVentaActionPerformed
       
    }//GEN-LAST:event_generarVentaActionPerformed

    private void RealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarVentaActionPerformed

        VentasForm vf = new VentasForm();
        CentrarVentana(vf);
    }//GEN-LAST:event_RealizarVentaActionPerformed

    private void AgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarClienteActionPerformed
        
        ClienteForm cf=new ClienteForm();
        CentrarVentana(cf);
    }//GEN-LAST:event_AgregarClienteActionPerformed

    private void AgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProductoActionPerformed

        ProductosForm pf=new ProductosForm();
        CentrarVentana(pf);
    }//GEN-LAST:event_AgregarProductoActionPerformed

    private void AgregarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVendedorActionPerformed
        
        VendedorForm vf = new VendedorForm();
        CentrarVentana(vf);
    }//GEN-LAST:event_AgregarVendedorActionPerformed
    void CentrarVentana(JInternalFrame frame) {
        VentanaPrincipal.add(frame);
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension Dframe = frame.getSize();
        frame.setLocation((dimension.width - Dframe.width) / 2, (dimension.height - Dframe.height) / 2);
        frame.show();
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarCliente;
    private javax.swing.JMenuItem AgregarProducto;
    private javax.swing.JMenuItem AgregarVendedor;
    private javax.swing.JMenuItem RealizarVenta;
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JMenu generarVenta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
