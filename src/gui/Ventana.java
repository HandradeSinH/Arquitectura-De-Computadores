/*
 * Created by JFormDesigner on Sat Sep 16 15:57:19 COT 2023
 */

package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author Daniel Andrade
 */
public class Ventana extends JPanel {
    public Ventana() {
        initComponents();
    }

    private void igualSuma(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Daniel Alejandro Andrade Rodriguez
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        textField1 = new JTextField();
        label5 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        label6 = new JLabel();
        textField4 = new JTextField();
        igualSuma = new JButton();
        textField5 = new JTextField();
        button2 = new JButton();
        textField6 = new JTextField();
        textField7 = new JTextField();
        textField8 = new JTextField();
        label7 = new JLabel();
        textField9 = new JTextField();
        button3 = new JButton();
        textField10 = new JTextField();
        textField11 = new JTextField();
        textField12 = new JTextField();
        label8 = new JLabel();
        label9 = new JLabel();
        textField13 = new JTextField();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing
        . border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder
        . CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .
        awt . Font. BOLD ,12 ) ,java . awt. Color .red ) , getBorder () ) )
        ;  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e
        ) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } )
        ;

        //---- label1 ----
        label1.setText("Calculadora");
        label1.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 24));

        //---- label2 ----
        label2.setText("Sumar");
        label2.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));

        //---- label3 ----
        label3.setText("Restar");
        label3.setFont(new Font("JetBrains Mono Light", Font.BOLD, 16));

        //---- label4 ----
        label4.setText("Converciones");
        label4.setFont(new Font("JetBrains Mono Light", Font.BOLD, 16));

        //---- textField1 ----
        textField1.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField1.setHorizontalAlignment(SwingConstants.CENTER);
        textField1.setBorder(new LineBorder(Color.lightGray));

        //---- label5 ----
        label5.setText("Base");
        label5.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));

        //---- textField2 ----
        textField2.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField2.setHorizontalAlignment(SwingConstants.RIGHT);
        textField2.setBorder(new LineBorder(Color.lightGray));

        //---- textField3 ----
        textField3.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField3.setHorizontalAlignment(SwingConstants.RIGHT);
        textField3.setBorder(new LineBorder(Color.lightGray));

        //---- label6 ----
        label6.setText("+");
        label6.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 15));
        label6.setHorizontalAlignment(SwingConstants.CENTER);

        //---- textField4 ----
        textField4.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField4.setHorizontalAlignment(SwingConstants.RIGHT);
        textField4.setBorder(new LineBorder(Color.lightGray));
        textField4.setEditable(false);

        //---- igualSuma ----
        igualSuma.setText("=");
        igualSuma.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 15));
        igualSuma.addActionListener(e -> igualSuma(e));

        //---- textField5 ----
        textField5.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField5.setHorizontalAlignment(SwingConstants.RIGHT);
        textField5.setBorder(new LineBorder(Color.lightGray));
        textField5.setEditable(false);

        //---- button2 ----
        button2.setText("=");
        button2.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 15));

        //---- textField6 ----
        textField6.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField6.setHorizontalAlignment(SwingConstants.RIGHT);
        textField6.setBorder(new LineBorder(Color.lightGray));

        //---- textField7 ----
        textField7.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField7.setHorizontalAlignment(SwingConstants.RIGHT);
        textField7.setBorder(new LineBorder(Color.lightGray));

        //---- textField8 ----
        textField8.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField8.setHorizontalAlignment(SwingConstants.CENTER);
        textField8.setBorder(new LineBorder(Color.lightGray));

        //---- label7 ----
        label7.setText("Base");
        label7.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));

        //---- textField9 ----
        textField9.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField9.setHorizontalAlignment(SwingConstants.RIGHT);
        textField9.setBorder(new LineBorder(Color.lightGray));
        textField9.setEditable(false);

        //---- button3 ----
        button3.setText("=");
        button3.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 15));

        //---- textField10 ----
        textField10.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField10.setHorizontalAlignment(SwingConstants.RIGHT);
        textField10.setBorder(new LineBorder(Color.lightGray));

        //---- textField11 ----
        textField11.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField11.setHorizontalAlignment(SwingConstants.RIGHT);
        textField11.setBorder(new LineBorder(Color.lightGray));

        //---- textField12 ----
        textField12.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField12.setHorizontalAlignment(SwingConstants.CENTER);
        textField12.setBorder(new LineBorder(Color.lightGray));

        //---- label8 ----
        label8.setText("Base");
        label8.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));

        //---- label9 ----
        label9.setText("a Base");
        label9.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));

        //---- textField13 ----
        textField13.setFont(new Font("JetBrains Mono Light", Font.BOLD | Font.ITALIC, 16));
        textField13.setHorizontalAlignment(SwingConstants.CENTER);
        textField13.setBorder(new LineBorder(Color.lightGray));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                .addComponent(textField2, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(textField4, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addComponent(igualSuma)
                                .addComponent(textField3, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                            .addGap(46, 46, 46))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label2)
                            .addGap(164, 164, 164)))
                    .addGroup(layout.createParallelGroup()
                        .addComponent(label3)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label7)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textField8, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                            .addComponent(textField7, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField6, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(button2))
                            .addComponent(textField5, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(label4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(textField9, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label8)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textField12, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(142, 142, 142)
                                        .addComponent(button3))
                                    .addComponent(textField11, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(textField10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label9)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textField13, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))))
                    .addContainerGap(70, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(label3)
                        .addComponent(label4))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(igualSuma)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addComponent(textField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(textField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(button2)
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addComponent(textField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label9, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(button3)))
                    .addContainerGap(30, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Daniel Alejandro Andrade Rodriguez
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField1;
    private JLabel label5;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label6;
    private JTextField textField4;
    private JButton igualSuma;
    private JTextField textField5;
    private JButton button2;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JLabel label7;
    private JTextField textField9;
    private JButton button3;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JLabel label8;
    private JLabel label9;
    private JTextField textField13;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
