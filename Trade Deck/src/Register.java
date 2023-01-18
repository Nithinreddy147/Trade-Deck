import java.sql.PreparedStatement;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }
    
    //Function to convert password into hashed password.
    //Algorithms are MD5 , SHA-1, SHA-256
    public String HashedPassword(String Password) throws NoSuchAlgorithmException{
        MessageDigest  messageDigest = MessageDigest.getInstance("SHA");
        messageDigest.update(Password.getBytes());
        byte[] resultbyteArray = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for(byte b: resultbyteArray){
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Loginpage_Container = new javax.swing.JPanel();
        Login_leftContainer = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TradeDeck_Heading = new javax.swing.JLabel();
        LoginForm_Container = new javax.swing.JPanel();
        Login_Heading = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        First_nmae_input = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        Password_input = new javax.swing.JPasswordField();
        register_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        email_input = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Last_name_input = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Username_input3 = new javax.swing.JTextField();
        Password1 = new javax.swing.JLabel();
        cnf_Password_input = new javax.swing.JPasswordField();
        LoginpageRoute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(994, 590));

        Loginpage_Container.setBackground(new java.awt.Color(255, 102, 102));

        Login_leftContainer.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assests/Trade deck logo.jpeg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(299, 172));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Welcome to TRADE DECK");

        javax.swing.GroupLayout Login_leftContainerLayout = new javax.swing.GroupLayout(Login_leftContainer);
        Login_leftContainer.setLayout(Login_leftContainerLayout);
        Login_leftContainerLayout.setHorizontalGroup(
            Login_leftContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_leftContainerLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(Login_leftContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(Login_leftContainerLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        Login_leftContainerLayout.setVerticalGroup(
            Login_leftContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Login_leftContainerLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TradeDeck_Heading.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        TradeDeck_Heading.setForeground(new java.awt.Color(255, 255, 255));
        TradeDeck_Heading.setText("Trade Deck");

        LoginForm_Container.setBackground(new java.awt.Color(255, 153, 153));

        Login_Heading.setBackground(new java.awt.Color(255, 102, 102));
        Login_Heading.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        Login_Heading.setForeground(new java.awt.Color(255, 255, 255));
        Login_Heading.setText("Register");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setText("First Name:");

        First_nmae_input.setBackground(new java.awt.Color(255, 153, 153));
        First_nmae_input.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        First_nmae_input.setToolTipText("Enter your Firstname");
        First_nmae_input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        First_nmae_input.setOpaque(false);

        Password.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        Password.setText("Password:");

        Password_input.setBackground(new java.awt.Color(255, 153, 153));
        Password_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password_input.setToolTipText("Enter your Password");
        Password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        register_Button.setBackground(new java.awt.Color(51, 51, 255));
        register_Button.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        register_Button.setForeground(new java.awt.Color(255, 255, 255));
        register_Button.setText("Register");
        register_Button.setBorder(null);
        register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_ButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel4.setText("Email:");

        email_input.setBackground(new java.awt.Color(255, 153, 153));
        email_input.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        email_input.setToolTipText("Enter your email");
        email_input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        email_input.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel5.setText("Last Name:");

        Last_name_input.setBackground(new java.awt.Color(255, 153, 153));
        Last_name_input.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        Last_name_input.setToolTipText("Enter your Lastname");
        Last_name_input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Last_name_input.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel6.setText("Username:");

        Username_input3.setBackground(new java.awt.Color(255, 153, 153));
        Username_input3.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        Username_input3.setToolTipText("Enter your Username");
        Username_input3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Username_input3.setOpaque(false);

        Password1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        Password1.setText("Cnf Password:");

        cnf_Password_input.setBackground(new java.awt.Color(255, 153, 153));
        cnf_Password_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cnf_Password_input.setToolTipText("Enter your Password");
        cnf_Password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        LoginpageRoute.setBackground(new java.awt.Color(255, 102, 102));
        LoginpageRoute.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        LoginpageRoute.setForeground(new java.awt.Color(255, 255, 255));
        LoginpageRoute.setText("Already user?");
        LoginpageRoute.setContentAreaFilled(false);
        LoginpageRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginpageRouteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginForm_ContainerLayout = new javax.swing.GroupLayout(LoginForm_Container);
        LoginForm_Container.setLayout(LoginForm_ContainerLayout);
        LoginForm_ContainerLayout.setHorizontalGroup(
            LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginForm_ContainerLayout.createSequentialGroup()
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginForm_ContainerLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(Password))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginForm_ContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginForm_ContainerLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginForm_ContainerLayout.createSequentialGroup()
                                .addComponent(Password1)
                                .addGap(26, 26, 26)))))
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Username_input3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_input, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Last_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnf_Password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(First_nmae_input, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginForm_ContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginForm_ContainerLayout.createSequentialGroup()
                        .addComponent(Login_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginForm_ContainerLayout.createSequentialGroup()
                        .addComponent(LoginpageRoute)
                        .addContainerGap())))
        );
        LoginForm_ContainerLayout.setVerticalGroup(
            LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginForm_ContainerLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(Login_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(First_nmae_input, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Last_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username_input3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_input, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password))
                .addGap(18, 18, 18)
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cnf_Password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password1))
                .addGap(28, 28, 28)
                .addComponent(register_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginpageRoute, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Loginpage_ContainerLayout = new javax.swing.GroupLayout(Loginpage_Container);
        Loginpage_Container.setLayout(Loginpage_ContainerLayout);
        Loginpage_ContainerLayout.setHorizontalGroup(
            Loginpage_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Loginpage_ContainerLayout.createSequentialGroup()
                .addComponent(Login_leftContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(Loginpage_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Loginpage_ContainerLayout.createSequentialGroup()
                        .addComponent(TradeDeck_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Loginpage_ContainerLayout.createSequentialGroup()
                        .addComponent(LoginForm_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );
        Loginpage_ContainerLayout.setVerticalGroup(
            Loginpage_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_leftContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Loginpage_ContainerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(TradeDeck_Heading)
                .addGap(18, 18, 18)
                .addComponent(LoginForm_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loginpage_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Loginpage_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_ButtonActionPerformed
        String Firstname = First_nmae_input.getText();
        String Lastname = Last_name_input.getText();
        String Username = Username_input3.getText();
        String Email = email_input.getText();
        String Password = String .valueOf(Password_input.getPassword());
        String CnfPassword = String .valueOf(cnf_Password_input.getPassword());
        if(!Password.equals(CnfPassword))
        {
            JOptionPane.showMessageDialog(null,"Password doesnot match");
        }
        else if(Firstname.isBlank())
        {
            JOptionPane.showMessageDialog(null,"Firstname cannot be empty");
        }
        else if(Lastname.isBlank())
        {
            JOptionPane.showMessageDialog(null,"Lastname cannot be empty");
        }
        else if(Username.isBlank())
        {
            JOptionPane.showMessageDialog(null,"Username cannot be empty");
        }
        else if(Email.isBlank())
        {
            JOptionPane.showMessageDialog(null,"Email cannot be empty");
        }
        else
        {
            try {
                // TODO add your handling code here
                String Hashedpassword = HashedPassword(Password);
                PreparedStatement ps ;
                String query ="INSERT INTO UserDetails VALUES('"+Firstname+"','"+Lastname+"','"+Username+"','"+Email+"','"+Hashedpassword+"');";
                try {
                    ps = SqlConnection.getConnection().prepareStatement(query); //Executing query in MySql Server
                    if(ps.executeUpdate()>0){
                        JOptionPane.showMessageDialog(null,"Account cerated successfully");
                        LoginPage lp = new LoginPage(); //object of class register page
                        lp.setVisible(true);
                        lp.pack();
                        lp.setLocationRelativeTo(null);
                        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        this.dispose();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException | NoSuchAlgorithmException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_register_ButtonActionPerformed

    private void LoginpageRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginpageRouteActionPerformed
        // TODO add your handling code here:
        LoginPage lp = new LoginPage(); //object of class register page
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_LoginpageRouteActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField First_nmae_input;
    private javax.swing.JTextField Last_name_input;
    private javax.swing.JPanel LoginForm_Container;
    private javax.swing.JLabel Login_Heading;
    private javax.swing.JPanel Login_leftContainer;
    private javax.swing.JButton LoginpageRoute;
    private javax.swing.JPanel Loginpage_Container;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Password1;
    private javax.swing.JPasswordField Password_input;
    private javax.swing.JLabel TradeDeck_Heading;
    private javax.swing.JTextField Username_input3;
    private javax.swing.JPasswordField cnf_Password_input;
    private javax.swing.JTextField email_input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton register_Button;
    // End of variables declaration//GEN-END:variables
}
