package com.ronald.peluqueriacanina.gui;

import com.ronald.peluqueriacanina.logica.Controladora;
import com.ronald.peluqueriacanina.logica.Mascota;
import java.util.List;
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
        jLabel2 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
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

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel2.setText("Buscar por:");

        btnBorrar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnBorrar.setText("Borrar");

        btnModificar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");

        jComboBox1.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id de Cliente", "Nombre de Cliente", "Id de Mascota ", "Nombre de Mascota " }));

        btnBuscar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnBorrar)
                        .addGap(40, 40, 40)
                        .addComponent(btnModificar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTable tbTablaInformacion;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    
}
