package Vista;

import javax.swing.JOptionPane;

public class PanelAdmin extends javax.swing.JInternalFrame {
    
    ClientesAdmin cliAd = new ClientesAdmin(null, false);
    VendedoresAdmin venAd = new VendedoresAdmin(null, false);

    public PanelAdmin(){
        initComponents();
    }
    
    public void limpiarTabla() {
        for (int i = 0; i < 10; i++) {
            Productos.setValueAt("", i, 0);
            Productos.setValueAt("", i, 1);
            Productos.setValueAt("", i, 2);
            Productos.setValueAt("", i, 3);
        }
    }

    void Limpiar() {
        TXTID.setText("");
        TXTArticulo.setText("");
        TXTPrecio.setText("");
        TXTStock.setText("");

    }

    void habilita(boolean answer) {
        TXTID.setEnabled(answer);
        TXTArticulo.setEnabled(answer);
        TXTPrecio.setEnabled(answer);
        TXTStock.setEnabled(answer);
        JBAgregar.setEnabled(answer);
    }

    public void ImprimirLista() {
        /*
        if (Inventario.getTamano() > 0) {
            for (int j = 0; j < Inventario.getTamano(); j++) {
                JTable.setValueAt(Inventario.posicionProducto(j).getId(), j, 0);
                JTable.setValueAt(Inventario.posicionProducto(j).getArticulo().toUpperCase(), j, 1);
                JTable.setValueAt(Inventario.posicionProducto(j).getPrecio(), j, 2);
                JTable.setValueAt(Inventario.posicionProducto(j).getStock(), j, 3);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos guardados", "Validación de datos", JOptionPane.INFORMATION_MESSAGE);

        }
        */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXTID = new javax.swing.JTextField();
        JBBuscar = new javax.swing.JButton();
        JBAgregar = new javax.swing.JButton();
        JBEliminar = new javax.swing.JButton();
        JBActualizar = new javax.swing.JButton();
        JBLimpiarCampos = new javax.swing.JButton();
        TXTArticulo = new javax.swing.JTextField();
        TXTPrecio = new javax.swing.JTextField();
        TXTStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Productos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        JBClientes = new javax.swing.JButton();
        JBVendedores = new javax.swing.JButton();

        setTitle("Panel Administrador - HELIX");
        setPreferredSize(new java.awt.Dimension(1112, 677));

        TXTID.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "ID Producto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTID.setSelectedTextColor(new java.awt.Color(204, 255, 255));

        JBBuscar.setBackground(new java.awt.Color(163, 16, 106));
        JBBuscar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBBuscar.setForeground(new java.awt.Color(255, 255, 255));
        JBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search.png"))); // NOI18N
        JBBuscar.setText("  Buscar");
        JBBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBuscarActionPerformed(evt);
            }
        });

        JBAgregar.setBackground(new java.awt.Color(163, 16, 106));
        JBAgregar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBAgregar.setForeground(new java.awt.Color(255, 255, 255));
        JBAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add.png"))); // NOI18N
        JBAgregar.setText("  Agregar");
        JBAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarActionPerformed(evt);
            }
        });

        JBEliminar.setBackground(new java.awt.Color(163, 16, 106));
        JBEliminar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBEliminar.setForeground(new java.awt.Color(255, 255, 255));
        JBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete.png"))); // NOI18N
        JBEliminar.setText("  Eliminar");
        JBEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEliminarActionPerformed(evt);
            }
        });

        JBActualizar.setBackground(new java.awt.Color(163, 16, 106));
        JBActualizar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBActualizar.setForeground(new java.awt.Color(255, 255, 255));
        JBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/update.png"))); // NOI18N
        JBActualizar.setText("  Actualizar");
        JBActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBActualizarActionPerformed(evt);
            }
        });

        JBLimpiarCampos.setBackground(new java.awt.Color(81, 66, 75));
        JBLimpiarCampos.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBLimpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        JBLimpiarCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clear.png"))); // NOI18N
        JBLimpiarCampos.setText("  Limpiar Campos");
        JBLimpiarCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JBLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLimpiarCamposActionPerformed(evt);
            }
        });

        TXTArticulo.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTArticulo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Nombre del Articulo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        TXTPrecio.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Precio Unitario:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N

        TXTStock.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TXTStock.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Stock:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 12))); // NOI18N
        TXTStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTStockActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Panel Administrador - NOMBRE");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Mantenimiento");

        JBClientes.setBackground(new java.awt.Color(99, 83, 161));
        JBClientes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBClientes.setForeground(new java.awt.Color(255, 255, 255));
        JBClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/client.png"))); // NOI18N
        JBClientes.setText("  Clientes");
        JBClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JBClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClientesActionPerformed(evt);
            }
        });

        JBVendedores.setBackground(new java.awt.Color(23, 86, 160));
        JBVendedores.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        JBVendedores.setForeground(new java.awt.Color(255, 255, 255));
        JBVendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sellers.png"))); // NOI18N
        JBVendedores.setText("  Vendedores");
        JBVendedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JBVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVendedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(TXTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXTStock, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JBLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TXTID, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TXTArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(JBClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTID)
                    .addComponent(TXTArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBLimpiarCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXTStock)
                    .addComponent(TXTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBVendedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(JBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(JBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBuscarActionPerformed
        /*
        try {
            if (Inventario.getTamano() > 0) {
                String id = TXTID.getText().trim();
                if (Inventario.getTamano() > 0) {
                    if (Inventario.buscarProducto(id) != null) {
                        JOptionPane.showMessageDialog(null, "Existe una coincidencia:\n Id: " + TXTID.getText() + "\n Articulo: " + TXTArticulo.getText() + "\n Precio: " + TXTPrecio.getText() + "\n Existencias: " + TXTExistencias.getText(), "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                        limpiarTabla();
                        ImprimirLista();
                        Limpiar();
                        habilita(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay registro en la base de datos con este ID " + id, "Validación de Búsqueda", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay resgistro en la lista", "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        */
    }//GEN-LAST:event_JBBuscarActionPerformed

    private void JBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarActionPerformed
        /*
        if (!validaciones.Esnumero(TXTID.getText().trim()) || TXTID.getText().trim().isEmpty() || Long.parseLong(TXTID.getText().trim()) < 0) {
            JOptionPane.showMessageDialog(null, "No es un ID válido o debe ingresar algún id no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!validaciones.Estexto(TXTArticulo.getText().toUpperCase().trim()) || TXTArticulo.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No es un nombre valido o campo vacio", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!validaciones.Esnumero(TXTPrecio.getText().trim()) || TXTPrecio.getText().trim().isEmpty() || Long.parseLong(TXTPrecio.getText().trim()) < 0) {
                    JOptionPane.showMessageDialog(null, "No es un Precio válido o debe ingresar algún precio no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!validaciones.Esnumero(TXTExistencias.getText().trim()) || TXTExistencias.getText().trim().isEmpty() || Long.parseLong(TXTExistencias.getText().trim()) < 0) {
                        JOptionPane.showMessageDialog(null, "No es un numero válido o debe ingresar algún numero no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                    } else {
                        String id = TXTID.getText().trim();
                        if (Inventario.buscarProducto(id) != null) {
                            JOptionPane.showMessageDialog(null, "No se permite agregar duplicado de IDs de productos", "Validación de datos", JOptionPane.ERROR_MESSAGE);
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
    }//GEN-LAST:event_JBAgregarActionPerformed

    private void JBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEliminarActionPerformed
        /*
        try {
            if (!validaciones.Esnumero(TXTID.getText().trim()) || TXTID.getText().trim().isEmpty() || Long.parseLong(TXTID.getText().trim()) < 0) {
                JOptionPane.showMessageDialog(null, "No es un número de ID válido o debe ingresar algún id no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                String id = TXTID.getText().trim();
                if (Inventario.getTamano() > 0) {
                    if (Inventario.buscarProducto(id) != null) {
                        int r = JOptionPane.showOptionDialog(this, "¿Esta seguro de eliminar este producto?", "Sistema de Inventario", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                        if (r == 0) {

                            TableModel model = JTable.getModel();
                            Inventario.eliminarProducto(Inventario.buscarProducto(id));
                            Limpiar();
                            habilita(true);
                            JOptionPane.showMessageDialog(null, "Producto Eliminado", "Resultados de Productos", JOptionPane.INFORMATION_MESSAGE);
                            limpiarTabla();
                            ImprimirLista();
                            JTable2.setModel(model);

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay registro en la base de datos con este ID" + id, "Validación de Búsqueda", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No hay resgistro en la lista", "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
*/
    }//GEN-LAST:event_JBEliminarActionPerformed

    private void JBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActualizarActionPerformed
        /*
        try {
            if (!validaciones.Esnumero(TXTID.getText().trim()) || TXTID.getText().trim().isEmpty() || Long.parseLong(TXTID.getText().trim()) < 0) {
                JOptionPane.showMessageDialog(null, "No es un ID válido o debe ingresar algún id no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
            } else {
                if (!validaciones.Estexto(TXTArticulo.getText().toUpperCase().trim()) || TXTArticulo.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No es un nombre valido o campo vacio", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (!validaciones.Esnumero(TXTPrecio.getText().trim()) || TXTPrecio.getText().trim().isEmpty() || Long.parseLong(TXTPrecio.getText().trim()) < 0) {
                        JOptionPane.showMessageDialog(null, "No es un Precio válido o debe ingresar algún precio no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                    } else {
                        if (!validaciones.Esnumero(TXTExistencias.getText().trim()) || TXTExistencias.getText().trim().isEmpty() || Long.parseLong(TXTExistencias.getText().trim()) < 0) {
                            JOptionPane.showMessageDialog(null, "No es un numero válido o debe ingresar algún numero no negativo", "Validación de datos", JOptionPane.ERROR_MESSAGE);
                        } else {
                            String id = TXTID.getText().trim();
                            if (Inventario.getTamano() > 0) {
                                if (Inventario.buscarProducto(id) != null) {
                                    TableModel model = JTable.getModel();

                                    Producto pro = Inventario.buscarProducto(id);
                                    pro.setArticulo(TXTArticulo.getText().toUpperCase().trim());
                                    pro.setPrecio(TXTPrecio.getText().trim());
                                    pro.setStock(TXTExistencias.getText().trim());

                                    Limpiar();
                                    habilita(true);
                                    JOptionPane.showMessageDialog(null, "Producto Actualizado", "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                                    limpiarTabla();
                                    ImprimirLista();
                                    JTable2.setModel(model);

                                } else {
                                    JOptionPane.showMessageDialog(null, "No hay registro en la base de datos con este ID " + id, "Validación de Búsqueda", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No hay resgistro en la lista", "Resultados de Acciones", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }

            }

        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
*/
    }//GEN-LAST:event_JBActualizarActionPerformed

    private void JBLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLimpiarCamposActionPerformed
        Limpiar();
        habilita(true);
    }//GEN-LAST:event_JBLimpiarCamposActionPerformed

    private void ProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductosMouseClicked
       /*
        if (evt.getClickCount() == 2) {
            int r = JOptionPane.showOptionDialog(rootPane, "Ha seleccionado el producto " + JTable.getSelectedRow() + "\n ¿Deseas cargarlo al sistema?", "Sistema de Encuestados", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (r == 0) {
                int fila = JTable.getSelectedRow();
                if (fila != -1) {
                    if (producto.getTamano() == 0) {
                        JOptionPane.showMessageDialog(null, "No hay registro de productos en la Base de Datos", "Validación de datos", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if (JTable.getValueAt(fila, 0).toString().isEmpty() && JTable.getValueAt(fila, 1).toString().isEmpty() && JTable.getValueAt(fila, 2).toString().isEmpty() && JTable.getValueAt(fila, 3).toString().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No puedes seleccionar un Producto que no existe", "Validación de datos", JOptionPane.INFORMATION_MESSAGE);
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

    private void JBClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClientesActionPerformed
        cliAd.setModal(true);
        cliAd.setVisible(true);
        cliAd.toFront();
    }//GEN-LAST:event_JBClientesActionPerformed

    private void JBVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVendedoresActionPerformed
        venAd.setModal(true);
        venAd.setVisible(true);
        venAd.toFront();
    }//GEN-LAST:event_JBVendedoresActionPerformed

    private void TXTStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTStockActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBActualizar;
    private javax.swing.JButton JBAgregar;
    private javax.swing.JButton JBBuscar;
    private javax.swing.JButton JBClientes;
    private javax.swing.JButton JBEliminar;
    private javax.swing.JButton JBLimpiarCampos;
    private javax.swing.JButton JBVendedores;
    private javax.swing.JTable Productos;
    private javax.swing.JTextField TXTArticulo;
    private javax.swing.JTextField TXTID;
    private javax.swing.JTextField TXTPrecio;
    private javax.swing.JTextField TXTStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
