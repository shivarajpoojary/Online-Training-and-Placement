/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author User
 */

public class ANSAPT extends javax.swing.JFrame {

    /**
     * Creates new form ANSAPT
     */
    public ANSAPT() {
        initComponents();
       
    }
    /*
    int i =60 ;
    Timer T = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            i--;
            if(i >= 0)
            {
                HR.setText(""+i);
            }
            else
            {
                dispose();
            }
                
        }
    });
    */
    int h1;
    int m1;
    int s;
    
    Timer T = new Timer(1000, new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            HR.setText(""+h1);
            MN.setText(""+m1);
            SC.setText(""+s);
            s--;
            
            if(s==-1)
            {
               s=59;
               m1 = m1-1;
               if((m1==-1)&&(h1==-1))
               {
                  h1=0;
                  m1=m1-1;
               }
               else if(m1==-1)
               {
                    h1 = h1-1;
                    m1=59;
               }
            }
            
            int hh1 = Integer.parseInt(HR.getText());
            int mm1 = Integer.parseInt(MN.getText());
            int ss1 = Integer.parseInt(SC.getText());
            
            if((hh1==0)&&(mm1==0)&&(ss1==0))
            {
                SUBMIT();
                String std = stdid.getText();
                new OVER(std).setVisible(true);
            }   
        }
    });
    
    
    
      public ANSAPT(String uname,String COM, String TestN,String std,int PG, int TPG,int m,int n,int hh,int mm,int ss)
    {
        initComponents();
        Test_ID.setText(uname);
        Comp_ID.setText(COM);
        Test_Name.setText(TestN);
        PGNO.setText(""+PG);
        stdid.setText(std);
        NO1.setText(""+m);
       
        jPanel3.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        int s=n;
        RETR(s);
        APT();
        this.h1= hh;
        this.m1 = mm;
        this.s = ss;
        T.start();

       
    }
      private void RETR(int n)
      {
           jCheckBox1.setVisible(false);
        jCheckBox2.setVisible(false);
        jCheckBox4.setVisible(false);
        jCheckBox5.setVisible(false);
        jCheckBox6.setVisible(false);
        jCheckBox7.setVisible(false);
        jCheckBox8.setVisible(false);
        jCheckBox9.setVisible(false);
        jCheckBox10.setVisible(false);
        jCheckBox11.setVisible(false);
        jCheckBox12.setVisible(false);
        jCheckBox13.setVisible(false);
        jCheckBox14.setVisible(false);
        jCheckBox15.setVisible(false);
        jCheckBox16.setVisible(false);
        jCheckBox17.setVisible(false);
        jCheckBox18.setVisible(false);
        jCheckBox19.setVisible(false);
        jCheckBox20.setVisible(false);
        jCheckBox21.setVisible(false);
        jCheckBox22.setVisible(false);
        jCheckBox23.setVisible(false);
        jCheckBox24.setVisible(false);
        jCheckBox25.setVisible(false);
        jCheckBox26.setVisible(false);

        
        JPanel1.setVisible(false);
        JPanel2.setVisible(false);
        JPanel3.setVisible(false);
        JPanel4.setVisible(false);
        JPanel5.setVisible(false);
        JPanel6.setVisible(false);
        JPanel7.setVisible(false);
        JPanel8.setVisible(false);
        JPanel9.setVisible(false);
        JPanel10.setVisible(false);
        JPanel11.setVisible(false);
        JPanel12.setVisible(false);
        JPanel13.setVisible(false);
        JPanel14.setVisible(false);
        JPanel15.setVisible(false);
        JPanel16.setVisible(false);
        JPanel17.setVisible(false);
        JPanel18.setVisible(false);
        JPanel19.setVisible(false);
        JPanel20.setVisible(false);
        JPanel21.setVisible(false);
        JPanel22.setVisible(false);
        JPanel23.setVisible(false);
        JPanel24.setVisible(false);
        JPanel25.setVisible(false);

        Panel1.setVisible(false);
        Panel2.setVisible(false);
        Panel3.setVisible(false);
        Panel4.setVisible(false);
        Panel5.setVisible(false);
        Panel6.setVisible(false);
        Panel7.setVisible(false);
        Panel8.setVisible(false);
        Panel9.setVisible(false);
        Panel10.setVisible(false);
        Panel11.setVisible(false);
        Panel12.setVisible(false);
        Panel13.setVisible(false);
        Panel14.setVisible(false);
        Panel15.setVisible(false);
        Panel16.setVisible(false);
        Panel17.setVisible(false);
        Panel18.setVisible(false);
        Panel19.setVisible(false);
        Panel20.setVisible(false);
        Panel21.setVisible(false);
        Panel22.setVisible(false);
        Panel23.setVisible(false);
        Panel24.setVisible(false);
        Panel25.setVisible(false);

         int i=Integer.parseInt(NO1.getText());

          
                   QN1.setText(""+i);
                   i++;                 
                 QN2.setText(""+i);
                   i++;                 
                 QN3.setText(""+i);
                   i++;                 
                 QN4.setText(""+i);
                   i++;                 
                 QN5.setText(""+i);
                   i++;                 
                 QN6.setText(""+i);
                   i++;                 
                 QN7.setText(""+i);
                   i++;                 
                 QN8.setText(""+i);
                   i++;                 
                 QN9.setText(""+i);
                   i++;                 
                 QN10.setText(""+i);
                   i++;                 
                 QN11.setText(""+i);
                   i++;                 
                 QN12.setText(""+i);
                   i++;                 
                 QN13.setText(""+i);
                   i++;                 
                 QN14.setText(""+i);
                   i++;                 
                 QN15.setText(""+i);
                   i++;                 
                 QN16.setText(""+i);
                   i++;                 
                 QN17.setText(""+i);
                   i++;                 
                 QN18.setText(""+i);
                   i++;                 
                 QN19.setText(""+i);
                   i++;                 
                 QN20.setText(""+i);
                   i++;                 
                 QN21.setText(""+i);
                   i++;                 
                 QN22.setText(""+i);
                   i++;                 
                 QN23.setText(""+i);
                   i++;                 
                 QN24.setText(""+i);
                   i++;                 
                 QN25.setText(""+i);
              try
        {
                    int TOPG;

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
                    String sql,sql1,sql3;
                    PreparedStatement pst,pst1,pst3;
                    sql = "SELECT  DISTINCT `PGNO`,`comp_ID`,`Test_Name` from `student`.`APTTEST` WHERE `Test_ID` = ?";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, Test_ID.getText());
                    ResultSet rs  = pst.executeQuery();
                    while(rs.next())
                    {
                        TOPG = rs.getInt(1);
                        TOTPG.setText(""+TOPG);
                        Comp_ID.setText(rs.getString(2));
                        Test_Name.setText(rs.getString(3));

                    }
                    sql1 = "SELECT  `QNO` from `student`.`APTTEST` WHERE `Test_ID` = ? AND `PGNO` = ? ORDER BY `QNO`";
                    pst1 = con.prepareStatement(sql1);
                    pst1.setString(1, Test_ID.getText());
                    pst1.setString(2, PGNO.getText());

                    ResultSet rs1  = pst1.executeQuery();
                    while(rs1.next())
                    {
                        int QN = rs1.getInt(1);
                       switch (QN) {

                              case 1:
                                       Panel1.setVisible(true);
                                            break;
                              case 2:
                                       Panel2.setVisible(true);
                                            break;
                           
                              case 3:
                                       Panel3.setVisible(true);
                                            break;
                             case 4:
                                       Panel4.setVisible(true);
                                            break;
                             case 5:
                                       Panel5.setVisible(true);
                                            break;
                                           case 6:
                                       Panel6.setVisible(true);
                                            break;
                                            case 7:
                                       Panel7.setVisible(true);
                                            break;
                                            case 8:
                                       Panel8.setVisible(true);
                                            break;
                                            case 9:
                                       Panel9.setVisible(true);
                                            break;
                                            case 10:
                                       Panel10.setVisible(true);
                                            break;
                                            case 11:
                                       Panel11.setVisible(true);
                                            break;
                                            case 12:
                                       Panel12.setVisible(true);
                                            break;
                                            case 13:
                                       Panel13.setVisible(true);
                                            break;
                                            case 14:
                                       Panel14.setVisible(true);
                                            break;
                                            case 15:
                                       Panel15.setVisible(true);
                                            break;
                                            case 16:
                                       Panel16.setVisible(true);
                                            break;
                                            case 17:
                                       Panel17.setVisible(true);
                                            break;
                                            case 18:
                                       Panel18.setVisible(true);
                                            break;
                                            case 19:
                                       Panel19.setVisible(true);
                                            break;
                                            case 20:
                                       Panel20.setVisible(true);
                                            break;
                                            case 21:
                                       Panel21.setVisible(true);
                                            break;
                                            case 22:
                                       Panel22.setVisible(true);
                                            break;
                                            case 23:
                                       Panel23.setVisible(true);
                                            break;
                                            case 24:
                                       Panel24.setVisible(true);
                                            break;
                                            case 25:
                                       Panel25.setVisible(true);
                                            break;
                                            
                       }
                       QN = n + QN;
                        NO2.setText(""+QN);
                    }
                    int a=0;

                    sql3 = "SELECT  * from `student`.`APTTEST` WHERE `Test_ID` = ?";
                    pst3 = con.prepareStatement(sql3);
                    pst3.setString(1, Test_ID.getText());
                    ResultSet rs3  = pst3.executeQuery();
                    while(rs3.next())
                    {  
                        a++;
                    }
                    TQ.setText(""+a);
                    
       }
        catch(HeadlessException | ClassNotFoundException | SQLException e )
         {
                        JOptionPane.showMessageDialog(null,e);
         }  
       

          
      }
     public ANSAPT(String uname,String COM, String TestN,String std,int PG,int TPG,int m,int n,int EX)
    {
        //this.i = Integer.parseInt(HR.getText());
        initComponents();
        Test_ID.setText(uname);
        Comp_ID.setText(COM);
        Test_Name.setText(TestN);
        PGNO.setText(""+PG);
        stdid.setText(std);
        NO1.setText(""+m);
        jPanel3.setVisible(true);
                jButton4.setVisible(false);
                jButton2.setVisible(false);

        jButton5.setVisible(true);
        jButton6.setVisible(true);
        int s = n;
        RETR(s);
        APT();
        TEST1();
        
        jCheckBox1.setVisible(true);
        jCheckBox2.setVisible(true);
        jCheckBox4.setVisible(true);
        jCheckBox5.setVisible(true);
        jCheckBox6.setVisible(true);
        jCheckBox7.setVisible(true);
        jCheckBox8.setVisible(true);
        jCheckBox9.setVisible(true);
        jCheckBox10.setVisible(true);
        jCheckBox11.setVisible(true);
        jCheckBox12.setVisible(true);
        jCheckBox13.setVisible(true);
        jCheckBox14.setVisible(true);
        jCheckBox15.setVisible(true);
        jCheckBox16.setVisible(true);
        jCheckBox17.setVisible(true);
        jCheckBox18.setVisible(true);
        jCheckBox19.setVisible(true);
        jCheckBox20.setVisible(true);
        jCheckBox21.setVisible(true);
        jCheckBox22.setVisible(true);
        jCheckBox23.setVisible(true);
        jCheckBox24.setVisible(true);
        jCheckBox25.setVisible(true);
        jCheckBox26.setVisible(true);
        
      
        
    }

    private void APT()
    {
        try
        {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            String sql,sql1;
            PreparedStatement pst,pst1;

            sql = "SELECT `QNO`,`Question`,`OPA`,`OPB`,`OPC`,`OPD`,`EXPL` from `student`.`APTTEST` WHERE `Test_ID` = ? AND `PGNO` = ? ORDER BY `QNO` LIMIT 0 , 30";
            pst = con.prepareStatement(sql);
            pst.setString(1, Test_ID.getText());
            int PG = Integer.parseInt(PGNO.getText());
            pst.setInt(2,PG);
            ResultSet rs  = pst.executeQuery();
            while(rs.next())
            {
               
                int QNO = rs.getInt(1);
                   
                switch (QNO) {
                    case 1:

                    TextArea1.setText(rs.getString(2));
                    ANA1.setText(rs.getString(3));
                    ANB1.setText(rs.getString(4));
                    ANC1.setText(rs.getString(5));
                    AND1.setText(rs.getString(6));
                    jTextArea1.setText(rs.getString(7));
                   
                    break;

                    case 2:
                    TextArea2.setText(rs.getString(2));
                    ANA2.setText(rs.getString(3));
                    ANB2.setText(rs.getString(4));
                    ANC2.setText(rs.getString(5));
                    AND2.setText(rs.getString(6));
                    jTextArea2.setText(rs.getString(7));

                    break;

                    case 3:
                    TextArea3.setText(rs.getString(2));
                    ANA3.setText(rs.getString(3));
                    ANB3.setText(rs.getString(4));
                    ANC3.setText(rs.getString(5));
                    AND3.setText(rs.getString(6));
                    jTextArea3.setText(rs.getString(7));

                    break;

                    case 4:
                    TextArea4.setText(rs.getString(2));
                    ANA4.setText(rs.getString(3));
                    ANB4.setText(rs.getString(4));
                    ANC4.setText(rs.getString(5));
                    AND4.setText(rs.getString(6));
                    jTextArea4.setText(rs.getString(7));

                    break;

                    case 5:
                    TextArea5.setText(rs.getString(2));
                    ANA5.setText(rs.getString(3));
                    ANB5.setText(rs.getString(4));
                    ANC5.setText(rs.getString(5));
                    AND5.setText(rs.getString(6));

                    jTextArea5.setText(rs.getString(7));
                    break;

                    case 6:
                    TextArea6.setText(rs.getString(2));
                    ANA6.setText(rs.getString(3));
                    ANB6.setText(rs.getString(4));
                    ANC6.setText(rs.getString(5));
                    AND6.setText(rs.getString(6));
                    jTextArea6.setText(rs.getString(7));

                    break;

                    case 7:
                    TextArea7.setText(rs.getString(2));
                    ANA7.setText(rs.getString(3));
                    ANB7.setText(rs.getString(4));
                    ANC7.setText(rs.getString(5));
                    AND7.setText(rs.getString(6));
                    jTextArea7.setText(rs.getString(7));

                    break;

                    case 8:
                    TextArea8.setText(rs.getString(2));
                    ANA8.setText(rs.getString(3));
                    ANB8.setText(rs.getString(4));
                    ANC8.setText(rs.getString(5));
                    AND8.setText(rs.getString(6));
                    jTextArea8.setText(rs.getString(7));

                    break;
                    case 9:
                    TextArea9.setText(rs.getString(2));
                    ANA9.setText(rs.getString(3));
                    ANB9.setText(rs.getString(4));
                    ANC9.setText(rs.getString(5));
                    AND9.setText(rs.getString(6));
                    jTextArea9.setText(rs.getString(7));

                    break;
                    case 10:
                    TextArea10.setText(rs.getString(2));
                    ANA10.setText(rs.getString(3));
                    ANB10.setText(rs.getString(4));
                    ANC10.setText(rs.getString(5));
                    AND10.setText(rs.getString(6));
                    jTextArea10.setText(rs.getString(7));

                    break;
                    case 11:
                    TextArea11.setText(rs.getString(2));
                    ANA11.setText(rs.getString(3));
                    ANB11.setText(rs.getString(4));
                    ANC11.setText(rs.getString(5));
                    AND11.setText(rs.getString(6));
                    jTextArea11.setText(rs.getString(7));

                    break;
                    case 12:
                    TextArea12.setText(rs.getString(2));
                    ANA12.setText(rs.getString(3));
                    ANB12.setText(rs.getString(4));
                    ANC12.setText(rs.getString(5));
                    AND12.setText(rs.getString(6));
                    jTextArea12.setText(rs.getString(7));

                    break;
                    case 13:
                    TextArea13.setText(rs.getString(2));
                    ANA13.setText(rs.getString(3));
                    ANB13.setText(rs.getString(4));
                    ANC13.setText(rs.getString(5));
                    AND13.setText(rs.getString(6));
                    jTextArea13.setText(rs.getString(7));

                    break;
                    case 14:
                    TextArea14.setText(rs.getString(2));
                    ANA14.setText(rs.getString(3));
                    ANB14.setText(rs.getString(4));
                    ANC14.setText(rs.getString(5));
                    AND14.setText(rs.getString(6));
                    jTextArea14.setText(rs.getString(7));

                    break;
                    case 15:
                    TextArea15.setText(rs.getString(2));
                    ANA15.setText(rs.getString(3));
                    ANB15.setText(rs.getString(4));
                    ANC15.setText(rs.getString(5));
                    AND15.setText(rs.getString(6));
                    jTextArea15.setText(rs.getString(7));

                    break;
                    case 16:
                    TextArea16.setText(rs.getString(2));
                    ANA16.setText(rs.getString(3));
                    ANB16.setText(rs.getString(4));
                    ANC16.setText(rs.getString(5));
                    AND16.setText(rs.getString(6));
                    jTextArea16.setText(rs.getString(7));

                    case 17:
                    TextArea17.setText(rs.getString(2));
                    ANA17.setText(rs.getString(3));
                    ANB17.setText(rs.getString(4));
                    ANC17.setText(rs.getString(5));
                    AND17.setText(rs.getString(6));
                    jTextArea17.setText(rs.getString(7));

                    break;
                    case 18:
                    TextArea18.setText(rs.getString(2));
                    ANA18.setText(rs.getString(3));
                    ANB18.setText(rs.getString(4));
                    ANC18.setText(rs.getString(5));
                    AND18.setText(rs.getString(6));
                    jTextArea18.setText(rs.getString(7));

                    break;
                    case 19:
                    TextArea19.setText(rs.getString(2));
                    ANA19.setText(rs.getString(3));
                    ANB19.setText(rs.getString(4));
                    ANC19.setText(rs.getString(5));
                    AND19.setText(rs.getString(6));
                    jTextArea19.setText(rs.getString(7));

                    break;
                    case 20:
                    TextArea20.setText(rs.getString(2));
                    ANA20.setText(rs.getString(3));
                    ANB20.setText(rs.getString(4));
                    ANC20.setText(rs.getString(5));
                    AND20.setText(rs.getString(6));
                    jTextArea20.setText(rs.getString(7));

                    break;
                    case 21:
                    TextArea21.setText(rs.getString(2));
                    ANA21.setText(rs.getString(3));
                    ANB21.setText(rs.getString(4));
                    ANC21.setText(rs.getString(5));
                    AND21.setText(rs.getString(6));
                    jTextArea21.setText(rs.getString(7));

                    break;
                    case 22:
                    TextArea22.setText(rs.getString(2));
                    ANA22.setText(rs.getString(3));
                    ANB22.setText(rs.getString(4));
                    ANC22.setText(rs.getString(5));
                    AND22.setText(rs.getString(6));
                    jTextArea22.setText(rs.getString(7));

                    break;
                    case 23:
                    TextArea23.setText(rs.getString(2));
                    ANA23.setText(rs.getString(3));
                    ANB23.setText(rs.getString(4));
                    ANC23.setText(rs.getString(5));
                    AND23.setText(rs.getString(6));
                    jTextArea23.setText(rs.getString(7));

                    break;
                    case 24:
                    TextArea24.setText(rs.getString(2));
                    ANA24.setText(rs.getString(3));
                    ANB24.setText(rs.getString(4));
                    ANC24.setText(rs.getString(5));
                    AND24.setText(rs.getString(6));
                    jTextArea24.setText(rs.getString(7));

                    break;
                    case 25:
                    TextArea25.setText(rs.getString(2));
                    ANA25.setText(rs.getString(3));
                    ANB25.setText(rs.getString(4));
                    ANC25.setText(rs.getString(5));
                    AND25.setText(rs.getString(6));
                    jTextArea25.setText(rs.getString(7));

                    break;

                }
            }


        }
        catch(HeadlessException | ClassNotFoundException | SQLException e )
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void TEST1()
    {
        jPanel3.setVisible(true);
        try
        {
    
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            String sql,sql2,sql3;
            PreparedStatement pst,pst2,pst3;
           
                    sql2 = "SELECT `QNO`,`SELANS`,`WRTANS` from `student`.`ANSTEST` WHERE `Test_ID` = ? AND `stdid` = ? AND `PGNO` = ? ORDER BY `comp_ID` LIMIT 0 , 30";
                    pst2 = con.prepareStatement(sql2);
                    pst2.setString(1,Test_ID.getText());
                    pst2.setString(2,stdid.getText());
                    pst2.setString(3,PGNO.getText());
                    ResultSet rs2  = pst2.executeQuery();
                   
                    while(rs2.next())
                    {
                             int QN = rs2.getInt(1);
                            char ANS = rs2.getString(2).charAt(0);                                           

                             switch (QN) {
                               case 1:
                                   switch (ANS)
                                    {
                                case 'A' :
                                    ANA1.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB1.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC1.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND1.setSelected(true);
                                  
                                    break;
                                    
                                    }
                   
                                        jLabel84.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 2:
                                       switch (ANS)
                                    {
                                case 'A' :
                                    ANA2.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB2.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC2.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND2.setSelected(true);
                                  
                                    break;
                                    
                                    }

                                        jLabel85.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 3:
                                       switch(ANS)
                                       {
                                       case 'A' :
                                    ANA3.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB3.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC3.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND3.setSelected(true);
                                  
                                    break;
                                    
                                    }

                                        jLabel86.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 4:
                                       switch (ANS)
                                    {
                                case 'A' :
                                    ANA4.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB4.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC4.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND4.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                       
                                        jLabel87.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 5:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA5.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB5.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC5.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND5.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel88.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 6:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA6.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB6.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC6.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND6.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel89.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 7:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA7.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB7.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC7.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND7.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel90.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 8:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA8.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB8.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC8.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND8.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel91.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 9:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA9.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB9.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC9.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND9.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel92.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 10:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA10.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB10.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC10.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND10.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel93.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 11:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA11.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB11.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC11.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND11.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel94.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 12:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA12.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB12.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC12.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND12.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel95.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 13:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA13.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB13.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC13.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND13.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel96.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 14:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA14.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB14.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC14.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND14.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel97.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 15:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA15.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB15.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC15.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND15.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel98.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 16:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA16.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB16.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC16.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND16.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel99.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 17:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA17.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB17.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC17.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND17.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel100.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 18:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA18.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB18.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC18.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND18.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel101.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 19:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA19.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB19.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC19.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND19.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel102.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 20:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA20.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB20.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC20.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND20.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel103.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 21:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA21.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB21.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC21.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND21.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel104.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 22:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA22.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB22.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC22.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND22.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel105.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 23:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA23.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB23.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC23.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND23.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel106.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 24:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA24.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB24.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC24.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND24.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel107.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   case 25:
                                        switch (ANS)
                                    {
                                case 'A' :
                                    ANA25.setSelected(true);
                                    break;
                                     case 'B':
                                     ANB25.setSelected(true);

                                    break; 
                                     case 'C':
                                     ANC25.setSelected(true);
                              
                                    break; 
                                     case 'D':
                                      AND25.setSelected(true);
                                  
                                    break;
                                    
                                    }
                                        jLabel108.setText("Answer  :"+rs2.getString(3));
                                        break;
                                   
                             } 
                    }
                    
                     int k = 0;
                    int m = 0;
                    int n = 0;

                            sql3 = "SELECT `ATT` from `student`.`ANSTEST` WHERE `Test_ID` = ? AND `stdid` = ? ";
                            pst3 = con.prepareStatement(sql3);
                            pst3.setString(1, Test_ID.getText());
                            pst3.setString(2, stdid.getText());
                           
                            ResultSet rs3  = pst3.executeQuery();
                            while(rs3.next()) 
                            {
                                String ATT = rs3.getString(1);
                                switch (ATT) {
                                    case "1":
                                        m++;
                                        break;
                                    case "0":
                                        n++;
                                        break;
                                    case "-1":
                                        k++;
                                        break;
                                    default:
                                        break;
                                 }
                            }

                             jTextField2.setText(""+m);
                            jTextField3.setText(""+n);
                            jTextField4.setText(""+k);
                  }
                 catch(HeadlessException | ClassNotFoundException | SQLException e )
                 {
                        JOptionPane.showMessageDialog(null,e);
                }
    }
    private void SUBMIT()
{
    try
                {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
                    String sql,sql1,sql2,sql3;
                    PreparedStatement pst,pst1,pst2,pst3;
                    int i= 1;
                   
                    sql1 = "SELECT `QNO`,`ANSWER` from `student`.`APTTEST` WHERE `comp_ID` = ? AND `Test_ID` = ? AND `PGNO` = ?  LIMIT 0 , 30";
                    pst1 = con.prepareStatement(sql1);
                    pst1.setString(1, Comp_ID.getText());
                    pst1.setString(2, Test_ID.getText());
                    pst1.setString(3, PGNO.getText());

                    ResultSet rs1  = pst1.executeQuery();

                    while(rs1.next())
                    {
                             int QNO = rs1.getInt(1);
                             String ANSWER  = rs1.getString(2);
                    
                            sql = "INSERT INTO `student`.`ANSTEST` (`Comp_ID`,`Test_ID`,`stdid`,`QNO`,`SELANS`,`WRTANS`,`PGNO`)VALUES(?, ?,?, ?, ?, ?, ?)";
                            pst = con.prepareStatement(sql);
                            pst.setString(1, Comp_ID.getText());
                            pst.setString(2, Test_ID.getText());
                            pst.setString(3, stdid.getText());
                            pst.setInt(4,rs1.getInt(1));
                            pst.setString(6,rs1.getString(2));
                            pst.setString(7,PGNO.getText());
           
                            String SELANS = "N";
                            String A = "A";
                            String B = "B";
                            String C = "C";
                            String D = "D";
                           switch (QNO) {
                               case 1:
                                   
                                  
                                  if(ANA1.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB1.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC1.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND1.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                  else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                

                                   break;
                               case 2:
                                   
                                  if(ANA2.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB2.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC2.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND2.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                 else
                                  {
                                        pst.setString(5,SELANS);
                                  }

                                   break;
     
                               case 3:
                                    if(ANA3.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB3.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC3.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND3.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                
                                  else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                   break;
                                 
                               case 4:
                                    
                                  if(ANA4.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB4.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC4.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND4.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                   else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                

                                   break;
                      
                               case 5:
                                   
                                  if(ANA5.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB5.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC5.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND5.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                
                                else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                   break;
                                
                               case 6:
                                    
                                  if(ANA6.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB6.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC6.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND6.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                   else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                


                                   break;
    
                               case 7:
                                  if(ANA7.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB7.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC7.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND7.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                  else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                


                                   break;
                        
                                    case 8:
                                    
                                  if(ANA8.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB8.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC8.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND8.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                   else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                

                             

                                   break;
                               case 9:
                                    if(ANA9.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB9.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC9.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND9.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                     else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                

                                   break;
                               case 10:
                                    
                                  if(ANA10.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB10.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC10.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND10.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                  else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                   break;
                                
                               case 11:
                                   
                                  if(ANA11.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB11.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC11.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND11.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                
                                else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                   break;
                               case 12:
                                    
                                  if(ANA12.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB12.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC12.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND12.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                 else
                                  {
                                        pst.setString(5,SELANS);
                                  }

                                   break;
                               case 13:
                                    
                                  if(ANA13.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB13.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC13.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND13.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                
                                     else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                   break;
                                   
                               case 14:
                                    
                                  if(ANA14.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB14.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC14.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND14.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                 else
                                  {
                                        pst.setString(5,SELANS);
                                  }

                                   break;
                               case 15:
                                   
                                  if(ANA15.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB15.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC15.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND15.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                 else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                

                                   break;
                               case 16:
                                    
                                  if(ANA16.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB16.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC16.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND16.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                
                                   else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                   break;
                               case 17:
                                
                                  if(ANA17.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB17.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC17.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND17.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                
                       else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                   break;
                               case 18:
                                   
                                  if(ANA18.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB18.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC18.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND18.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                 else
                                  {
                                        pst.setString(5,SELANS);
                                  }

                                   break;
                               case 19:
                                  
                                  if(ANA19.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB19.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC19.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND19.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                
                                    else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                   break;
                               case 20:
                                   
                                  if(ANA20.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB20.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC20.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND20.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                 else
                                  {
                                        pst.setString(5,SELANS);
                                  }

                                   break;
                               case 21:
                                  
                                  if(ANA21.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB21.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC21.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND21.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                 else
                                  {
                                        pst.setString(5,SELANS);
                                  }

                                   break;
                               case 22:
                                   
                                  if(ANA22.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB22.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC22.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND22.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                
                                 else
                                  {
                                        pst.setString(5,SELANS);
                                  }

                                   break;
                               case 23:
                                   
                                  if(ANA23.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB23.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC23.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND23.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                 else
                                  {
                                        pst.setString(5,SELANS);
                                  }

                                   break;
                               case 24:
                                   
                                  if(ANA24.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB24.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC24.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND24.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                 else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                      
                                   break;
                               case 25:
                                   
                                  if(ANA25.isSelected())
                                  {
                                      pst.setString(5,A);

                                  }
                                  else if(ANB25.isSelected())
                                  {
                                      pst.setString(5,B);

                                  }
                                  else if(ANC25.isSelected())
                                  {
                                      pst.setString(5,C);

                                  }
                                  else if(AND25.isSelected())
                                  {
                                      pst.setString(5,D);

                                  }
                                
                                   else
                                  {
                                        pst.setString(5,SELANS);
                                  }
                                   break;
                            
                                   
                               
                           }

                           pst.execute();
                    
                   
                    }
                    
                    sql2 = "SELECT `SELANS`,`WRTANS`,`QNO` from `student`.`ANSTEST` WHERE `comp_ID` = ? AND `Test_ID` = ? AND `stdid` = ? AND `PGNO` = ?  LIMIT 0 , 30";
                    pst2 = con.prepareStatement(sql2);
                    pst2.setString(1, Comp_ID.getText());
                    pst2.setString(2, Test_ID.getText());
                    pst2.setString(3, stdid.getText());
                    pst2.setString(4, PGNO.getText());

                    ResultSet rs2  = pst2.executeQuery();

                    while(rs2.next())
                    {
                             String SLANS = rs2.getString(1);                                           
                             String WRANS  = rs2.getString(2);
                             int QN = rs2.getInt(3);
                                                            
                            sql3="UPDATE `student`.`ANSTEST` SET `ATT`=? WHERE `ANSTEST`.`Test_ID` = ?  AND `stdid` = ? AND `QNO` = ? AND `PGNO` = ?";

                            pst3 = con.prepareStatement(sql3);
                            if(SLANS.equals(WRANS))
                            {
                                 pst3.setString(1,"1");
                           }
                            else if(SLANS.equals("N"))
                            {
                                 pst3.setString(1,"-1");
                            }
                            else
                            {
                                pst3.setString(1,"0");
                            }
                            pst3.setString(2, Test_ID.getText());
                            pst3.setString(3,stdid.getText());
                            pst3.setInt(4, QN);
                            pst3.setString(5, PGNO.getText());
                            pst3.execute();
                           
                    }
                                       JOptionPane.showMessageDialog(null,"Answers Submitted");
                                       int p = Integer.parseInt(TOTPG.getText());
                                        int PG = Integer.parseInt(PGNO.getText());
      
                                        if(p == PG)
                                        {
                                            T.stop();
                                            dispose();          
                                        } 
                                        else
                                        {
                                                int m =Integer.parseInt(NO1.getText());
                                                m = m + 25 ;
                                                int n= m -1 ;
                                                String TestNam = Test_Name.getText();
                                                String comp = Comp_ID.getText();
                                                String stdi  =stdid.getText();
                                                String usern = Test_ID.getText();
                                                int PGN  = Integer.parseInt(PGNO.getText());
                                                PGN = PGN + 1;
                                                T.stop();
                                                int hh1 = Integer.parseInt(HR.getText());
                                                int mm1 = Integer.parseInt(MN.getText());
                                                int ss1 = Integer.parseInt(SC.getText());

                                                new ANSAPT(usern,comp,TestNam,stdi,PGN,p,m,n,hh1,mm1,ss1).setVisible(true); 
                                                dispose();
                                        }
                                       jButton4.setEnabled(false);
                                       
                                       
                                           

                                        
          
                   }
                catch(HeadlessException | ClassNotFoundException | SQLException e )
                {
                    JOptionPane.showMessageDialog(null,e);
                }

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        buttonGroup24 = new javax.swing.ButtonGroup();
        buttonGroup25 = new javax.swing.ButtonGroup();
        buttonGroup26 = new javax.swing.ButtonGroup();
        buttonGroup27 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        QN1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        ANA1 = new javax.swing.JRadioButton();
        ANB1 = new javax.swing.JRadioButton();
        ANC1 = new javax.swing.JRadioButton();
        AND1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        JPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Panel2 = new javax.swing.JPanel();
        QN2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TextArea2 = new javax.swing.JTextArea();
        ANA2 = new javax.swing.JRadioButton();
        ANB2 = new javax.swing.JRadioButton();
        ANC2 = new javax.swing.JRadioButton();
        AND2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        JPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel118 = new javax.swing.JLabel();
        Panel3 = new javax.swing.JPanel();
        QN3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TextArea3 = new javax.swing.JTextArea();
        ANA3 = new javax.swing.JRadioButton();
        ANB3 = new javax.swing.JRadioButton();
        ANC3 = new javax.swing.JRadioButton();
        AND3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        JPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel119 = new javax.swing.JLabel();
        Panel4 = new javax.swing.JPanel();
        QN4 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        TextArea4 = new javax.swing.JTextArea();
        ANA4 = new javax.swing.JRadioButton();
        ANB4 = new javax.swing.JRadioButton();
        ANC4 = new javax.swing.JRadioButton();
        AND4 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jCheckBox5 = new javax.swing.JCheckBox();
        JPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel120 = new javax.swing.JLabel();
        Panel5 = new javax.swing.JPanel();
        QN5 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        TextArea5 = new javax.swing.JTextArea();
        ANA5 = new javax.swing.JRadioButton();
        ANB5 = new javax.swing.JRadioButton();
        ANC5 = new javax.swing.JRadioButton();
        AND5 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        JPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel121 = new javax.swing.JLabel();
        Panel19 = new javax.swing.JPanel();
        QN19 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        TextArea19 = new javax.swing.JTextArea();
        ANA19 = new javax.swing.JRadioButton();
        ANB19 = new javax.swing.JRadioButton();
        ANC19 = new javax.swing.JRadioButton();
        AND19 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jCheckBox20 = new javax.swing.JCheckBox();
        JPanel19 = new javax.swing.JPanel();
        jScrollPane45 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        jLabel102 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        Panel20 = new javax.swing.JPanel();
        QN20 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        TextArea20 = new javax.swing.JTextArea();
        ANA20 = new javax.swing.JRadioButton();
        ANB20 = new javax.swing.JRadioButton();
        ANC20 = new javax.swing.JRadioButton();
        AND20 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jCheckBox21 = new javax.swing.JCheckBox();
        JPanel20 = new javax.swing.JPanel();
        jScrollPane46 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jLabel136 = new javax.swing.JLabel();
        Panel21 = new javax.swing.JPanel();
        QN21 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        TextArea21 = new javax.swing.JTextArea();
        ANA21 = new javax.swing.JRadioButton();
        ANB21 = new javax.swing.JRadioButton();
        ANC21 = new javax.swing.JRadioButton();
        AND21 = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jCheckBox22 = new javax.swing.JCheckBox();
        JPanel21 = new javax.swing.JPanel();
        jScrollPane47 = new javax.swing.JScrollPane();
        jTextArea21 = new javax.swing.JTextArea();
        jLabel137 = new javax.swing.JLabel();
        Panel22 = new javax.swing.JPanel();
        QN22 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        TextArea22 = new javax.swing.JTextArea();
        ANA22 = new javax.swing.JRadioButton();
        ANB22 = new javax.swing.JRadioButton();
        ANC22 = new javax.swing.JRadioButton();
        AND22 = new javax.swing.JRadioButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jCheckBox23 = new javax.swing.JCheckBox();
        JPanel22 = new javax.swing.JPanel();
        jScrollPane48 = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        jLabel138 = new javax.swing.JLabel();
        Panel7 = new javax.swing.JPanel();
        QN7 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        TextArea7 = new javax.swing.JTextArea();
        ANA7 = new javax.swing.JRadioButton();
        ANB7 = new javax.swing.JRadioButton();
        ANC7 = new javax.swing.JRadioButton();
        AND7 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        JPanel7 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel123 = new javax.swing.JLabel();
        Panel6 = new javax.swing.JPanel();
        QN6 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        TextArea6 = new javax.swing.JTextArea();
        ANA6 = new javax.swing.JRadioButton();
        ANB6 = new javax.swing.JRadioButton();
        ANC6 = new javax.swing.JRadioButton();
        AND6 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        JPanel6 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel122 = new javax.swing.JLabel();
        Panel10 = new javax.swing.JPanel();
        QN10 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        TextArea10 = new javax.swing.JTextArea();
        ANA10 = new javax.swing.JRadioButton();
        ANB10 = new javax.swing.JRadioButton();
        ANC10 = new javax.swing.JRadioButton();
        AND10 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jCheckBox11 = new javax.swing.JCheckBox();
        JPanel10 = new javax.swing.JPanel();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jLabel126 = new javax.swing.JLabel();
        Panel8 = new javax.swing.JPanel();
        QN8 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        TextArea8 = new javax.swing.JTextArea();
        ANA8 = new javax.swing.JRadioButton();
        ANB8 = new javax.swing.JRadioButton();
        AND8 = new javax.swing.JRadioButton();
        ANC8 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jCheckBox9 = new javax.swing.JCheckBox();
        JPanel8 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel124 = new javax.swing.JLabel();
        Panel18 = new javax.swing.JPanel();
        QN18 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        TextArea18 = new javax.swing.JTextArea();
        ANA18 = new javax.swing.JRadioButton();
        ANB18 = new javax.swing.JRadioButton();
        ANC18 = new javax.swing.JRadioButton();
        AND18 = new javax.swing.JRadioButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jCheckBox19 = new javax.swing.JCheckBox();
        JPanel18 = new javax.swing.JPanel();
        jScrollPane44 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jLabel101 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        Panel9 = new javax.swing.JPanel();
        QN9 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        TextArea9 = new javax.swing.JTextArea();
        ANA9 = new javax.swing.JRadioButton();
        ANB9 = new javax.swing.JRadioButton();
        ANC9 = new javax.swing.JRadioButton();
        AND9 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jCheckBox10 = new javax.swing.JCheckBox();
        JPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel125 = new javax.swing.JLabel();
        Panel13 = new javax.swing.JPanel();
        QN13 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        TextArea13 = new javax.swing.JTextArea();
        ANA13 = new javax.swing.JRadioButton();
        ANB13 = new javax.swing.JRadioButton();
        ANC13 = new javax.swing.JRadioButton();
        AND13 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jCheckBox14 = new javax.swing.JCheckBox();
        JPanel13 = new javax.swing.JPanel();
        jScrollPane39 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jLabel129 = new javax.swing.JLabel();
        Panel11 = new javax.swing.JPanel();
        QN11 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        TextArea11 = new javax.swing.JTextArea();
        ANA11 = new javax.swing.JRadioButton();
        ANB11 = new javax.swing.JRadioButton();
        ANC11 = new javax.swing.JRadioButton();
        AND11 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jCheckBox12 = new javax.swing.JCheckBox();
        JPanel11 = new javax.swing.JPanel();
        jScrollPane37 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jLabel127 = new javax.swing.JLabel();
        Panel15 = new javax.swing.JPanel();
        QN15 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        TextArea15 = new javax.swing.JTextArea();
        ANA15 = new javax.swing.JRadioButton();
        ANB15 = new javax.swing.JRadioButton();
        ANC15 = new javax.swing.JRadioButton();
        AND15 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jCheckBox16 = new javax.swing.JCheckBox();
        jLabel98 = new javax.swing.JLabel();
        JPanel15 = new javax.swing.JPanel();
        jScrollPane41 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jLabel131 = new javax.swing.JLabel();
        Panel14 = new javax.swing.JPanel();
        QN14 = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        TextArea14 = new javax.swing.JTextArea();
        ANA14 = new javax.swing.JRadioButton();
        ANB14 = new javax.swing.JRadioButton();
        ANC14 = new javax.swing.JRadioButton();
        AND14 = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jCheckBox15 = new javax.swing.JCheckBox();
        JPanel14 = new javax.swing.JPanel();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jLabel130 = new javax.swing.JLabel();
        Panel17 = new javax.swing.JPanel();
        QN17 = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        TextArea17 = new javax.swing.JTextArea();
        ANA17 = new javax.swing.JRadioButton();
        ANB17 = new javax.swing.JRadioButton();
        ANC17 = new javax.swing.JRadioButton();
        AND17 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jCheckBox18 = new javax.swing.JCheckBox();
        JPanel17 = new javax.swing.JPanel();
        jScrollPane43 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jLabel133 = new javax.swing.JLabel();
        Panel12 = new javax.swing.JPanel();
        QN12 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        TextArea12 = new javax.swing.JTextArea();
        ANA12 = new javax.swing.JRadioButton();
        ANB12 = new javax.swing.JRadioButton();
        ANC12 = new javax.swing.JRadioButton();
        AND12 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        JPanel12 = new javax.swing.JPanel();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jLabel128 = new javax.swing.JLabel();
        Panel25 = new javax.swing.JPanel();
        QN25 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        TextArea25 = new javax.swing.JTextArea();
        ANA25 = new javax.swing.JRadioButton();
        ANB25 = new javax.swing.JRadioButton();
        ANC25 = new javax.swing.JRadioButton();
        AND25 = new javax.swing.JRadioButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jCheckBox26 = new javax.swing.JCheckBox();
        JPanel25 = new javax.swing.JPanel();
        jScrollPane51 = new javax.swing.JScrollPane();
        jTextArea25 = new javax.swing.JTextArea();
        jLabel141 = new javax.swing.JLabel();
        Panel23 = new javax.swing.JPanel();
        QN23 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        TextArea23 = new javax.swing.JTextArea();
        ANA23 = new javax.swing.JRadioButton();
        ANB23 = new javax.swing.JRadioButton();
        ANC23 = new javax.swing.JRadioButton();
        AND23 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jCheckBox24 = new javax.swing.JCheckBox();
        jPanel24 = new javax.swing.JPanel();
        JPanel23 = new javax.swing.JPanel();
        jScrollPane49 = new javax.swing.JScrollPane();
        jTextArea23 = new javax.swing.JTextArea();
        jLabel139 = new javax.swing.JLabel();
        Panel24 = new javax.swing.JPanel();
        QN24 = new javax.swing.JLabel();
        jScrollPane35 = new javax.swing.JScrollPane();
        TextArea24 = new javax.swing.JTextArea();
        ANA24 = new javax.swing.JRadioButton();
        ANB24 = new javax.swing.JRadioButton();
        ANC24 = new javax.swing.JRadioButton();
        AND24 = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jCheckBox25 = new javax.swing.JCheckBox();
        JPanel24 = new javax.swing.JPanel();
        jScrollPane50 = new javax.swing.JScrollPane();
        jTextArea24 = new javax.swing.JTextArea();
        jLabel140 = new javax.swing.JLabel();
        Panel16 = new javax.swing.JPanel();
        QN16 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        TextArea16 = new javax.swing.JTextArea();
        ANA16 = new javax.swing.JRadioButton();
        ANB16 = new javax.swing.JRadioButton();
        ANC16 = new javax.swing.JRadioButton();
        AND16 = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jCheckBox17 = new javax.swing.JCheckBox();
        JPanel16 = new javax.swing.JPanel();
        jScrollPane42 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jLabel132 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Comp_ID = new javax.swing.JTextField();
        Test_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Test_Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stdid = new javax.swing.JTextField();
        NO1 = new javax.swing.JTextField();
        NO2 = new javax.swing.JTextField();
        PGNO = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        TOTPG = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        TQ = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        HR = new javax.swing.JLabel();
        MN = new javax.swing.JLabel();
        SC = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Panel1.setBackground(new java.awt.Color(204, 204, 204));
        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QN1.setText("1");
        Panel1.add(QN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 26, 17, -1));

        TextArea1.setEditable(false);
        TextArea1.setBackground(new java.awt.Color(204, 255, 255));
        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        TextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane3.setViewportView(TextArea1);

        Panel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 11, 790, 341));

        buttonGroup1.add(ANA1);
        ANA1.setText("A");
        Panel1.add(ANA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 40, 20));

        buttonGroup1.add(ANB1);
        ANB1.setText("B");
        Panel1.add(ANB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, -1, -1));

        buttonGroup1.add(ANC1);
        ANC1.setText("C");
        Panel1.add(ANC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        buttonGroup1.add(AND1);
        AND1.setText("D");
        AND1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AND1ActionPerformed(evt);
            }
        });
        Panel1.add(AND1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("A.");
        Panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 404, -1, 30));

        jLabel31.setForeground(new java.awt.Color(255, 0, 0));
        jLabel31.setText("B.");
        Panel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 407, -1, 30));

        jLabel80.setForeground(new java.awt.Color(255, 0, 0));
        jLabel80.setText("C.");
        Panel1.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 414, -1, 20));

        jLabel84.setBackground(new java.awt.Color(204, 204, 255));
        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(204, 0, 204));
        Panel1.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 11, 360, 36));

        jLabel109.setForeground(new java.awt.Color(255, 0, 0));
        jLabel109.setText("D.");
        Panel1.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 410, -1, 20));

        buttonGroup27.add(jCheckBox1);
        jCheckBox1.setText("View Explanation");
        jCheckBox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox1FocusLost(evt);
            }
        });
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
        Panel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, -1, -1));

        JPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        Panel1.add(JPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(843, 58, -1, 294));

        Panel2.setBackground(new java.awt.Color(204, 204, 204));
        Panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN2.setText("2");

        TextArea2.setEditable(false);
        TextArea2.setBackground(new java.awt.Color(204, 255, 255));
        TextArea2.setColumns(20);
        TextArea2.setRows(5);
        TextArea2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane7.setViewportView(TextArea2);

        buttonGroup2.add(ANA2);
        ANA2.setText("A");

        buttonGroup2.add(ANB2);
        ANB2.setText("B");

        buttonGroup2.add(ANC2);
        ANC2.setText("C");

        buttonGroup2.add(AND2);
        AND2.setText("D");

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("A.");

        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("B.");

        jLabel55.setForeground(new java.awt.Color(255, 0, 0));
        jLabel55.setText("C.");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox2);
        jCheckBox2.setText("View Explanation");
        jCheckBox2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox2FocusLost(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        JPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout JPanel2Layout = new javax.swing.GroupLayout(JPanel2);
        JPanel2.setLayout(JPanel2Layout);
        JPanel2Layout.setHorizontalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPanel2Layout.setVerticalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel118.setForeground(new java.awt.Color(255, 0, 0));
        jLabel118.setText("D.");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ANA2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ANB2)
                .addGap(152, 152, 152)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ANC2)
                .addGap(128, 128, 128)
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AND2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2298, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QN2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ANA2)
                        .addComponent(ANB2)
                        .addComponent(ANC2)
                        .addComponent(jLabel7)
                        .addComponent(jLabel32)
                        .addComponent(jLabel55))
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AND2)
                        .addComponent(jLabel118)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Panel3.setBackground(new java.awt.Color(204, 204, 204));
        Panel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN3.setText("3");

        TextArea3.setEditable(false);
        TextArea3.setBackground(new java.awt.Color(204, 255, 255));
        TextArea3.setColumns(20);
        TextArea3.setRows(5);
        TextArea3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane9.setViewportView(TextArea3);

        buttonGroup3.add(ANA3);
        ANA3.setText("A");

        buttonGroup3.add(ANB3);
        ANB3.setText("B");

        buttonGroup3.add(ANC3);
        ANC3.setText("C");

        buttonGroup3.add(AND3);
        AND3.setText("D");
        AND3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AND3ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("A.");

        jLabel33.setForeground(new java.awt.Color(255, 0, 0));
        jLabel33.setText("B.");

        jLabel57.setForeground(new java.awt.Color(255, 0, 0));
        jLabel57.setText("C.");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox4);
        jCheckBox4.setText("View Explanation");
        jCheckBox4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox4FocusLost(evt);
            }
        });
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        JPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea3.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea3.setRows(5);
        jTextArea3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane5.setViewportView(jTextArea3);

        javax.swing.GroupLayout JPanel3Layout = new javax.swing.GroupLayout(JPanel3);
        JPanel3.setLayout(JPanel3Layout);
        JPanel3Layout.setHorizontalGroup(
            JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel3Layout.setVerticalGroup(
            JPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );

        jLabel119.setForeground(new java.awt.Color(255, 0, 0));
        jLabel119.setText("D.");

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA3)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB3)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC3)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addComponent(QN3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2296, Short.MAX_VALUE))))
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN3)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AND3)
                            .addComponent(ANC3)
                            .addComponent(ANB3)
                            .addComponent(ANA3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel33)
                            .addComponent(jLabel57)
                            .addComponent(jLabel119))
                        .addGap(19, 19, 19))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Panel4.setBackground(new java.awt.Color(204, 204, 204));
        Panel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN4.setText("4");

        TextArea4.setEditable(false);
        TextArea4.setBackground(new java.awt.Color(204, 255, 255));
        TextArea4.setColumns(20);
        TextArea4.setRows(5);
        TextArea4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane14.setViewportView(TextArea4);

        buttonGroup4.add(ANA4);
        ANA4.setText("A");

        buttonGroup4.add(ANB4);
        ANB4.setText("B");

        buttonGroup4.add(ANC4);
        ANC4.setText("C");

        buttonGroup4.add(AND4);
        AND4.setText("D");

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("A.");

        jLabel34.setForeground(new java.awt.Color(255, 0, 0));
        jLabel34.setText("B.");

        jLabel58.setForeground(new java.awt.Color(255, 0, 0));
        jLabel58.setText("C.");

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox5);
        jCheckBox5.setText("View Explanation");
        jCheckBox5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox5FocusLost(evt);
            }
        });
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        JPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea4.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea4.setRows(5);
        jTextArea4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane8.setViewportView(jTextArea4);

        javax.swing.GroupLayout JPanel4Layout = new javax.swing.GroupLayout(JPanel4);
        JPanel4.setLayout(JPanel4Layout);
        JPanel4Layout.setHorizontalGroup(
            JPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        JPanel4Layout.setVerticalGroup(
            JPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
        );

        jLabel120.setForeground(new java.awt.Color(255, 0, 0));
        jLabel120.setText("D.");

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4Layout.createSequentialGroup()
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel4Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA4)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ANB4)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC4)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel120)
                        .addGap(18, 18, 18)
                        .addComponent(AND4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QN4)
                    .addGroup(Panel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel4Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ANA4)
                    .addComponent(jLabel9)
                    .addComponent(AND4)
                    .addComponent(ANC4)
                    .addComponent(jLabel58)
                    .addComponent(ANB4)
                    .addComponent(jLabel34)
                    .addComponent(jLabel120))
                .addGap(19, 19, 19))
        );

        Panel5.setBackground(new java.awt.Color(204, 204, 204));
        Panel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN5.setText("5");

        TextArea5.setEditable(false);
        TextArea5.setBackground(new java.awt.Color(204, 255, 255));
        TextArea5.setColumns(20);
        TextArea5.setRows(5);
        TextArea5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane15.setViewportView(TextArea5);

        buttonGroup5.add(ANA5);
        ANA5.setText("A");

        buttonGroup5.add(ANB5);
        ANB5.setText("B");

        buttonGroup5.add(ANC5);
        ANC5.setText("C");

        buttonGroup5.add(AND5);
        AND5.setText("D");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("A.");

        jLabel35.setForeground(new java.awt.Color(255, 0, 0));
        jLabel35.setText("B.");

        jLabel59.setForeground(new java.awt.Color(255, 0, 0));
        jLabel59.setText("C.");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox6);
        jCheckBox6.setText("View Explanation");
        jCheckBox6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox6FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox6FocusLost(evt);
            }
        });
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        JPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea5.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea5.setRows(5);
        jTextArea5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane6.setViewportView(jTextArea5);

        javax.swing.GroupLayout JPanel5Layout = new javax.swing.GroupLayout(JPanel5);
        JPanel5.setLayout(JPanel5Layout);
        JPanel5Layout.setHorizontalGroup(
            JPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPanel5Layout.setVerticalGroup(
            JPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6))
        );

        jLabel121.setForeground(new java.awt.Color(255, 0, 0));
        jLabel121.setText("D.");

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel5Layout.createSequentialGroup()
                .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox6)
                            .addGroup(Panel5Layout.createSequentialGroup()
                                .addComponent(QN5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Panel5Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA5)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB5)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC5)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel121)
                        .addGap(18, 18, 18)
                        .addComponent(AND5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel5Layout.createSequentialGroup()
                .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN5))
                    .addGroup(Panel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Panel5Layout.createSequentialGroup()
                                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ANA5)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(ANB5)
                    .addComponent(jLabel59)
                    .addComponent(ANC5)
                    .addComponent(AND5)
                    .addComponent(jLabel121))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Panel19.setBackground(new java.awt.Color(204, 204, 204));
        Panel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN19.setText("19");

        TextArea19.setEditable(false);
        TextArea19.setBackground(new java.awt.Color(204, 255, 255));
        TextArea19.setColumns(20);
        TextArea19.setRows(5);
        TextArea19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane16.setViewportView(TextArea19);

        buttonGroup19.add(ANA19);
        ANA19.setText("A");

        buttonGroup19.add(ANB19);
        ANB19.setText("B");

        buttonGroup19.add(ANC19);
        ANC19.setText("C");

        buttonGroup19.add(AND19);
        AND19.setText("D");

        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("A.");

        jLabel49.setForeground(new java.awt.Color(255, 0, 0));
        jLabel49.setText("B.");

        jLabel73.setForeground(new java.awt.Color(255, 0, 0));
        jLabel73.setText("C.");

        buttonGroup27.add(jCheckBox20);
        jCheckBox20.setText("View Explanation");
        jCheckBox20.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox20FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox20FocusLost(evt);
            }
        });

        JPanel19.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea19.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea19.setColumns(20);
        jTextArea19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea19.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea19.setRows(5);
        jTextArea19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane45.setViewportView(jTextArea19);

        javax.swing.GroupLayout JPanel19Layout = new javax.swing.GroupLayout(JPanel19);
        JPanel19.setLayout(JPanel19Layout);
        JPanel19Layout.setHorizontalGroup(
            JPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        JPanel19Layout.setVerticalGroup(
            JPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel19Layout.createSequentialGroup()
                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(204, 0, 204));

        jLabel135.setForeground(new java.awt.Color(255, 0, 0));
        jLabel135.setText("D.");

        javax.swing.GroupLayout Panel19Layout = new javax.swing.GroupLayout(Panel19);
        Panel19.setLayout(Panel19Layout);
        Panel19Layout.setHorizontalGroup(
            Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel19Layout.createSequentialGroup()
                .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel19Layout.createSequentialGroup()
                                .addComponent(QN19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel19Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA19)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB19)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC19)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel135)
                        .addGap(18, 18, 18)
                        .addComponent(AND19)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        Panel19Layout.setVerticalGroup(
            Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel19Layout.createSequentialGroup()
                .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(QN19)
                        .addGroup(Panel19Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AND19)
                    .addComponent(ANC19)
                    .addComponent(ANB19)
                    .addComponent(ANA19)
                    .addComponent(jLabel24)
                    .addComponent(jLabel49)
                    .addComponent(jLabel73)
                    .addComponent(jLabel135))
                .addGap(19, 19, 19))
        );

        Panel20.setBackground(new java.awt.Color(204, 204, 204));
        Panel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN20.setText("20");

        TextArea20.setEditable(false);
        TextArea20.setBackground(new java.awt.Color(204, 255, 255));
        TextArea20.setColumns(20);
        TextArea20.setRows(5);
        TextArea20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane17.setViewportView(TextArea20);

        buttonGroup20.add(ANA20);
        ANA20.setText("A");
        ANA20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANA20ActionPerformed(evt);
            }
        });

        buttonGroup20.add(ANB20);
        ANB20.setText("B");

        buttonGroup20.add(ANC20);
        ANC20.setText("C");

        buttonGroup20.add(AND20);
        AND20.setText("D");

        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("A.");

        jLabel50.setForeground(new java.awt.Color(255, 0, 0));
        jLabel50.setText("B.");

        jLabel74.setForeground(new java.awt.Color(255, 0, 0));
        jLabel74.setText("C.");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox21);
        jCheckBox21.setText("View Explanation");
        jCheckBox21.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox21FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox21FocusLost(evt);
            }
        });

        JPanel20.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea20.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea20.setColumns(20);
        jTextArea20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea20.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea20.setRows(5);
        jTextArea20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane46.setViewportView(jTextArea20);

        javax.swing.GroupLayout JPanel20Layout = new javax.swing.GroupLayout(JPanel20);
        JPanel20.setLayout(JPanel20Layout);
        JPanel20Layout.setHorizontalGroup(
            JPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane46, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
        );
        JPanel20Layout.setVerticalGroup(
            JPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane46, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
        );

        jLabel136.setForeground(new java.awt.Color(255, 0, 0));
        jLabel136.setText("D.");

        javax.swing.GroupLayout Panel20Layout = new javax.swing.GroupLayout(Panel20);
        Panel20.setLayout(Panel20Layout);
        Panel20Layout.setHorizontalGroup(
            Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel20Layout.createSequentialGroup()
                .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel20Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA20)
                        .addGap(203, 203, 203)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB20)
                        .addGap(165, 165, 165)
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANC20)
                        .addGap(150, 150, 150)
                        .addComponent(jLabel136)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND20))
                    .addGroup(Panel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel20Layout.createSequentialGroup()
                                .addComponent(QN20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox21, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(530, Short.MAX_VALUE))
        );
        Panel20Layout.setVerticalGroup(
            Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QN20)
                    .addGroup(Panel20Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel20Layout.createSequentialGroup()
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox21))
                            .addGroup(Panel20Layout.createSequentialGroup()
                                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(JPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(45, 45, 45)
                .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ANA20)
                        .addComponent(jLabel25)
                        .addComponent(jLabel50)
                        .addComponent(ANB20))
                    .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel74)
                        .addComponent(ANC20))
                    .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AND20)
                        .addComponent(jLabel136)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Panel21.setBackground(new java.awt.Color(204, 204, 204));
        Panel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN21.setText("21");

        TextArea21.setEditable(false);
        TextArea21.setBackground(new java.awt.Color(204, 255, 255));
        TextArea21.setColumns(20);
        TextArea21.setRows(5);
        TextArea21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane18.setViewportView(TextArea21);

        buttonGroup21.add(ANA21);
        ANA21.setText("A");

        buttonGroup21.add(ANB21);
        ANB21.setText("B");

        buttonGroup21.add(ANC21);
        ANC21.setText("C");

        buttonGroup21.add(AND21);
        AND21.setText("D");

        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("A.");

        jLabel51.setForeground(new java.awt.Color(255, 0, 0));
        jLabel51.setText("B.");

        jLabel75.setForeground(new java.awt.Color(255, 0, 0));
        jLabel75.setText("C.");

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox22);
        jCheckBox22.setText("View Explanation");
        jCheckBox22.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox22FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox22FocusLost(evt);
            }
        });

        JPanel21.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea21.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea21.setColumns(20);
        jTextArea21.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea21.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea21.setRows(5);
        jTextArea21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane47.setViewportView(jTextArea21);

        javax.swing.GroupLayout JPanel21Layout = new javax.swing.GroupLayout(JPanel21);
        JPanel21.setLayout(JPanel21Layout);
        JPanel21Layout.setHorizontalGroup(
            JPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane47, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPanel21Layout.setVerticalGroup(
            JPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane47, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel137.setForeground(new java.awt.Color(255, 0, 0));
        jLabel137.setText("D.");

        javax.swing.GroupLayout Panel21Layout = new javax.swing.GroupLayout(Panel21);
        Panel21.setLayout(Panel21Layout);
        Panel21Layout.setHorizontalGroup(
            Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel21Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ANA21)
                .addGap(167, 167, 167)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ANB21)
                .addGap(161, 161, 161)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ANC21)
                .addGap(148, 148, 148)
                .addComponent(jLabel137)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AND21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel21Layout.createSequentialGroup()
                        .addComponent(QN21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        Panel21Layout.setVerticalGroup(
            Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel21Layout.createSequentialGroup()
                .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN21))
                    .addGroup(Panel21Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Panel21Layout.createSequentialGroup()
                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox22)))
                .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel21Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ANB21)
                            .addComponent(ANA21)
                            .addComponent(ANC21)
                            .addComponent(jLabel26)
                            .addComponent(jLabel51)
                            .addComponent(jLabel75))
                        .addGap(20, 20, 20))
                    .addGroup(Panel21Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AND21)
                            .addComponent(jLabel137))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Panel22.setBackground(new java.awt.Color(204, 204, 204));
        Panel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN22.setText("22");

        TextArea22.setEditable(false);
        TextArea22.setBackground(new java.awt.Color(204, 255, 255));
        TextArea22.setColumns(20);
        TextArea22.setRows(5);
        TextArea22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane19.setViewportView(TextArea22);

        buttonGroup22.add(ANA22);
        ANA22.setText("A");

        buttonGroup22.add(ANB22);
        ANB22.setText("B");

        buttonGroup22.add(ANC22);
        ANC22.setText("C");

        buttonGroup22.add(AND22);
        AND22.setText("D");

        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("A.");

        jLabel52.setForeground(new java.awt.Color(255, 0, 0));
        jLabel52.setText("B.");

        jLabel76.setForeground(new java.awt.Color(255, 0, 0));
        jLabel76.setText("C.");

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox23);
        jCheckBox23.setText("View Explanation");
        jCheckBox23.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox23FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox23FocusLost(evt);
            }
        });

        JPanel22.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea22.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea22.setColumns(20);
        jTextArea22.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea22.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea22.setRows(5);
        jTextArea22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane48.setViewportView(jTextArea22);

        javax.swing.GroupLayout JPanel22Layout = new javax.swing.GroupLayout(JPanel22);
        JPanel22.setLayout(JPanel22Layout);
        JPanel22Layout.setHorizontalGroup(
            JPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        JPanel22Layout.setVerticalGroup(
            JPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel22Layout.createSequentialGroup()
                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jLabel138.setForeground(new java.awt.Color(255, 0, 0));
        jLabel138.setText("D.");

        javax.swing.GroupLayout Panel22Layout = new javax.swing.GroupLayout(Panel22);
        Panel22.setLayout(Panel22Layout);
        Panel22Layout.setHorizontalGroup(
            Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel22Layout.createSequentialGroup()
                        .addComponent(QN22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel22Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA22)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB22)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC22)
                        .addGap(150, 150, 150)
                        .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel22Layout.createSequentialGroup()
                                .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AND22))
                            .addComponent(jCheckBox23))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2291, Short.MAX_VALUE))
        );
        Panel22Layout.setVerticalGroup(
            Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel22Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel22Layout.createSequentialGroup()
                        .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN22)
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(JPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel22Layout.createSequentialGroup()
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox23)))
                .addGap(46, 46, 46)
                .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ANC22)
                    .addComponent(ANB22)
                    .addComponent(ANA22)
                    .addComponent(jLabel27)
                    .addComponent(jLabel52)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AND22)
                    .addComponent(jLabel138))
                .addGap(21, 21, 21))
        );

        Panel7.setBackground(new java.awt.Color(204, 204, 204));
        Panel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN7.setText("7");

        TextArea7.setEditable(false);
        TextArea7.setBackground(new java.awt.Color(204, 255, 255));
        TextArea7.setColumns(20);
        TextArea7.setRows(5);
        TextArea7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane20.setViewportView(TextArea7);

        buttonGroup7.add(ANA7);
        ANA7.setText("A");

        buttonGroup7.add(ANB7);
        ANB7.setText("B");

        buttonGroup7.add(ANC7);
        ANC7.setText("C");

        buttonGroup7.add(AND7);
        AND7.setText("D");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("A.");

        jLabel38.setForeground(new java.awt.Color(255, 0, 0));
        jLabel38.setText("B.");

        jLabel61.setForeground(new java.awt.Color(255, 0, 0));
        jLabel61.setText("C.");

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox8);
        jCheckBox8.setText("View Explanation");
        jCheckBox8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox8FocusLost(evt);
            }
        });
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        JPanel7.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea7.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea7.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea7.setRows(5);
        jTextArea7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane10.setViewportView(jTextArea7);

        javax.swing.GroupLayout JPanel7Layout = new javax.swing.GroupLayout(JPanel7);
        JPanel7.setLayout(JPanel7Layout);
        JPanel7Layout.setHorizontalGroup(
            JPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        JPanel7Layout.setVerticalGroup(
            JPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

        jLabel123.setForeground(new java.awt.Color(255, 0, 0));
        jLabel123.setText("D.");

        javax.swing.GroupLayout Panel7Layout = new javax.swing.GroupLayout(Panel7);
        Panel7.setLayout(Panel7Layout);
        Panel7Layout.setHorizontalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createSequentialGroup()
                .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel7Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA7)
                        .addGap(176, 176, 176)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel61)
                        .addGap(18, 18, 18)
                        .addComponent(ANC7)
                        .addGap(126, 126, 126)
                        .addComponent(jLabel123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND7))
                    .addGroup(Panel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel7Layout.createSequentialGroup()
                                .addComponent(QN7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(2289, Short.MAX_VALUE))
        );
        Panel7Layout.setVerticalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel7Layout.createSequentialGroup()
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QN7)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ANA7)
                            .addComponent(jLabel12))
                        .addGap(21, 21, 21))
                    .addGroup(Panel7Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel38)
                                .addComponent(ANB7))
                            .addComponent(jLabel61)
                            .addComponent(ANC7)
                            .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AND7)
                                .addComponent(jLabel123)))
                        .addContainerGap(33, Short.MAX_VALUE))))
        );

        Panel6.setBackground(new java.awt.Color(204, 204, 204));
        Panel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN6.setText("6");

        TextArea6.setEditable(false);
        TextArea6.setBackground(new java.awt.Color(204, 255, 255));
        TextArea6.setColumns(20);
        TextArea6.setRows(5);
        TextArea6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane21.setViewportView(TextArea6);

        buttonGroup6.add(ANA6);
        ANA6.setText("A");

        buttonGroup6.add(ANB6);
        ANB6.setText("B");

        buttonGroup6.add(ANC6);
        ANC6.setText("C");

        buttonGroup6.add(AND6);
        AND6.setText("D");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("A.");

        jLabel36.setForeground(new java.awt.Color(255, 0, 0));
        jLabel36.setText("B.");

        jLabel60.setForeground(new java.awt.Color(255, 0, 0));
        jLabel60.setText("C.");

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox7);
        jCheckBox7.setText("View Explanation");
        jCheckBox7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox7FocusLost(evt);
            }
        });
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        JPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea6.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea6.setRows(5);
        jTextArea6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane11.setViewportView(jTextArea6);

        javax.swing.GroupLayout JPanel6Layout = new javax.swing.GroupLayout(JPanel6);
        JPanel6.setLayout(JPanel6Layout);
        JPanel6Layout.setHorizontalGroup(
            JPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        JPanel6Layout.setVerticalGroup(
            JPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel122.setForeground(new java.awt.Color(255, 0, 0));
        jLabel122.setText("D.");

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel6Layout.createSequentialGroup()
                .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(Panel6Layout.createSequentialGroup()
                            .addGap(723, 723, 723)
                            .addComponent(jCheckBox7))
                        .addGroup(Panel6Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(QN6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel6Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA6)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB6)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANC6)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel122)
                        .addGap(18, 18, 18)
                        .addComponent(AND6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel6Layout.createSequentialGroup()
                        .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN6)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(jCheckBox7)
                        .addGap(30, 30, 30)
                        .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AND6)
                            .addComponent(ANA6)
                            .addComponent(ANB6)
                            .addComponent(ANC6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel36)
                            .addComponent(jLabel60)
                            .addComponent(jLabel122))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(Panel6Layout.createSequentialGroup()
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Panel10.setBackground(new java.awt.Color(204, 204, 204));
        Panel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN10.setText("10");

        TextArea10.setEditable(false);
        TextArea10.setBackground(new java.awt.Color(204, 255, 255));
        TextArea10.setColumns(20);
        TextArea10.setRows(5);
        TextArea10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane22.setViewportView(TextArea10);

        buttonGroup10.add(ANA10);
        ANA10.setText("A");

        buttonGroup10.add(ANB10);
        ANB10.setText("B");

        buttonGroup10.add(ANC10);
        ANC10.setText("C");

        buttonGroup10.add(AND10);
        AND10.setText("D");

        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("A.");

        jLabel40.setForeground(new java.awt.Color(255, 0, 0));
        jLabel40.setText("B.");

        jLabel64.setForeground(new java.awt.Color(255, 0, 0));
        jLabel64.setText("C.");

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox11);
        jCheckBox11.setText("View Explanation");
        jCheckBox11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox11FocusLost(evt);
            }
        });

        JPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea10.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea10.setColumns(20);
        jTextArea10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea10.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea10.setRows(5);
        jTextArea10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane36.setViewportView(jTextArea10);

        javax.swing.GroupLayout JPanel10Layout = new javax.swing.GroupLayout(JPanel10);
        JPanel10.setLayout(JPanel10Layout);
        JPanel10Layout.setHorizontalGroup(
            JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        JPanel10Layout.setVerticalGroup(
            JPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane36, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

        jLabel126.setForeground(new java.awt.Color(255, 0, 0));
        jLabel126.setText("D.");

        javax.swing.GroupLayout Panel10Layout = new javax.swing.GroupLayout(Panel10);
        Panel10.setLayout(Panel10Layout);
        Panel10Layout.setHorizontalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel10Layout.createSequentialGroup()
                .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel10Layout.createSequentialGroup()
                                .addComponent(QN10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox11))
                        .addGap(18, 18, 18)
                        .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel10Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(ANA10)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel40)
                        .addGap(18, 18, 18)
                        .addComponent(ANB10)
                        .addGap(169, 169, 169)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC10)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel126)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel10Layout.setVerticalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel10Layout.createSequentialGroup()
                        .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN10)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel64)
                                .addComponent(ANC10)
                                .addComponent(ANB10)
                                .addComponent(jLabel40)
                                .addComponent(ANA10)
                                .addComponent(jLabel15))
                            .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AND10)
                                .addComponent(jLabel126))))
                    .addGroup(Panel10Layout.createSequentialGroup()
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        Panel8.setBackground(new java.awt.Color(204, 204, 204));
        Panel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN8.setText("8");

        TextArea8.setEditable(false);
        TextArea8.setBackground(new java.awt.Color(204, 255, 255));
        TextArea8.setColumns(20);
        TextArea8.setRows(5);
        TextArea8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane23.setViewportView(TextArea8);

        buttonGroup8.add(ANA8);
        ANA8.setText("A");

        buttonGroup8.add(ANB8);
        ANB8.setText("B");

        buttonGroup8.add(AND8);
        AND8.setText("D");

        buttonGroup8.add(ANC8);
        ANC8.setText("C");
        ANC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANC8ActionPerformed(evt);
            }
        });

        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("A.");

        jLabel37.setForeground(new java.awt.Color(255, 0, 0));
        jLabel37.setText("B.");

        jLabel62.setForeground(new java.awt.Color(255, 0, 0));
        jLabel62.setText("C.");

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox9);
        jCheckBox9.setText("View Explanation");
        jCheckBox9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox9FocusLost(evt);
            }
        });
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        JPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea8.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea8.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea8.setRows(5);
        jTextArea8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane12.setViewportView(jTextArea8);

        javax.swing.GroupLayout JPanel8Layout = new javax.swing.GroupLayout(JPanel8);
        JPanel8.setLayout(JPanel8Layout);
        JPanel8Layout.setHorizontalGroup(
            JPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        JPanel8Layout.setVerticalGroup(
            JPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel124.setForeground(new java.awt.Color(255, 0, 0));
        jLabel124.setText("D.");

        javax.swing.GroupLayout Panel8Layout = new javax.swing.GroupLayout(Panel8);
        Panel8.setLayout(Panel8Layout);
        Panel8Layout.setHorizontalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createSequentialGroup()
                .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel8Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel8Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANA8)
                                .addGap(131, 131, 131)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANB8)
                                .addGap(172, 172, 172)
                                .addComponent(jLabel62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANC8)
                                .addGap(169, 169, 169)
                                .addComponent(jLabel124)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AND8)
                                .addGap(77, 77, 77))))
                    .addGroup(Panel8Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(QN8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2286, Short.MAX_VALUE))
        );
        Panel8Layout.setVerticalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createSequentialGroup()
                .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel8Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel8Layout.createSequentialGroup()
                                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(290, 290, 290))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel8Layout.createSequentialGroup()
                                .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QN8)
                                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jCheckBox9))
                    .addGroup(Panel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ANA8)
                        .addComponent(jLabel13))
                    .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ANB8)
                        .addComponent(jLabel37))
                    .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AND8)
                        .addComponent(jLabel124))
                    .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ANC8)
                        .addComponent(jLabel62)))
                .addGap(54, 54, 54))
        );

        Panel18.setBackground(new java.awt.Color(204, 204, 204));
        Panel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN18.setText("18");

        TextArea18.setEditable(false);
        TextArea18.setBackground(new java.awt.Color(204, 255, 255));
        TextArea18.setColumns(20);
        TextArea18.setRows(5);
        TextArea18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane24.setViewportView(TextArea18);

        buttonGroup18.add(ANA18);
        ANA18.setText("A");

        buttonGroup18.add(ANB18);
        ANB18.setText("B");

        buttonGroup18.add(ANC18);
        ANC18.setText("C");

        buttonGroup18.add(AND18);
        AND18.setText("D");

        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("A.");

        jLabel48.setForeground(new java.awt.Color(255, 0, 0));
        jLabel48.setText("B.");

        jLabel72.setForeground(new java.awt.Color(255, 0, 0));
        jLabel72.setText("C.");

        buttonGroup27.add(jCheckBox19);
        jCheckBox19.setText("View Explanation");
        jCheckBox19.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox19FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox19FocusLost(evt);
            }
        });

        JPanel18.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea18.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea18.setColumns(20);
        jTextArea18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea18.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea18.setRows(5);
        jTextArea18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane44.setViewportView(jTextArea18);

        javax.swing.GroupLayout JPanel18Layout = new javax.swing.GroupLayout(JPanel18);
        JPanel18.setLayout(JPanel18Layout);
        JPanel18Layout.setHorizontalGroup(
            JPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel18Layout.setVerticalGroup(
            JPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel18Layout.createSequentialGroup()
                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(204, 0, 204));

        jLabel134.setForeground(new java.awt.Color(255, 0, 0));
        jLabel134.setText("D.");

        javax.swing.GroupLayout Panel18Layout = new javax.swing.GroupLayout(Panel18);
        Panel18.setLayout(Panel18Layout);
        Panel18Layout.setHorizontalGroup(
            Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel18Layout.createSequentialGroup()
                .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel18Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA18)
                        .addGap(180, 180, 180)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB18)
                        .addGap(182, 182, 182)
                        .addComponent(jLabel72)
                        .addGap(18, 18, 18)
                        .addComponent(ANC18)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel134)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND18))
                    .addGroup(Panel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1026, Short.MAX_VALUE))
            .addGroup(Panel18Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Panel18Layout.setVerticalGroup(
            Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QN18)
                .addGap(21, 21, 21)
                .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel18Layout.createSequentialGroup()
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox19)
                .addGap(57, 57, 57)
                .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ANB18)
                        .addComponent(ANA18)
                        .addComponent(jLabel23)
                        .addComponent(jLabel48))
                    .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel72)
                        .addComponent(ANC18)
                        .addComponent(AND18)
                        .addComponent(jLabel134)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Panel9.setBackground(new java.awt.Color(204, 204, 204));
        Panel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN9.setText("9");

        TextArea9.setEditable(false);
        TextArea9.setBackground(new java.awt.Color(204, 255, 255));
        TextArea9.setColumns(20);
        TextArea9.setRows(5);
        TextArea9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane25.setViewportView(TextArea9);

        buttonGroup9.add(ANA9);
        ANA9.setText("A");

        buttonGroup9.add(ANB9);
        ANB9.setText("B");

        buttonGroup9.add(ANC9);
        ANC9.setText("C");

        buttonGroup9.add(AND9);
        AND9.setText("D");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("A.");

        jLabel39.setForeground(new java.awt.Color(255, 0, 0));
        jLabel39.setText("B.");

        jLabel63.setForeground(new java.awt.Color(255, 0, 0));
        jLabel63.setText("C.");

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox10);
        jCheckBox10.setText("View Explanation");
        jCheckBox10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox10FocusLost(evt);
            }
        });

        JPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea9.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea9.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea9.setRows(5);
        jTextArea9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane13.setViewportView(jTextArea9);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout JPanel9Layout = new javax.swing.GroupLayout(JPanel9);
        JPanel9.setLayout(JPanel9Layout);
        JPanel9Layout.setHorizontalGroup(
            JPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel9Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        JPanel9Layout.setVerticalGroup(
            JPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel9Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jLabel125.setForeground(new java.awt.Color(255, 0, 0));
        jLabel125.setText("D.");

        javax.swing.GroupLayout Panel9Layout = new javax.swing.GroupLayout(Panel9);
        Panel9.setLayout(Panel9Layout);
        Panel9Layout.setHorizontalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel9Layout.createSequentialGroup()
                .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel9Layout.createSequentialGroup()
                                .addComponent(QN9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel9Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA9)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB9)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC9)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2286, Short.MAX_VALUE))
        );
        Panel9Layout.setVerticalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QN9)
                    .addGroup(Panel9Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Panel9Layout.createSequentialGroup()
                                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel9Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel63)
                                .addComponent(ANC9)
                                .addComponent(ANB9)
                                .addComponent(jLabel39)
                                .addComponent(ANA9)
                                .addComponent(jLabel14))
                            .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AND9)
                                .addComponent(jLabel125)))))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        Panel13.setBackground(new java.awt.Color(204, 204, 204));
        Panel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN13.setText("13");

        TextArea13.setEditable(false);
        TextArea13.setBackground(new java.awt.Color(204, 255, 255));
        TextArea13.setColumns(20);
        TextArea13.setRows(5);
        TextArea13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane26.setViewportView(TextArea13);

        buttonGroup13.add(ANA13);
        ANA13.setText("A");

        buttonGroup13.add(ANB13);
        ANB13.setText("B");

        buttonGroup13.add(ANC13);
        ANC13.setText("C");

        buttonGroup13.add(AND13);
        AND13.setText("D");

        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("A.");

        jLabel43.setForeground(new java.awt.Color(255, 0, 0));
        jLabel43.setText("B.");

        jLabel67.setForeground(new java.awt.Color(255, 0, 0));
        jLabel67.setText("C.");

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox14);
        jCheckBox14.setText("View Explaination");
        jCheckBox14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox14FocusLost(evt);
            }
        });

        JPanel13.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea13.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea13.setColumns(20);
        jTextArea13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea13.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea13.setRows(5);
        jTextArea13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane39.setViewportView(jTextArea13);

        javax.swing.GroupLayout JPanel13Layout = new javax.swing.GroupLayout(JPanel13);
        JPanel13.setLayout(JPanel13Layout);
        JPanel13Layout.setHorizontalGroup(
            JPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        JPanel13Layout.setVerticalGroup(
            JPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane39, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel129.setForeground(new java.awt.Color(255, 0, 0));
        jLabel129.setText("D.");

        javax.swing.GroupLayout Panel13Layout = new javax.swing.GroupLayout(Panel13);
        Panel13.setLayout(Panel13Layout);
        Panel13Layout.setHorizontalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel13Layout.createSequentialGroup()
                .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel13Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA13)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB13)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel67)
                        .addGap(18, 18, 18)
                        .addComponent(ANC13)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2290, Short.MAX_VALUE))
        );
        Panel13Layout.setVerticalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel13Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel13Layout.createSequentialGroup()
                        .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN13)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ANA13)
                    .addComponent(jLabel18)
                    .addComponent(jLabel43)
                    .addComponent(ANB13)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANC13)
                    .addComponent(AND13)
                    .addComponent(jLabel129))
                .addGap(11, 11, 11))
        );

        Panel11.setBackground(new java.awt.Color(204, 204, 204));
        Panel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN11.setText("11");

        TextArea11.setEditable(false);
        TextArea11.setBackground(new java.awt.Color(204, 255, 255));
        TextArea11.setColumns(20);
        TextArea11.setRows(5);
        TextArea11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane27.setViewportView(TextArea11);

        buttonGroup11.add(ANA11);
        ANA11.setText("A");

        buttonGroup11.add(ANB11);
        ANB11.setText("B");

        buttonGroup11.add(ANC11);
        ANC11.setText("C");

        buttonGroup11.add(AND11);
        AND11.setText("D");

        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("A.");

        jLabel41.setForeground(new java.awt.Color(255, 0, 0));
        jLabel41.setText("B.");

        jLabel65.setForeground(new java.awt.Color(255, 0, 0));
        jLabel65.setText("C.");

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox12);
        jCheckBox12.setText("View Explanation");
        jCheckBox12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox12FocusLost(evt);
            }
        });

        JPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea11.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea11.setColumns(20);
        jTextArea11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea11.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea11.setRows(5);
        jTextArea11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane37.setViewportView(jTextArea11);

        javax.swing.GroupLayout JPanel11Layout = new javax.swing.GroupLayout(JPanel11);
        JPanel11.setLayout(JPanel11Layout);
        JPanel11Layout.setHorizontalGroup(
            JPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        JPanel11Layout.setVerticalGroup(
            JPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane37, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel127.setForeground(new java.awt.Color(255, 0, 0));
        jLabel127.setText("D.");

        javax.swing.GroupLayout Panel11Layout = new javax.swing.GroupLayout(Panel11);
        Panel11.setLayout(Panel11Layout);
        Panel11Layout.setHorizontalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA11)
                        .addGap(184, 184, 184)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB11)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC11)
                        .addGap(141, 141, 141)
                        .addComponent(jLabel127)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND11))
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox12)
                            .addGroup(Panel11Layout.createSequentialGroup()
                                .addComponent(QN11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        Panel11Layout.setVerticalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QN11)
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Panel11Layout.createSequentialGroup()
                                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ANA11)
                            .addComponent(jLabel16)
                            .addComponent(jLabel41)
                            .addComponent(ANB11)
                            .addComponent(jLabel65)
                            .addComponent(ANC11)
                            .addComponent(AND11)
                            .addComponent(jLabel127))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        Panel15.setBackground(new java.awt.Color(204, 204, 204));
        Panel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN15.setText("15");

        TextArea15.setEditable(false);
        TextArea15.setBackground(new java.awt.Color(204, 255, 255));
        TextArea15.setColumns(20);
        TextArea15.setRows(5);
        TextArea15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane28.setViewportView(TextArea15);

        buttonGroup15.add(ANA15);
        ANA15.setText("A");

        buttonGroup15.add(ANB15);
        ANB15.setText("B");

        buttonGroup15.add(ANC15);
        ANC15.setText("C");

        buttonGroup15.add(AND15);
        AND15.setText("D");

        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("A.");

        jLabel45.setForeground(new java.awt.Color(255, 0, 0));
        jLabel45.setText("B.");

        jLabel69.setForeground(new java.awt.Color(255, 0, 0));
        jLabel69.setText("C.");

        buttonGroup27.add(jCheckBox16);
        jCheckBox16.setText("View Explanation");
        jCheckBox16.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox16FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox16FocusLost(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(204, 0, 204));

        JPanel15.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea15.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea15.setColumns(20);
        jTextArea15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea15.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea15.setRows(5);
        jTextArea15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane41.setViewportView(jTextArea15);

        javax.swing.GroupLayout JPanel15Layout = new javax.swing.GroupLayout(JPanel15);
        JPanel15.setLayout(JPanel15Layout);
        JPanel15Layout.setHorizontalGroup(
            JPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel15Layout.setVerticalGroup(
            JPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane41, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jLabel131.setForeground(new java.awt.Color(255, 0, 0));
        jLabel131.setText("D.");

        javax.swing.GroupLayout Panel15Layout = new javax.swing.GroupLayout(Panel15);
        Panel15.setLayout(Panel15Layout);
        Panel15Layout.setHorizontalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel15Layout.createSequentialGroup()
                .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel15Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA15)
                        .addGap(197, 197, 197)
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB15)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC15)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel131)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND15))
                    .addGroup(Panel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel15Layout.createSequentialGroup()
                                .addComponent(QN15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(2300, Short.MAX_VALUE))
        );
        Panel15Layout.setVerticalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel15Layout.createSequentialGroup()
                        .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN15)
                            .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel15Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ANA15)
                                    .addComponent(jLabel20))
                                .addGap(17, 17, 17))
                            .addGroup(Panel15Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jCheckBox16)
                                .addGap(27, 27, 27)
                                .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel45)
                                    .addComponent(ANB15)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ANC15)
                                    .addComponent(AND15)
                                    .addComponent(jLabel131))
                                .addContainerGap(27, Short.MAX_VALUE))))
                    .addGroup(Panel15Layout.createSequentialGroup()
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        Panel14.setBackground(new java.awt.Color(204, 204, 204));
        Panel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN14.setText("14");

        TextArea14.setEditable(false);
        TextArea14.setBackground(new java.awt.Color(204, 255, 255));
        TextArea14.setColumns(20);
        TextArea14.setRows(5);
        TextArea14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane30.setViewportView(TextArea14);

        buttonGroup14.add(ANA14);
        ANA14.setText("A");

        buttonGroup14.add(ANB14);
        ANB14.setText("B");

        buttonGroup14.add(ANC14);
        ANC14.setText("C");

        buttonGroup14.add(AND14);
        AND14.setText("D");
        AND14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AND14ActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("A.");

        jLabel44.setForeground(new java.awt.Color(255, 0, 0));
        jLabel44.setText("B.");

        jLabel68.setForeground(new java.awt.Color(255, 0, 0));
        jLabel68.setText("C.");

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox15);
        jCheckBox15.setText("View Explanation");

        JPanel14.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea14.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea14.setColumns(20);
        jTextArea14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea14.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea14.setRows(5);
        jTextArea14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane40.setViewportView(jTextArea14);

        javax.swing.GroupLayout JPanel14Layout = new javax.swing.GroupLayout(JPanel14);
        JPanel14.setLayout(JPanel14Layout);
        JPanel14Layout.setHorizontalGroup(
            JPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane40, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );
        JPanel14Layout.setVerticalGroup(
            JPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel14Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel130.setForeground(new java.awt.Color(255, 0, 0));
        jLabel130.setText("D.");

        javax.swing.GroupLayout Panel14Layout = new javax.swing.GroupLayout(Panel14);
        Panel14.setLayout(Panel14Layout);
        Panel14Layout.setHorizontalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel14Layout.createSequentialGroup()
                .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel14Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA14)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB14)
                        .addGap(189, 189, 189)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC14)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel130)
                        .addGap(18, 18, 18)
                        .addComponent(AND14))
                    .addGroup(Panel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel14Layout.createSequentialGroup()
                                .addComponent(QN14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(819, 819, 819))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel14Layout.createSequentialGroup()
                                .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox15)
                                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(JPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1877, Short.MAX_VALUE))
        );
        Panel14Layout.setVerticalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel14Layout.createSequentialGroup()
                .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN14))
                    .addGroup(Panel14Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel14Layout.createSequentialGroup()
                                .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox15)))))
                .addGap(28, 40, Short.MAX_VALUE)
                .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ANC14)
                    .addComponent(ANB14)
                    .addComponent(ANA14)
                    .addComponent(jLabel19)
                    .addComponent(jLabel44)
                    .addComponent(AND14)
                    .addComponent(jLabel68)
                    .addComponent(jLabel130))
                .addGap(16, 16, 16))
        );

        Panel17.setBackground(new java.awt.Color(204, 204, 204));
        Panel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN17.setText("17");

        TextArea17.setEditable(false);
        TextArea17.setBackground(new java.awt.Color(204, 255, 255));
        TextArea17.setColumns(20);
        TextArea17.setRows(5);
        TextArea17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane32.setViewportView(TextArea17);

        buttonGroup17.add(ANA17);
        ANA17.setText("A");

        buttonGroup17.add(ANB17);
        ANB17.setText("B");

        buttonGroup17.add(ANC17);
        ANC17.setText("C");

        buttonGroup17.add(AND17);
        AND17.setText("D");

        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("A.");

        jLabel47.setForeground(new java.awt.Color(255, 0, 0));
        jLabel47.setText("B.");

        jLabel71.setForeground(new java.awt.Color(255, 0, 0));
        jLabel71.setText("C.");

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox18);
        jCheckBox18.setText("View Explanation");
        jCheckBox18.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox18FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox18FocusLost(evt);
            }
        });

        JPanel17.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea17.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea17.setColumns(20);
        jTextArea17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea17.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea17.setRows(5);
        jTextArea17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane43.setViewportView(jTextArea17);

        javax.swing.GroupLayout JPanel17Layout = new javax.swing.GroupLayout(JPanel17);
        JPanel17.setLayout(JPanel17Layout);
        JPanel17Layout.setHorizontalGroup(
            JPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel17Layout.setVerticalGroup(
            JPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane43, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
        );

        jLabel133.setForeground(new java.awt.Color(255, 0, 0));
        jLabel133.setText("D.");

        javax.swing.GroupLayout Panel17Layout = new javax.swing.GroupLayout(Panel17);
        Panel17.setLayout(Panel17Layout);
        Panel17Layout.setHorizontalGroup(
            Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel17Layout.createSequentialGroup()
                .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel17Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA17)
                        .addGap(170, 170, 170)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB17)
                        .addGap(198, 198, 198)
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC17)
                        .addGap(121, 121, 121)
                        .addComponent(jLabel133)
                        .addGap(18, 18, 18)
                        .addComponent(AND17))
                    .addGroup(Panel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox18)
                            .addGroup(Panel17Layout.createSequentialGroup()
                                .addComponent(QN17, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        Panel17Layout.setVerticalGroup(
            Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QN17)
                    .addGroup(Panel17Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel17Layout.createSequentialGroup()
                        .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ANC17)
                            .addComponent(jLabel71)
                            .addComponent(AND17)
                            .addComponent(jLabel133))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel17Layout.createSequentialGroup()
                        .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ANB17)
                            .addComponent(ANA17)
                            .addComponent(jLabel22)
                            .addComponent(jLabel47))
                        .addGap(38, 38, 38))))
        );

        Panel12.setBackground(new java.awt.Color(204, 204, 204));
        Panel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN12.setText("12");

        TextArea12.setEditable(false);
        TextArea12.setBackground(new java.awt.Color(204, 255, 255));
        TextArea12.setColumns(20);
        TextArea12.setRows(5);
        TextArea12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane33.setViewportView(TextArea12);

        buttonGroup12.add(ANA12);
        ANA12.setText("A");

        buttonGroup12.add(ANB12);
        ANB12.setText("B");

        buttonGroup12.add(ANC12);
        ANC12.setText("C");

        buttonGroup12.add(AND12);
        AND12.setText("D");

        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("A.");

        jLabel42.setForeground(new java.awt.Color(255, 0, 0));
        jLabel42.setText("B.");

        jLabel66.setForeground(new java.awt.Color(255, 0, 0));
        jLabel66.setText("C.");

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox13);
        jCheckBox13.setText("View Explanation");
        jCheckBox13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox13FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox13FocusLost(evt);
            }
        });

        JPanel12.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea12.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea12.setColumns(20);
        jTextArea12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea12.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea12.setRows(5);
        jTextArea12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane38.setViewportView(jTextArea12);

        javax.swing.GroupLayout JPanel12Layout = new javax.swing.GroupLayout(JPanel12);
        JPanel12.setLayout(JPanel12Layout);
        JPanel12Layout.setHorizontalGroup(
            JPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        JPanel12Layout.setVerticalGroup(
            JPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel128.setForeground(new java.awt.Color(255, 0, 0));
        jLabel128.setText("D.");

        javax.swing.GroupLayout Panel12Layout = new javax.swing.GroupLayout(Panel12);
        Panel12.setLayout(Panel12Layout);
        Panel12Layout.setHorizontalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel12Layout.createSequentialGroup()
                .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel12Layout.createSequentialGroup()
                                .addComponent(QN12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel12Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA12)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB12)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel66)
                        .addGap(18, 18, 18)
                        .addComponent(ANC12)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel128)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND12)))
                .addContainerGap(1927, Short.MAX_VALUE))
        );
        Panel12Layout.setVerticalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel12Layout.createSequentialGroup()
                .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN12))
                    .addGroup(Panel12Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AND12)
                    .addComponent(ANC12)
                    .addComponent(ANB12)
                    .addComponent(ANA12)
                    .addComponent(jLabel17)
                    .addComponent(jLabel42)
                    .addComponent(jLabel66)
                    .addComponent(jLabel128))
                .addGap(30, 30, 30))
        );

        Panel25.setBackground(new java.awt.Color(204, 204, 204));
        Panel25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN25.setText("25");

        TextArea25.setEditable(false);
        TextArea25.setBackground(new java.awt.Color(204, 255, 255));
        TextArea25.setColumns(20);
        TextArea25.setRows(5);
        TextArea25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane29.setViewportView(TextArea25);

        buttonGroup25.add(ANA25);
        ANA25.setText("A");

        buttonGroup25.add(ANB25);
        ANB25.setText("B");

        buttonGroup25.add(ANC25);
        ANC25.setText("C");

        buttonGroup25.add(AND25);
        AND25.setText("D");

        jLabel30.setForeground(new java.awt.Color(255, 0, 0));
        jLabel30.setText("A.");

        jLabel56.setForeground(new java.awt.Color(255, 0, 0));
        jLabel56.setText("B.");

        jLabel79.setForeground(new java.awt.Color(255, 0, 0));
        jLabel79.setText("C.");

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox26);
        jCheckBox26.setText("View Explanation");
        jCheckBox26.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox26FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox26FocusLost(evt);
            }
        });

        JPanel25.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea25.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea25.setColumns(20);
        jTextArea25.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea25.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea25.setRows(5);
        jTextArea25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane51.setViewportView(jTextArea25);

        javax.swing.GroupLayout JPanel25Layout = new javax.swing.GroupLayout(JPanel25);
        JPanel25.setLayout(JPanel25Layout);
        JPanel25Layout.setHorizontalGroup(
            JPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel25Layout.setVerticalGroup(
            JPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel25Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel141.setForeground(new java.awt.Color(255, 0, 0));
        jLabel141.setText("D.");

        javax.swing.GroupLayout Panel25Layout = new javax.swing.GroupLayout(Panel25);
        Panel25.setLayout(Panel25Layout);
        Panel25Layout.setHorizontalGroup(
            Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel25Layout.createSequentialGroup()
                .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel25Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(QN25, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Panel25Layout.createSequentialGroup()
                            .addGap(91, 91, 91)
                            .addComponent(jLabel30)
                            .addGap(18, 18, 18)
                            .addComponent(ANA25)
                            .addGap(149, 149, 149)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ANB25)
                            .addGap(167, 167, 167)
                            .addComponent(jLabel79)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ANC25)
                            .addGap(183, 183, 183)
                            .addComponent(AND25)))
                    .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBox26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel25Layout.setVerticalGroup(
            Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel25Layout.createSequentialGroup()
                .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN25))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel25Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel25Layout.createSequentialGroup()
                                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addComponent(jCheckBox26)
                .addGap(18, 18, 18)
                .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ANA25)
                        .addComponent(jLabel30))
                    .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ANB25))
                    .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel79)
                        .addComponent(ANC25))
                    .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AND25)
                        .addComponent(jLabel141)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        Panel23.setBackground(new java.awt.Color(204, 204, 204));
        Panel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN23.setText("23");

        TextArea23.setEditable(false);
        TextArea23.setBackground(new java.awt.Color(204, 255, 255));
        TextArea23.setColumns(20);
        TextArea23.setRows(5);
        TextArea23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane34.setViewportView(TextArea23);

        buttonGroup23.add(ANA23);
        ANA23.setText("A");

        buttonGroup23.add(ANB23);
        ANB23.setText("B");

        buttonGroup23.add(ANC23);
        ANC23.setText("C");

        buttonGroup23.add(AND23);
        AND23.setText("D");

        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("A.");

        jLabel53.setForeground(new java.awt.Color(255, 0, 0));
        jLabel53.setText("B.");

        jLabel77.setForeground(new java.awt.Color(255, 0, 0));
        jLabel77.setText("C.");

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox24);
        jCheckBox24.setText("View Explanation");
        jCheckBox24.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox24FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox24FocusLost(evt);
            }
        });

        jPanel24.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        JPanel23.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea23.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea23.setColumns(20);
        jTextArea23.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea23.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea23.setRows(5);
        jTextArea23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane49.setViewportView(jTextArea23);

        javax.swing.GroupLayout JPanel23Layout = new javax.swing.GroupLayout(JPanel23);
        JPanel23.setLayout(JPanel23Layout);
        JPanel23Layout.setHorizontalGroup(
            JPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel23Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        JPanel23Layout.setVerticalGroup(
            JPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane49, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );

        jLabel139.setForeground(new java.awt.Color(255, 0, 0));
        jLabel139.setText("D.");

        javax.swing.GroupLayout Panel23Layout = new javax.swing.GroupLayout(Panel23);
        Panel23.setLayout(Panel23Layout);
        Panel23Layout.setHorizontalGroup(
            Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel23Layout.createSequentialGroup()
                .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN23, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel23Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA23)
                        .addGap(186, 186, 186)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB23)
                        .addGap(175, 175, 175)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANC23)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCheckBox24)))
                .addGap(18, 18, 18)
                .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel23Layout.createSequentialGroup()
                        .addComponent(JPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1805, Short.MAX_VALUE))
        );
        Panel23Layout.setVerticalGroup(
            Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel23Layout.createSequentialGroup()
                        .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel23Layout.createSequentialGroup()
                                .addComponent(QN23)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel23Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox24)
                .addGap(18, 18, 18)
                .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel23Layout.createSequentialGroup()
                        .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ANA23)
                            .addComponent(jLabel28)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ANB23)
                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ANC23))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel23Layout.createSequentialGroup()
                        .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AND23)
                            .addComponent(jLabel139))
                        .addGap(24, 24, 24))))
        );

        Panel24.setBackground(new java.awt.Color(204, 204, 204));
        Panel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN24.setText("24");

        TextArea24.setEditable(false);
        TextArea24.setBackground(new java.awt.Color(204, 255, 255));
        TextArea24.setColumns(20);
        TextArea24.setRows(5);
        TextArea24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane35.setViewportView(TextArea24);

        buttonGroup24.add(ANA24);
        ANA24.setText("A");
        ANA24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANA24ActionPerformed(evt);
            }
        });

        buttonGroup24.add(ANB24);
        ANB24.setText("B");

        buttonGroup24.add(ANC24);
        ANC24.setText("C");

        buttonGroup24.add(AND24);
        AND24.setText("D");

        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setText("A.");

        jLabel54.setForeground(new java.awt.Color(255, 0, 0));
        jLabel54.setText("B.");

        jLabel78.setForeground(new java.awt.Color(255, 0, 0));
        jLabel78.setText("C.");

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox25);
        jCheckBox25.setText("View Explanation");
        jCheckBox25.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox25FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox25FocusLost(evt);
            }
        });

        JPanel24.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea24.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea24.setColumns(20);
        jTextArea24.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea24.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea24.setRows(5);
        jTextArea24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane50.setViewportView(jTextArea24);

        javax.swing.GroupLayout JPanel24Layout = new javax.swing.GroupLayout(JPanel24);
        JPanel24.setLayout(JPanel24Layout);
        JPanel24Layout.setHorizontalGroup(
            JPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel24Layout.createSequentialGroup()
                .addComponent(jScrollPane50, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPanel24Layout.setVerticalGroup(
            JPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel140.setForeground(new java.awt.Color(255, 0, 0));
        jLabel140.setText("D.");

        javax.swing.GroupLayout Panel24Layout = new javax.swing.GroupLayout(Panel24);
        Panel24.setLayout(Panel24Layout);
        Panel24Layout.setHorizontalGroup(
            Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel24Layout.createSequentialGroup()
                .addGroup(Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel24Layout.createSequentialGroup()
                                .addComponent(QN24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel24Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANA24)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB24)
                        .addGap(176, 176, 176)
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC24)
                        .addGap(124, 124, 124)
                        .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND24)))
                .addContainerGap(2294, Short.MAX_VALUE))
        );
        Panel24Layout.setVerticalGroup(
            Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel24Layout.createSequentialGroup()
                        .addGroup(Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN24)
                            .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox25)
                        .addGap(55, 55, 55)
                        .addGroup(Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ANA24)
                            .addComponent(jLabel29)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ANB24)
                            .addComponent(jLabel78)
                            .addComponent(ANC24)
                            .addComponent(AND24)
                            .addComponent(jLabel140)))
                    .addGroup(Panel24Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel16.setBackground(new java.awt.Color(204, 204, 204));
        Panel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        QN16.setText("16");

        TextArea16.setEditable(false);
        TextArea16.setBackground(new java.awt.Color(204, 255, 255));
        TextArea16.setColumns(20);
        TextArea16.setRows(5);
        TextArea16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane31.setViewportView(TextArea16);

        buttonGroup16.add(ANA16);
        ANA16.setText("A");

        buttonGroup16.add(ANB16);
        ANB16.setText("B");

        buttonGroup16.add(ANC16);
        ANC16.setText("C");

        buttonGroup16.add(AND16);
        AND16.setText("D");

        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("A.");

        jLabel46.setForeground(new java.awt.Color(255, 0, 0));
        jLabel46.setText("B.");

        jLabel70.setForeground(new java.awt.Color(255, 0, 0));
        jLabel70.setText("C.");

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(204, 0, 204));

        buttonGroup27.add(jCheckBox17);
        jCheckBox17.setText("View Explanation");
        jCheckBox17.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCheckBox17FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCheckBox17FocusLost(evt);
            }
        });

        JPanel16.setBackground(new java.awt.Color(204, 204, 204));

        jTextArea16.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea16.setColumns(20);
        jTextArea16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea16.setForeground(new java.awt.Color(204, 51, 0));
        jTextArea16.setRows(5);
        jTextArea16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explanation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane42.setViewportView(jTextArea16);

        javax.swing.GroupLayout JPanel16Layout = new javax.swing.GroupLayout(JPanel16);
        JPanel16.setLayout(JPanel16Layout);
        JPanel16Layout.setHorizontalGroup(
            JPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel16Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel16Layout.setVerticalGroup(
            JPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel16Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane42, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jLabel132.setForeground(new java.awt.Color(255, 0, 0));
        jLabel132.setText("D.");

        javax.swing.GroupLayout Panel16Layout = new javax.swing.GroupLayout(Panel16);
        Panel16.setLayout(Panel16Layout);
        Panel16Layout.setHorizontalGroup(
            Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel16Layout.createSequentialGroup()
                        .addComponent(QN16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel16Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ANA16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ANB16)
                .addGap(152, 152, 152)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ANC16)
                .addGap(132, 132, 132)
                .addComponent(jLabel132)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AND16)
                .addGap(557, 557, 557))
        );
        Panel16Layout.setVerticalGroup(
            Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel16Layout.createSequentialGroup()
                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(QN16)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AND16)
                    .addComponent(ANC16)
                    .addComponent(ANB16)
                    .addComponent(ANA16)
                    .addComponent(jLabel21)
                    .addComponent(jLabel46)
                    .addComponent(jLabel70)
                    .addComponent(jLabel132))
                .addGap(17, 17, 17))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 204));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 0, 204));

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setText("Not Answered :");

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Answered", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel81.setText("Total Number of Right Answers :");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel82.setText("Total Number of Wrong Answers :");

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 0, 204));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel83)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("SUBMIT ANSWERS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("NEXT >>>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("NEXT >>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("<<  PREVIOUS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Panel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Panel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Panel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Panel21, javax.swing.GroupLayout.PREFERRED_SIZE, 1342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(369, 369, 369)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(626, 626, 626)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(921, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(Panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(Panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Panel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Panel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Panel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Panel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1219, 1219, 1219))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel1.setText("APTITUDE PREPERATION");
        jLabel1.setOpaque(true);

        jButton1.setText("<< BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(230, 230, 230))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Company ID");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 2, -1, 32));

        Comp_ID.setEditable(false);
        Comp_ID.setBackground(new java.awt.Color(204, 204, 255));
        Comp_ID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Comp_ID.setForeground(new java.awt.Color(153, 0, 0));
        Comp_ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(Comp_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 110, 30));

        Test_ID.setEditable(false);
        Test_ID.setBackground(new java.awt.Color(204, 204, 255));
        Test_ID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Test_ID.setForeground(new java.awt.Color(153, 0, 0));
        Test_ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(Test_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 120, 30));

        jLabel3.setText("Test ID");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 25));

        Test_Name.setEditable(false);
        Test_Name.setBackground(new java.awt.Color(204, 204, 255));
        Test_Name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Test_Name.setForeground(new java.awt.Color(153, 0, 0));
        Test_Name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(Test_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 6, 133, 30));

        jLabel4.setText("Test Name");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 2, -1, 32));

        jLabel5.setText("Student ID");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 5, -1, 27));

        stdid.setEditable(false);
        stdid.setBackground(new java.awt.Color(204, 204, 255));
        stdid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stdid.setForeground(new java.awt.Color(153, 0, 0));
        stdid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(stdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 6, 117, 30));

        NO1.setEditable(false);
        NO1.setBackground(new java.awt.Color(204, 204, 255));
        NO1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NO1.setForeground(new java.awt.Color(153, 0, 0));
        NO1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NO1.setText("1");
        NO1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(NO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 48, 43, 33));

        NO2.setEditable(false);
        NO2.setBackground(new java.awt.Color(204, 204, 255));
        NO2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NO2.setForeground(new java.awt.Color(153, 0, 0));
        NO2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NO2.setText("25");
        NO2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        NO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO2ActionPerformed(evt);
            }
        });
        jPanel6.add(NO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(889, 48, 40, 32));

        PGNO.setEditable(false);
        PGNO.setBackground(new java.awt.Color(204, 204, 255));
        PGNO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PGNO.setForeground(new java.awt.Color(153, 0, 0));
        PGNO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PGNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGNOActionPerformed(evt);
            }
        });
        jPanel6.add(PGNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 48, 50, 30));

        jLabel110.setText("Page NO  :");
        jPanel6.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, 26));

        TOTPG.setEditable(false);
        TOTPG.setBackground(new java.awt.Color(204, 204, 255));
        TOTPG.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TOTPG.setForeground(new java.awt.Color(153, 0, 0));
        TOTPG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(TOTPG, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 46, 30));

        jLabel111.setText("Total Page  :");
        jPanel6.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 52, -1, 29));

        jLabel113.setText("TO");
        jPanel6.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 52, -1, 24));

        jLabel112.setText("Questions");
        jPanel6.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 57, -1, -1));

        jLabel117.setText("Total Questions :");
        jPanel6.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 59, -1, -1));

        TQ.setEditable(false);
        TQ.setBackground(new java.awt.Color(204, 204, 255));
        TQ.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        TQ.setForeground(new java.awt.Color(153, 0, 0));
        TQ.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TQ.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(TQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 68, 29));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication3/alarm_clock_PNG93 - Copy.png"))); // NOI18N
        jLabel144.setText("jLabel144");
        jPanel4.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 0, 220, -1));

        HR.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        HR.setForeground(new java.awt.Color(255, 0, 51));
        HR.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel4.add(HR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 70));

        MN.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MN.setForeground(new java.awt.Color(255, 0, 51));
        MN.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel4.add(MN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 60, 70));

        SC.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        SC.setForeground(new java.awt.Color(255, 0, 51));
        SC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jPanel4.add(SC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 60, 70));

        jLabel114.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel114.setText(":");
        jPanel4.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 10, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 934, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 12933, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ANC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANC8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANC8ActionPerformed

    private void AND14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AND14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AND14ActionPerformed

    private void ANA24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANA24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANA24ActionPerformed

    private void ANA20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANA20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANA20ActionPerformed
       

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        SUBMIT();
             
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
     int p = Integer.parseInt(TOTPG.getText());
      int PG = Integer.parseInt(PGNO.getText());
      
      if(p == PG)
      {
          JOptionPane.showMessageDialog(null," PAGES ENDED ");
          
      } 
      else
      {   
                                 int m =Integer.parseInt(NO1.getText());
                                  m = m + 25 ;
                                  int n= m -1 ;
                                  String TestNam = Test_Name.getText();
                                  String comp = Comp_ID.getText();
                                  String stdi  =stdid.getText();
                                  String usern = Test_ID.getText();
                                  int PGN  = Integer.parseInt(PGNO.getText());
                                  PGN = PGN + 1;
                                  T.stop();
                                   int hh1 = Integer.parseInt(HR.getText());
                                    int mm1 = Integer.parseInt(MN.getText());
                                    int ss1 = Integer.parseInt(SC.getText());
            
                                  new ANSAPT(usern,comp,TestNam,stdi,PGN,p,m,n,hh1,mm1,ss1).setVisible(true); 
                                  dispose();
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NO2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int p = Integer.parseInt(TOTPG.getText());
        int PN = Integer.parseInt(PGNO.getText());
        if(p==PN)
        {
            JOptionPane.showMessageDialog(null,"PAGES ENDED");
        }
        else
        {
                                int EX = 1;
                                  int N1 = Integer.parseInt(NO1.getText());
                                  int N2 = Integer.parseInt(NO2.getText());
                                  PN = PN + 1;
                                  int m =N1+25;
                                  int n = m-1;
                                  String TestNam = Test_Name.getText();
                                  String comp = Comp_ID.getText();
                                  String stdi  =stdid.getText();
                                  String usern = Test_ID.getText();
                                  
                                  new ANSAPT(usern,comp,TestNam,stdi,PN,p,m,n,EX).setVisible(true); 
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         int p = Integer.parseInt(TOTPG.getText());
        int PN = Integer.parseInt(PGNO.getText());
        if(PN==1)
        {
            JOptionPane.showMessageDialog(null,"PAGES ENDED");
        }
        else
        {
                                  int EX = 1;
                                  int N1 = Integer.parseInt(NO1.getText());
                                  int N2 = Integer.parseInt(NO2.getText());
                                 
                                  int m =N1-25;
                                  int n = 0;
                                  PN = PN -1;
                                  String TestNam = Test_Name.getText();
                                  String comp = Comp_ID.getText();
                                  String stdi  =stdid.getText();
                                  String usern = Test_ID.getText();
                                  
                                  new ANSAPT(usern,comp,TestNam,stdi,PN,p,m,n,EX).setVisible(true); 
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void PGNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PGNOActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
       

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:


        
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void AND3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AND3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_AND3ActionPerformed

    private void AND1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AND1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_AND1ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox1FocusGained
        // TODO add your handling code here:
                           JPanel1.setVisible(true);

    }//GEN-LAST:event_jCheckBox1FocusGained

    private void jCheckBox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox1FocusLost
        // TODO add your handling code here:

                                  JPanel1.setVisible(false);

    }//GEN-LAST:event_jCheckBox1FocusLost

    private void jCheckBox2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox2FocusGained
        // TODO add your handling code here:
                           JPanel2.setVisible(true);

    }//GEN-LAST:event_jCheckBox2FocusGained

    private void jCheckBox4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox4FocusGained
        // TODO add your handling code here:
                           JPanel3.setVisible(true);

    }//GEN-LAST:event_jCheckBox4FocusGained

    private void jCheckBox2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox2FocusLost
        // TODO add your handling code here:
                           JPanel2.setVisible(false);

    }//GEN-LAST:event_jCheckBox2FocusLost

    private void jCheckBox4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox4FocusLost
        // TODO add your handling code here:
                           JPanel3.setVisible(false);

    }//GEN-LAST:event_jCheckBox4FocusLost

    private void jCheckBox5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox5FocusGained
        // TODO add your handling code here:
                           JPanel4.setVisible(true);

    }//GEN-LAST:event_jCheckBox5FocusGained

    private void jCheckBox5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox5FocusLost
        // TODO add your handling code here:
                           JPanel4.setVisible(false);

    }//GEN-LAST:event_jCheckBox5FocusLost

    private void jCheckBox6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox6FocusGained
        // TODO add your handling code here:
                           JPanel5.setVisible(true);

    }//GEN-LAST:event_jCheckBox6FocusGained

    private void jCheckBox6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox6FocusLost
        // TODO add your handling code here:
                           JPanel5.setVisible(false);

    }//GEN-LAST:event_jCheckBox6FocusLost

    private void jCheckBox7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox7FocusGained
        // TODO add your handling code here:
                           JPanel6.setVisible(true);

    }//GEN-LAST:event_jCheckBox7FocusGained

    private void jCheckBox7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox7FocusLost
        // TODO add your handling code here:
                           JPanel6.setVisible(false);

    }//GEN-LAST:event_jCheckBox7FocusLost

    private void jCheckBox8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox8FocusGained
        // TODO add your handling code here:
                           JPanel7.setVisible(true);

    }//GEN-LAST:event_jCheckBox8FocusGained

    private void jCheckBox8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox8FocusLost
        // TODO add your handling code here:
                           JPanel7.setVisible(false);

    }//GEN-LAST:event_jCheckBox8FocusLost

    private void jCheckBox9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox9FocusGained
        // TODO add your handling code here:
                           JPanel8.setVisible(true);

    }//GEN-LAST:event_jCheckBox9FocusGained

    private void jCheckBox9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox9FocusLost
        // TODO add your handling code here:
                           JPanel8.setVisible(false);

    }//GEN-LAST:event_jCheckBox9FocusLost

    private void jCheckBox10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox10FocusGained
        // TODO add your handling code here:
                           JPanel9.setVisible(true);

    }//GEN-LAST:event_jCheckBox10FocusGained

    private void jCheckBox10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox10FocusLost
        // TODO add your handling code here:
                           JPanel9.setVisible(false);

    }//GEN-LAST:event_jCheckBox10FocusLost

    private void jCheckBox11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox11FocusGained
        // TODO add your handling code here:
                           JPanel10.setVisible(true);

    }//GEN-LAST:event_jCheckBox11FocusGained

    private void jCheckBox11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox11FocusLost
        // TODO add your handling code here:
                           JPanel10.setVisible(false);

    }//GEN-LAST:event_jCheckBox11FocusLost

    private void jCheckBox12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox12FocusGained
        // TODO add your handling code here:
         JPanel11.setVisible(true);
    }//GEN-LAST:event_jCheckBox12FocusGained

    private void jCheckBox12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox12FocusLost
        // TODO add your handling code here:
         JPanel11.setVisible(false);
    }//GEN-LAST:event_jCheckBox12FocusLost

    private void jCheckBox14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox14FocusGained
        // TODO add your handling code here:
                 JPanel13.setVisible(true);

    }//GEN-LAST:event_jCheckBox14FocusGained

    private void jCheckBox14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox14FocusLost
        // TODO add your handling code here:
                 JPanel13.setVisible(false);

    }//GEN-LAST:event_jCheckBox14FocusLost

    private void jCheckBox13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox13FocusGained
        // TODO add your handling code here:
                 JPanel12.setVisible(true);

    }//GEN-LAST:event_jCheckBox13FocusGained

    private void jCheckBox13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox13FocusLost
        // TODO add your handling code here:
                 JPanel12.setVisible(false);

    }//GEN-LAST:event_jCheckBox13FocusLost

    private void jCheckBox16FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox16FocusGained
        // TODO add your handling code here:
                 JPanel15.setVisible(true);

    }//GEN-LAST:event_jCheckBox16FocusGained

    private void jCheckBox16FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox16FocusLost
        // TODO add your handling code here:
                 JPanel15.setVisible(false);

    }//GEN-LAST:event_jCheckBox16FocusLost

    private void jCheckBox17FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox17FocusGained
        // TODO add your handling code here:
                 JPanel16.setVisible(true);

    }//GEN-LAST:event_jCheckBox17FocusGained

    private void jCheckBox17FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox17FocusLost
        // TODO add your handling code here:
                 JPanel16.setVisible(false);

    }//GEN-LAST:event_jCheckBox17FocusLost

    private void jCheckBox18FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox18FocusGained
        // TODO add your handling code here:
                 JPanel17.setVisible(true);

    }//GEN-LAST:event_jCheckBox18FocusGained

    private void jCheckBox18FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox18FocusLost
        // TODO add your handling code here:
                 JPanel17.setVisible(false);

    }//GEN-LAST:event_jCheckBox18FocusLost

    private void jCheckBox19FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox19FocusGained
        // TODO add your handling code here:
                 JPanel18.setVisible(true);

    }//GEN-LAST:event_jCheckBox19FocusGained

    private void jCheckBox19FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox19FocusLost
        // TODO add your handling code here:
                 JPanel18.setVisible(false);

    }//GEN-LAST:event_jCheckBox19FocusLost

    private void jCheckBox20FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox20FocusGained
        // TODO add your handling code here:
                 JPanel19.setVisible(true);

    }//GEN-LAST:event_jCheckBox20FocusGained

    private void jCheckBox20FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox20FocusLost
        // TODO add your handling code here:
                 JPanel19.setVisible(false);

    }//GEN-LAST:event_jCheckBox20FocusLost

    private void jCheckBox21FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox21FocusGained
        // TODO add your handling code here:
                 JPanel20.setVisible(true);

    }//GEN-LAST:event_jCheckBox21FocusGained

    private void jCheckBox21FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox21FocusLost
        // TODO add your handling code here:
                 JPanel20.setVisible(false);

    }//GEN-LAST:event_jCheckBox21FocusLost

    private void jCheckBox22FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox22FocusGained
        // TODO add your handling code here:
                 JPanel21.setVisible(true);

    }//GEN-LAST:event_jCheckBox22FocusGained

    private void jCheckBox22FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox22FocusLost
        // TODO add your handling code here:
                 JPanel21.setVisible(false);
    }//GEN-LAST:event_jCheckBox22FocusLost

    private void jCheckBox23FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox23FocusGained
        // TODO add your handling code here:
                 JPanel22.setVisible(true);
    }//GEN-LAST:event_jCheckBox23FocusGained

    private void jCheckBox23FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox23FocusLost
        // TODO add your handling code here:
                 JPanel22.setVisible(false);
    }//GEN-LAST:event_jCheckBox23FocusLost

    private void jCheckBox24FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox24FocusGained
        // TODO add your handling code here:
                 JPanel23.setVisible(true);

    }//GEN-LAST:event_jCheckBox24FocusGained

    private void jCheckBox24FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox24FocusLost
        // TODO add your handling code here:
                 JPanel23.setVisible(false);

    }//GEN-LAST:event_jCheckBox24FocusLost

    private void jCheckBox25FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox25FocusGained
        // TODO add your handling code here:
                 JPanel24.setVisible(true);

    }//GEN-LAST:event_jCheckBox25FocusGained

    private void jCheckBox25FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox25FocusLost
        // TODO add your handling code here:
                 JPanel24.setVisible(false);

    }//GEN-LAST:event_jCheckBox25FocusLost

    private void jCheckBox26FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox26FocusGained
        // TODO add your handling code here:
                 JPanel25.setVisible(true);

    }//GEN-LAST:event_jCheckBox26FocusGained

    private void jCheckBox26FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCheckBox26FocusLost
        // TODO add your handling code here:
                 JPanel25.setVisible(false);

    }//GEN-LAST:event_jCheckBox26FocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        T.stop(); 
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ANSAPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ANSAPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ANSAPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ANSAPT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ANSAPT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ANA1;
    private javax.swing.JRadioButton ANA10;
    private javax.swing.JRadioButton ANA11;
    private javax.swing.JRadioButton ANA12;
    private javax.swing.JRadioButton ANA13;
    private javax.swing.JRadioButton ANA14;
    private javax.swing.JRadioButton ANA15;
    private javax.swing.JRadioButton ANA16;
    private javax.swing.JRadioButton ANA17;
    private javax.swing.JRadioButton ANA18;
    private javax.swing.JRadioButton ANA19;
    private javax.swing.JRadioButton ANA2;
    private javax.swing.JRadioButton ANA20;
    private javax.swing.JRadioButton ANA21;
    private javax.swing.JRadioButton ANA22;
    private javax.swing.JRadioButton ANA23;
    private javax.swing.JRadioButton ANA24;
    private javax.swing.JRadioButton ANA25;
    private javax.swing.JRadioButton ANA3;
    private javax.swing.JRadioButton ANA4;
    private javax.swing.JRadioButton ANA5;
    private javax.swing.JRadioButton ANA6;
    private javax.swing.JRadioButton ANA7;
    private javax.swing.JRadioButton ANA8;
    private javax.swing.JRadioButton ANA9;
    private javax.swing.JRadioButton ANB1;
    private javax.swing.JRadioButton ANB10;
    private javax.swing.JRadioButton ANB11;
    private javax.swing.JRadioButton ANB12;
    private javax.swing.JRadioButton ANB13;
    private javax.swing.JRadioButton ANB14;
    private javax.swing.JRadioButton ANB15;
    private javax.swing.JRadioButton ANB16;
    private javax.swing.JRadioButton ANB17;
    private javax.swing.JRadioButton ANB18;
    private javax.swing.JRadioButton ANB19;
    private javax.swing.JRadioButton ANB2;
    private javax.swing.JRadioButton ANB20;
    private javax.swing.JRadioButton ANB21;
    private javax.swing.JRadioButton ANB22;
    private javax.swing.JRadioButton ANB23;
    private javax.swing.JRadioButton ANB24;
    private javax.swing.JRadioButton ANB25;
    private javax.swing.JRadioButton ANB3;
    private javax.swing.JRadioButton ANB4;
    private javax.swing.JRadioButton ANB5;
    private javax.swing.JRadioButton ANB6;
    private javax.swing.JRadioButton ANB7;
    private javax.swing.JRadioButton ANB8;
    private javax.swing.JRadioButton ANB9;
    private javax.swing.JRadioButton ANC1;
    private javax.swing.JRadioButton ANC10;
    private javax.swing.JRadioButton ANC11;
    private javax.swing.JRadioButton ANC12;
    private javax.swing.JRadioButton ANC13;
    private javax.swing.JRadioButton ANC14;
    private javax.swing.JRadioButton ANC15;
    private javax.swing.JRadioButton ANC16;
    private javax.swing.JRadioButton ANC17;
    private javax.swing.JRadioButton ANC18;
    private javax.swing.JRadioButton ANC19;
    private javax.swing.JRadioButton ANC2;
    private javax.swing.JRadioButton ANC20;
    private javax.swing.JRadioButton ANC21;
    private javax.swing.JRadioButton ANC22;
    private javax.swing.JRadioButton ANC23;
    private javax.swing.JRadioButton ANC24;
    private javax.swing.JRadioButton ANC25;
    private javax.swing.JRadioButton ANC3;
    private javax.swing.JRadioButton ANC4;
    private javax.swing.JRadioButton ANC5;
    private javax.swing.JRadioButton ANC6;
    private javax.swing.JRadioButton ANC7;
    private javax.swing.JRadioButton ANC8;
    private javax.swing.JRadioButton ANC9;
    private javax.swing.JRadioButton AND1;
    private javax.swing.JRadioButton AND10;
    private javax.swing.JRadioButton AND11;
    private javax.swing.JRadioButton AND12;
    private javax.swing.JRadioButton AND13;
    private javax.swing.JRadioButton AND14;
    private javax.swing.JRadioButton AND15;
    private javax.swing.JRadioButton AND16;
    private javax.swing.JRadioButton AND17;
    private javax.swing.JRadioButton AND18;
    private javax.swing.JRadioButton AND19;
    private javax.swing.JRadioButton AND2;
    private javax.swing.JRadioButton AND20;
    private javax.swing.JRadioButton AND21;
    private javax.swing.JRadioButton AND22;
    private javax.swing.JRadioButton AND23;
    private javax.swing.JRadioButton AND24;
    private javax.swing.JRadioButton AND25;
    private javax.swing.JRadioButton AND3;
    private javax.swing.JRadioButton AND4;
    private javax.swing.JRadioButton AND5;
    private javax.swing.JRadioButton AND6;
    private javax.swing.JRadioButton AND7;
    private javax.swing.JRadioButton AND8;
    private javax.swing.JRadioButton AND9;
    private javax.swing.JTextField Comp_ID;
    private javax.swing.JLabel HR;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JPanel JPanel10;
    private javax.swing.JPanel JPanel11;
    private javax.swing.JPanel JPanel12;
    private javax.swing.JPanel JPanel13;
    private javax.swing.JPanel JPanel14;
    private javax.swing.JPanel JPanel15;
    private javax.swing.JPanel JPanel16;
    private javax.swing.JPanel JPanel17;
    private javax.swing.JPanel JPanel18;
    private javax.swing.JPanel JPanel19;
    private javax.swing.JPanel JPanel2;
    private javax.swing.JPanel JPanel20;
    private javax.swing.JPanel JPanel21;
    private javax.swing.JPanel JPanel22;
    private javax.swing.JPanel JPanel23;
    private javax.swing.JPanel JPanel24;
    private javax.swing.JPanel JPanel25;
    private javax.swing.JPanel JPanel3;
    private javax.swing.JPanel JPanel4;
    private javax.swing.JPanel JPanel5;
    private javax.swing.JPanel JPanel6;
    private javax.swing.JPanel JPanel7;
    private javax.swing.JPanel JPanel8;
    private javax.swing.JPanel JPanel9;
    private javax.swing.JLabel MN;
    private javax.swing.JTextField NO1;
    private javax.swing.JTextField NO2;
    private javax.swing.JTextField PGNO;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel10;
    private javax.swing.JPanel Panel11;
    private javax.swing.JPanel Panel12;
    private javax.swing.JPanel Panel13;
    private javax.swing.JPanel Panel14;
    private javax.swing.JPanel Panel15;
    private javax.swing.JPanel Panel16;
    private javax.swing.JPanel Panel17;
    private javax.swing.JPanel Panel18;
    private javax.swing.JPanel Panel19;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel20;
    private javax.swing.JPanel Panel21;
    private javax.swing.JPanel Panel22;
    private javax.swing.JPanel Panel23;
    private javax.swing.JPanel Panel24;
    private javax.swing.JPanel Panel25;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JPanel Panel6;
    private javax.swing.JPanel Panel7;
    private javax.swing.JPanel Panel8;
    private javax.swing.JPanel Panel9;
    private javax.swing.JLabel QN1;
    private javax.swing.JLabel QN10;
    private javax.swing.JLabel QN11;
    private javax.swing.JLabel QN12;
    private javax.swing.JLabel QN13;
    private javax.swing.JLabel QN14;
    private javax.swing.JLabel QN15;
    private javax.swing.JLabel QN16;
    private javax.swing.JLabel QN17;
    private javax.swing.JLabel QN18;
    private javax.swing.JLabel QN19;
    private javax.swing.JLabel QN2;
    private javax.swing.JLabel QN20;
    private javax.swing.JLabel QN21;
    private javax.swing.JLabel QN22;
    private javax.swing.JLabel QN23;
    private javax.swing.JLabel QN24;
    private javax.swing.JLabel QN25;
    private javax.swing.JLabel QN3;
    private javax.swing.JLabel QN4;
    private javax.swing.JLabel QN5;
    private javax.swing.JLabel QN6;
    private javax.swing.JLabel QN7;
    private javax.swing.JLabel QN8;
    private javax.swing.JLabel QN9;
    private javax.swing.JLabel SC;
    private javax.swing.JTextField TOTPG;
    private javax.swing.JTextField TQ;
    private javax.swing.JTextField Test_ID;
    private javax.swing.JTextField Test_Name;
    private javax.swing.JTextArea TextArea1;
    private javax.swing.JTextArea TextArea10;
    private javax.swing.JTextArea TextArea11;
    private javax.swing.JTextArea TextArea12;
    private javax.swing.JTextArea TextArea13;
    private javax.swing.JTextArea TextArea14;
    private javax.swing.JTextArea TextArea15;
    private javax.swing.JTextArea TextArea16;
    private javax.swing.JTextArea TextArea17;
    private javax.swing.JTextArea TextArea18;
    private javax.swing.JTextArea TextArea19;
    private javax.swing.JTextArea TextArea2;
    private javax.swing.JTextArea TextArea20;
    private javax.swing.JTextArea TextArea21;
    private javax.swing.JTextArea TextArea22;
    private javax.swing.JTextArea TextArea23;
    private javax.swing.JTextArea TextArea24;
    private javax.swing.JTextArea TextArea25;
    private javax.swing.JTextArea TextArea3;
    private javax.swing.JTextArea TextArea4;
    private javax.swing.JTextArea TextArea5;
    private javax.swing.JTextArea TextArea6;
    private javax.swing.JTextArea TextArea7;
    private javax.swing.JTextArea TextArea8;
    private javax.swing.JTextArea TextArea9;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup24;
    private javax.swing.ButtonGroup buttonGroup25;
    private javax.swing.ButtonGroup buttonGroup26;
    private javax.swing.ButtonGroup buttonGroup27;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea21;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea23;
    private javax.swing.JTextArea jTextArea24;
    private javax.swing.JTextArea jTextArea25;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField stdid;
    // End of variables declaration//GEN-END:variables
}
