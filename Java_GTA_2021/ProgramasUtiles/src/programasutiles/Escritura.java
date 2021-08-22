package programasutiles;

/**
 * IPEC Santo Domingo de Heredia
 * Informática en Desarrollo de Software
 * Proyecto Programas Útiles
 * Date: 2021-mar-15
 * @author  Jesús Alberto Moscoso Agüero
 * @author  J. Mosro - jmosro.14@gmail.com
 * @version 1
*/
public class Escritura extends javax.swing.JFrame {

    MenuPrincipal menu;
    
    public Escritura(MenuPrincipal menu) {
        this.menu = menu;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtf_numero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_escritura = new javax.swing.JTextField();
        limpiar = new javax.swing.JButton();
        anterior = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escritura");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Escritura de un número...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Ingrese un número entre 0 y 99");

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Número:");

        jtf_numero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtf_numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_numeroKeyReleased(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Escritura:");

        jtf_escritura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_escrituraActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(0, 102, 102));
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        anterior.setBackground(new java.awt.Color(0, 102, 102));
        anterior.setForeground(new java.awt.Color(255, 255, 255));
        anterior.setText("Anterior");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(limpiar))
                            .addComponent(jtf_escritura, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_escritura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(anterior)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_anteriorActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        jtf_numero.setText("");
        jtf_escritura.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void jtf_numeroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_numeroKeyReleased
        String texto = jtf_numero.getText();
        String escritura = "";
        try {
            if(texto.isEmpty()) {
                jtf_escritura.setText("Ingresar un numero entre 0 y 99");
            } else if(Integer.parseInt(texto) >= 0 && Integer.parseInt(texto) <= 99) {  
                int numero = Integer.parseInt(texto);
                jtf_numero.setText(String.valueOf(numero)); // quitar los 0 de la izquierda del número
                texto = String.valueOf(numero);
                if(texto.length()==1) {
                   switch(texto.substring(0,1)) {
                       case "0": escritura += "Cero"; break;
                       case "1": escritura += "Uno"; break;
                       case "2": escritura += "Dos"; break;
                       case "3": escritura += "Tres"; break;
                       case "4": escritura += "Cuatro"; break;
                       case "5": escritura += "Cinco"; break;
                       case "6": escritura += "Seis"; break;
                       case "7": escritura += "Siete"; break;
                       case "8": escritura += "Ocho"; break;
                       case "9": escritura += "Nueve"; break;
                   }
                }
                else if(texto.substring(0, 1).equals("1")) {
                    switch(texto.substring(1,2)) {
                            case "0": escritura += "Diez"; break;
                            case "1": escritura += "Once"; break;
                            case "2": escritura += "Doce"; break;
                            case "3": escritura += "Trece"; break;
                            case "4": escritura += "Catorce"; break;
                            case "5": escritura += "Quince"; break;
                            case "6": escritura += "Diesciseis"; break;
                            case "7": escritura += "Diescisiete"; break;
                            case "8": escritura += "Diesciocho"; break;
                            case "9": escritura += "Diescinueve"; break;
                    }
                }
                else if(texto.substring(0, 1).equals("2") && texto.substring(1,2).equals("0"))
                    escritura = "Veinte";
                else if(texto.substring(0, 1).equals("2") && !texto.substring(1,2).equals("0"))
                    escritura = "Veinti";
                else if(texto.substring(0, 1).equals("3")) escritura += "Treinta";
                else if(texto.substring(0, 1).equals("4")) escritura += "Cuarenta";
                else if(texto.substring(0, 1).equals("5")) escritura += "Cincuenta";
                else if(texto.substring(0, 1).equals("6")) escritura += "Sesenta";
                else if(texto.substring(0, 1).equals("7")) escritura += "Setenta";
                else if(texto.substring(0, 1).equals("8")) escritura += "Ochenta";
                else if(texto.substring(0, 1).equals("9")) escritura += "Noventa";
                
                if(texto.length()==2 && !texto.substring(0, 1).equals("1") &&
                   !texto.substring(0, 1).equals("2") && !texto.substring(1,2).equals("0"))
                    escritura += " y ";
                    
                
               // Agregar la parte de las unidades cuando son 2 cifras
               if(texto.length()==2 && !texto.substring(0, 1).equals("1") && !texto.substring(1,2).equals("0")) {
                   switch(texto.substring(1,2)) {
                       case "1": escritura += "uno"; break;
                       case "2": escritura += "dos"; break;
                       case "3": escritura += "tres"; break;
                       case "4": escritura += "cuatro"; break;
                       case "5": escritura += "cinco"; break;
                       case "6": escritura += "seis"; break;
                       case "7": escritura += "siete"; break;
                       case "8": escritura += "ocho"; break;
                       case "9": escritura += "nueve"; break;
                   }
               }
               jtf_escritura.setText(escritura);
            } else if(Integer.parseInt(texto) < 0) {
                jtf_escritura.setText("Debe ser un número positivo.");
            } else if(Integer.parseInt(texto) > 99) {
                jtf_escritura.setText("Debe ser un número menor o igual a 99");
            }
        } catch(NumberFormatException ex) {
            jtf_escritura.setText("Formato incorrecto.");
        }
    }//GEN-LAST:event_jtf_numeroKeyReleased

    private void jtf_escrituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_escrituraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_escrituraActionPerformed

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
            java.util.logging.Logger.getLogger(Escritura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritura(new MenuPrincipal()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtf_escritura;
    private javax.swing.JTextField jtf_numero;
    private javax.swing.JButton limpiar;
    // End of variables declaration//GEN-END:variables
}