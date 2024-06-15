/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainPackage;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author avih2
 */
public class questionsMenu extends javax.swing.JFrame {
    JCheckBox[] answerBox = new JCheckBox[4];
    static ArrayList<Questions> questionsList = new ArrayList<Questions>();
    int questionNumber = 0;
    static int correctAnswers = 0;

    /**
     * Creates new form questionsMenu
     */
    public questionsMenu() {
        initComponents();
        JCheckBox[] answerBox01={answer0,answer1,answer2,answer3};
        System.arraycopy(answerBox01, 0, answerBox, 0, answerBox01.length);
        
        Questions q1 = new Questions("Major Impact","What is a major positive impact of renewable energy technologies on the environment?", new String[]{"Increased greenhouse gas emissions","Depletion of rare earth minerals","Reduction in air pollution","Increased water consumption"},2);
        Questions q2 = new Questions("E-Waste Impact","Which of the following is a significant negative impact of e-waste on the environment?", new String[]{"Improved recycling processes","Hazardous material contamination","Enhanced economic growth","Development of green technologies"},1);
        Questions q3 = new Questions("Telemedicine Impact","How has telemedicine positively impacted human health?", new String[]{"Increased electromagnetic radiation exposure","Reduced access to healthcare","Improved remote healthcare access","Increased healthcare costs"},2);
        Questions q4 = new Questions("Screen Time Impact","What is a negative health impact associated with increased screen time?", new String[]{"Enhanced mental well-being","Improved physical fitness","Increased risk of obesity","Better sleep quality"},2);
        Questions q5 = new Questions("Energy Usage Impact","Which of the following technologies helps in reducing energy consumption?", new String[]{"Traditional incandescent bulbs","LED lighting","Fossil fuel power plants","Single-use batteries"},1);
        Questions q6 = new Questions("Social Media Impact","What is a common mental health issue linked to excessive use of social media?", new String[]{"Improved social interactions","Reduced anxiety levels","Social media addiction","Enhanced physical activity"},2);
        Questions q7 = new Questions("E-Waste Mitigation","What is one effective way to mitigate e-waste?", new String[]{"Frequently replacing devices","Proper recycling of old devices","Ignoring proper disposal methods","Using single-use electronics"},1);
        Questions q8 = new Questions("Footprint Reduction","How can individuals reduce their carbon footprint with energy-efficient practices?", new String[]{"Investing in renewable energy sources","Using traditional incandescent bulbs","Leaving electronics on when not in use","Using non-rechargeable batteries"},0);
        Questions q9 = new Questions("Improving Health","What practice can improve mental and physical health related to technology use?", new String[]{"Ignoring physical activities","Increasing screen time","Reducing face-to-face interactions","Practicing digital detoxes"},3);
        Questions q10 = new Questions("Awarness of Impacts","Why is educating and advocating about the impacts of technology important?", new String[]{"It promotes sustainable practices and responsible consumption","It encourages the use of more energy","It leads to less informed decisions","It decreases awareness about recycling"},0);
        Questions q11 = new Questions("Ottawa Program","What is one of the programs in Ottawa that helps reduce landfill waste?", new String[]{"Electronic Waste Recycling Program","Canada Greener Homes Grant","Ottawa Renewable Energy Cooperative","Green Bin program"},3);
        questionsList.add(q1);
        questionsList.add(q2);
        questionsList.add(q3);
        questionsList.add(q4);
        questionsList.add(q5);
        questionsList.add(q6);
        questionsList.add(q7);
        questionsList.add(q8);
        questionsList.add(q9);
        questionsList.add(q10);
        questionsList.add(q11);
        
        
        writeScreen();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quitButton = new javax.swing.JButton();
        checkButton = new javax.swing.JButton();
        questionNumberField = new javax.swing.JLabel();
        questionTitle = new javax.swing.JLabel();
        questionText = new javax.swing.JLabel();
        answer0 = new javax.swing.JCheckBox();
        answer1 = new javax.swing.JCheckBox();
        answer2 = new javax.swing.JCheckBox();
        answer3 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        quitButton.setText("Leave Game");
        quitButton.setFocusPainted(false);
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        checkButton.setText("Check Answer");
        checkButton.setFocusPainted(false);
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        questionNumberField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        questionNumberField.setText("#0");

        questionTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        questionTitle.setText("Question Title");

        questionText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        questionText.setText("Question Text");

        answer0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        answer0.setText("Answer 0");
        answer0.setFocusPainted(false);
        answer0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer0ActionPerformed(evt);
            }
        });

        answer1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        answer1.setText("Answer 1");
        answer1.setFocusPainted(false);
        answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1ActionPerformed(evt);
            }
        });

        answer2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        answer2.setText("Answer 2");
        answer2.setFocusPainted(false);
        answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2ActionPerformed(evt);
            }
        });

        answer3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        answer3.setText("Answer 3");
        answer3.setFocusPainted(false);
        answer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("A");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("B");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("C");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("D");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(questionNumberField)
                        .addGap(18, 18, 18)
                        .addComponent(questionTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(12, 12, 12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(answer0, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                                    .addComponent(answer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(answer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(answer3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkButton)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(questionText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionNumberField)
                    .addComponent(questionTitle))
                .addGap(18, 18, 18)
                .addComponent(questionText)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
        JFrame quitConfirm = new JFrame();
        if(JOptionPane.showConfirmDialog(quitConfirm, "Are you sure you want to leave the game?", "QUIT", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            close();
            mainMenu menu = new mainMenu();
            menu.setVisible(true);
        }
    }//GEN-LAST:event_quitButtonActionPerformed

    private char answerAsLetter(int answer){
        switch(answer){
            case 0 -> {
                return 'A';
            }
            case 1 -> {
                return 'B';
            }
            case 2 -> {
                return 'C';
            }
            case 3 -> {
                return 'D';
            }
        }
        return 'A';
    }
    private boolean validAnswer() {
    int selectedCount = 0;

    for (JCheckBox item : answerBox) {
        if (item.isSelected()) {
            selectedCount++;
        }
    }
    return selectedCount == 1;
}
    private void writeScreen(){
        questionNumberField.setText("#"+ String.valueOf(questionNumber+1));
        questionTitle.setText(questionsList.get(questionNumber).getTitle());
        questionText.setText(questionsList.get(questionNumber).getQuestion());
        int index = 0;
        for(JCheckBox item : answerBox){
            item.setText(questionsList.get(questionNumber).getAnswers(index));
            index++;
        }
    }
    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed

    Questions currentQuestion = questionsList.get(questionNumber);
    
    if (validAnswer()) {
        int selectedIndex = -1;
        for (int i = 0; i < answerBox.length; i++) {
            if (answerBox[i].isSelected()) {
                selectedIndex = i;
                break;
            }
        }
        char letter = answerAsLetter(currentQuestion.getCorrectAnswer());
        if (selectedIndex != -1 && selectedIndex == currentQuestion.getCorrectAnswer()) {
            JOptionPane.showMessageDialog(this, "You are Correct, The Answer was "+letter, "CORRECT", JOptionPane.INFORMATION_MESSAGE);
            correctAnswers++;
        } else {
            JOptionPane.showMessageDialog(this, "You are Wrong, The Answer was "+letter, "INCORRECT", JOptionPane.INFORMATION_MESSAGE);
        }
        questionNumber++;
        if(questionNumber==questionsList.size()){
            close();
            finalMenu endMenu = new finalMenu();
            endMenu.setVisible(true);
        }
        else{
            for(JCheckBox item : answerBox){
                item.setSelected(false);
            }
            writeScreen();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please Select Only One Box", "INVALID", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_checkButtonActionPerformed

    private void answer0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer0ActionPerformed

    private void answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer2ActionPerformed

    private void answer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer1ActionPerformed

    private void answer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer3ActionPerformed

    public static int getCorrectAnswers(){
        return correctAnswers;
    }
    public static int getTotalAnswers(){
        return questionsList.size();
    }
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
            java.util.logging.Logger.getLogger(questionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(questionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(questionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(questionsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questionsMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox answer0;
    private javax.swing.JCheckBox answer1;
    private javax.swing.JCheckBox answer2;
    private javax.swing.JCheckBox answer3;
    private javax.swing.JButton checkButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel questionNumberField;
    private javax.swing.JLabel questionText;
    private javax.swing.JLabel questionTitle;
    private javax.swing.JButton quitButton;
    // End of variables declaration//GEN-END:variables
}