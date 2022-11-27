
package Vista;
import Controlador.Contar;
import static Controlador.Contar.arreglo;
import com.google.gson.Gson;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class View extends javax.swing.JFrame {
    DefaultTableModel modelo;
    int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados"));
      Contar obj = new Contar(valor);
    public View() {
        initComponents();
        setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Años");
        modelo.addColumn("Rango");
        modelo.addColumn("Bono");
        modelo.addColumn("Total");
        
        this.tblDatos.setModel(modelo);
        btnVer.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnIngresarBolsa1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnVer = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.darkGray);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Sueldo:");

        jLabel3.setText("Fecha de Ingreso:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        btnIngresarBolsa1.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresarBolsa1.setText("Ingresar");
        btnIngresarBolsa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarBolsa1ActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblDatos);

        btnVer.setText("Ver");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIngresarBolsa1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(txtFecha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCargar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarBolsa1)
                    .addComponent(btnVer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed
private int contador= 0 ;

    private void btnIngresarBolsa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarBolsa1ActionPerformed
        
        try {
        obj.Ingresar();
        txtFecha.setText("");
        txtSueldo.setText("");
        txtNombre.setText("");
        contador++;
        if (contador == Contar.arreglo.length) {
            btnVer.setVisible(true);
        }
        JOptionPane.showMessageDialog(null,"Ingresado correctamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR");
            
        }

        
        
        
        
        
        
        
    }//GEN-LAST:event_btnIngresarBolsa1ActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        Contar.fechaAnios(txtFecha.getText());
        Contar.ver();
    String []info=new String[6];

        for (int i = 0; i < Contar.arreglo.length; i++) {
            
            info[0]=Contar.arreglo[i].getNombre();
            info[1]=String.valueOf(Contar.arreglo[i].getSueldo());
            info[2]=String.valueOf(Contar.arreglo[i].getAnios());
            info[3]=String.valueOf(Contar.arreglo[i].getRango());
            info[4]=String.valueOf(Contar.arreglo[i].getDescuento()+("(")+Contar.arreglo[i].getDesc())+("%)");
            info[5]=String.valueOf(Contar.arreglo[i].getTotal());
            modelo.addRow(info);
            
        }
        
        btnVer.setVisible(false);
            
        
        
        
        
            
            
        
        
        
        
        
         
    }//GEN-LAST:event_btnVerActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
    }//GEN-LAST:event_txtSueldoActionPerformed
 public static void escribir(){
        Gson gson = new Gson();
        for (int i = 0; i < arreglo.length; i++) {
          String json = gson.toJson(arreglo[i]);
           System.out.println(json);
           
             
    }}
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
             escribir();
       
            int a = modelo.getRowCount()-1;
            for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
            }
            JOptionPane.showMessageDialog(null,"Guardado correctamente");
        } catch (Exception e) {
                        JOptionPane.showMessageDialog(null,"Error");

        }
        
        
        

       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        //Cont.Leer();
        System.out.println("sii");
        Contar.fechaAnios(txtFecha.getText());
        Contar.ver();
        
        String []info=new String[6];

        for (int i = 0; i < Contar.arreglo.length; i++) {
            
            info[0]=Contar.arreglo[i].getNombre();
            info[1]=String.valueOf(Contar.arreglo[i].getSueldo());
            info[2]=String.valueOf(Contar.arreglo[i].getAnios());
            info[3]=String.valueOf(Contar.arreglo[i].getRango());
            info[4]=String.valueOf(Contar.arreglo[i].getDescuento()+("(")+Contar.arreglo[i].getDesc())+("%)");
            info[5]=String.valueOf(Contar.arreglo[i].getTotal());
            modelo.addRow(info);
            
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIngresarBolsa1;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tblDatos;
    public static javax.swing.JTextField txtFecha;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables

    public static <E> E deserializarObjeto(String direccionArchivo, Class<E> claseObjetivo) {
        E objeto = null;
        try (FileInputStream fis = new FileInputStream(direccionArchivo);
                ObjectInputStream entrada = new ObjectInputStream(fis);) {
            objeto = (E) entrada.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objeto;
    }


}
