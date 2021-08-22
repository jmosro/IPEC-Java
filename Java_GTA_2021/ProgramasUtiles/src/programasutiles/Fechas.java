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
public class Fechas extends javax.swing.JFrame {

    MenuPrincipal menu;
    int inicial_dia, inicial_mes, inicial_annio;
    int final_dia, final_mes, final_annio;
    int cantidad_dias;
    
    public Fechas(MenuPrincipal menu) {
        this.menu = menu;
        initComponents();
    }

    private boolean validacion() {
         // Inicial día
        try {
            if(jtf_inicial_dia.getText().isEmpty()) {
                jtf_cantidad_dias.setText("Fecha inicial día, no debe ser vacío");
                return false;
            }
            inicial_dia = Integer.parseInt(jtf_inicial_dia.getText());
            if(inicial_dia < 0) {
                jtf_cantidad_dias.setText("Fecha inicial día, debe ser número positivo."); return false;
            } else if(inicial_dia == 0) {
                jtf_cantidad_dias.setText("Fecha inicial día, no debe ser 0."); return false;
            } else if(inicial_dia > 31) {
                jtf_cantidad_dias.setText("Fecha inicial día, debe tener valor entre 1 y 31."); return false;
            }
        } catch(NumberFormatException ex) {
            jtf_cantidad_dias.setText("Fecha inicial día, con formato de número incorrecto."); return false;
        }
        // Inicial mes
        try {
            if(jtf_inicial_mes.getText().isEmpty()) {
                jtf_cantidad_dias.setText("Fecha inicial mes, no debe ser vacío");
                return false;
            }
            inicial_mes = Integer.parseInt(jtf_inicial_mes.getText());
            if(inicial_mes < 0) {
                jtf_cantidad_dias.setText("Fecha inicial mes, debe ser número positivo."); return false;
            } else if(inicial_mes == 0) {
                jtf_cantidad_dias.setText("Fecha inicial mes, no debe ser 0."); return false;
            } else if(inicial_mes > 12) {
                jtf_cantidad_dias.setText("Fecha inicial mes, debe tener valor entre 1 y 12."); return false;
            }
        } catch(NumberFormatException ex) {
            jtf_cantidad_dias.setText("Fecha inicial mes, con formato de número incorrecto."); return false;
        }
        // Inicial Año
        try {
            if(jtf_inicial_annio.getText().isEmpty()) {
                jtf_cantidad_dias.setText("Fecha inicial año, no debe ser vacío");
                return false;
            }
            inicial_annio = Integer.parseInt(jtf_inicial_annio.getText());
            if(inicial_annio < 0) {
                jtf_cantidad_dias.setText("Fecha inicial año, debe ser número positivo."); return false;
            } else if(inicial_annio == 0) {
                jtf_cantidad_dias.setText("Fecha inicial año, no debe ser 0."); return false;
            }
        } catch(NumberFormatException ex) {
            jtf_cantidad_dias.setText("Fecha inicial año, con formato de número incorrecto."); return false;
        }
        // Final día
        try {
            if(jtf_final_dia.getText().isEmpty()) {
                jtf_cantidad_dias.setText("Fecha final día, no debe ser vacío");
                return false;
            } 
            final_dia = Integer.parseInt(jtf_final_dia.getText());
            if(final_dia < 0) {
                jtf_cantidad_dias.setText("Fecha final día, debe ser número positivo."); return false;
            } else if(final_dia == 0) {
                jtf_cantidad_dias.setText("Fecha final día, no debe ser 0."); return false;
            } else if(final_dia > 31) {
                jtf_cantidad_dias.setText("Fecha final día, debe tener valor entre 1 y 31."); return false;
            }
        } catch(NumberFormatException ex) {
            jtf_cantidad_dias.setText("Fecha final día, con formato de número incorrecto."); return false;
        }
        // Final mes
        try {
            if(jtf_final_mes.getText().isEmpty()) {
                jtf_cantidad_dias.setText("Fecha final mes, no debe ser vacío");
                return false;
            }
            final_mes = Integer.parseInt(jtf_final_mes.getText());
            if(final_mes < 0) {
                jtf_cantidad_dias.setText("Fecha final mes, debe ser número positivo."); return false;
            } else if(final_mes == 0) {
                jtf_cantidad_dias.setText("Fecha final mes, no debe ser 0."); return false;
            } else if(final_mes > 12) {
                jtf_cantidad_dias.setText("Fecha final mes, debe tener valor entre 1 y 12."); return false;
            }
        } catch(NumberFormatException ex) {
            jtf_cantidad_dias.setText("Fecha final mes, con formato de número incorrecto."); return false;
        }
        // Final año
        try {
            if(jtf_final_annio.getText().isEmpty()) {
                jtf_cantidad_dias.setText("Fecha final año, no debe ser vacío");
                return false;
            }
            final_annio = Integer.parseInt(jtf_final_annio.getText());
            if(final_annio < 0) {
                jtf_cantidad_dias.setText("Fecha final año, debe ser número positivo."); return false;
            } else if(final_annio == 0) {
                jtf_cantidad_dias.setText("Fecha final año, no debe ser 0."); return false;
            }
        } catch(NumberFormatException ex) {
            jtf_cantidad_dias.setText("Fecha final año, con formato de número incorrecto."); return false;
        }
        
        return true;
    }
    
    private void calcularDias() {
        if(validacion()) {
            cantidad_dias = 0;
            // Diferencia de años
            int dif_annios = Math.abs(inicial_annio - final_annio);
            cantidad_dias += dif_annios * 360;
            // Diferencia de meses
            int dif_meses = Math.abs(inicial_mes - final_mes);
            cantidad_dias += dif_meses * 30;
            // Diferencia de dias
            if(inicial_dia == 31) inicial_dia = 30;
            if(final_dia == 31) final_dia = 30;
            int dif_dias = Math.abs(inicial_dia - final_dia);
            cantidad_dias += dif_dias;
            
            if(cantidad_dias == 0) jtf_cantidad_dias.setText("0 día. Nota: Es la misma fecha de inicio y final.");
            else if(cantidad_dias == 1) jtf_cantidad_dias.setText(cantidad_dias + " día.");
            else jtf_cantidad_dias.setText(cantidad_dias + " días. " +
                "Días (" + (cantidad_dias % 30) + 
                ") Meses (" + ((cantidad_dias/30)%12) +
                ") Años (" + ((cantidad_dias/30/12)%360) + ")");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jtf_cantidad_dias = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtf_inicial_dia = new javax.swing.JTextField();
        jtf_inicial_mes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtf_inicial_annio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jtf_final_dia = new javax.swing.JTextField();
        jtf_final_mes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtf_final_annio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escritura");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Días entre fechas ...");

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
        jLabel2.setText("<html>Ingrese 2 fechas para calcular los días entre fechas.<br>* Tiempo comercial (Meses de 30 días). No Incluye el último día.</html>");

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

        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Días:");

        jtf_cantidad_dias.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtf_cantidad_dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_cantidad_diasActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha inicial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));

        jLabel3.setText("Día:");

        jtf_inicial_dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_inicial_diaKeyReleased(evt);
            }
        });

        jtf_inicial_mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_inicial_mesKeyReleased(evt);
            }
        });

        jLabel4.setText("Mes:");

        jtf_inicial_annio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_inicial_annioKeyReleased(evt);
            }
        });

        jLabel5.setText("Año:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_inicial_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_inicial_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_inicial_annio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jtf_inicial_annio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtf_inicial_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jtf_inicial_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha final", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 102, 102));

        jLabel6.setText("Día:");

        jtf_final_dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_final_diaKeyReleased(evt);
            }
        });

        jtf_final_mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_final_mesKeyReleased(evt);
            }
        });

        jLabel7.setText("Mes:");

        jtf_final_annio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_final_annioKeyReleased(evt);
            }
        });

        jLabel8.setText("Año:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_final_dia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_final_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_final_annio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_final_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_final_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_final_annio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_cantidad_dias, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(limpiar)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(limpiar)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtf_cantidad_dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(anterior)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_anteriorActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        jtf_inicial_dia.setText("");
        jtf_inicial_mes.setText("");
        jtf_inicial_annio.setText("");
        jtf_final_dia.setText("");
        jtf_final_mes.setText("");
        jtf_final_annio.setText("");
        jtf_cantidad_dias.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void jtf_cantidad_diasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_cantidad_diasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_cantidad_diasActionPerformed

    private void jtf_inicial_diaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_inicial_diaKeyReleased
        calcularDias();
    }//GEN-LAST:event_jtf_inicial_diaKeyReleased

    private void jtf_inicial_mesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_inicial_mesKeyReleased
        calcularDias();
    }//GEN-LAST:event_jtf_inicial_mesKeyReleased

    private void jtf_inicial_annioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_inicial_annioKeyReleased
        calcularDias();
    }//GEN-LAST:event_jtf_inicial_annioKeyReleased

    private void jtf_final_diaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_final_diaKeyReleased
        calcularDias();
    }//GEN-LAST:event_jtf_final_diaKeyReleased

    private void jtf_final_mesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_final_mesKeyReleased
        calcularDias();
    }//GEN-LAST:event_jtf_final_mesKeyReleased

    private void jtf_final_annioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_final_annioKeyReleased
        calcularDias();
    }//GEN-LAST:event_jtf_final_annioKeyReleased

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
            java.util.logging.Logger.getLogger(Fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fechas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fechas(new MenuPrincipal()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jtf_cantidad_dias;
    private javax.swing.JTextField jtf_final_annio;
    private javax.swing.JTextField jtf_final_dia;
    private javax.swing.JTextField jtf_final_mes;
    private javax.swing.JTextField jtf_inicial_annio;
    private javax.swing.JTextField jtf_inicial_dia;
    private javax.swing.JTextField jtf_inicial_mes;
    private javax.swing.JButton limpiar;
    // End of variables declaration//GEN-END:variables
}
