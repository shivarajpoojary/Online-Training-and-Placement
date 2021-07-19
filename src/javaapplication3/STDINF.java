/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class STDINF extends javax.swing.JFrame {

    /**
     * Creates new form STDINF
     */
    public STDINF() {
        initComponents();
               ((JTextField)dob.getDateEditor().getUiComponent()).setEditable(false);

    }
    public STDINF(String ussname,String pssword)
    {
        initComponents();
        stdid.setText(ussname);
        password.setText(pssword);
              ((JTextField)dob.getDateEditor().getUiComponent()).setEditable(false);

        FETCH();
        
    }
   
    public void FETCH()
    {
        try
        {
            
          
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
                String sql;
                PreparedStatement pst;
           
                sql = "SELECT *FROM `stdreg` WHERE stdid = ? AND password = ? LIMIT 0 , 30";
                pst = con.prepareStatement(sql);
                pst.setString(1,stdid.getText());
                pst.setString(2,password.getText());
                ResultSet rs=pst.executeQuery();
                
                if(rs.next())
                {    
                       String snam = rs.getString(1);
                      
                       String passwor =rs.getString(2);
                       String stdi = rs.getString(3);
                       String mnam = rs.getString(4);
                       String fnam = rs.getString(5);
                       String gende = rs.getString(6);
                       
                       String dobr = rs.getString(7);
                      ((JTextField)dob.getDateEditor().getUiComponent()).setText(dobr);

                       String emai = rs.getString(8);
                       String clnam = rs.getString(9);
                       String degag = rs.getString(10);
                       String degpas = rs.getString(11);
                       String sslcper = rs.getString(12);
                       String sslcpas = rs.getString(13);
                       String pucper = rs.getString(14);
                       String pucpas = rs.getString(15);
                       String backlog = rs.getString(16);
                      
                        sname.setText(snam);
                        mname.setText(mnam);
                        fname.setText(fnam);
                        String a="MALE";
                        String b="FEMALE";
                        if(gende.equals(a))
                        {
                            jRadioButton1.setSelected(true);
                        }
                        if(gende.equals(b))
                        {
                            jRadioButton2.setSelected(true);
                        }
                        email.setText(emai);
                        clname.setText(clnam);
                        degagg.setText(degag);
                        degpass.setText(degpas);
                        sslcperc.setText(sslcper);
                        sslcpass.setText(sslcpas);
                        pucperc.setText(pucper);
                        pucpass.setText(pucpas);
                        backlogs.setText(backlog);
                }
        }
         catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                JOptionPane.showMessageDialog(null,e);
        }
    }
     public void UPDATE()
     {
        String s="gmail.com";
        if(sname.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Student name can't be empty");
             
        }
       else if(stdid.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Student ID can't be empty");
             
        }
         else if(mname.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Mother name can't be empty");
        }
        else if(fname.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"father name can't be empty");
        }
      
        else if(email.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Email can't be empty");
        }
         else if(!(email.getText().contains(s)))
        {
            JOptionPane.showMessageDialog(null,"'@gmail.com' to be include in Email");
            email.setText("");
        }
        else if(clname.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"College name can't be empty");
        }
        else if(degagg.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Please enter Degree aggregate");
        }
        else if(degpass.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Please enter passing year of degree");
        }
         else if(sslcperc.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Please enter SSLC percentage");
        }
         else if(sslcpass.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Please enter SSLC passing year");
        }
         else if(pucperc.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Please enter PUC percentage");
        }
        else if(pucpass.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Please enter PUC passing year");
        }
        else if(backlogs.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Please enter backlogs,if not enter 0");
        }
        else
        {
        int val4=Integer.parseInt(sslcperc.getText());
        int val5 = 100;
        int val6=Integer.parseInt(pucperc.getText());
        int val7 = 100;
        int val8=Integer.parseInt(degagg.getText());
        int val9 = 100;
       
        if(val4>val5)
        {
                        JOptionPane.showMessageDialog(null," '" +val4+ "' is not a valid percentage");   
                        sslcperc.setText("");
        }
        else if(val6>val7)
        {
                        JOptionPane.showMessageDialog(null," '" +val6+ "' is not a valid percentage");  
                        pucperc.setText("");
        }
        else if(val8>val9)
        {
                        JOptionPane.showMessageDialog(null," '" +val8+ "' is not a valid percentage"); 
                        degagg.setText("");
        }
         else if(!(degpass.getText().length() == 4))
                 {
                     JOptionPane.showMessageDialog(null, "Enter the year in 'yyyy' Format");
                     degpass.setText("");
                 }
            else if(!(sslcpass.getText().length() == 4))
                     {
                         JOptionPane.showMessageDialog(null, "Enter the year in 'yyyy' Format");
                         sslcpass.setText("");
                     }
             else if(!(pucpass.getText().length() == 4))
                     {
                         JOptionPane.showMessageDialog(null, "Enter the year in 'yyyy' Format");
                         pucpass.setText("");
                     }
             else if(backlogs.getText().length() > 2)
                     {
                         JOptionPane.showMessageDialog(null, "The value is too long....");
                         backlogs.setText("");
                     }
     
        else
        {
         try
         {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
                    String sql1,sql2;
                    PreparedStatement pst1,pst2;
                 
                            sql1="UPDATE `student`.`stdreg` SET `sname` = ?,`password`=?,`stdid`=?,`mname`=?,`fname`=?,`gender`=?,`dob`=?,`email`=?,`clname`=?,`degagg`=?,`degpass`=?,`sslcperc`=?,`sslcpass`=?,`pucperc`=?,`pucpass`=?,`backlogs`=? WHERE `stdreg`.`stdid` = ?";
                            pst1 = con.prepareStatement(sql1);
                            pst1.setString(1,sname.getText());
                            pst1.setString(2,password.getText());
                            pst1.setString(3,stdid.getText());
                            pst1.setString(4,mname.getText());
                            pst1.setString(5,fname.getText());
                             if(jRadioButton1.isSelected())  
                             {
                               pst1.setString(6,jRadioButton1.getText()); 
                             }
                             if(jRadioButton2.isSelected())  
                             {
                               pst1.setString(6,jRadioButton2.getText()); 
                             }
                            pst1.setString(7,((JTextField)dob.getDateEditor().getUiComponent()).getText());
                            pst1.setString(8,email.getText());
                            pst1.setString(9,clname.getText());
                            pst1.setString(10,degagg.getText());
                            pst1.setString(11,degpass.getText());
                            pst1.setString(12,sslcperc.getText());
                            pst1.setString(13,sslcpass.getText());
                            pst1.setString(14,pucperc.getText());
                            pst1.setString(15,pucpass.getText());
                            pst1.setString(16,backlogs.getText());
                            pst1.setString(17,stdid.getText());
                            pst1.execute();
                            JOptionPane.showMessageDialog(null,"Record updated");
                           // String usern = stdid.getText();
                         // String passw = password.getText();
                         // new STDMODULE(usern,passw).setVisible(true);
                          dispose();

         }
          catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
                JOptionPane.showMessageDialog(null,e);
        } 
        }  
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

        popupMenu1 = new java.awt.PopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        email = new javax.swing.JTextField();
        clname = new javax.swing.JTextField();
        degagg = new javax.swing.JTextField();
        degpass = new javax.swing.JTextField();
        sslcperc = new javax.swing.JTextField();
        sslcpass = new javax.swing.JTextField();
        pucperc = new javax.swing.JTextField();
        pucpass = new javax.swing.JTextField();
        backlogs = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();
        stdid = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        sname = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(300, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));

        jLabel2.setBackground(new java.awt.Color(255, 255, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("STUDENT NAME");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 34));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PASSWORD");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 113, 28));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("STUDENT ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 113, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MOTHER NAME");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 113, 38));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FATHER NAME");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 113, 35));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENDER");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 113, 33));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DOB");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 113, 27));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EMAIL ID");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 113, 32));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("COLLEGE NAME");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 113, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DEGREE AGGREGATE");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 150, 32));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PASS YEAR GRADUATION");
        jLabel13.setToolTipText("PASS");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 185, 27));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("10TH PERCENTAGE");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 185, 26));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PASS YEAR SSLC");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, 185, 32));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("12TH PERCENTAGE");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 185, 27));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("PASS YEAR PUC");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 146, 18));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("BACKLOGS");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 650, 154, -1));

        mname.setBackground(new java.awt.Color(153, 153, 153));
        mname.setForeground(new java.awt.Color(255, 255, 255));
        mname.setToolTipText("ENTER THE MOTHER NAME");
        mname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mnameKeyTyped(evt);
            }
        });
        jPanel2.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 166, 367, 28));

        fname.setBackground(new java.awt.Color(153, 153, 153));
        fname.setForeground(new java.awt.Color(255, 255, 255));
        fname.setToolTipText("ENTER THE FATHER NAME");
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnameKeyTyped(evt);
            }
        });
        jPanel2.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 203, 367, 29));

        jRadioButton1.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("MALE");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 250, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("FEMALE");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 250, -1, -1));

        email.setBackground(new java.awt.Color(153, 153, 153));
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setToolTipText("ENTER THE EMAIL ID");
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 326, 367, 31));

        clname.setBackground(new java.awt.Color(153, 153, 153));
        clname.setForeground(new java.awt.Color(255, 255, 255));
        clname.setToolTipText("ENTER THE COLLAGE NAME");
        clname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                clnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clnameKeyTyped(evt);
            }
        });
        jPanel2.add(clname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 367, 30));

        degagg.setBackground(new java.awt.Color(153, 153, 153));
        degagg.setForeground(new java.awt.Color(255, 255, 255));
        degagg.setToolTipText("ENTER THE DEGREE AGGRIGATE");
        degagg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                degaggKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                degaggKeyTyped(evt);
            }
        });
        jPanel2.add(degagg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 367, 29));

        degpass.setBackground(new java.awt.Color(153, 153, 153));
        degpass.setForeground(new java.awt.Color(255, 255, 255));
        degpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degpassActionPerformed(evt);
            }
        });
        degpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                degpassKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                degpassKeyTyped(evt);
            }
        });
        jPanel2.add(degpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 367, 30));

        sslcperc.setBackground(new java.awt.Color(153, 153, 153));
        sslcperc.setForeground(new java.awt.Color(255, 255, 255));
        sslcperc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sslcpercKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sslcpercKeyTyped(evt);
            }
        });
        jPanel2.add(sslcperc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 367, 26));

        sslcpass.setBackground(new java.awt.Color(153, 153, 153));
        sslcpass.setForeground(new java.awt.Color(255, 255, 255));
        sslcpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sslcpassKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sslcpassKeyTyped(evt);
            }
        });
        jPanel2.add(sslcpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 529, 370, 30));

        pucperc.setBackground(new java.awt.Color(153, 153, 153));
        pucperc.setForeground(new java.awt.Color(255, 255, 255));
        pucperc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pucpercKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pucpercKeyTyped(evt);
            }
        });
        jPanel2.add(pucperc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 370, 32));

        pucpass.setBackground(new java.awt.Color(153, 153, 153));
        pucpass.setForeground(new java.awt.Color(255, 255, 255));
        pucpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pucpassActionPerformed(evt);
            }
        });
        pucpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pucpassKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pucpassKeyTyped(evt);
            }
        });
        jPanel2.add(pucpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 370, 32));

        backlogs.setBackground(new java.awt.Color(153, 153, 153));
        backlogs.setForeground(new java.awt.Color(255, 255, 255));
        backlogs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backlogsKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                backlogsKeyTyped(evt);
            }
        });
        jPanel2.add(backlogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, 370, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 110, -1));

        dob.setBackground(new java.awt.Color(153, 153, 153));
        dob.setDateFormatString("yyyy-MM-d");
        jPanel2.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 367, 27));

        stdid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        stdid.setForeground(new java.awt.Color(255, 255, 0));
        stdid.setText("jLabel20");
        jPanel2.add(stdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 640, 27));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 51));
        jButton5.setText("<< BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 110, 27));

        sname.setBackground(new java.awt.Color(153, 153, 153));
        sname.setForeground(new java.awt.Color(255, 255, 255));
        sname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                snameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                snameKeyTyped(evt);
            }
        });
        jPanel2.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 360, 30));

        jPanel3.setBackground(new java.awt.Color(0, 204, 0));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("STUDENT INFORMATION");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 40));

        jCheckBox1.setBackground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Show password");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 120, 30));

        password.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 360, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
    UPDATE();
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void degaggKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_degaggKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_degaggKeyTyped

    private void degpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_degpassKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_degpassKeyTyped

    private void sslcpercKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sslcpercKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_sslcpercKeyTyped

    private void sslcpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sslcpassKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_sslcpassKeyTyped

    private void pucpercKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pucpercKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_pucpercKeyTyped

    private void pucpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pucpassKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pucpassKeyTyped

    private void backlogsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backlogsKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_backlogsKeyTyped

    private void mnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnameKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnameKeyTyped

    private void fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fnameKeyTyped

    private void clnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clnameKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_clnameKeyTyped

    private void mnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnameKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            mname.setEditable(true);
        }
        else
        {
            mname.setEditable(false);
                     mname.setCaretPosition(0);

           
        }
       
    }//GEN-LAST:event_mnameKeyPressed

    private void fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyPressed
        // TODO add your handling code here:
         
         char c = evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            fname.setEditable(true);
        }
        else
        {
            fname.setEditable(false);
           
        }
       
    }//GEN-LAST:event_fnameKeyPressed

    private void clnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clnameKeyPressed
        // TODO add your handling code here:
        
         char c = evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            clname.setEditable(true);
        }
        else
        {
            clname.setEditable(false);
           
        }
       
    }//GEN-LAST:event_clnameKeyPressed

    private void degaggKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_degaggKeyPressed
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            degagg.setEditable(true);
        }
        else
        {
            degagg.setEditable(false);
           
        }
    }//GEN-LAST:event_degaggKeyPressed

    private void degpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_degpassKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            degpass.setEditable(true);
        }
        else
        {
            degpass.setEditable(false);
           
        }
    }//GEN-LAST:event_degpassKeyPressed

    private void sslcpercKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sslcpercKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            sslcperc.setEditable(true);
        }
        else
        {
            sslcperc.setEditable(false);
           
        }
    }//GEN-LAST:event_sslcpercKeyPressed

    private void sslcpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sslcpassKeyPressed
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            sslcpass.setEditable(true);
        }
        else
        {
            sslcpass.setEditable(false);
           
        }
    }//GEN-LAST:event_sslcpassKeyPressed

    private void pucpercKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pucpercKeyPressed
        // TODO add your handling code here:
          char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            pucperc.setEditable(true);
        }
        else
        {
            pucperc.setEditable(false);
           
        }
    }//GEN-LAST:event_pucpercKeyPressed

    private void pucpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pucpassKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            pucpass.setEditable(true);
        }
        else
        {
            pucpass.setEditable(false);
           
        }
    }//GEN-LAST:event_pucpassKeyPressed

    private void backlogsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backlogsKeyPressed
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            backlogs.setEditable(true);
        }
        else
        {
            backlogs.setEditable(false);
           
        }
    }//GEN-LAST:event_backlogsKeyPressed

    private void degpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degpassActionPerformed

    private void pucpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pucpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pucpassActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
          int YesOrNo = JOptionPane.showConfirmDialog(null,"Are you sure want to Update student information ");
                     if(YesOrNo == 0)
                     {
                      UPDATE();
                     }
                     else
                     {
                        dispose();
                  
                     }
                   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void snameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            sname.setEditable(true);
        }
        else
        {
            sname.setEditable(false);
           
        }
       
    }//GEN-LAST:event_snameKeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected())
        {
            password.setEchoChar((char)0);
        }
        else
        {
            password.setEchoChar('*');
        }
          
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void snameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snameKeyTyped
        // TODO add your handling code here:
         
    }//GEN-LAST:event_snameKeyTyped

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
            java.util.logging.Logger.getLogger(STDINF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STDINF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STDINF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STDINF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STDINF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField backlogs;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField clname;
    private javax.swing.JTextField degagg;
    private javax.swing.JTextField degpass;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField mname;
    private javax.swing.JPasswordField password;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField pucpass;
    private javax.swing.JTextField pucperc;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField sslcpass;
    private javax.swing.JTextField sslcperc;
    private javax.swing.JLabel stdid;
    // End of variables declaration//GEN-END:variables
}
