/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorHistorialVenta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.vo.Categoria;
import modelo.vo.Cliente;
import modelo.vo.Pedido;
import modelo.vo.Producto;
import modelo.vo.Usuario;
import modelo.vo.Venta;

/**
 *
 * @author Daniel
 */
public class PanelHistorialVentas extends javax.swing.JPanel {

    private ControladorHistorialVenta miControladorHistorialVenta;

    /**
     * Creates new form NewPanelUsuarios
     */
    public PanelHistorialVentas() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        txtNombreVendedor = new jtextfieldround.JTextFieldRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreCliente = new jtextfieldround.JTextFieldRound();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoVendedor = new jtextfieldround.JTextFieldRound();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoCliente = new jtextfieldround.JTextFieldRound();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(1189, 903));
        setMinimumSize(new java.awt.Dimension(1189, 903));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1189, 903));
        setRequestFocusEnabled(false);
        setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(57, 103, 196));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(44, 80, 154));
        jPanel1.setPreferredSize(new java.awt.Dimension(179, 44));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Historial de ventas");
        jLabel1.setPreferredSize(new java.awt.Dimension(183, 44));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(789, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel4.setBackground(new java.awt.Color(57, 103, 196));

        jPanel7.setBackground(new java.awt.Color(57, 103, 196));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas realizadas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Venta", "DNI Vendedor", "DNI Cliente", "Monto"
            }
        ));
        tblVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblVentaFocusGained(evt);
            }
        });
        jScrollPane4.setViewportView(tblVenta);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(57, 103, 196));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        txtNombreVendedor.setEditable(false);
        txtNombreVendedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreVendedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(70, 106, 124));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del vendedor");

        jLabel3.setBackground(new java.awt.Color(70, 106, 124));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre del cliente");

        txtNombreCliente.setEditable(false);
        txtNombreCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombreCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(70, 106, 124));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos del venedor");

        txtApellidoVendedor.setEditable(false);
        txtApellidoVendedor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoVendedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(70, 106, 124));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos del cliente");

        txtApellidoCliente.setEditable(false);
        txtApellidoCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellidoCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellidoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(57, 103, 196));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos comprados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Categoria", "Cantidad", "Precio"
            }
        ));
        jScrollPane3.setViewportView(tblPedidos);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tblVentaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblVentaFocusGained
        // TODO add your handling code here:
        miControladorHistorialVenta.cargarPedidosSeleccionados();
    }//GEN-LAST:event_tblVentaFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tblPedidos;
    public javax.swing.JTable tblVenta;
    private jtextfieldround.JTextFieldRound txtApellidoCliente;
    private jtextfieldround.JTextFieldRound txtApellidoVendedor;
    private jtextfieldround.JTextFieldRound txtNombreCliente;
    private jtextfieldround.JTextFieldRound txtNombreVendedor;
    // End of variables declaration//GEN-END:variables

    // ENLACE CONTROLADOR
    public void setControlador(ControladorHistorialVenta miControladorHistorialVenta) {
        this.miControladorHistorialVenta = miControladorHistorialVenta;
    }
    
    // MÉTODOS AUXILIARES
    public void setTablaVentas(ArrayList<Venta> misVentas) {
        String[] columnas = {"ID Venta", "DNI Vendedor", "DNI Cliente", "Monto"};
        Object[][] miData = new Object[misVentas.size()][4];
        for (int i = 0; i < misVentas.size(); i++) {
            miData[i][0] = misVentas.get(i).getIdVenta();
            miData[i][1] = misVentas.get(i).getDniUsuario();
            miData[i][2] = misVentas.get(i).getDniCliente();
            miData[i][3] = misVentas.get(i).getMonto();
        }
        DefaultTableModel miDefaultTableModel = new DefaultTableModel(miData, columnas);
        tblVenta.setModel(miDefaultTableModel);
    }
    
    // Método por mejorar.
    public void SetTablaPedidos(ArrayList<Pedido> listaCarritoPedidos, ArrayList<Producto> misProductos, ArrayList<Categoria> misCategorias) {
        String[] columnas = {"Producto", "Categoria", "Cantidad", "Precio"};
        Object[][] miData = new Object[listaCarritoPedidos.size()][4];
        Producto miProductoBuscado = new Producto();
        
        for (int i = 0; i < miData.length; i++) {
            miData[i][2] = listaCarritoPedidos.get(i).getCantidad();
            
            for (int j = 0; j < misProductos.size(); j++) {
                miProductoBuscado = misProductos.get(j);
                if (miProductoBuscado.getIdProducto() == listaCarritoPedidos.get(i).getIdProducto()) {
                    miData[i][0] = miProductoBuscado.getNombre();
                    miData[i][3] = miProductoBuscado.getPrecio();
                    break;
                }
            }
            
            for (int j = 0; j < misCategorias.size(); j++) {
                if (miProductoBuscado.getIdCategoria() == misCategorias.get(j).getIdCategoria()) {
                    miData[i][1] = misCategorias.get(j).getNombreCategoria();
                }
            }
        }
        
        DefaultTableModel miDefaultTableModel = new DefaultTableModel(miData, columnas);
        tblPedidos.setModel(miDefaultTableModel);
    }

    public int idVentaSeleccionado() {
        int idVentaSeleccionado = -1;
        if (tblVenta.getSelectedRow() != -1) {
            idVentaSeleccionado = (int) tblVenta.getValueAt(tblVenta.getSelectedRow(), 0);
        }
        return idVentaSeleccionado;
    }
    
    public String dniUsuarioSeleccionado() {
        String dniUsuarioSelecionado = "";
        if (tblVenta.getSelectedRow() != -1) {
            dniUsuarioSelecionado = (String) tblVenta.getValueAt(tblVenta.getSelectedRow(), 1);
        }
        return dniUsuarioSelecionado;
    }
    
    public String dniClienteSeleccionado() {
        String dniClienteSeleccionado = "";
        if (tblVenta.getSelectedRow() != -1) {
            dniClienteSeleccionado = (String) tblVenta.getValueAt(tblVenta.getSelectedRow(), 2);
        }
        return dniClienteSeleccionado;
    }

    public void desempaquetarDatosUsuario(Usuario miUsuario) {
        txtNombreVendedor.setText(miUsuario.getNombre());
        txtApellidoVendedor.setText(miUsuario.getApellido());
    }

    public void desempaquetarDatosCliente(Cliente miCliente) {
        txtNombreCliente.setText(miCliente.getNombre());
        txtApellidoCliente.setText(miCliente.getApellido());
    }
}
