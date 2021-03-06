package formularios;

import formularios.perimetro.frm_circulo_perimetro;
import formularios.perimetro.frm_cuadrado_perimetro;
import formularios.perimetro.frm_poligono_perimetro;
import formularios.perimetro.frm_rectangulo_perimetro;
import formularios.perimetro.frm_rombo_perimetro;
import formularios.perimetro.frm_trapecio_perimetro;
import formularios.perimetro.frm_triangulo_perimetro;

/**
 * IPEC Santo Domingo de Heredia
 * Informática en Desarrollo de Software
 * Proyecto Figuras Geométricas
 * Date: 2021-mar
 * @author  Jesús Alberto Moscoso Agüero
 * @author  J. Mosro - jmosro.14@gmail.com
 * @version 1
*/
public class frm_perimetro extends javax.swing.JFrame {

    frm_principal principal_formulario;
    
    public frm_perimetro(frm_principal principal) {
        principal_formulario = principal;
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
        btn_triangulo = new javax.swing.JButton();
        btn_rectangulo = new javax.swing.JButton();
        btn_rombo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_anterior = new javax.swing.JButton();
        btn_cuadrado = new javax.swing.JButton();
        btn_poligono = new javax.swing.JButton();
        btn_circulo = new javax.swing.JButton();
        btn_trapecio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Geometría");
        setBackground(new java.awt.Color(153, 153, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 153, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Perímetro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_triangulo.setBackground(new java.awt.Color(153, 153, 0));
        btn_triangulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_triangulo.setText("Triángulo");
        btn_triangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trianguloActionPerformed(evt);
            }
        });

        btn_rectangulo.setBackground(new java.awt.Color(153, 153, 0));
        btn_rectangulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_rectangulo.setText("Rectángulo");
        btn_rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rectanguloActionPerformed(evt);
            }
        });

        btn_rombo.setBackground(new java.awt.Color(153, 153, 0));
        btn_rombo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_rombo.setText("Rombo");
        btn_rombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_romboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Elegir una figura para calcular el perímetro");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btn_anterior.setBackground(new java.awt.Color(102, 102, 0));
        btn_anterior.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_anterior.setForeground(new java.awt.Color(255, 255, 255));
        btn_anterior.setText("Anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_cuadrado.setBackground(new java.awt.Color(153, 153, 0));
        btn_cuadrado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_cuadrado.setText("Cuadrado");
        btn_cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cuadradoActionPerformed(evt);
            }
        });

        btn_poligono.setBackground(new java.awt.Color(153, 153, 0));
        btn_poligono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_poligono.setText("Polígono");
        btn_poligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_poligonoActionPerformed(evt);
            }
        });

        btn_circulo.setBackground(new java.awt.Color(153, 153, 0));
        btn_circulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_circulo.setText("Círculo");
        btn_circulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_circuloActionPerformed(evt);
            }
        });

        btn_trapecio.setBackground(new java.awt.Color(153, 153, 0));
        btn_trapecio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_trapecio.setText("Trapecio");
        btn_trapecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trapecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_anterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_rectangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_rombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_triangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btn_trapecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_circulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_poligono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btn_circulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cuadrado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_poligono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_rectangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_rombo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_trapecio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_triangulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btn_anterior)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_trianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trianguloActionPerformed
        frm_triangulo_perimetro triangulo_perimetro = new frm_triangulo_perimetro(this);
        this.setVisible(false);
        triangulo_perimetro.setVisible(true);
    }//GEN-LAST:event_btn_trianguloActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        this.dispose();
        //principal_formulario.setVisible(true);
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_rectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rectanguloActionPerformed
        frm_rectangulo_perimetro rectangulo_perimetro = new frm_rectangulo_perimetro(this);
        this.setVisible(false);
        rectangulo_perimetro.setVisible(true);
    }//GEN-LAST:event_btn_rectanguloActionPerformed

    private void btn_romboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_romboActionPerformed
        frm_rombo_perimetro rombo_perimetro = new frm_rombo_perimetro(this);
        this.setVisible(false);
        rombo_perimetro.setVisible(true);
    }//GEN-LAST:event_btn_romboActionPerformed

    private void btn_cuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cuadradoActionPerformed
        frm_cuadrado_perimetro cuadrado_perimetro = new frm_cuadrado_perimetro(this);
        this.setVisible(false);
        cuadrado_perimetro.setVisible(true);
    }//GEN-LAST:event_btn_cuadradoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        principal_formulario.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btn_poligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_poligonoActionPerformed
        frm_poligono_perimetro poligono_perimetro = new frm_poligono_perimetro(this);
        this.setVisible(false);
        poligono_perimetro.setVisible(true);
    }//GEN-LAST:event_btn_poligonoActionPerformed

    private void btn_circuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_circuloActionPerformed
        frm_circulo_perimetro circulo_perimetro = new frm_circulo_perimetro(this);
        this.setVisible(false);
        circulo_perimetro.setVisible(true);
    }//GEN-LAST:event_btn_circuloActionPerformed

    private void btn_trapecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trapecioActionPerformed
        frm_trapecio_perimetro trapecio_perimetro = new frm_trapecio_perimetro(this);
        this.setVisible(false);
        trapecio_perimetro.setVisible(true);
    }//GEN-LAST:event_btn_trapecioActionPerformed

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
            java.util.logging.Logger.getLogger(frm_perimetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_perimetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_perimetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_perimetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_perimetro(new frm_principal()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_circulo;
    private javax.swing.JButton btn_cuadrado;
    private javax.swing.JButton btn_poligono;
    private javax.swing.JButton btn_rectangulo;
    private javax.swing.JButton btn_rombo;
    private javax.swing.JButton btn_trapecio;
    private javax.swing.JButton btn_triangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
