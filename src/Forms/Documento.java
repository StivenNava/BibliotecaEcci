package Forms;

import Conexion.CrudDocumentos;
import Modelo.ModelDocumento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTACION
 */
public class Documento extends javax.swing.JFrame {

    /**
     * Creates new form Documento
     */
    public Documento() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        TxtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtTipoD = new javax.swing.JTextField();
        TxtColeccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtAA1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtPrograma = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtCA1 = new javax.swing.JTextField();
        TxtNA1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxtAA2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TxtAI = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtCA2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TxtAA3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtNA3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TxtCA3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TxtNA2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TxtAE = new javax.swing.JTextField();
        TxtCI = new javax.swing.JTextField();
        TxtCE = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cboyear = new javax.swing.JComboBox<>();
        cbodia = new javax.swing.JComboBox<>();
        cbomes = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 190, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar nuevo documento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Titulo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de documento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 30));

        TxtTipoD.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtTipoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 190, -1));

        TxtColeccion.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtColeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 190, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Colección:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 30));

        TxtAA1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtAA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 190, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido Autor1:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, 30));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, 30));

        TxtPrograma.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        TxtPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProgramaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 190, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Programa:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 30));

        TxtCA1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtCA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 190, -1));

        TxtNA1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtNA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 190, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre Autor1:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, -1, 30));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Código Autor1:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, 30));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Conclusion Español");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, 30));

        TxtAA2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtAA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 190, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre Autor2:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, 30));

        TxtAI.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtAI, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 190, 70));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Código Autor2:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, -1, 30));

        TxtCA2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtCA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 190, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Apellido Autor3:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, 30));

        TxtAA3.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtAA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 190, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nombre Autor3:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, 30));

        TxtNA3.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtNA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 190, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Código Autor3:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, -1, 30));

        TxtCA3.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtCA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 520, 190, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Abstract Español:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, 30));

        TxtNA2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtNA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 190, -1));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Abstract Ingles:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, 30));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Apellido Autor2:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, 30));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Conclusion Ingles");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, -1, 30));

        TxtAE.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 190, 60));

        TxtCI.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 200, 60));

        TxtCE.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jPanel1.add(TxtCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 190, 80));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 150, 40));

        cboyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
        jPanel1.add(cboyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, 30));

        cbodia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cbodia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 60, 30));

        cbomes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC" }));
        jPanel1.add(cbomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, 30));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setText("Atrás");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inbox.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 100, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1bd3c7620a4e775dab0c2b0155b5c048.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProgramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProgramaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String fecha = (String)cboyear.getSelectedItem()+"-"+(String)cbomes.getSelectedItem()+"-"+(String)cbodia.getSelectedItem();
        ModelDocumento dts = new ModelDocumento();
        CrudDocumentos func = new CrudDocumentos();
        Boolean response = false;
                
        dts.setTitulo(TxtTitulo.getText());
        dts.setTipodeDocumento(TxtTipoD.getText());
        dts.setColeccion(TxtColeccion.getText());
        dts.setPrograma(TxtPrograma.getText());
        dts.setFecha(fecha);
        dts.setApellidoAutor1(TxtAA1.getText());
        dts.setNombreAutor1(TxtNA1.getText());
        dts.setCodigoAutor1(TxtCA1.getText());
        dts.setApellidoAutor2(TxtAA2.getText());
        dts.setNombreAutor2(TxtNA2.getText());
        dts.setCodigoAutor2(TxtCA2.getText());
        dts.setApellidoAutor3(TxtAA3.getText());
        dts.setNombreAutor3(TxtNA3.getText());
        dts.setCodigoAutor3(TxtCA3.getText());
        dts.setAbstractEspanol(TxtAE.getText());
        dts.setAbstractIngles(TxtAI.getText());
        dts.setConclusionEspanol(TxtCE.getText());
        dts.setConclusionIngles(TxtCI.getText());
       
        response = func.CrearDocumento(dts);
        
        if(response){
            System.out.println("Documento creado correctamente");
        }
        else{
            System.out.println("Error en la cración del Documento");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        TxtAA1.setText("");
        TxtAA2.setText("");
        TxtAA3.setText("");
        TxtAE.setText("");
        TxtAI.setText("");
        TxtCA1.setText("");
        TxtCA2.setText("");
        TxtCA3.setText("");
        TxtCE.setText("");
        TxtCI.setText("");
        TxtColeccion.setText("");
        TxtNA1.setText("");
        TxtNA2.setText("");
        TxtNA3.setText("");
        TxtPrograma.setText("");
        TxtTipoD.setText("");
        TxtTitulo.setText("");
        
            
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Solicitud obj = new Solicitud();
    obj.setVisible(true);
    dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Documento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Documento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAA1;
    private javax.swing.JTextField TxtAA2;
    private javax.swing.JTextField TxtAA3;
    private javax.swing.JTextField TxtAE;
    private javax.swing.JTextField TxtAI;
    private javax.swing.JTextField TxtCA1;
    private javax.swing.JTextField TxtCA2;
    private javax.swing.JTextField TxtCA3;
    private javax.swing.JTextField TxtCE;
    private javax.swing.JTextField TxtCI;
    private javax.swing.JTextField TxtColeccion;
    private javax.swing.JTextField TxtNA1;
    private javax.swing.JTextField TxtNA2;
    private javax.swing.JTextField TxtNA3;
    private javax.swing.JTextField TxtPrograma;
    private javax.swing.JTextField TxtTipoD;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JComboBox<String> cbodia;
    private javax.swing.JComboBox<String> cbomes;
    private javax.swing.JComboBox<String> cboyear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
