package com.ronald.peluqueriacanina.gui;

import com.ronald.peluqueriacanina.logica.Controladora;
import com.ronald.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ronald Almada
 */
public class VentanaBuscarCliente extends javax.swing.JFrame {


    Controladora controladoraLogica = null;
    public VentanaBuscarCliente() {
        controladoraLogica = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTablaInformacion = new javax.swing.JTable();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        labelTitulo.setText("Buscar Cliente");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbTablaInformacion.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        tbTablaInformacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbTablaInformacion);

        btnBorrar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnBorrar)
                .addGap(40, 40, 40)
                .addComponent(btnModificar)
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Busqueda de Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(labelTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarDatos();
    }//GEN-LAST:event_formWindowOpened

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //si hay clientes en la base de datos borramos
        if (tbTablaInformacion.getRowCount() > 0){
            //si tenomos seleccionado a un cliente podemos borrar
            if(tbTablaInformacion.getSelectedRow() != -1){
                int numeroCliente = Integer.parseInt(String.valueOf(tbTablaInformacion.getValueAt(tbTablaInformacion.getSelectedRow(), 0)));
                
                controladoraLogica.eliminarMascota(numeroCliente);
                
                mostrarMensaje("Cliente Eliminado", "Eliminar Cliente");
                //volvemos a cargar los datos una vez que hayamos eliminado al seleccionado
                cargarDatos();
            }
            else{
                mostrarMensaje("No hay cliente seleccionado", "Error al Eliminar Cliente");
            }
        }
        else{
            mostrarMensaje("No hay Clientes para eliminar", "Error al Eliminar Cliente");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //si hay por lo menos una fila para realizar la accion
        if (tbTablaInformacion.getRowCount() > 0){
            //si tenemos seleccionado a un cliente podemos borrar
            if(tbTablaInformacion.getSelectedRow() != -1){
                int numeroCliente = Integer.parseInt(String.valueOf(tbTablaInformacion.getValueAt(tbTablaInformacion.getSelectedRow(), 0)));
                
                VentanaModificarCliente ventanaModificar = new VentanaModificarCliente(numeroCliente);
                ventanaModificar.setTitle("Modificar Datos de Cliente");
                ventanaModificar.setVisible(true);
                ventanaModificar.setLocationRelativeTo(null);
                //volvemos a cargar los datos una vez que hayamos eliminado al seleccionado
                cargarDatos();
                
                this.dispose();
            }
            else{
                mostrarMensaje("No hay cliente seleccionado", "Error al modificar Cliente");
            }
        }
        else{
            mostrarMensaje("No existen clientes para Modificar", "Error al Eliminar Cliente");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed
    
    public void mostrarMensaje(String mensaje, String titulo){
        JOptionPane.showMessageDialog(null, mensaje, titulo, HEIGHT);
    }
    
    private void cargarDatos() {
        DefaultTableModel tablaModelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        String[] titulos ={"Id Cliente", "Id Mascota", "Nombre Cliente", "Nombre Mascota",
            "Telefono", "Direccion", "Raza", "Color", "Es Alergico", "Atención Especial", "Observaciones"};
        
        tablaModelo.setColumnIdentifiers(titulos);
        
        List<Mascota> listaMascotas = controladoraLogica.getDatos();
        
        if(listaMascotas != null){
            for(Mascota mascota : listaMascotas){
                Object[] objeto = {mascota.getCliente().getId(), mascota.getNum_cliente(),
                mascota.getCliente().getNombre(), mascota.getNombre(), mascota.getCliente().getTelefono(),
                mascota.getCliente().getDireccion(), mascota.getRaza(), mascota.getColor(),
                mascota.isEsAlergico(), mascota.isEsEspecial(), mascota.getObservaciones()};
                
                tablaModelo.addRow(objeto);
            }
        }
        tbTablaInformacion.setModel(tablaModelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tbTablaInformacion;
    // End of variables declaration//GEN-END:variables

    
}
