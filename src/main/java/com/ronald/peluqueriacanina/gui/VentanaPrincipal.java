package com.ronald.peluqueriacanina.gui;

/**
 *
 * @author Ronald Almada
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        panelPrincipal = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelAcciones = new javax.swing.JPanel();
        btnCrearNuevoCliente = new javax.swing.JButton();
        btnCrearCliente = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        iconPerrito = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        labelTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        labelTitulo.setText("Peluquería Canina");

        panelAcciones.setBackground(new java.awt.Color(222, 222, 222));

        btnCrearNuevoCliente.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnCrearNuevoCliente.setText("Crear Nuevo Cliente");
        btnCrearNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearNuevoClienteActionPerformed(evt);
            }
        });

        btnCrearCliente.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnCrearCliente.setText("Buscar Cliente");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCliente(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCrearNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnCrearNuevoCliente)
                .addGap(62, 62, 62)
                .addComponent(btnCrearCliente)
                .addGap(63, 63, 63)
                .addComponent(btnSalir)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        iconPerrito.setIcon(new javax.swing.ImageIcon("/home/r/NetBeansProjects/PeluqueriaCanina/src/main/java/com/ronald/peluqueriacanina/gui/img_perrito.jpg")); // NOI18N

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iconPerrito)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconPerrito, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearNuevoClienteActionPerformed
        
        VentanaNuevoCliente ventanaCrear = new VentanaNuevoCliente();
        ventanaCrear.setTitle("Añadir Nuevo Cliente");
        ventanaCrear.setVisible(true);
        ventanaCrear.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCrearNuevoClienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCliente
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCliente



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnCrearNuevoCliente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel iconPerrito;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
