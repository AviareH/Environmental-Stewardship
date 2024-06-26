/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainPackage;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import javax.swing.plaf.basic.BasicTextAreaUI;

/**
 *
 * @author avih2
 */
public class infoMenu extends javax.swing.JFrame {

    /**
     * Creates new form infoMenu
     */
    public infoMenu() {
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

        goButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        titleField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        goButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        goButton.setText("Next");
        goButton.setFocusPainted(false);
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        returnButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnButton.setText("Return");
        returnButton.setFocusPainted(false);
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        titleField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titleField.setText(" Impacts of Technology");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Technology has significant impacts on the environment and human health, both positive and negative. Renewable energy technologies like solar panels and wind turbines reduce reliance on fossil fuels, lowering greenhouse gas emissions and air pollution. Energy-efficient solutions such as smart grids and LED lighting also reduce energy consumption. Pollution monitoring technologies, like air quality sensors and water purification systems, help manage and reduce environmental contamination. In agriculture, precision and vertical farming promote sustainable practices, optimizing crop yields and reducing waste. However, technology also brings environmental challenges. E-waste, with its hazardous materials, poses a significant problem due to improper disposal. The manufacturing of electronic devices depletes rare earth minerals and consumes large amounts of water and energy. Data centers contribute to pollution and greenhouse gas emissions due to their high energy demands. Additionally, infrastructure development for technology can lead to habitat destruction, affecting biodiversity. On the health front, technology has revolutionized healthcare. Telemedicine allows remote consultations, improving access to healthcare, particularly in remote areas. Wearable health devices monitor vital signs, enabling early detection of health issues. Imaging technologies like MRI and CT scans enhance diagnostics and treatments, while personalized medicine tailors treatments to individual patients. Mobile health apps and online communities increase health awareness, empowering individuals to manage their health better. Electronic Health Records (EHR) and remote monitoring systems streamline patient information management and reduce the need for frequent hospital visits. Despite these benefits, technology can negatively affect health. Mobile phones and wireless networks raise concerns about electromagnetic radiation exposure. Increased screen time contributes to a sedentary lifestyle, leading to obesity and related diseases. Excessive social media use can lead to mental health issues like anxiety, depression, and social media addiction. Blue light from screens can disrupt sleep patterns, causing sleep disorders.  In conclusion, technology profoundly impacts the environment and human health, offering benefits and challenges.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 760, Short.MAX_VALUE)
                        .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleField))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleField)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goButton)
                    .addComponent(returnButton))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed
        // TODO add your handling code here:
        close();
        infoMenu1 info = new infoMenu1();
        info.setVisible(true);
    }//GEN-LAST:event_goButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // TODO add your handling code here:
        close();
        mainMenu menu = new mainMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(infoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(infoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(infoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(infoMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new infoMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel titleField;
    // End of variables declaration//GEN-END:variables
}
