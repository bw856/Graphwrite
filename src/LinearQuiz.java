/*
 May 29, 2019
 Graphwrite - Linear Quiz
*/

import java.awt.Color;

public class LinearQuiz extends javax.swing.JFrame {

            int score = 0; // global score variable
            
    public LinearQuiz() {
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

        Q1 = new javax.swing.ButtonGroup();
        Q2 = new javax.swing.ButtonGroup();
        Q3 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        txtScore = new javax.swing.JTextField();
        lblScore = new javax.swing.JLabel();
        lblQuestion1 = new javax.swing.JLabel();
        scpQuestion1 = new javax.swing.JScrollPane();
        txtQuestion1 = new javax.swing.JTextArea();
        Q1A1 = new javax.swing.JRadioButton();
        Q1A2 = new javax.swing.JRadioButton();
        Q1A3 = new javax.swing.JRadioButton();
        Q1A4 = new javax.swing.JRadioButton();
        lblQuestion2 = new javax.swing.JLabel();
        scpQuestion2 = new javax.swing.JScrollPane();
        txtQuestion2 = new javax.swing.JTextArea();
        Q2A1 = new javax.swing.JRadioButton();
        Q2A2 = new javax.swing.JRadioButton();
        Q2A3 = new javax.swing.JRadioButton();
        Q2A4 = new javax.swing.JRadioButton();
        lblQuestion3 = new javax.swing.JLabel();
        scpQuestion3 = new javax.swing.JScrollPane();
        txtQuestion3 = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        Q3A1 = new javax.swing.JRadioButton();
        Q3A2 = new javax.swing.JRadioButton();
        Q3A3 = new javax.swing.JRadioButton();
        Q3A4 = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        Q1Answer = new javax.swing.JLabel();
        Q2Answer = new javax.swing.JLabel();
        Q3Answer = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblTitle.setText("Linear Function QUIZ");

        txtScore.setEditable(false);
        txtScore.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtScore.setText("   /3");

        lblScore.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        lblScore.setText("Score");

        lblQuestion1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lblQuestion1.setText("Question 1:");

        txtQuestion1.setEditable(false);
        txtQuestion1.setColumns(20);
        txtQuestion1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtQuestion1.setRows(5);
        txtQuestion1.setText("Which of the following equations in slope-intercept form are correct given\nthe slope m=1/2 and point (6, 5).");
        scpQuestion1.setViewportView(txtQuestion1);

        Q1.add(Q1A1);
        Q1A1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q1A1.setText(" y = 1/2x + 2");

        Q1.add(Q1A2);
        Q1A2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q1A2.setText("y = 1/2x - 1");

        Q1.add(Q1A3);
        Q1A3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q1A3.setText("y = 2x + 1");

        Q1.add(Q1A4);
        Q1A4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q1A4.setText("y = 2x + 2");

        lblQuestion2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lblQuestion2.setText("Question 2:");

        txtQuestion2.setEditable(false);
        txtQuestion2.setColumns(20);
        txtQuestion2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtQuestion2.setRows(5);
        txtQuestion2.setText("What is the slope of y=1/3x -4?");
        scpQuestion2.setViewportView(txtQuestion2);

        Q2.add(Q2A1);
        Q2A1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q2A1.setText("-1/3");

        Q2.add(Q2A2);
        Q2A2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q2A2.setText("1/3");

        Q2.add(Q2A3);
        Q2A3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q2A3.setText("3");

        Q2.add(Q2A4);
        Q2A4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q2A4.setText("4");

        lblQuestion3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        lblQuestion3.setText("Question 3:");

        txtQuestion3.setEditable(false);
        txtQuestion3.setColumns(20);
        txtQuestion3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtQuestion3.setRows(5);
        txtQuestion3.setText("Write the equation for the problem:  \nA plumber charges $50 for a house call plus $12 per hour for labor.");
        scpQuestion3.setViewportView(txtQuestion3);

        btnSubmit.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        Q3.add(Q3A1);
        Q3A1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q3A1.setText("y = 50x + 12");

        Q3.add(Q3A2);
        Q3A2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q3A2.setText("y = 50 + 12x");

        Q3.add(Q3A3);
        Q3A3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q3A3.setText("y = 62x");

        Q3.add(Q3A4);
        Q3A4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Q3A4.setText("y = 50 + 12y");

        btnBack.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        Q1Answer.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        Q2Answer.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        Q3Answer.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        btnReset.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setEnabled(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scpQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuestion1)
                                .addGap(18, 18, 18)
                                .addComponent(Q1Answer))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuestion2)
                                .addGap(18, 18, 18)
                                .addComponent(Q2Answer))
                            .addComponent(scpQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scpQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuestion3)
                                .addGap(18, 18, 18)
                                .addComponent(Q3Answer))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(Q2A1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Q2A2)
                                .addGap(61, 61, 61)
                                .addComponent(Q2A3)
                                .addGap(65, 65, 65)
                                .addComponent(Q2A4)
                                .addGap(92, 92, 92)))
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblScore))
                            .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit)
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Q1A1)
                .addGap(18, 18, 18)
                .addComponent(Q1A2)
                .addGap(18, 18, 18)
                .addComponent(Q1A3)
                .addGap(18, 18, 18)
                .addComponent(Q1A4)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(Q3A1)
                .addGap(18, 18, 18)
                .addComponent(Q3A2)
                .addGap(18, 18, 18)
                .addComponent(Q3A3)
                .addGap(18, 18, 18)
                .addComponent(Q3A4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblScore)
                    .addComponent(lblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuestion1)
                    .addComponent(Q1Answer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q1A1)
                    .addComponent(Q1A2)
                    .addComponent(Q1A3)
                    .addComponent(Q1A4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuestion2)
                    .addComponent(Q2Answer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q2A1)
                    .addComponent(Q2A2)
                    .addComponent(Q2A3)
                    .addComponent(Q2A4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuestion3)
                    .addComponent(Q3Answer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Q3A1)
                    .addComponent(Q3A2)
                    .addComponent(Q3A3)
                    .addComponent(Q3A4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnBack)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        // If statements check if the correct radio button is selected and adds to score variable
        // 
        if (Q1A1.isSelected() == true) {
            Q1Answer.setForeground(Color.green);
            Q1Answer.setText("Correct!");
            score += 1;
        } else {
            Q1Answer.setForeground(Color.red);
            Q1Answer.setText("Incorrect!");
        }
        
        if (Q2A2.isSelected() == true) {
            Q2Answer.setForeground(Color.green);
            Q2Answer.setText("Correct!");
            score += 1;
        } else {
            Q2Answer.setForeground(Color.red);
            Q2Answer.setText("Incorrect!");
        }
        
        if (Q3A2.isSelected() == true) {
            Q3Answer.setForeground(Color.green);
            Q3Answer.setText("Correct!");
            score += 1;
        } else {
            Q3Answer.setForeground(Color.red);
            Q3Answer.setText("Incorrect!");
        }
        // Prints overall score
        this.txtScore.setText(score+"/3"); 
        
        // Switch buttons on and off
        btnReset.setEnabled(true); 
        btnSubmit.setEnabled(false); 
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        setVisible(false); // Hides Linear Quiz
        LinearFunction Linear = new LinearFunction(); 
        Linear.setVisible(true);   // Opens Linear Function Menu
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    setVisible(false); // To make a quick flash
    setVisible(true);
    // Switch buttons on and off
    btnSubmit.setEnabled(true);
    btnReset.setEnabled(false); 
    // Clearing Radio buttons
    Q1.clearSelection();
    Q2.clearSelection();
    Q3.clearSelection();
    // Clearing answer
    Q1Answer.setText("");
    Q2Answer.setText("");
    Q3Answer.setText("");
    // Resetting score
    score = 0;
    this.txtScore.setText("/3");

    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(LinearQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinearQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinearQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinearQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinearQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Q1;
    private javax.swing.JRadioButton Q1A1;
    private javax.swing.JRadioButton Q1A2;
    private javax.swing.JRadioButton Q1A3;
    private javax.swing.JRadioButton Q1A4;
    private javax.swing.JLabel Q1Answer;
    private javax.swing.ButtonGroup Q2;
    private javax.swing.JRadioButton Q2A1;
    private javax.swing.JRadioButton Q2A2;
    private javax.swing.JRadioButton Q2A3;
    private javax.swing.JRadioButton Q2A4;
    private javax.swing.JLabel Q2Answer;
    private javax.swing.ButtonGroup Q3;
    private javax.swing.JRadioButton Q3A1;
    private javax.swing.JRadioButton Q3A2;
    private javax.swing.JRadioButton Q3A3;
    private javax.swing.JRadioButton Q3A4;
    private javax.swing.JLabel Q3Answer;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblQuestion1;
    private javax.swing.JLabel lblQuestion2;
    private javax.swing.JLabel lblQuestion3;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JScrollPane scpQuestion1;
    private javax.swing.JScrollPane scpQuestion2;
    private javax.swing.JScrollPane scpQuestion3;
    private javax.swing.JTextArea txtQuestion1;
    private javax.swing.JTextArea txtQuestion2;
    private javax.swing.JTextArea txtQuestion3;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
}
