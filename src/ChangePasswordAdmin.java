import java.sql.*;
import javax.swing.*;
public class ChangePasswordAdmin extends javax.swing.JDialog {

     Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    String depid;
    public ChangePasswordAdmin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
     public void checkPassword(String depid)
    {
        this.depid=depid;
        this.setVisible(true);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Submit");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField3MouseClicked(evt);
            }
        });
        jPasswordField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField3ActionPerformed(evt);
            }
        });

        jPasswordField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField2MouseClicked(evt);
            }
        });

        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordField1MousePressed(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel3.setText("Confirm Password");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel1.setText("Current Password");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18));
        jLabel2.setText("New Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-580)/2, (screenSize.height-361)/2, 580, 361);
    }// </editor-fold>//GEN-END:initComponents
   public void connect()
    {
    try
    {
    Class.forName("oracle.jdbc.driver.OracleDriver");
    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
    
    }
    catch(Exception e)
    {
        System.out.print(e);
        System.exit(0);
    }
    }
    public void reset()
    {
        jPasswordField1.setText(null);
        jPasswordField2.setText(null);
        jPasswordField3.setText(null);
    }
    public void emptyField()
    {
        if(jPasswordField3.getText().equals("")&&!jPasswordField2.getText().equals("")&&!jPasswordField1.getText().equals(""))
        {
            jLabel4.setText("This Field Cannot Be Empty.");
            reset();
        }
        else if(jPasswordField2.getText().equals("")&&!jPasswordField3.getText().equals("")&&!jPasswordField1.getText().equals(""))
        {
            jLabel5.setText("This Field Cannot Be Empty.");
            reset();
        }
        else if(jPasswordField1.getText().equals("")&&!jPasswordField2.getText().equals("")&&!jPasswordField3.getText().equals(""))
        {
             jLabel6.setText("This Field Cannot Be Empty.");
             reset();
        }
        else if(jPasswordField3.getText().equals("")&&jPasswordField2.getText().equals("")&&!jPasswordField1.getText().equals(""))
        {
            jLabel4.setText("This Field Cannot Be Empty.");
            jLabel5.setText("This Field Cannot Be Empty.");
            reset();
        }
        else if(jPasswordField1.getText().equals("")&&!jPasswordField2.getText().equals("")&&jPasswordField3.getText().equals(""))
        {
            jLabel4.setText("This Field Cannot Be Empty.");
            jLabel6.setText("This Field Cannot Be Empty.");
            reset();
        }
        else if(!jPasswordField1.getText().equals("")&&jPasswordField2.getText().equals("")&&jPasswordField3.getText().equals(""))
        {
           jLabel5.setText("This Field Cannot Be Empty.");
           jLabel4.setText("This Field Cannot Be Empty.");
           reset();
           
        }
        else if(jPasswordField1.getText().equals("")&&jPasswordField2.getText().equals("")&&!jPasswordField3.getText().equals(""))
        {
             jLabel6.setText("This Field Cannot Be Empty.");
             jLabel5.setText("This Field Cannot Be Empty.");
             reset();
        }
        else if(jPasswordField1.getText().equals("")&&jPasswordField2.getText().equals("")&&jPasswordField3.getText().equals(""))
        {   
            jLabel4.setText("This Field Cannot Be Empty.");
            jLabel5.setText("This Field Cannot Be Empty.");
            jLabel6.setText("This Field Cannot Be Empty.");
            
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            connect();
            stmt=con.prepareStatement("select * from admin where depid=?");
            stmt.setString(1,depid);
            rs=stmt.executeQuery();
            if(!jPasswordField1.getText().equals("")&&!jPasswordField2.getText().equals("")&&!jPasswordField3.getText().equals("")) {
                while(rs.next()) {
                    if(rs.getString(2).equals(jPasswordField1.getText())) {
                        if(jPasswordField2.getText().equals(jPasswordField3.getText())) {
                            String x=jPasswordField2.getText();
                            stmt=con.prepareStatement("update admin set deppassword=? where depid=?");
                            stmt.setString(1,x);
                            stmt.setString(2,depid);
                            int i=stmt.executeUpdate();
                            JOptionPane.showMessageDialog(this,"Password Has Been Changed.");
                            dispose();
                            
                        } else {
                            jLabel4.setText("New Password Does Not Match. Please Enter Password Again.");
                            reset();
                        }
                    } else {
                        jLabel4.setText("Invalid Password. Please Enter Correct Current Password.");
                        reset();
                    }
                }
            } else {
                emptyField();
            }
            
            
        } catch(Exception xy) {
            System.out.print(xy);
        }
}//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField3MouseClicked
        jLabel4.setText(null);
}//GEN-LAST:event_jPasswordField3MouseClicked

    private void jPasswordField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField3ActionPerformed
        // TODO add your handling code here
}//GEN-LAST:event_jPasswordField3ActionPerformed

    private void jPasswordField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField2MouseClicked
        jLabel5.setText(null);
}//GEN-LAST:event_jPasswordField2MouseClicked

    private void jPasswordField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MousePressed
        jLabel6.setText(null);
}//GEN-LAST:event_jPasswordField1MousePressed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        
}//GEN-LAST:event_jPasswordField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
