
package vistas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.Productos;
import modelo.ProductosDAO;
import modelo.VentasDAO;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleVentas;
import modelo.Ventas;

public class VentasForm extends javax.swing.JInternalFrame {

    ClienteDAO cdao=new ClienteDAO();
    VentasDAO vdao=new VentasDAO();
    ProductosDAO pdao=new ProductosDAO();
    Productos p =new Productos();
    Ventas v =new Ventas();
    DetalleVentas dv =new DetalleVentas();
    
    Cliente cliente=new Cliente();
    
    
    DefaultTableModel modelo= new DefaultTableModel();
    double tpagar; 
    int cant;
    double precio;
    int idp;
    
    
    public VentasForm() {
        initComponents();
        
        fecha();
        
        generarSerie();
        txtVendedor.setText("Mariela Nina Capujra");

    }
    void fecha(){
        Calendar calendar=new GregorianCalendar();
        txtFecha.setText(""+calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.DAY_OF_MONTH));
        
        
    }
    
    void generarSerie(){
        String serie = vdao.NroSerieVentas();
        
        if(serie==null){
            txtSerie.setText("0000001");
        }else{
            int increment=0;
            increment = Integer.parseInt(serie);
            increment = increment+1;
            txtSerie.setText("000000"+increment);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        txtcodCliente = new javax.swing.JTextField();
        txtcodProducto = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnBuscarcliente = new javax.swing.JButton();
        btnBuscarproducto = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtVendedor = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        btnagregarventa = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setResizable(true);
        setTitle("Panel de Ventas");

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos:"));
        jPanel1.setForeground(new java.awt.Color(0, 204, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("COD CLIENTE");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("COD PRODUC");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("PRECIO");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CANTIDAD");

        txtcodCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtcodCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtcodCliente.setForeground(new java.awt.Color(0, 0, 51));

        txtcodProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtcodProducto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtcodProducto.setForeground(new java.awt.Color(0, 0, 51));
        txtcodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodProductoActionPerformed(evt);
            }
        });

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 51));

        btnBuscarcliente.setBackground(new java.awt.Color(204, 204, 255));
        btnBuscarcliente.setText("Buscar");
        btnBuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarclienteActionPerformed(evt);
            }
        });

        btnBuscarproducto.setBackground(new java.awt.Color(204, 204, 255));
        btnBuscarproducto.setText("Buscar");
        btnBuscarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarproductoActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(204, 204, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtFecha.setBackground(new java.awt.Color(255, 153, 255));
        txtFecha.setFont(new java.awt.Font("Futura Bk BT", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(204, 0, 102));
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("CLIENTE:");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("STOCK:");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("vendedor");

        txtCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCliente.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(0, 0, 204));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        txtProducto.setBackground(new java.awt.Color(255, 255, 255));
        txtProducto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(0, 0, 204));
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });

        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtStock.setForeground(new java.awt.Color(0, 0, 204));
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        txtVendedor.setBackground(new java.awt.Color(255, 255, 255));
        txtVendedor.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtVendedor.setForeground(new java.awt.Color(204, 0, 204));

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("PRODUC:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnBuscarcliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnBuscarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVendedor)
                            .addComponent(txtCliente)
                            .addComponent(txtProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtcodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtcodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13)
                    .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado Ventas:"));

        TablaDetalle.setBackground(new java.awt.Color(255, 204, 255));
        TablaDetalle.setForeground(new java.awt.Color(153, 153, 255));
        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "COD", "PRODUCTO", "CANTIDAD", "PRE UNI", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(TablaDetalle);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos:"));
        jPanel3.setForeground(new java.awt.Color(0, 204, 255));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 102));
        jLabel7.setText("POLLERIA PICO DE ORO");

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Venta de ricos pollos a la brasa");

        jLabel9.setFont(new java.awt.Font("Dosis", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("telf: 85854785");

        jLabel10.setFont(new java.awt.Font("Futura Md BT", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 51));
        jLabel10.setText("NRO SERIE: ");

        txtSerie.setBackground(new java.awt.Color(255, 204, 0));
        txtSerie.setFont(new java.awt.Font("Exotc350 Bd BT", 1, 14)); // NOI18N
        txtSerie.setForeground(new java.awt.Color(0, 0, 102));
        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/poll.png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/poll.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel9))
                        .addComponent(jLabel7)))
                .addGap(49, 49, 49)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 153, 255));

        jButton4.setBackground(new java.awt.Color(51, 255, 255));
        jButton4.setText("CANCELAR");

        btnagregarventa.setBackground(new java.awt.Color(51, 255, 255));
        btnagregarventa.setText("GENERAR VENTA");
        btnagregarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarventaActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("TOTAL A PAGAR: ");

        txtTotalPagar.setBackground(new java.awt.Color(255, 255, 102));
        txtTotalPagar.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N
        txtTotalPagar.setForeground(new java.awt.Color(0, 51, 255));
        txtTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(btnagregarventa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregarventa)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPagarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed
void agregarProducto(){
        
        double total;
        int item = 0;
        
        modelo =(DefaultTableModel)TablaDetalle.getModel();
        item = item+1;
        idp = Integer.parseInt(txtcodProducto.getText());
        String nomp = txtProducto.getText();
        precio = Double.parseDouble(txtPrecio.getText());
        cant = Integer.parseInt(txtCantidad.getValue().toString());
        int stock =Integer.parseInt(txtStock.getText());
        total=cant*precio;
        ArrayList listas= new ArrayList();
        
        if(stock>0){
            listas.add(item);
            listas.add(idp);
            listas.add(nomp);
            listas.add(cant);
            listas.add(precio);
            listas.add(total);
            
            Object[]ob= new Object[6];
            ob[0]=listas.get(0);
            ob[1]=listas.get(1);
            ob[2]=listas.get(2);
            ob[3]=listas.get(3);
            ob[4]=listas.get(4);
            ob[5]=listas.get(5);
            modelo.addRow(ob);
            TablaDetalle.setModel(modelo);
            //calculamos total
            calcularTotal();
            
            
            
        }else{
             JOptionPane.showMessageDialog(this,"stock producto no disponible");
        }
    }
 
    void calcularTotal(){
        tpagar=0;
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
           cant=Integer.parseInt(TablaDetalle.getValueAt(i,3).toString()); 
           precio=Double.parseDouble(TablaDetalle.getValueAt(i,4).toString()); 
           tpagar=tpagar+(cant*precio);
        }
        txtTotalPagar.setText(" "+tpagar);
    }
    
   
    
    
    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtcodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodProductoActionPerformed

    private void btnBuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarclienteActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarclienteActionPerformed

    private void btnBuscarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarproductoActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBuscarproductoActionPerformed

    private void btnagregarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarventaActionPerformed
        if(txtTotalPagar.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe ingresar datos");
        }else{
        guardarVenta();
        guardarDetalle();
        actualizarStock();
        JOptionPane.showMessageDialog(this, "Se realizo con exito");
        limpiarTabla();
        nuevo();
        generarSerie();
        
        } } 
        
    void nuevo(){
        txtcodCliente.setText("");
        txtCliente.setText("");
        txtCantidad.setValue(1);
        txtcodProducto.setText("");
        txtProducto.setText("");
        txtStock.setText("");
        txtPrecio.setText("");
        txtTotalPagar.setText("");
        txtcodCliente.requestFocus();
    
    }   
    void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
            
            
        }
    
    }//GEN-LAST:event_btnagregarventaActionPerformed

    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerieActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed
    
    void actualizarStock(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Productos pr = new Productos();
            idp=Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            cant=Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            pr = pdao.listarID(idp);
            int sa;
            sa = Integer.parseInt(pr.getStock())- cant;
            
            pdao.actualizarStock(sa,idp);
            
        }
        
    }
    void guardarVenta(){
        int idv=1;
        int idc= cliente.getId();
        String serie= txtSerie.getText();
        String fecha= txtFecha.getText();
        double monto= tpagar;
        String estado= "1";
         
        v.setIdCliente(idc);
        v.setIdVendedor(idv);
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);
        v.setEstado(estado);
        vdao.GuardarVentas(v);
    
     }
     
    void guardarDetalle(){
        String idv = vdao.IdVentas();
        int idve;
        idve = Integer.parseInt(idv);
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            idp = Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            cant = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            double pre= Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            dv.setIdVentas(idve);
            dv.setIdProducto(idp);
            dv.setCantidad(cant);
            dv.setPreVenta(pre); 
            vdao.GuardarDetalleVentas(dv);
         }  
     }
     void buscarProducto(){
        int id=Integer.parseInt(txtcodProducto.getText());
        if(txtcodProducto.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Debe ingresar el codProducto");    
        }else{
            Productos p = pdao.listarID(id);
            if (p.getId()!=0){
                txtProducto.setText(p.getNom());
                txtPrecio.setText(""+p.getPrecio());
                txtStock.setText(""+p.getStock());
                
            }else{
                JOptionPane.showMessageDialog(this,"Producto no registrado");
                txtcodProducto.requestFocus();
            }
            
            
        }
    }
    void buscarCliente(){
        int r;
        String cod=txtcodCliente.getText();
        if(txtcodCliente.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Debe ingresar codigo Cliente");
        }else{
            cliente =cdao.listarID(cod);
            if(cliente.getDni()!= null){
                txtCliente.setText(cliente.getNom());
                txtcodProducto.requestFocus();
            } else{
                r=JOptionPane.showConfirmDialog(this,"Cliente no registrado,desea registrar?");
                if(r==0){
                    ClienteForm cf=new ClienteForm();
                    Principal.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                }
            }
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TablaDetalle;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarcliente;
    private javax.swing.JButton btnBuscarproducto;
    private javax.swing.JButton btnagregarventa;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtVendedor;
    private javax.swing.JTextField txtcodCliente;
    private javax.swing.JTextField txtcodProducto;
    // End of variables declaration//GEN-END:variables


  
}
