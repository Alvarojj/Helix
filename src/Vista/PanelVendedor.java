/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author VinuShioN
 */
public class PanelVendedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form PanelVendedor
     */
    public PanelVendedor() {
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

        jLabel1 = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbProducto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Productos = new javax.swing.JTable();
        JBAgregarProducto = new javax.swing.JButton();

        setTitle("Panel Vendedor - HELIX");
        setPreferredSize(new java.awt.Dimension(1112, 677));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Panel Vendedor - NOMBRE");
        jLabel1.setToolTipText("");

        cbCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "CLIENTE 1", "CLIENTE 2", "CLIENTE 3" }));
        cbCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Cliente:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Producto:");

        cbProducto.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "PRODUCTO 1", "PRODUCTO 2", "PRODUCTO 3", " " }));
        cbProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        Productos.setAutoCreateRowSorter(true);
        Productos.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Producto", "Articulo", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Productos.setSelectionBackground(new java.awt.Color(60, 63, 65));
        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Productos);

        JBAgregarProducto.setBackground(new java.awt.Color(163, 16, 106));
        JBAgregarProducto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        JBAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        JBAgregarProducto.setText("  Agregar Producto");
        JBAgregarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JBAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JBAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(590, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(JBAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked
        /*
        if (evt.getClickCount() == 2) {
            int r = JOptionPane.showOptionDialog(rootPane, "Ha seleccionado el producto " + JTable.getSelectedRow() + "\n ??Deseas cargarlo al sistema?", "Sistema de Encuestados", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (r == 0) {
                int fila = JTable.getSelectedRow();
                if (fila != -1) {
                    if (producto.getTamano() == 0) {
                        JOptionPane.showMessageDialog(null, "No hay registro de productos en la Base de Datos", "Validaci??n de datos", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if (JTable.getValueAt(fila, 0).toString().isEmpty() && JTable.getValueAt(fila, 1).toString().isEmpty() && JTable.getValueAt(fila, 2).toString().isEmpty() && JTable.getValueAt(fila, 3).toString().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No puedes seleccionar un Producto que no existe", "Validaci??n de datos", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            TXTID.setText(JTable.getValueAt(fila, 0).toString());
                            TXTID.setEnabled(false);
                            JBAgregar.setEnabled(false);
                            TXTArticulo.setText(JTable.getValueAt(fila, 1).toString());
                            TXTPrecio.setText(JTable.getValueAt(fila, 2).toString());
                            TXTExistencias.setText(JTable.getValueAt(fila, 3).toString());
                            poslugar = fila;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Debe seleccionar un producto", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
        */
    }//GEN-LAST:event_ProductosMouseClicked

    private void JBAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarProductoActionPerformed
        /*
        if (!validaciones.Esnumero(TXTID.getText().trim()) || TXTID.getText().trim().isEmpty() || Long.parseLong(TXTID.getText().trim()) < 0) {
            JOptionPane.showMessageDialog(null, "No es un ID v??lido o debe ingresar alg??n id no negativo", "Validaci??n de datos", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!validaciones.Estexto(TXTArticulo.getText().toUpperCase().trim()) || TXTArticulo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No es un nombre valido o campo vacio", "Validaci??n de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!validaciones.Esnumero(TXTPrecio.getText().trim()) || TXTPrecio.getText().trim().isEmpty() || Long.parseLong(TXTPrecio.getText().trim()) < 0) {
                    JOptionPane.showMessageDialog(null, "No es un Precio v??lido o debe ingresar alg??n precio no negativo", "Validaci??n de datos", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!validaciones.Esnumero(TXTExistencias.getText().trim()) || TXTExistencias.getText().trim().isEmpty() || Long.parseLong(TXTExistencias.getText().trim()) < 0) {
                        JOptionPane.showMessageDialog(null, "No es un numero v??lido o debe ingresar alg??n numero no negativo", "Validaci??n de datos", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String id = TXTID.getText().trim();
                        if (Inventario.buscarProducto(id) != null) {
                            JOptionPane.showMessageDialog(null, "No se permite agregar duplicado de IDs de productos", "Validaci??n de datos", JOptionPane.ERROR_MESSAGE);
                        } else {
                            TableModel model = JTable.getModel();
                            producto = new Producto(TXTID.getText(), TXTArticulo.getText().toUpperCase(), TXTPrecio.getText().toUpperCase(), TXTExistencias.getText().toUpperCase(), Inventario);
                            Inventario.agregar(producto);
                            Limpiar();
                            habilita(true);
                            JOptionPane.showMessageDialog(null, "Procucto Guardado", "Ingreso de Datos", JOptionPane.INFORMATION_MESSAGE);
                            limpiarTabla();
                            ImprimirLista();
                            JTable2.setModel(model);
                        }
                    }
                }
            }
        }
        */
    }//GEN-LAST:event_JBAgregarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregarProducto;
    private javax.swing.JTable Productos;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
