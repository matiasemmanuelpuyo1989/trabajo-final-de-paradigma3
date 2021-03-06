
package ventasdao.ui.abm;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import ventasdao.controladores.CategoriaControlador;
import ventasdao.controladores.ClienteControlador;
import ventasdao.controladores.ProductoControlador;
import ventasdao.objetos.Categoria;
import ventasdao.objetos.Cliente;
import ventasdao.objetos.Producto;
import ventasdao.objetos.ProductoCantidad;
import ventasdao.ui.grilla.GrillaCliente;
import ventasdao.ui.grilla.GrillaFactura;
import ventasdao.ui.grilla.GrillaProducto;

/**
 *
 * @author Administrador
 */
public class AbmFactura extends javax.swing.JInternalFrame {
    
    private ProductoControlador productoControlador;
    private CategoriaControlador categoriaControlador;
    private GrillaProducto grillaProducto;
    private DefaultComboBoxModel modelCombo;
    private DefaultComboBoxModel modelComboProductos;
    
    GrillaFactura grillaFactura;
    
    public AbmFactura() {
        initComponents();
        
        ClienteControlador ClienteControlador = new ClienteControlador();
        ClienteControlador = new ClienteControlador();
        
        productoControlador = new ProductoControlador();
        
        try {
            grillaFactura = new GrillaFactura(new ArrayList<ProductoCantidad>());
            jtFactura.setModel(grillaFactura);
        } catch (Exception ex) {
            Logger.getLogger(AbmFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ArrayList<Cliente> clientes = ClienteControlador.listar();
            ArrayList<Producto> productos = productoControlador.listar();
            
            modelCombo = new DefaultComboBoxModel(clientes.toArray());
            jCbCliente.setModel(modelCombo);
            
            modelComboProductos = new DefaultComboBoxModel(productos.toArray());
            jCBProducto.setModel(modelComboProductos);
            
        } catch (Exception ex) {
            Logger.getLogger(AbmFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLCliente = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jCbCliente = new javax.swing.JComboBox<>();
        jLProducto = new javax.swing.JLabel();
        jCBProducto = new javax.swing.JComboBox<>();
        jLPrecio = new javax.swing.JLabel();
        jLCantidad = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jtfCantidad = new javax.swing.JTextField();
        jBTEliminar = new javax.swing.JButton();
        jBTAGregar = new javax.swing.JButton();
        jLCantidad1 = new javax.swing.JLabel();
        jtfSubtotal = new javax.swing.JTextField();
        jLTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFactura = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jlbTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLCliente.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLCliente.setText("Cliente");

        jLTitulo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLTitulo.setText("Factura");

        jCbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbClienteActionPerformed(evt);
            }
        });

        jLProducto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLProducto.setText("Producto");

        jCBProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBProductoItemStateChanged(evt);
            }
        });
        jCBProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProductoActionPerformed(evt);
            }
        });

        jLPrecio.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLPrecio.setText("Precio");

        jLCantidad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLCantidad.setText("Cantidad");

        jtfPrecio.setEnabled(false);

        jtfCantidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtfCantidadPropertyChange(evt);
            }
        });
        jtfCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCantidadKeyReleased(evt);
            }
        });

        jBTEliminar.setText("Eliminar");

        jBTAGregar.setText("Agregar");
        jBTAGregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAGregarActionPerformed(evt);
            }
        });

        jLCantidad1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLCantidad1.setText("SubTotal");

        jtfSubtotal.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLCliente)
                                .addGap(58, 58, 58)
                                .addComponent(jCbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLProducto)
                                    .addComponent(jLCantidad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBTAGregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBTEliminar)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLCantidad1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLTitulo)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCliente)
                    .addComponent(jCbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProducto)
                    .addComponent(jCBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPrecio)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCantidad)
                    .addComponent(jtfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCantidad1)
                    .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTEliminar)
                    .addComponent(jBTAGregar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLTotal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLTotal.setText("Total");

        jtFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(2, 2, 2)));
        jtFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Productos", "Precio Unitario", "Cantidad", "Total"
            }
        ));
        jScrollPane1.setViewportView(jtFactura);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("TOTAL");

        jlbTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlbTotal.setText("$0.00");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(591, 591, 591)
                        .addComponent(jLTotal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlbTotal))
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jlbTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(748, 748, 748)
                .addComponent(jLTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbClienteActionPerformed

    private void jCBProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBProductoActionPerformed

    private void jCBProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBProductoItemStateChanged
        // TODO add your handling code here:
        //selection Change
        
        Producto producto = (Producto)jCBProducto.getSelectedItem();
        try{
            Producto pr =  productoControlador.extraer(producto.getId());
            
            jtfPrecio.setText(""+pr.getPrecio());
            
        }catch(SQLException ex){
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AbmFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jCBProductoItemStateChanged

    private void jtfCantidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtfCantidadPropertyChange
        // TODO add your handling code here:
        //quantity change

        
        
    }//GEN-LAST:event_jtfCantidadPropertyChange

    private void jtfCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCantidadKeyReleased
        // TODO add your handling code here:
        
        
        try{
            
            Double cantidad =  Double.parseDouble(jtfCantidad.getText());
            Double precio =  Double.parseDouble(jtfPrecio.getText());
            
            Double subTotal = cantidad * precio;
            
            jtfSubtotal.setText(""+ subTotal);
            
        }catch(Exception ex){
            
            jtfSubtotal.setText("");
            
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jtfCantidadKeyReleased

    private void jBTAGregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTAGregarActionPerformed
        // TODO add your handling code here:
        //agregar 
        
        ProductoCantidad productoCantidad = new ProductoCantidad();
        
        Producto producto = (Producto)jCBProducto.getSelectedItem();
        
        productoCantidad.setId(producto.getId());
        productoCantidad.setNombre(producto.getNombre());
        productoCantidad.setPrecio(producto.getPrecio());
        
        Integer cantidad = 0;
        Float importe = 0f;
        try{
            cantidad = Integer.parseInt(jtfCantidad.getText());
            
            importe = cantidad * productoCantidad.getPrecio();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        productoCantidad.setCantidad(cantidad);
        productoCantidad.setImporte(importe);
        
        
        grillaFactura.agregar(productoCantidad);
        jtFactura.updateUI();
        
        jlbTotal.setText("$" + grillaFactura.total);
        
    }//GEN-LAST:event_jBTAGregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    private void refreshTable(){
        try {
           // jtFactura.setModel(new GrillaCliente(ClienteControlador.listar()));
        } catch (Exception ex) {
            Logger.getLogger(AbmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTAGregar;
    private javax.swing.JButton jBTEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBProducto;
    private javax.swing.JComboBox<String> jCbCliente;
    private javax.swing.JLabel jLCantidad;
    private javax.swing.JLabel jLCantidad1;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLProducto;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbTotal;
    private javax.swing.JTable jtFactura;
    private javax.swing.JTextField jtfCantidad;
    private javax.swing.JTextField jtfPrecio;
    private javax.swing.JTextField jtfSubtotal;
    // End of variables declaration//GEN-END:variables

   // private void limpiarCampos() {
    //   jtfDescripcion.setText("");
     //  jtfNombre.setText("");
     //  jtfPrecio.setText("");
   // }
}
