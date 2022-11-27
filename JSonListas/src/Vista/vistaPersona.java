package Vista;

import Modelo.Persona;
import Controlador.Operaciones;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class vistaPersona extends javax.swing.JFrame {

    String valor;

    DefaultTableModel modeloTablaPersona;

    int filaSeleccionada=-1;
    Persona personaSeleccionada;
    public vistaPersona() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public vistaPersona(String valor) {
        this.valor = valor;
        initComponents();
    }

    public void actualizarDatos() {
        crearModeloTablaPersona();
        agregarDatosPersona();
    }

    private void crearModeloTablaPersona() {
        String[] columnas = new String[]{"Nombre", "Sueldo", "Anios", "Rango","Bono","Total"};
        modeloTablaPersona = new DefaultTableModel(columnas, 0);
        tblPersonas.setModel(modeloTablaPersona);
    }

    private void agregarDatosPersona() {
        for (Persona producto : Operaciones.general.getPersonas()) {
            insertarFilaEnTabla(producto);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(tblPersonas);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Sueldo:");

        lblPrecio.setText("Fecha:");

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnCargar)
                    .addComponent(btnGuardar))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        filaSeleccionada = tblPersonas.getSelectedRow();
        try {
            
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(rootPane, "Por favor debe seleccionar un elemento de la tabla");
        } else {
            Operaciones.general.getPersonas().remove(filaSeleccionada);
            modeloTablaPersona.removeRow(filaSeleccionada);
        }
        JOptionPane.showMessageDialog(null,"Se eliminó");
        } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"No se eliminó");

        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Operaciones.general.guardar();
    }//GEN-LAST:event_formWindowClosing

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
        int anios;
        String rango;
        float bono;
        float total;
        
        anios = Controlador.Operaciones.Fecha(txtFecha.getText());
        rango = Controlador.Operaciones.rango(anios);
        bono = Controlador.Operaciones.Bono(rango,Float.parseFloat(txtSueldo.getText()));
        total = Controlador.Operaciones.Total(bono,Float.parseFloat(txtSueldo.getText()));
        
        Persona persona = new Persona(txtNombre.getText(), rango, Float.parseFloat(txtSueldo.getText()), anios, bono, total);
        if (filaSeleccionada != -1) {

            personaSeleccionada.setNombre(txtNombre.getText());
            personaSeleccionada.setSueldo(Float.parseFloat(txtSueldo.getText()));
            personaSeleccionada.setFecha(txtFecha.getText());
            personaSeleccionada.setAnios(Controlador.Operaciones.Fecha(txtFecha.getText()));
            personaSeleccionada.setRango(Controlador.Operaciones.rango(persona.getAnios()));
            personaSeleccionada.setTotalBono(Controlador.Operaciones.Bono(persona.getRango(),persona.getSueldo()));
            personaSeleccionada.setTotal(Controlador.Operaciones.Total(persona.getTotalBono(),persona.getSueldo()));
            modeloTablaPersona.removeRow(filaSeleccionada);
            modeloTablaPersona.insertRow(filaSeleccionada, crearValoresObjetoParaFila(persona));
        } else {
            Operaciones.general.getPersonas().add(persona);
            insertarFilaEnTabla(persona);
        }
        filaSeleccionada=-1;
                  JOptionPane.showMessageDialog(null,"Ingresado correctamente");

        }catch (Exception e){
          JOptionPane.showMessageDialog(null,"Error");

        }
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        actualizarDatos();
    }//GEN-LAST:event_btnCargarActionPerformed

    private Object[] crearValoresObjetoParaFila(Persona producto) {
        return new Object[]{
            producto.getNombre(),
            producto.getSueldo(),
            producto.getAnios(),
            producto.getRango(),
            producto.getTotalBono(),
            producto.getTotal(),
            
        };
    }

    private void insertarFilaEnTabla(Persona producto) {
        modeloTablaPersona.addRow(crearValoresObjetoParaFila(producto));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
    

}
