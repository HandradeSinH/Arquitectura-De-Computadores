package gui;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import operaciones.Calculos;

/**
 *
 * @author Daniel Andrade
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setTitle("5 Por Favor");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoBox = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        numero1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        numero2 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        base = new javax.swing.JTextField();
        sumar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        resultadoBox.setEditable(false);
        resultadoBox.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(resultadoBox);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(70, 210, 200, 30);

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel1.setText("Digite la base:");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(30, 50, 160, 30);

        numero1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jScrollPane2.setViewportView(numero1);

        jPanel5.add(jScrollPane2);
        jScrollPane2.setBounds(70, 90, 200, 30);

        numero2.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jScrollPane3.setViewportView(numero2);

        jPanel5.add(jScrollPane3);
        jScrollPane3.setBounds(70, 130, 200, 30);

        jLabel2.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel2.setText("C A L C U L A D O R A");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(30, 10, 220, 40);

        base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseActionPerformed(evt);
            }
        });
        jPanel5.add(base);
        base.setBounds(200, 50, 71, 30);

        sumar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        sumar.setText("Sumar");
        sumar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });
        jPanel5.add(sumar);
        sumar.setBounds(200, 170, 70, 30);

        salir.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        salir.setText("Salir");
        salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel5.add(salir);
        salir.setBounds(220, 250, 50, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 280, 290);

        setSize(new java.awt.Dimension(295, 298));
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void baseActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {
        sumar(numero1.getText(),numero2.getText(),base.getText());
    }

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {
        salir();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField base;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane numero1;
    private javax.swing.JTextPane numero2;
    private javax.swing.JTextPane resultadoBox;
    private javax.swing.JButton salir;
    private javax.swing.JButton sumar;
    // End of variables declaration

    private void sumar(String numero1, String numero2, String base){
        int baseInt = Integer.parseInt(base);
        Calculos calc = new Calculos();
        int i=0;

        ArrayList<Integer> resultado = new ArrayList<Integer>();
        resultado = calc.sumaArrays(numero1, numero2,baseInt);
        for (Integer jose : resultado) {
            resultadoBox.setText(resultado.toString());
        }

    }
    private void salir() {
        System.exit(0);
    }

}
