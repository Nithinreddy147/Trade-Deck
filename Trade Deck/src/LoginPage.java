import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
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
        LoginForm_Container = new javax.swing.JPanel();
        Login_Heading = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Username_input = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        Password_input = new javax.swing.JPasswordField();
        Submit_Button = new javax.swing.JButton();
        RegisterPageRoute = new javax.swing.JButton();
        TradeDeck_Heading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        LoginForm_Container.setBackground(new java.awt.Color(255, 153, 153));

        Login_Heading.setBackground(new java.awt.Color(255, 102, 102));
        Login_Heading.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        Login_Heading.setForeground(new java.awt.Color(255, 255, 255));
        Login_Heading.setText("Login");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setText("Username:");

        Username_input.setBackground(new java.awt.Color(255, 153, 153));
        Username_input.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        Username_input.setToolTipText("Enter your Username");
        Username_input.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Username_input.setOpaque(false);
        Username_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Username_inputActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        Password.setText("Password:");

        Password_input.setBackground(new java.awt.Color(255, 153, 153));
        Password_input.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password_input.setToolTipText("Enter your Password");
        Password_input.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        Submit_Button.setBackground(new java.awt.Color(51, 51, 255));
        Submit_Button.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Submit_Button.setForeground(new java.awt.Color(255, 255, 255));
        Submit_Button.setText("Login");
        Submit_Button.setBorder(null);
        Submit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_ButtonActionPerformed(evt);
            }
        });

        RegisterPageRoute.setBackground(new java.awt.Color(0, 0, 0));
        RegisterPageRoute.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        RegisterPageRoute.setForeground(new java.awt.Color(255, 255, 255));
        RegisterPageRoute.setText("New user?");
        RegisterPageRoute.setContentAreaFilled(false);
        RegisterPageRoute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterPageRouteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginForm_ContainerLayout = new javax.swing.GroupLayout(LoginForm_Container);
        LoginForm_Container.setLayout(LoginForm_ContainerLayout);
        LoginForm_ContainerLayout.setHorizontalGroup(
            LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginForm_ContainerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(LoginForm_ContainerLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Username_input, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginForm_ContainerLayout.createSequentialGroup()
                        .addComponent(Password)
                        .addGap(18, 18, 18)
                        .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Submit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password_input))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginForm_ContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginForm_ContainerLayout.createSequentialGroup()
                        .addComponent(Login_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginForm_ContainerLayout.createSequentialGroup()
                        .addComponent(RegisterPageRoute)
                        .addGap(18, 18, 18))))
        );
        LoginForm_ContainerLayout.setVerticalGroup(
            LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginForm_ContainerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Login_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Username_input, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(LoginForm_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(Password_input, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(Submit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(RegisterPageRoute)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        TradeDeck_Heading.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        TradeDeck_Heading.setForeground(new java.awt.Color(255, 255, 255));
        TradeDeck_Heading.setText("Trade Deck");

        javax.swing.GroupLayout Loginpage_ContainerLayout = new javax.swing.GroupLayout(Loginpage_Container);
        Loginpage_Container.setLayout(Loginpage_ContainerLayout);
        Loginpage_ContainerLayout.setHorizontalGroup(
            Loginpage_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Loginpage_ContainerLayout.createSequentialGroup()
                .addComponent(Login_leftContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(Loginpage_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Loginpage_ContainerLayout.createSequentialGroup()
                        .addComponent(LoginForm_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Loginpage_ContainerLayout.createSequentialGroup()
                        .addComponent(TradeDeck_Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        Loginpage_ContainerLayout.setVerticalGroup(
            Loginpage_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login_leftContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Loginpage_ContainerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(TradeDeck_Heading)
                .addGap(29, 29, 29)
                .addComponent(LoginForm_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loginpage_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Loginpage_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Username_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Username_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Username_inputActionPerformed

    private void Submit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_ButtonActionPerformed
        String Username = Username_input.getText();
        String Password = String.valueOf(Password_input.getPassword());
        try {
            // TODO add your handling code here:
            PreparedStatement ps;
            ResultSet rs;
            
            String Hashedpassword = HashedPassword(Password);
            String query ="SELECT * FROM UserDetails WHERE Username='"+Username+"' AND Password ='"+Hashedpassword+"';";
            
            //Establish connection to sql servers
            ps = SqlConnection.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, "Login Successful");
                MainScreen ms = new MainScreen(); //object of class register page
                MainScreen.username=Username;
                ms.setVisible(true);
                ms.pack();
                ms.setLocationRelativeTo(null);
                ms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid credentials");   
            }
            
            if(Username.isBlank())
            {
                JOptionPane.showMessageDialog(null, "Username cannot be empty!");
            }
            else if(Password.isBlank())
            {
                JOptionPane.showMessageDialog(null, "Password cannot be empty!");
            }
            
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Submit_ButtonActionPerformed

    private void RegisterPageRouteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterPageRouteActionPerformed
        // TODO add your handling code here:
        Register rp = new Register(); //object of class register page
        rp.setVisible(true);
        rp.pack();
        rp.setLocationRelativeTo(null);
        rp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_RegisterPageRouteActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginForm_Container;
    private javax.swing.JLabel Login_Heading;
    private javax.swing.JPanel Login_leftContainer;
    private javax.swing.JPanel Loginpage_Container;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField Password_input;
    private javax.swing.JButton RegisterPageRoute;
    private javax.swing.JButton Submit_Button;
    private javax.swing.JLabel TradeDeck_Heading;
    private javax.swing.JTextField Username_input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
