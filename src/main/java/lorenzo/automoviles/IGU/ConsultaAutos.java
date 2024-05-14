package lorenzo.automoviles.IGU;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lorenzo.automoviles.logica.Automovil;
import lorenzo.automoviles.logica.Controladora;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class ConsultaAutos extends javax.swing.JFrame {
    
    Controladora control = new Controladora();

    public ConsultaAutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutoVista = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel2.setText("Consulta de Automoviles");

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        tablaAutoVista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaAutoVista);

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
     crearTabla();
        
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tablaAutoVista.getRowCount() > 0){
            if (tablaAutoVista.getSelectedRow() != -1 ){
                int idAuto = Integer.parseInt(String.valueOf(tablaAutoVista.getValueAt(tablaAutoVista.getSelectedRow(),0 )));
                
                control.borrarAuto(idAuto);
                crearTabla();
                
                mostrarMensaje("Automovil Borrado Exitosamente", "Info", "Borrado Correcto");
            }
            else{
                mostrarMensaje("No Selcciono un Automovil para Borrar", "Error", "Error al Eliminar");
            }
        } 
        else{
            mostrarMensaje("No Automoviles para Borrar", "Error", "Tabla Vacia");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (tablaAutoVista.getRowCount() >0 ){
            if (tablaAutoVista.getSelectedRow()!= -1){
                int idAuto = Integer.parseInt(String.valueOf(tablaAutoVista.getValueAt(tablaAutoVista.getSelectedRow(),0 )));
                
                ModificacionAuto modiAuto = new ModificacionAuto(idAuto);
                modiAuto.setVisible(true);
                modiAuto.setLocationRelativeTo(null);
                
                this.dispose();
            
            }
            else {
                mostrarMensaje("No Hay Automovil seleccionado", "Error", "No se Puede Modificar");
            }
        }
        else{
            mostrarMensaje ("No Hay Automovil seleccionado", "Error", "Tabla Vacia para Modificar");
        }
        
        
        
        
    }//GEN-LAST:event_btnModificarActionPerformed
    public void mostrarMensaje (String mensaje, String tipo, String titulo){
            JOptionPane optionPane = new JOptionPane(mensaje);
            if (tipo.equals("Info")){
                optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            }
            else if (tipo.equals("Error")) {
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
            JDialog dialogo = optionPane.createDialog(titulo);
            dialogo.setAlwaysOnTop(true);
            dialogo.setVisible(true);      
    }       
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAutoVista;
    // End of variables declaration//GEN-END:variables

    private void crearTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        String titulos[] = {"Id", "Marca", "Modelo", "Color", "Motor", "Patente", "Cant. Puertas"};
        modeloTabla.setColumnIdentifiers(titulos);
        List <Automovil> listaAuto = control.traerAuros();
        
        if (listaAuto !=null){
            for (Automovil auto: listaAuto){
                Object [] object = {auto.getId(), auto.getMarca(), auto.getModelo(), auto.getColor(),
                                    auto.getMotor(), auto.getPatente(), auto.getCantPuerta()};
                modeloTabla.addRow(object);
            }
                
        }
        tablaAutoVista.setModel(modeloTabla);
 
    }
}
