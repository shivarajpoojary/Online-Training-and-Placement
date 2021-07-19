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

/**
 *
 * @author User
 */
public class APTTEST extends javax.swing.JFrame {

    /**
     * Creates new form APTTEST
     */
    public APTTEST() {
        initComponents();

       
    }
     public APTTEST(String uname,String COM, String TestN,int NM1,int NM2,int PG)
    {
        initComponents();
        Comp_ID.setText(COM);
        Test_Name.setText(TestN);
        Test_ID.setText(uname);
        NO1.setText(""+NM1);
        NO2.setText(""+NM2);
        PGNO.setText(""+PG);
        jButton2.setVisible(false);


        int i=Integer.parseInt(NO1.getText());
        int j=Integer.parseInt(NO2.getText());

           
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
                
                   
           
      
    }
   
      public APTTEST(String uname,String COM, String TestN,int PG, int TPG,int m,int n)
    {
        initComponents();
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

    
        
    
        
        Test_ID.setText(uname);
        Comp_ID.setText(COM);
        Test_Name.setText(TestN);
        PGNO.setText(""+PG);
        NO1.setText(""+m);
               

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
                    sql = "SELECT  DISTINCT `PGNO` from `student`.`APTTEST` WHERE `Test_ID` = ? LIMIT 0 , 30";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, Test_ID.getText());
                    ResultSet rs  = pst.executeQuery();
                    while(rs.next())
                    {
                        TOPG = rs.getInt(1);
                        TOTPG.setText(""+TOPG);

                    }
                    sql1 = "SELECT  `QNO` from `student`.`APTTEST` WHERE `Test_ID` = ? AND `PGNO` = ? ORDER BY `QNO` LIMIT 0 , 30";
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
              APT();
       
    }
      private void APT()
    {
        try
        {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
            String sql,sql1;
            PreparedStatement pst,pst1;

            sql = "SELECT `QNO`,`Question`,`OPA`,`OPB`,`OPC`,`OPD`,`EXPL`,`ANSWER` from `student`.`APTTEST` WHERE `Test_ID` = ? AND `PGNO` = ? ORDER BY `QNO` LIMIT 0 , 30";
            pst = con.prepareStatement(sql);
            pst.setString(1, Test_ID.getText());
            int PG = Integer.parseInt(PGNO.getText());
            pst.setInt(2,PG);
            ResultSet rs  = pst.executeQuery();
            while(rs.next())
            {
               
                int QNO = rs.getInt(1);
                char ANS = rs.getString(8).charAt(0);
 
                switch (QNO) {
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
                    TextArea1.setText(rs.getString(2));
                    OPA1.setText(rs.getString(3));
                    OPB1.setText(rs.getString(4));
                    OPC1.setText(rs.getString(5));
                    OPD1.setText(rs.getString(6));
                    jTextArea1.setText(rs.getString(7));
                   
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

                    TextArea2.setText(rs.getString(2));
                    OPA2.setText(rs.getString(3));
                    OPB2.setText(rs.getString(4));
                    OPC2.setText(rs.getString(5));
                    OPD2.setText(rs.getString(6));
                    jTextArea2.setText(rs.getString(7));

                    break;

                    case 3:
                        switch (ANS)
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

                    TextArea3.setText(rs.getString(2));
                    OPA3.setText(rs.getString(3));
                    OPB3.setText(rs.getString(4));
                    OPC3.setText(rs.getString(5));
                    OPD3.setText(rs.getString(6));
                    jTextArea3.setText(rs.getString(7));

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

                    TextArea4.setText(rs.getString(2));
                    OPA4.setText(rs.getString(3));
                    OPB4.setText(rs.getString(4));
                    OPC4.setText(rs.getString(5));
                    OPD4.setText(rs.getString(6));
                    jTextArea4.setText(rs.getString(7));

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

                    TextArea5.setText(rs.getString(2));
                    OPA5.setText(rs.getString(3));
                    OPB5.setText(rs.getString(4));
                    OPC5.setText(rs.getString(5));
                    OPD5.setText(rs.getString(6));

                    jTextArea5.setText(rs.getString(7));
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

                    TextArea6.setText(rs.getString(2));
                    OPA6.setText(rs.getString(3));
                    OPB6.setText(rs.getString(4));
                    OPC6.setText(rs.getString(5));
                    OPD6.setText(rs.getString(6));
                    jTextArea6.setText(rs.getString(7));

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

                    TextArea7.setText(rs.getString(2));
                    OPA7.setText(rs.getString(3));
                    OPB7.setText(rs.getString(4));
                    OPC7.setText(rs.getString(5));
                    OPD7.setText(rs.getString(6));
                    jTextArea7.setText(rs.getString(7));

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

                    TextArea8.setText(rs.getString(2));
                    OPA8.setText(rs.getString(3));
                    OPB8.setText(rs.getString(4));
                    OPC8.setText(rs.getString(5));
                    OPD8.setText(rs.getString(6));
                    jTextArea8.setText(rs.getString(7));

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

                    TextArea9.setText(rs.getString(2));
                    OPA9.setText(rs.getString(3));
                    OPB9.setText(rs.getString(4));
                    OPC9.setText(rs.getString(5));
                    OPD9.setText(rs.getString(6));
                    jTextArea9.setText(rs.getString(7));

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

                    TextArea10.setText(rs.getString(2));
                    OPA10.setText(rs.getString(3));
                    OPB10.setText(rs.getString(4));
                    OPC10.setText(rs.getString(5));
                    OPD10.setText(rs.getString(6));
                    jTextArea10.setText(rs.getString(7));

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

                    TextArea11.setText(rs.getString(2));
                    OPA11.setText(rs.getString(3));
                    OPB11.setText(rs.getString(4));
                    OPC11.setText(rs.getString(5));
                    OPD11.setText(rs.getString(6));
                    jTextArea11.setText(rs.getString(7));

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

                    TextArea12.setText(rs.getString(2));
                    OPA12.setText(rs.getString(3));
                    OPB12.setText(rs.getString(4));
                    OPC12.setText(rs.getString(5));
                    OPD12.setText(rs.getString(6));
                    jTextArea12.setText(rs.getString(7));

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

                    TextArea13.setText(rs.getString(2));
                    OPA13.setText(rs.getString(3));
                    OPB13.setText(rs.getString(4));
                    OPC13.setText(rs.getString(5));
                    OPD13.setText(rs.getString(6));
                    jTextArea13.setText(rs.getString(7));

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

                    TextArea14.setText(rs.getString(2));
                    OPA14.setText(rs.getString(3));
                    OPB14.setText(rs.getString(4));
                    OPC14.setText(rs.getString(5));
                    OPD14.setText(rs.getString(6));
                    jTextArea14.setText(rs.getString(7));

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

                    TextArea15.setText(rs.getString(2));
                    OPA15.setText(rs.getString(3));
                    OPB15.setText(rs.getString(4));
                    OPC15.setText(rs.getString(5));
                    OPD15.setText(rs.getString(6));
                    jTextArea15.setText(rs.getString(7));

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

                    TextArea16.setText(rs.getString(2));
                    OPA16.setText(rs.getString(3));
                    OPB16.setText(rs.getString(4));
                    OPC16.setText(rs.getString(5));
                    OPD16.setText(rs.getString(6));
                    jTextArea16.setText(rs.getString(7));

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

                    TextArea17.setText(rs.getString(2));
                    OPA17.setText(rs.getString(3));
                    OPB17.setText(rs.getString(4));
                    OPC17.setText(rs.getString(5));
                    OPD17.setText(rs.getString(6));
                    jTextArea17.setText(rs.getString(7));

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

                    TextArea18.setText(rs.getString(2));
                    OPA18.setText(rs.getString(3));
                    OPB18.setText(rs.getString(4));
                    OPC18.setText(rs.getString(5));
                    OPD18.setText(rs.getString(6));
                    jTextArea18.setText(rs.getString(7));

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

                    TextArea19.setText(rs.getString(2));
                    OPA19.setText(rs.getString(3));
                    OPB19.setText(rs.getString(4));
                    OPC19.setText(rs.getString(5));
                    OPD19.setText(rs.getString(6));
                    jTextArea19.setText(rs.getString(7));

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

                    TextArea20.setText(rs.getString(2));
                    OPA20.setText(rs.getString(3));
                    OPB20.setText(rs.getString(4));
                    OPC20.setText(rs.getString(5));
                    OPD20.setText(rs.getString(6));
                    jTextArea20.setText(rs.getString(7));

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

                    TextArea21.setText(rs.getString(2));
                    OPA21.setText(rs.getString(3));
                    OPB21.setText(rs.getString(4));
                    OPC21.setText(rs.getString(5));
                    OPD21.setText(rs.getString(6));
                    jTextArea21.setText(rs.getString(7));

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

                    TextArea22.setText(rs.getString(2));
                    OPA22.setText(rs.getString(3));
                    OPB22.setText(rs.getString(4));
                    OPC22.setText(rs.getString(5));
                    OPD22.setText(rs.getString(6));
                    jTextArea22.setText(rs.getString(7));

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

                    TextArea23.setText(rs.getString(2));
                    OPA23.setText(rs.getString(3));
                    OPB23.setText(rs.getString(4));
                    OPC23.setText(rs.getString(5));
                    OPD23.setText(rs.getString(6));
                    jTextArea23.setText(rs.getString(7));

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

                    TextArea24.setText(rs.getString(2));
                    OPA24.setText(rs.getString(3));
                    OPB24.setText(rs.getString(4));
                    OPC24.setText(rs.getString(5));
                    OPD24.setText(rs.getString(6));
                    jTextArea25.setText(rs.getString(7));

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

                    TextArea25.setText(rs.getString(2));
                    OPA25.setText(rs.getString(3));
                    OPB25.setText(rs.getString(4));
                    OPC25.setText(rs.getString(5));
                    OPD25.setText(rs.getString(6));
                    jTextArea24.setText(rs.getString(7));

                    break;

                }
            }


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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Panel1 = new javax.swing.JPanel();
        QN1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        OPA1 = new javax.swing.JTextField();
        OPB1 = new javax.swing.JTextField();
        OPD1 = new javax.swing.JTextField();
        OPC1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ANA1 = new javax.swing.JRadioButton();
        ANB1 = new javax.swing.JRadioButton();
        ANC1 = new javax.swing.JRadioButton();
        AND1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        QN2 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TextArea2 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        OPA2 = new javax.swing.JTextField();
        OPB2 = new javax.swing.JTextField();
        OPD2 = new javax.swing.JTextField();
        OPC2 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        ANA2 = new javax.swing.JRadioButton();
        ANB2 = new javax.swing.JRadioButton();
        ANC2 = new javax.swing.JRadioButton();
        AND2 = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Panel3 = new javax.swing.JPanel();
        QN3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TextArea3 = new javax.swing.JTextArea();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        OPA3 = new javax.swing.JTextField();
        OPB3 = new javax.swing.JTextField();
        OPD3 = new javax.swing.JTextField();
        OPC3 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        ANA3 = new javax.swing.JRadioButton();
        ANB3 = new javax.swing.JRadioButton();
        ANC3 = new javax.swing.JRadioButton();
        AND3 = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        Panel4 = new javax.swing.JPanel();
        QN4 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        TextArea4 = new javax.swing.JTextArea();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        OPA4 = new javax.swing.JTextField();
        OPB4 = new javax.swing.JTextField();
        OPD4 = new javax.swing.JTextField();
        OPC4 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        ANA4 = new javax.swing.JRadioButton();
        ANB4 = new javax.swing.JRadioButton();
        ANC4 = new javax.swing.JRadioButton();
        AND4 = new javax.swing.JRadioButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        Panel5 = new javax.swing.JPanel();
        QN5 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        TextArea5 = new javax.swing.JTextArea();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        OPA5 = new javax.swing.JTextField();
        OPB5 = new javax.swing.JTextField();
        OPD5 = new javax.swing.JTextField();
        OPC5 = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        ANA5 = new javax.swing.JRadioButton();
        ANB5 = new javax.swing.JRadioButton();
        ANC5 = new javax.swing.JRadioButton();
        AND5 = new javax.swing.JRadioButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        Panel19 = new javax.swing.JPanel();
        QN19 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        TextArea19 = new javax.swing.JTextArea();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        OPA19 = new javax.swing.JTextField();
        OPB19 = new javax.swing.JTextField();
        OPD19 = new javax.swing.JTextField();
        OPC19 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        ANA19 = new javax.swing.JRadioButton();
        ANB19 = new javax.swing.JRadioButton();
        ANC19 = new javax.swing.JRadioButton();
        AND19 = new javax.swing.JRadioButton();
        jScrollPane45 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        Panel20 = new javax.swing.JPanel();
        QN20 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        TextArea20 = new javax.swing.JTextArea();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        OPA20 = new javax.swing.JTextField();
        OPB20 = new javax.swing.JTextField();
        OPD20 = new javax.swing.JTextField();
        OPC20 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        ANA20 = new javax.swing.JRadioButton();
        ANB20 = new javax.swing.JRadioButton();
        ANC20 = new javax.swing.JRadioButton();
        AND20 = new javax.swing.JRadioButton();
        jScrollPane46 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        Panel21 = new javax.swing.JPanel();
        QN21 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        TextArea21 = new javax.swing.JTextArea();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        OPA21 = new javax.swing.JTextField();
        OPB21 = new javax.swing.JTextField();
        OPD21 = new javax.swing.JTextField();
        OPC21 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        ANA21 = new javax.swing.JRadioButton();
        ANB21 = new javax.swing.JRadioButton();
        ANC21 = new javax.swing.JRadioButton();
        AND21 = new javax.swing.JRadioButton();
        jScrollPane47 = new javax.swing.JScrollPane();
        jTextArea21 = new javax.swing.JTextArea();
        Panel22 = new javax.swing.JPanel();
        QN22 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        TextArea22 = new javax.swing.JTextArea();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        OPA22 = new javax.swing.JTextField();
        OPB22 = new javax.swing.JTextField();
        OPD22 = new javax.swing.JTextField();
        OPC22 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        ANA22 = new javax.swing.JRadioButton();
        ANB22 = new javax.swing.JRadioButton();
        ANC22 = new javax.swing.JRadioButton();
        AND22 = new javax.swing.JRadioButton();
        jScrollPane48 = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        Panel7 = new javax.swing.JPanel();
        QN7 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        TextArea7 = new javax.swing.JTextArea();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        OPA7 = new javax.swing.JTextField();
        OPB7 = new javax.swing.JTextField();
        OPD7 = new javax.swing.JTextField();
        OPC7 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        ANA7 = new javax.swing.JRadioButton();
        ANB7 = new javax.swing.JRadioButton();
        ANC7 = new javax.swing.JRadioButton();
        AND7 = new javax.swing.JRadioButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        Panel6 = new javax.swing.JPanel();
        QN6 = new javax.swing.JLabel();
        jScrollPane21 = new javax.swing.JScrollPane();
        TextArea6 = new javax.swing.JTextArea();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        OPA6 = new javax.swing.JTextField();
        OPB6 = new javax.swing.JTextField();
        OPD6 = new javax.swing.JTextField();
        OPC6 = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        ANA6 = new javax.swing.JRadioButton();
        ANB6 = new javax.swing.JRadioButton();
        ANC6 = new javax.swing.JRadioButton();
        AND6 = new javax.swing.JRadioButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        Panel10 = new javax.swing.JPanel();
        QN10 = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        TextArea10 = new javax.swing.JTextArea();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        OPA10 = new javax.swing.JTextField();
        OPB10 = new javax.swing.JTextField();
        OPD10 = new javax.swing.JTextField();
        OPC10 = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        ANA10 = new javax.swing.JRadioButton();
        ANB10 = new javax.swing.JRadioButton();
        ANC10 = new javax.swing.JRadioButton();
        AND10 = new javax.swing.JRadioButton();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        Panel8 = new javax.swing.JPanel();
        QN8 = new javax.swing.JLabel();
        jScrollPane23 = new javax.swing.JScrollPane();
        TextArea8 = new javax.swing.JTextArea();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        OPA8 = new javax.swing.JTextField();
        OPB8 = new javax.swing.JTextField();
        OPD8 = new javax.swing.JTextField();
        OPC8 = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        ANA8 = new javax.swing.JRadioButton();
        ANB8 = new javax.swing.JRadioButton();
        ANC8 = new javax.swing.JRadioButton();
        AND8 = new javax.swing.JRadioButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        Panel18 = new javax.swing.JPanel();
        QN18 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        TextArea18 = new javax.swing.JTextArea();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        OPA18 = new javax.swing.JTextField();
        OPB18 = new javax.swing.JTextField();
        OPD18 = new javax.swing.JTextField();
        OPC18 = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        ANA18 = new javax.swing.JRadioButton();
        ANB18 = new javax.swing.JRadioButton();
        ANC18 = new javax.swing.JRadioButton();
        AND18 = new javax.swing.JRadioButton();
        jScrollPane44 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        Panel9 = new javax.swing.JPanel();
        QN9 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        TextArea9 = new javax.swing.JTextArea();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        OPA9 = new javax.swing.JTextField();
        OPB9 = new javax.swing.JTextField();
        OPD9 = new javax.swing.JTextField();
        OPC9 = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        ANA9 = new javax.swing.JRadioButton();
        ANB9 = new javax.swing.JRadioButton();
        ANC9 = new javax.swing.JRadioButton();
        AND9 = new javax.swing.JRadioButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        Panel13 = new javax.swing.JPanel();
        QN13 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        TextArea13 = new javax.swing.JTextArea();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        OPA13 = new javax.swing.JTextField();
        OPB13 = new javax.swing.JTextField();
        OPD13 = new javax.swing.JTextField();
        OPC13 = new javax.swing.JTextField();
        jLabel151 = new javax.swing.JLabel();
        ANA13 = new javax.swing.JRadioButton();
        ANB13 = new javax.swing.JRadioButton();
        ANC13 = new javax.swing.JRadioButton();
        AND13 = new javax.swing.JRadioButton();
        jScrollPane39 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        Panel11 = new javax.swing.JPanel();
        QN11 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        TextArea11 = new javax.swing.JTextArea();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        OPA11 = new javax.swing.JTextField();
        OPB11 = new javax.swing.JTextField();
        OPD11 = new javax.swing.JTextField();
        OPC11 = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        ANA11 = new javax.swing.JRadioButton();
        ANB11 = new javax.swing.JRadioButton();
        ANC11 = new javax.swing.JRadioButton();
        AND11 = new javax.swing.JRadioButton();
        jScrollPane37 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        Panel15 = new javax.swing.JPanel();
        QN15 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        TextArea15 = new javax.swing.JTextArea();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        OPA15 = new javax.swing.JTextField();
        OPB15 = new javax.swing.JTextField();
        OPD15 = new javax.swing.JTextField();
        OPC15 = new javax.swing.JTextField();
        jLabel163 = new javax.swing.JLabel();
        ANA15 = new javax.swing.JRadioButton();
        ANB15 = new javax.swing.JRadioButton();
        ANC15 = new javax.swing.JRadioButton();
        AND15 = new javax.swing.JRadioButton();
        jScrollPane41 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        Panel14 = new javax.swing.JPanel();
        QN14 = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        TextArea14 = new javax.swing.JTextArea();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        OPA14 = new javax.swing.JTextField();
        OPB14 = new javax.swing.JTextField();
        OPD14 = new javax.swing.JTextField();
        OPC14 = new javax.swing.JTextField();
        jLabel175 = new javax.swing.JLabel();
        ANA14 = new javax.swing.JRadioButton();
        ANB14 = new javax.swing.JRadioButton();
        ANC14 = new javax.swing.JRadioButton();
        AND14 = new javax.swing.JRadioButton();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        Panel16 = new javax.swing.JPanel();
        QN16 = new javax.swing.JLabel();
        jScrollPane31 = new javax.swing.JScrollPane();
        TextArea16 = new javax.swing.JTextArea();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        OPA16 = new javax.swing.JTextField();
        OPB16 = new javax.swing.JTextField();
        OPD16 = new javax.swing.JTextField();
        OPC16 = new javax.swing.JTextField();
        jLabel181 = new javax.swing.JLabel();
        ANA16 = new javax.swing.JRadioButton();
        ANB16 = new javax.swing.JRadioButton();
        ANC16 = new javax.swing.JRadioButton();
        AND16 = new javax.swing.JRadioButton();
        jScrollPane42 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        Panel17 = new javax.swing.JPanel();
        QN17 = new javax.swing.JLabel();
        jScrollPane32 = new javax.swing.JScrollPane();
        TextArea17 = new javax.swing.JTextArea();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        OPA17 = new javax.swing.JTextField();
        OPB17 = new javax.swing.JTextField();
        OPD17 = new javax.swing.JTextField();
        OPC17 = new javax.swing.JTextField();
        jLabel187 = new javax.swing.JLabel();
        ANA17 = new javax.swing.JRadioButton();
        ANB17 = new javax.swing.JRadioButton();
        ANC17 = new javax.swing.JRadioButton();
        AND17 = new javax.swing.JRadioButton();
        jScrollPane43 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        Panel12 = new javax.swing.JPanel();
        QN12 = new javax.swing.JLabel();
        jScrollPane33 = new javax.swing.JScrollPane();
        TextArea12 = new javax.swing.JTextArea();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        OPA12 = new javax.swing.JTextField();
        OPB12 = new javax.swing.JTextField();
        OPD12 = new javax.swing.JTextField();
        OPC12 = new javax.swing.JTextField();
        jLabel193 = new javax.swing.JLabel();
        ANA12 = new javax.swing.JRadioButton();
        ANB12 = new javax.swing.JRadioButton();
        ANC12 = new javax.swing.JRadioButton();
        AND12 = new javax.swing.JRadioButton();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        Panel25 = new javax.swing.JPanel();
        QN25 = new javax.swing.JLabel();
        jScrollPane29 = new javax.swing.JScrollPane();
        TextArea25 = new javax.swing.JTextArea();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        OPA25 = new javax.swing.JTextField();
        OPB25 = new javax.swing.JTextField();
        OPD25 = new javax.swing.JTextField();
        OPC25 = new javax.swing.JTextField();
        jLabel169 = new javax.swing.JLabel();
        ANA25 = new javax.swing.JRadioButton();
        ANB25 = new javax.swing.JRadioButton();
        ANC25 = new javax.swing.JRadioButton();
        AND25 = new javax.swing.JRadioButton();
        jScrollPane50 = new javax.swing.JScrollPane();
        jTextArea25 = new javax.swing.JTextArea();
        Panel23 = new javax.swing.JPanel();
        QN23 = new javax.swing.JLabel();
        jScrollPane34 = new javax.swing.JScrollPane();
        TextArea23 = new javax.swing.JTextArea();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        OPA23 = new javax.swing.JTextField();
        OPB23 = new javax.swing.JTextField();
        OPD23 = new javax.swing.JTextField();
        OPC23 = new javax.swing.JTextField();
        jLabel199 = new javax.swing.JLabel();
        ANA23 = new javax.swing.JRadioButton();
        ANB23 = new javax.swing.JRadioButton();
        ANC23 = new javax.swing.JRadioButton();
        AND23 = new javax.swing.JRadioButton();
        jScrollPane49 = new javax.swing.JScrollPane();
        jTextArea23 = new javax.swing.JTextArea();
        Panel24 = new javax.swing.JPanel();
        QN24 = new javax.swing.JLabel();
        jScrollPane35 = new javax.swing.JScrollPane();
        TextArea24 = new javax.swing.JTextArea();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        OPA24 = new javax.swing.JTextField();
        OPB24 = new javax.swing.JTextField();
        OPD24 = new javax.swing.JTextField();
        OPC24 = new javax.swing.JTextField();
        jLabel205 = new javax.swing.JLabel();
        ANA24 = new javax.swing.JRadioButton();
        ANB24 = new javax.swing.JRadioButton();
        ANC24 = new javax.swing.JRadioButton();
        AND24 = new javax.swing.JRadioButton();
        jScrollPane51 = new javax.swing.JScrollPane();
        jTextArea24 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Comp_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Test_ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Test_Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NO1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NO2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PGNO = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TOTPG = new javax.swing.JTextField();
        TQ = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1800, 1500));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Practice Aptitude Test");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(514, 514, 514)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(3114, 12401));

        Panel1.setBackground(new java.awt.Color(204, 204, 204));

        QN1.setText("1");

        TextArea1.setColumns(20);
        TextArea1.setRows(5);
        jScrollPane3.setViewportView(TextArea1);

        jLabel12.setText("D.");

        jLabel13.setBackground(new java.awt.Color(204, 255, 255));
        jLabel13.setText("LOCKED ANSWER");
        jLabel13.setOpaque(true);

        buttonGroup1.add(ANA1);
        ANA1.setText("A");

        buttonGroup1.add(ANB1);
        ANB1.setText("B");
        ANB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANB1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(ANC1);
        ANC1.setText("C");

        buttonGroup1.add(AND1);
        AND1.setText("D");

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        jLabel15.setText("A.");

        jLabel16.setText("B.");

        jLabel17.setText("C.");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(OPA1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel10)
                                .addGap(42, 42, 42))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)))
                        .addComponent(OPB1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(10, 10, 10)))
                        .addComponent(OPC1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANA1)
                    .addComponent(AND1)
                    .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ANB1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ANC1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)
                                .addComponent(OPA1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(OPD1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(OPC1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel17))
                            .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(OPB1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16))))
                    .addGroup(Panel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANA1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANB1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANC1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AND1)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        Panel2.setBackground(new java.awt.Color(204, 204, 204));

        QN2.setText("2");

        TextArea2.setColumns(20);
        TextArea2.setRows(5);
        jScrollPane7.setViewportView(TextArea2);

        jLabel33.setText("A.");

        jLabel34.setText("B.");

        jLabel35.setText("C.");

        jLabel36.setText("D.");

        jLabel37.setBackground(new java.awt.Color(204, 255, 255));
        jLabel37.setText("LOCKED ANSWER");
        jLabel37.setOpaque(true);

        buttonGroup3.add(ANA2);
        ANA2.setText("A");

        buttonGroup3.add(ANB2);
        ANB2.setText("B");

        buttonGroup3.add(ANC2);
        ANC2.setText("C");

        buttonGroup3.add(AND2);
        AND2.setText("D");

        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane4.setViewportView(jTextArea2);

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(OPA2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel34)
                        .addGap(18, 18, 18)
                        .addComponent(OPB2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANA2)
                    .addComponent(ANC2)
                    .addComponent(ANB2)
                    .addComponent(AND2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN2)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34)
                            .addComponent(OPA2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ANA2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AND2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Panel3.setBackground(new java.awt.Color(204, 204, 204));

        QN3.setText("3");

        TextArea3.setColumns(20);
        TextArea3.setRows(5);
        jScrollPane9.setViewportView(TextArea3);

        jLabel45.setText("A.");

        jLabel46.setText("B.");

        jLabel47.setText("C.");

        jLabel48.setText("D.");

        jLabel49.setBackground(new java.awt.Color(204, 255, 255));
        jLabel49.setText("LOCKED ANSWER");
        jLabel49.setOpaque(true);

        buttonGroup2.add(ANA3);
        ANA3.setText("A");

        buttonGroup2.add(ANB3);
        ANB3.setText("B");

        buttonGroup2.add(ANC3);
        ANC3.setText("C");

        buttonGroup2.add(AND3);
        AND3.setText("D");

        jTextArea3.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane5.setViewportView(jTextArea3);

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel45)
                        .addGap(18, 18, 18)
                        .addComponent(OPA3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(OPB3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ANB3)
                        .addComponent(ANA3)
                        .addComponent(ANC3)
                        .addComponent(AND3))
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel3Layout.createSequentialGroup()
                .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN3)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(jLabel48)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46)
                            .addComponent(OPA3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel3Layout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANA3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANB3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANC3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AND3)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        Panel4.setBackground(new java.awt.Color(204, 204, 204));

        QN4.setText("4");

        TextArea4.setColumns(20);
        TextArea4.setRows(5);
        jScrollPane14.setViewportView(TextArea4);

        jLabel75.setText("A.");

        jLabel76.setText("B.");

        jLabel77.setText("C.");

        jLabel78.setText("D.");

        jLabel79.setBackground(new java.awt.Color(204, 255, 255));
        jLabel79.setText("LOCKED ANSWER");
        jLabel79.setOpaque(true);

        buttonGroup4.add(ANA4);
        ANA4.setText("A");

        buttonGroup4.add(ANB4);
        ANB4.setText("B");

        buttonGroup4.add(ANC4);
        ANC4.setText("C");

        buttonGroup4.add(AND4);
        AND4.setText("D");

        jTextArea4.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane6.setViewportView(jTextArea4);

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
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ANA4)
                            .addComponent(ANB4)
                            .addComponent(ANC4)
                            .addComponent(AND4)
                            .addComponent(jLabel79)))
                    .addGroup(Panel4Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel75)
                        .addGap(18, 18, 18)
                        .addComponent(OPA4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel76)
                        .addGap(18, 18, 18)
                        .addComponent(OPB4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel4Layout.createSequentialGroup()
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN4)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANC4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AND4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(jLabel78)
                    .addComponent(jLabel77)
                    .addComponent(jLabel76)
                    .addComponent(OPA4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPD4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPB4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPC4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel5.setBackground(new java.awt.Color(204, 204, 204));

        QN5.setText("5");

        TextArea5.setColumns(20);
        TextArea5.setRows(5);
        jScrollPane15.setViewportView(TextArea5);

        jLabel81.setText("A.");

        jLabel82.setText("B.");

        jLabel83.setText("C.");

        jLabel84.setText("D.");

        jLabel85.setBackground(new java.awt.Color(204, 255, 255));
        jLabel85.setText("LOCKED ANSWER");
        jLabel85.setOpaque(true);

        buttonGroup5.add(ANA5);
        ANA5.setText("A");

        buttonGroup5.add(ANB5);
        ANB5.setText("B");

        buttonGroup5.add(ANC5);
        ANC5.setText("C");

        buttonGroup5.add(AND5);
        AND5.setText("D");

        jTextArea5.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane8.setViewportView(jTextArea5);

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel5Layout.createSequentialGroup()
                .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel5Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel81)
                        .addGap(18, 18, 18)
                        .addComponent(OPA5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel82)
                        .addGap(18, 18, 18)
                        .addComponent(OPB5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ANA5)
                    .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANB5)
                    .addComponent(ANC5)
                    .addComponent(AND5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8)
                .addContainerGap())
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel5Layout.createSequentialGroup()
                .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel5Layout.createSequentialGroup()
                        .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QN5)
                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel81)
                                    .addComponent(jLabel84)
                                    .addComponent(jLabel83)
                                    .addComponent(jLabel82)
                                    .addComponent(OPA5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPD5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPB5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPC5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel5Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANA5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANB5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANC5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AND5)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Panel19.setBackground(new java.awt.Color(204, 204, 204));

        QN19.setText("19");

        TextArea19.setColumns(20);
        TextArea19.setRows(5);
        jScrollPane16.setViewportView(TextArea19);

        jLabel87.setText("A.");

        jLabel88.setText("B.");

        jLabel89.setText("C.");

        jLabel90.setText("D.");

        jLabel91.setBackground(new java.awt.Color(204, 255, 255));
        jLabel91.setText("LOCKED ANSWER");
        jLabel91.setOpaque(true);

        buttonGroup19.add(ANA19);
        ANA19.setText("A");

        buttonGroup19.add(ANB19);
        ANB19.setText("B");

        buttonGroup19.add(ANC19);
        ANC19.setText("C");

        buttonGroup19.add(AND19);
        AND19.setText("D");

        jTextArea19.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea19.setColumns(20);
        jTextArea19.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea19.setRows(5);
        jTextArea19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane45.setViewportView(jTextArea19);

        javax.swing.GroupLayout Panel19Layout = new javax.swing.GroupLayout(Panel19);
        Panel19.setLayout(Panel19Layout);
        Panel19Layout.setHorizontalGroup(
            Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel19Layout.createSequentialGroup()
                .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel19Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel87)
                        .addGap(18, 18, 18)
                        .addComponent(OPA19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel88)
                        .addGap(18, 18, 18)
                        .addComponent(OPB19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN19, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ANA19)
                            .addComponent(ANB19)
                            .addComponent(ANC19)
                            .addComponent(AND19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane45)
                .addContainerGap())
        );
        Panel19Layout.setVerticalGroup(
            Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel19Layout.createSequentialGroup()
                        .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN19)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel19Layout.createSequentialGroup()
                                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANA19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANB19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANC19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AND19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(jLabel90)
                            .addComponent(jLabel89)
                            .addComponent(jLabel88)
                            .addComponent(OPA19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel20.setBackground(new java.awt.Color(204, 204, 204));

        QN20.setText("20");

        TextArea20.setColumns(20);
        TextArea20.setRows(5);
        jScrollPane17.setViewportView(TextArea20);

        jLabel93.setText("A.");

        jLabel94.setText("B.");

        jLabel95.setText("C.");

        jLabel96.setText("D.");

        jLabel97.setBackground(new java.awt.Color(204, 255, 255));
        jLabel97.setText("LOCKED ANSWER");
        jLabel97.setOpaque(true);

        buttonGroup20.add(ANA20);
        ANA20.setText("A");

        buttonGroup20.add(ANB20);
        ANB20.setText("B");

        buttonGroup20.add(ANC20);
        ANC20.setText("C");

        buttonGroup20.add(AND20);
        AND20.setText("D");

        jTextArea20.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea20.setColumns(20);
        jTextArea20.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea20.setRows(5);
        jTextArea20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane46.setViewportView(jTextArea20);

        javax.swing.GroupLayout Panel20Layout = new javax.swing.GroupLayout(Panel20);
        Panel20.setLayout(Panel20Layout);
        Panel20Layout.setHorizontalGroup(
            Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel20Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel93)
                .addGap(18, 18, 18)
                .addComponent(OPA20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel94)
                .addGap(18, 18, 18)
                .addComponent(OPB20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OPC20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(OPD20, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QN20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ANB20)
                        .addComponent(ANA20))
                    .addGroup(Panel20Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(ANC20))
                    .addComponent(AND20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel20Layout.setVerticalGroup(
            Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel20Layout.createSequentialGroup()
                        .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN20)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel93)
                            .addComponent(jLabel96)
                            .addComponent(jLabel95)
                            .addComponent(jLabel94)
                            .addComponent(OPA20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel20Layout.createSequentialGroup()
                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel21.setBackground(new java.awt.Color(204, 204, 204));

        QN21.setText("21");

        TextArea21.setColumns(20);
        TextArea21.setRows(5);
        jScrollPane18.setViewportView(TextArea21);

        jLabel99.setText("A.");

        jLabel100.setText("B.");

        jLabel101.setText("C.");

        jLabel102.setText("D.");

        jLabel103.setBackground(new java.awt.Color(204, 255, 255));
        jLabel103.setText("LOCKED ANSWER");
        jLabel103.setOpaque(true);

        buttonGroup21.add(ANA21);
        ANA21.setText("A");

        buttonGroup21.add(ANB21);
        ANB21.setText("B");

        buttonGroup21.add(ANC21);
        ANC21.setText("C");

        buttonGroup21.add(AND21);
        AND21.setText("D");

        jTextArea21.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea21.setColumns(20);
        jTextArea21.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea21.setRows(5);
        jTextArea21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane47.setViewportView(jTextArea21);

        javax.swing.GroupLayout Panel21Layout = new javax.swing.GroupLayout(Panel21);
        Panel21.setLayout(Panel21Layout);
        Panel21Layout.setHorizontalGroup(
            Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel21Layout.createSequentialGroup()
                .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel21Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel99)
                        .addGap(18, 18, 18)
                        .addComponent(OPA21, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel100)
                        .addGap(18, 18, 18)
                        .addComponent(OPB21, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC21, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD21, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ANA21)
                            .addComponent(ANB21)
                            .addComponent(ANC21)
                            .addComponent(AND21))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane47)
                .addContainerGap())
        );
        Panel21Layout.setVerticalGroup(
            Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel21Layout.createSequentialGroup()
                        .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN21)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel21Layout.createSequentialGroup()
                                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANA21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANB21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANC21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AND21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel99)
                            .addComponent(jLabel102)
                            .addComponent(jLabel101)
                            .addComponent(jLabel100)
                            .addComponent(OPA21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel22.setBackground(new java.awt.Color(204, 204, 204));

        QN22.setText("22");

        TextArea22.setColumns(20);
        TextArea22.setRows(5);
        jScrollPane19.setViewportView(TextArea22);

        jLabel105.setText("A.");

        jLabel106.setText("B.");

        jLabel107.setText("C.");

        jLabel108.setText("D.");

        jLabel109.setBackground(new java.awt.Color(204, 255, 255));
        jLabel109.setText("LOCKED ANSWER");
        jLabel109.setOpaque(true);

        buttonGroup22.add(ANA22);
        ANA22.setText("A");

        buttonGroup22.add(ANB22);
        ANB22.setText("B");

        buttonGroup22.add(ANC22);
        ANC22.setText("C");

        buttonGroup22.add(AND22);
        AND22.setText("D");

        jTextArea22.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea22.setColumns(20);
        jTextArea22.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea22.setRows(5);
        jTextArea22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane48.setViewportView(jTextArea22);

        javax.swing.GroupLayout Panel22Layout = new javax.swing.GroupLayout(Panel22);
        Panel22.setLayout(Panel22Layout);
        Panel22Layout.setHorizontalGroup(
            Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel22Layout.createSequentialGroup()
                .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel22Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel105)
                        .addGap(18, 18, 18)
                        .addComponent(OPA22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel106)
                        .addGap(18, 18, 18)
                        .addComponent(OPB22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ANA22)
                            .addComponent(ANB22)
                            .addComponent(ANC22)
                            .addComponent(AND22))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane48)
                .addContainerGap())
        );
        Panel22Layout.setVerticalGroup(
            Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel22Layout.createSequentialGroup()
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANC22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND22))
                    .addGroup(Panel22Layout.createSequentialGroup()
                        .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN22)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel105)
                            .addComponent(jLabel108)
                            .addComponent(jLabel107)
                            .addComponent(jLabel106)
                            .addComponent(OPA22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel7.setBackground(new java.awt.Color(204, 204, 204));

        QN7.setText("7");

        TextArea7.setColumns(20);
        TextArea7.setRows(5);
        jScrollPane20.setViewportView(TextArea7);

        jLabel111.setText("A.");

        jLabel112.setText("B.");

        jLabel113.setText("C.");

        jLabel114.setText("D.");

        jLabel115.setBackground(new java.awt.Color(204, 255, 255));
        jLabel115.setText("LOCKED ANSWER");
        jLabel115.setOpaque(true);

        buttonGroup7.add(ANA7);
        ANA7.setText("A");

        buttonGroup7.add(ANB7);
        ANB7.setText("B");

        buttonGroup7.add(ANC7);
        ANC7.setText("C");

        buttonGroup7.add(AND7);
        AND7.setText("D");

        jTextArea6.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane10.setViewportView(jTextArea6);

        javax.swing.GroupLayout Panel7Layout = new javax.swing.GroupLayout(Panel7);
        Panel7.setLayout(Panel7Layout);
        Panel7Layout.setHorizontalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createSequentialGroup()
                .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel7Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel111)
                        .addGap(18, 18, 18)
                        .addComponent(OPA7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel112)
                        .addGap(18, 18, 18)
                        .addComponent(OPB7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Panel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ANA7)
                                .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ANC7)
                                    .addComponent(ANB7)))
                            .addComponent(AND7))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10)))
                .addContainerGap())
        );
        Panel7Layout.setVerticalGroup(
            Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel7Layout.createSequentialGroup()
                .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN7)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANC7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AND7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(jLabel114)
                    .addComponent(jLabel113)
                    .addComponent(jLabel112)
                    .addComponent(OPA7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPD7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPB7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPC7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        Panel6.setBackground(new java.awt.Color(204, 204, 204));

        QN6.setText("6");

        TextArea6.setColumns(20);
        TextArea6.setRows(5);
        jScrollPane21.setViewportView(TextArea6);

        jLabel117.setText("A.");

        jLabel118.setText("B.");

        jLabel119.setText("C.");

        jLabel120.setText("D.");

        jLabel121.setBackground(new java.awt.Color(204, 255, 255));
        jLabel121.setText("LOCKED ANSWER");
        jLabel121.setOpaque(true);

        buttonGroup6.add(ANA6);
        ANA6.setText("A");

        buttonGroup6.add(ANB6);
        ANB6.setText("B");

        buttonGroup6.add(ANC6);
        ANC6.setText("C");

        buttonGroup6.add(AND6);
        AND6.setText("D");

        jTextArea7.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea7.setRows(5);
        jTextArea7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane11.setViewportView(jTextArea7);

        javax.swing.GroupLayout Panel6Layout = new javax.swing.GroupLayout(Panel6);
        Panel6.setLayout(Panel6Layout);
        Panel6Layout.setHorizontalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel6Layout.createSequentialGroup()
                .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel6Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel117)
                        .addGap(18, 18, 18)
                        .addComponent(OPA6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel118)
                        .addGap(18, 18, 18)
                        .addComponent(OPB6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ANB6)
                            .addComponent(ANA6))
                        .addGroup(Panel6Layout.createSequentialGroup()
                            .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AND6)
                                .addComponent(ANC6))
                            .addGap(2, 2, 2)))
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel6Layout.setVerticalGroup(
            Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel6Layout.createSequentialGroup()
                .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ANA6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB6)
                        .addGap(3, 3, 3)
                        .addComponent(ANC6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND6))
                    .addGroup(Panel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(QN6)
                                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel117)
                            .addComponent(jLabel120)
                            .addComponent(jLabel119)
                            .addComponent(jLabel118)
                            .addComponent(OPA6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel10.setBackground(new java.awt.Color(204, 204, 204));

        QN10.setText("10");

        TextArea10.setColumns(20);
        TextArea10.setRows(5);
        jScrollPane22.setViewportView(TextArea10);

        jLabel123.setText("A.");

        jLabel124.setText("B.");

        jLabel125.setText("C.");

        jLabel126.setText("D.");

        jLabel127.setBackground(new java.awt.Color(204, 255, 255));
        jLabel127.setText("LOCKED ANSWER");
        jLabel127.setOpaque(true);

        buttonGroup10.add(ANA10);
        ANA10.setText("A");

        buttonGroup10.add(ANB10);
        ANB10.setText("B");

        buttonGroup10.add(ANC10);
        ANC10.setText("C");

        buttonGroup10.add(AND10);
        AND10.setText("D");

        jTextArea10.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea10.setColumns(20);
        jTextArea10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea10.setRows(5);
        jTextArea10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane36.setViewportView(jTextArea10);

        javax.swing.GroupLayout Panel10Layout = new javax.swing.GroupLayout(Panel10);
        Panel10.setLayout(Panel10Layout);
        Panel10Layout.setHorizontalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel10Layout.createSequentialGroup()
                .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel10Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel123)
                        .addGap(18, 18, 18)
                        .addComponent(OPA10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel124)
                        .addGap(18, 18, 18)
                        .addComponent(OPB10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ANA10)
                    .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANB10)
                    .addComponent(ANC10)
                    .addComponent(AND10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane36)
                .addContainerGap())
        );
        Panel10Layout.setVerticalGroup(
            Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel10Layout.createSequentialGroup()
                .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel10Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANC10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AND10))
                    .addGroup(Panel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN10)
                            .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(jLabel126)
                    .addComponent(jLabel125)
                    .addComponent(jLabel124)
                    .addComponent(OPA10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPD10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPB10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPC10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel8.setBackground(new java.awt.Color(204, 204, 204));

        QN8.setText("8");

        TextArea8.setColumns(20);
        TextArea8.setRows(5);
        jScrollPane23.setViewportView(TextArea8);

        jLabel129.setText("A.");

        jLabel130.setText("B.");

        jLabel131.setText("C.");

        jLabel132.setText("D.");

        jLabel133.setBackground(new java.awt.Color(204, 255, 255));
        jLabel133.setText("LOCKED ANSWER");
        jLabel133.setOpaque(true);

        buttonGroup8.add(ANA8);
        ANA8.setText("A");

        ANB8.setText("B");

        buttonGroup8.add(ANC8);
        ANC8.setText("C");
        ANC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANC8ActionPerformed(evt);
            }
        });

        buttonGroup8.add(AND8);
        AND8.setText("D");

        jTextArea8.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea8.setRows(5);
        jTextArea8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane12.setViewportView(jTextArea8);

        javax.swing.GroupLayout Panel8Layout = new javax.swing.GroupLayout(Panel8);
        Panel8.setLayout(Panel8Layout);
        Panel8Layout.setHorizontalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel129)
                .addGap(18, 18, 18)
                .addComponent(OPA8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel130)
                .addGap(18, 18, 18)
                .addComponent(OPB8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OPC8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(OPD8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QN8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANA8)
                    .addComponent(ANB8)
                    .addComponent(ANC8)
                    .addComponent(AND8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12)
                .addGap(15, 15, 15))
        );
        Panel8Layout.setVerticalGroup(
            Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QN8)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel8Layout.createSequentialGroup()
                            .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ANA8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ANB8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ANC8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AND8))
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(jLabel132)
                    .addComponent(jLabel131)
                    .addComponent(jLabel130)
                    .addComponent(OPA8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPD8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPB8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPC8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        Panel18.setBackground(new java.awt.Color(204, 204, 204));

        QN18.setText("18");

        TextArea18.setColumns(20);
        TextArea18.setRows(5);
        jScrollPane24.setViewportView(TextArea18);

        jLabel135.setText("A.");

        jLabel136.setText("B.");

        jLabel137.setText("C.");

        jLabel138.setText("D.");

        jLabel139.setBackground(new java.awt.Color(204, 255, 255));
        jLabel139.setText("LOCKED ANSWER");
        jLabel139.setOpaque(true);

        buttonGroup18.add(ANA18);
        ANA18.setText("A");

        buttonGroup18.add(ANB18);
        ANB18.setText("B");

        buttonGroup18.add(ANC18);
        ANC18.setText("C");

        buttonGroup18.add(AND18);
        AND18.setText("D");

        jTextArea18.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea18.setColumns(20);
        jTextArea18.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea18.setRows(5);
        jTextArea18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane44.setViewportView(jTextArea18);

        javax.swing.GroupLayout Panel18Layout = new javax.swing.GroupLayout(Panel18);
        Panel18.setLayout(Panel18Layout);
        Panel18Layout.setHorizontalGroup(
            Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel18Layout.createSequentialGroup()
                .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel18Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel135)
                        .addGap(18, 18, 18)
                        .addComponent(OPA18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel136)
                        .addGap(18, 18, 18)
                        .addComponent(OPB18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD18, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AND18)
                        .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ANB18)
                                .addComponent(ANA18))
                            .addGroup(Panel18Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(ANC18)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel18Layout.setVerticalGroup(
            Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel18Layout.createSequentialGroup()
                .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel18Layout.createSequentialGroup()
                        .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel18Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QN18)
                                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel135)
                                    .addComponent(jLabel138)
                                    .addComponent(jLabel137)
                                    .addComponent(jLabel136)
                                    .addComponent(OPA18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPD18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPB18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPC18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel18Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANA18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANB18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANC18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AND18)))
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel18Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Panel9.setBackground(new java.awt.Color(204, 204, 204));

        QN9.setText("9");

        TextArea9.setColumns(20);
        TextArea9.setRows(5);
        jScrollPane25.setViewportView(TextArea9);

        jLabel141.setText("A.");

        jLabel142.setText("B.");

        jLabel143.setText("C.");

        jLabel144.setText("D.");

        jLabel145.setBackground(new java.awt.Color(204, 255, 255));
        jLabel145.setText("LOCKED ANSWER");
        jLabel145.setOpaque(true);

        buttonGroup9.add(ANA9);
        ANA9.setText("A");

        buttonGroup9.add(ANB9);
        ANB9.setText("B");

        buttonGroup9.add(ANC9);
        ANC9.setText("C");

        buttonGroup9.add(AND9);
        AND9.setText("D");

        jTextArea9.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea9.setRows(5);
        jTextArea9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane13.setViewportView(jTextArea9);

        javax.swing.GroupLayout Panel9Layout = new javax.swing.GroupLayout(Panel9);
        Panel9.setLayout(Panel9Layout);
        Panel9Layout.setHorizontalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel9Layout.createSequentialGroup()
                .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel9Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel141)
                        .addGap(18, 18, 18)
                        .addComponent(OPA9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel142)
                        .addGap(18, 18, 18)
                        .addComponent(OPB9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ANB9)
                                .addComponent(ANA9))
                            .addComponent(ANC9)
                            .addComponent(AND9))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel9Layout.setVerticalGroup(
            Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel9Layout.createSequentialGroup()
                        .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN9)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel141)
                            .addComponent(jLabel144)
                            .addComponent(jLabel143)
                            .addComponent(jLabel142)
                            .addComponent(OPA9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Panel9Layout.createSequentialGroup()
                            .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ANA9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ANB9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ANC9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AND9))
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        Panel13.setBackground(new java.awt.Color(204, 204, 204));

        QN13.setText("13");

        TextArea13.setColumns(20);
        TextArea13.setRows(5);
        jScrollPane26.setViewportView(TextArea13);

        jLabel147.setText("A.");

        jLabel148.setText("B.");

        jLabel149.setText("C.");

        jLabel150.setText("D.");

        jLabel151.setBackground(new java.awt.Color(204, 255, 255));
        jLabel151.setText("LOCKED ANSWER");
        jLabel151.setOpaque(true);

        buttonGroup13.add(ANA13);
        ANA13.setText("A");

        buttonGroup13.add(ANB13);
        ANB13.setText("B");

        buttonGroup13.add(ANC13);
        ANC13.setText("C");

        buttonGroup13.add(AND13);
        AND13.setText("D");

        jTextArea13.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea13.setColumns(20);
        jTextArea13.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea13.setRows(5);
        jTextArea13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane39.setViewportView(jTextArea13);

        javax.swing.GroupLayout Panel13Layout = new javax.swing.GroupLayout(Panel13);
        Panel13.setLayout(Panel13Layout);
        Panel13Layout.setHorizontalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel13Layout.createSequentialGroup()
                .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel13Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel147)
                        .addGap(18, 18, 18)
                        .addComponent(OPA13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel148)
                        .addGap(18, 18, 18)
                        .addComponent(OPB13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AND13)
                                .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ANB13)
                                        .addComponent(ANA13))
                                    .addGroup(Panel13Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(ANC13)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane39)
                .addContainerGap())
        );
        Panel13Layout.setVerticalGroup(
            Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel13Layout.createSequentialGroup()
                .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN13)
                            .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel147)
                            .addComponent(jLabel150)
                            .addComponent(jLabel149)
                            .addComponent(jLabel148)
                            .addComponent(OPA13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel13Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANC13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AND13))
                    .addGroup(Panel13Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel11.setBackground(new java.awt.Color(204, 204, 204));

        QN11.setText("11");

        TextArea11.setColumns(20);
        TextArea11.setRows(5);
        jScrollPane27.setViewportView(TextArea11);

        jLabel153.setText("A.");

        jLabel154.setText("B.");

        jLabel155.setText("C.");

        jLabel156.setText("D.");

        jLabel157.setBackground(new java.awt.Color(204, 255, 255));
        jLabel157.setText("LOCKED ANSWER");
        jLabel157.setOpaque(true);

        buttonGroup11.add(ANA11);
        ANA11.setText("A");

        buttonGroup11.add(ANB11);
        ANB11.setText("B");

        buttonGroup11.add(ANC11);
        ANC11.setText("C");

        buttonGroup11.add(AND11);
        AND11.setText("D");

        jTextArea11.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea11.setColumns(20);
        jTextArea11.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea11.setRows(5);
        jTextArea11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane37.setViewportView(jTextArea11);

        javax.swing.GroupLayout Panel11Layout = new javax.swing.GroupLayout(Panel11);
        Panel11.setLayout(Panel11Layout);
        Panel11Layout.setHorizontalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel153)
                        .addGap(18, 18, 18)
                        .addComponent(OPA11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel154)
                        .addGap(18, 18, 18)
                        .addComponent(OPB11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD11, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANB11)
                    .addComponent(ANA11)
                    .addComponent(ANC11)
                    .addComponent(AND11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel11Layout.setVerticalGroup(
            Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel11Layout.createSequentialGroup()
                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel11Layout.createSequentialGroup()
                                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QN11)
                                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel153)
                                    .addComponent(jLabel156)
                                    .addComponent(jLabel155)
                                    .addComponent(jLabel154)
                                    .addComponent(OPA11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPD11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPB11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPC11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel11Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANC11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AND11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel15.setBackground(new java.awt.Color(204, 204, 204));

        QN15.setText("15");

        TextArea15.setColumns(20);
        TextArea15.setRows(5);
        jScrollPane28.setViewportView(TextArea15);

        jLabel159.setText("A.");

        jLabel160.setText("B.");

        jLabel161.setText("C.");

        jLabel162.setText("D.");

        jLabel163.setBackground(new java.awt.Color(204, 255, 255));
        jLabel163.setText("LOCKED ANSWER");
        jLabel163.setOpaque(true);

        buttonGroup15.add(ANA15);
        ANA15.setText("A");

        buttonGroup15.add(ANB15);
        ANB15.setText("B");

        buttonGroup15.add(ANC15);
        ANC15.setText("C");

        buttonGroup15.add(AND15);
        AND15.setText("D");

        jTextArea15.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea15.setColumns(20);
        jTextArea15.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea15.setRows(5);
        jTextArea15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane41.setViewportView(jTextArea15);

        javax.swing.GroupLayout Panel15Layout = new javax.swing.GroupLayout(Panel15);
        Panel15.setLayout(Panel15Layout);
        Panel15Layout.setHorizontalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel15Layout.createSequentialGroup()
                .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel15Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel159)
                        .addGap(18, 18, 18)
                        .addComponent(OPA15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel160)
                        .addGap(18, 18, 18)
                        .addComponent(OPB15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD15, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ANA15)
                            .addComponent(ANB15)
                            .addComponent(ANC15)
                            .addComponent(AND15))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane41)
                .addContainerGap())
        );
        Panel15Layout.setVerticalGroup(
            Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel15Layout.createSequentialGroup()
                .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel15Layout.createSequentialGroup()
                                .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QN15)
                                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel159)
                                    .addComponent(jLabel162)
                                    .addComponent(jLabel161)
                                    .addComponent(jLabel160)
                                    .addComponent(OPA15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPD15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPB15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPC15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel15Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANC15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel14.setBackground(new java.awt.Color(204, 204, 204));

        QN14.setText("14");

        TextArea14.setColumns(20);
        TextArea14.setRows(5);
        jScrollPane30.setViewportView(TextArea14);

        jLabel171.setText("A.");

        jLabel172.setText("B.");

        jLabel173.setText("C.");

        jLabel174.setText("D.");

        jLabel175.setBackground(new java.awt.Color(204, 255, 255));
        jLabel175.setText("LOCKED ANSWER");
        jLabel175.setOpaque(true);

        buttonGroup14.add(ANA14);
        ANA14.setText("A");

        buttonGroup14.add(ANB14);
        ANB14.setText("B");

        buttonGroup14.add(ANC14);
        ANC14.setText("C");

        buttonGroup14.add(AND14);
        AND14.setText("D");

        jTextArea14.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea14.setColumns(20);
        jTextArea14.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea14.setRows(5);
        jTextArea14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane40.setViewportView(jTextArea14);

        javax.swing.GroupLayout Panel14Layout = new javax.swing.GroupLayout(Panel14);
        Panel14.setLayout(Panel14Layout);
        Panel14Layout.setHorizontalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel14Layout.createSequentialGroup()
                .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel14Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel171)
                        .addGap(18, 18, 18)
                        .addComponent(OPA14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel172)
                        .addGap(18, 18, 18)
                        .addComponent(OPB14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ANA14)
                            .addComponent(ANB14)
                            .addComponent(ANC14)
                            .addComponent(AND14)
                            .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane40)
                .addContainerGap())
        );
        Panel14Layout.setVerticalGroup(
            Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel14Layout.createSequentialGroup()
                .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel14Layout.createSequentialGroup()
                        .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QN14)
                                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel14Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANA14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANB14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANC14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AND14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel171)
                            .addComponent(jLabel174)
                            .addComponent(jLabel173)
                            .addComponent(jLabel172)
                            .addComponent(OPA14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel14Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel16.setBackground(new java.awt.Color(204, 204, 204));

        QN16.setText("16");

        TextArea16.setColumns(20);
        TextArea16.setRows(5);
        jScrollPane31.setViewportView(TextArea16);

        jLabel177.setText("A.");

        jLabel178.setText("B.");

        jLabel179.setText("C.");

        jLabel180.setText("D.");

        jLabel181.setBackground(new java.awt.Color(204, 255, 255));
        jLabel181.setText("LOCKED ANSWER");
        jLabel181.setOpaque(true);

        buttonGroup16.add(ANA16);
        ANA16.setText("A");

        buttonGroup16.add(ANB16);
        ANB16.setText("B");

        buttonGroup16.add(ANC16);
        ANC16.setText("C");

        buttonGroup16.add(AND16);
        AND16.setText("D");

        jTextArea16.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea16.setColumns(20);
        jTextArea16.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea16.setRows(5);
        jTextArea16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane42.setViewportView(jTextArea16);

        javax.swing.GroupLayout Panel16Layout = new javax.swing.GroupLayout(Panel16);
        Panel16.setLayout(Panel16Layout);
        Panel16Layout.setHorizontalGroup(
            Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel16Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel177)
                .addGap(18, 18, 18)
                .addComponent(OPA16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel178)
                .addGap(18, 18, 18)
                .addComponent(OPB16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OPC16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(OPD16, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QN16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANA16)
                    .addComponent(ANB16)
                    .addComponent(ANC16)
                    .addComponent(AND16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel16Layout.setVerticalGroup(
            Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel16Layout.createSequentialGroup()
                        .addGroup(Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN16)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel16Layout.createSequentialGroup()
                                .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANA16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANB16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANC16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AND16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel177)
                            .addComponent(jLabel180)
                            .addComponent(jLabel179)
                            .addComponent(jLabel178)
                            .addComponent(OPA16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel17.setBackground(new java.awt.Color(204, 204, 204));

        QN17.setText("17");

        TextArea17.setColumns(20);
        TextArea17.setRows(5);
        jScrollPane32.setViewportView(TextArea17);

        jLabel183.setText("A.");

        jLabel184.setText("B.");

        jLabel185.setText("C.");

        jLabel186.setText("D.");

        jLabel187.setBackground(new java.awt.Color(204, 255, 255));
        jLabel187.setText("LOCKED ANSWER");
        jLabel187.setOpaque(true);

        buttonGroup17.add(ANA17);
        ANA17.setText("A");

        buttonGroup17.add(ANB17);
        ANB17.setText("B");

        buttonGroup17.add(ANC17);
        ANC17.setText("C");

        buttonGroup17.add(AND17);
        AND17.setText("D");

        jTextArea17.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea17.setColumns(20);
        jTextArea17.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea17.setRows(5);
        jTextArea17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane43.setViewportView(jTextArea17);

        javax.swing.GroupLayout Panel17Layout = new javax.swing.GroupLayout(Panel17);
        Panel17.setLayout(Panel17Layout);
        Panel17Layout.setHorizontalGroup(
            Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel17Layout.createSequentialGroup()
                .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN17, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel17Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel183)
                        .addGap(18, 18, 18)
                        .addComponent(OPA17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel184)
                        .addGap(18, 18, 18)
                        .addComponent(OPB17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel185, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD17, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ANA17)
                    .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ANB17)
                    .addComponent(ANC17)
                    .addComponent(AND17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane43)
                .addContainerGap())
        );
        Panel17Layout.setVerticalGroup(
            Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel17Layout.createSequentialGroup()
                .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel17Layout.createSequentialGroup()
                                .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QN17)
                                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel183)
                                    .addComponent(jLabel186)
                                    .addComponent(jLabel185)
                                    .addComponent(jLabel184)
                                    .addComponent(OPA17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPD17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPB17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPC17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel17Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ANB17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANC17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AND17)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Panel12.setBackground(new java.awt.Color(204, 204, 204));

        QN12.setText("12");

        TextArea12.setColumns(20);
        TextArea12.setRows(5);
        jScrollPane33.setViewportView(TextArea12);

        jLabel189.setText("A.");

        jLabel190.setText("B.");

        jLabel191.setText("C.");

        jLabel192.setText("D.");

        jLabel193.setBackground(new java.awt.Color(204, 255, 255));
        jLabel193.setText("LOCKED ANSWER");
        jLabel193.setOpaque(true);

        buttonGroup12.add(ANA12);
        ANA12.setText("A");

        buttonGroup12.add(ANB12);
        ANB12.setText("B");

        buttonGroup12.add(ANC12);
        ANC12.setText("C");

        buttonGroup12.add(AND12);
        AND12.setText("D");

        jTextArea12.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea12.setColumns(20);
        jTextArea12.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea12.setRows(5);
        jTextArea12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane38.setViewportView(jTextArea12);

        javax.swing.GroupLayout Panel12Layout = new javax.swing.GroupLayout(Panel12);
        Panel12.setLayout(Panel12Layout);
        Panel12Layout.setHorizontalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel12Layout.createSequentialGroup()
                .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel12Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel189)
                        .addGap(18, 18, 18)
                        .addComponent(OPA12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel190)
                        .addGap(18, 18, 18)
                        .addComponent(OPB12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel191, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel12Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel12Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ANB12)
                                    .addComponent(ANA12)
                                    .addComponent(ANC12)
                                    .addComponent(AND12))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane38)
                .addContainerGap())
        );
        Panel12Layout.setVerticalGroup(
            Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel12Layout.createSequentialGroup()
                .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel12Layout.createSequentialGroup()
                        .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(QN12)
                                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel189)
                                    .addComponent(jLabel192)
                                    .addComponent(jLabel191)
                                    .addComponent(jLabel190)
                                    .addComponent(OPA12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPD12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPB12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OPC12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Panel12Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANA12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANB12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANC12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AND12)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        Panel25.setBackground(new java.awt.Color(204, 204, 204));

        QN25.setText("25");

        TextArea25.setColumns(20);
        TextArea25.setRows(5);
        jScrollPane29.setViewportView(TextArea25);

        jLabel165.setText("A.");

        jLabel166.setText("B.");

        jLabel167.setText("C.");

        jLabel168.setText("D.");

        jLabel169.setBackground(new java.awt.Color(204, 255, 255));
        jLabel169.setText("LOCKED ANSWER");
        jLabel169.setOpaque(true);

        buttonGroup25.add(ANA25);
        ANA25.setText("A");

        buttonGroup25.add(ANB25);
        ANB25.setText("B");

        buttonGroup25.add(ANC25);
        ANC25.setText("C");

        buttonGroup25.add(AND25);
        AND25.setText("D");

        jTextArea25.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea25.setColumns(20);
        jTextArea25.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea25.setRows(5);
        jTextArea25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane50.setViewportView(jTextArea25);

        javax.swing.GroupLayout Panel25Layout = new javax.swing.GroupLayout(Panel25);
        Panel25.setLayout(Panel25Layout);
        Panel25Layout.setHorizontalGroup(
            Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel25Layout.createSequentialGroup()
                .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel25Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel165)
                        .addGap(18, 18, 18)
                        .addComponent(OPA25, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel166)
                        .addGap(18, 18, 18)
                        .addComponent(OPB25, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC25, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD25, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN25, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ANA25)
                            .addComponent(ANB25)
                            .addComponent(ANC25)
                            .addComponent(AND25))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane50)
                .addContainerGap())
        );
        Panel25Layout.setVerticalGroup(
            Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel25Layout.createSequentialGroup()
                .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN25)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel165)
                            .addComponent(jLabel168)
                            .addComponent(jLabel167)
                            .addComponent(jLabel166)
                            .addComponent(OPA25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel25Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(Panel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel25Layout.createSequentialGroup()
                                .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANA25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ANB25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANC25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AND25)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Panel23.setBackground(new java.awt.Color(204, 204, 204));

        QN23.setText("23");

        TextArea23.setColumns(20);
        TextArea23.setRows(5);
        jScrollPane34.setViewportView(TextArea23);

        jLabel195.setText("A.");

        jLabel196.setText("B.");

        jLabel197.setText("C.");

        jLabel198.setText("D.");

        jLabel199.setBackground(new java.awt.Color(204, 255, 255));
        jLabel199.setText("LOCKED ANSWER");
        jLabel199.setOpaque(true);

        buttonGroup23.add(ANA23);
        ANA23.setText("A");

        buttonGroup23.add(ANB23);
        ANB23.setText("B");

        buttonGroup23.add(ANC23);
        ANC23.setText("C");

        buttonGroup23.add(AND23);
        AND23.setText("D");

        jTextArea23.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea23.setColumns(20);
        jTextArea23.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea23.setRows(5);
        jTextArea23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane49.setViewportView(jTextArea23);

        javax.swing.GroupLayout Panel23Layout = new javax.swing.GroupLayout(Panel23);
        Panel23.setLayout(Panel23Layout);
        Panel23Layout.setHorizontalGroup(
            Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel23Layout.createSequentialGroup()
                .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel23Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel195)
                        .addGap(18, 18, 18)
                        .addComponent(OPA23, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel196)
                        .addGap(18, 18, 18)
                        .addComponent(OPB23, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC23, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD23, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN23, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ANA23)
                            .addComponent(ANB23)
                            .addComponent(ANC23)
                            .addComponent(AND23))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane49)
                .addContainerGap())
        );
        Panel23Layout.setVerticalGroup(
            Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel23Layout.createSequentialGroup()
                .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN23)
                            .addGroup(Panel23Layout.createSequentialGroup()
                                .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANA23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANB23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ANC23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AND23))
                            .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel195)
                            .addComponent(jLabel198)
                            .addComponent(jLabel197)
                            .addComponent(jLabel196)
                            .addComponent(OPA23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPD23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPB23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OPC23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Panel24.setBackground(new java.awt.Color(204, 204, 204));

        QN24.setText("24");

        TextArea24.setColumns(20);
        TextArea24.setRows(5);
        jScrollPane35.setViewportView(TextArea24);

        jLabel201.setText("A.");

        jLabel202.setText("B.");

        jLabel203.setText("C.");

        jLabel204.setText("D.");

        jLabel205.setBackground(new java.awt.Color(204, 255, 255));
        jLabel205.setText("LOCKED ANSWER");
        jLabel205.setOpaque(true);

        buttonGroup24.add(ANA24);
        ANA24.setText("A");

        buttonGroup24.add(ANB24);
        ANB24.setText("B");

        buttonGroup24.add(ANC24);
        ANC24.setText("C");

        buttonGroup24.add(AND24);
        AND24.setText("D");

        jTextArea24.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea24.setColumns(20);
        jTextArea24.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextArea24.setRows(5);
        jTextArea24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Explaination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jScrollPane51.setViewportView(jTextArea24);

        javax.swing.GroupLayout Panel24Layout = new javax.swing.GroupLayout(Panel24);
        Panel24.setLayout(Panel24Layout);
        Panel24Layout.setHorizontalGroup(
            Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel24Layout.createSequentialGroup()
                .addGroup(Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel24Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel201)
                        .addGap(18, 18, 18)
                        .addComponent(OPA24, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel202)
                        .addGap(18, 18, 18)
                        .addComponent(OPB24, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OPC24, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(OPD24, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Panel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(QN24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ANA24)
                            .addComponent(ANB24)
                            .addComponent(ANC24)
                            .addComponent(AND24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane51)))
                .addContainerGap())
        );
        Panel24Layout.setVerticalGroup(
            Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel24Layout.createSequentialGroup()
                .addGroup(Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QN24)
                            .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel24Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANA24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANB24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ANC24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AND24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel201)
                    .addComponent(jLabel204)
                    .addComponent(jLabel203)
                    .addComponent(jLabel202)
                    .addComponent(OPA24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPD24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPB24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OPC24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText(">> NEXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("<< PREVIOUS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 314, 314)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Panel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1671, 1671, 1671))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Panel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Panel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(2457, 2457, 2457))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Company ID");

        Comp_ID.setEditable(false);
        Comp_ID.setBackground(new java.awt.Color(204, 255, 255));
        Comp_ID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Comp_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Comp_IDActionPerformed(evt);
            }
        });

        jLabel3.setText("Test ID");

        Test_ID.setEditable(false);
        Test_ID.setBackground(new java.awt.Color(204, 255, 255));
        Test_ID.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel4.setText("Test Name");

        Test_Name.setEditable(false);
        Test_Name.setBackground(new java.awt.Color(204, 255, 255));
        Test_Name.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel7.setText("Questions");

        NO1.setEditable(false);
        NO1.setBackground(new java.awt.Color(204, 255, 255));
        NO1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        NO1.setText("1");
        NO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO1ActionPerformed(evt);
            }
        });

        jLabel5.setText("TO");

        NO2.setEditable(false);
        NO2.setBackground(new java.awt.Color(204, 255, 255));
        NO2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        NO2.setText("25");
        NO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NO2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Page NO  :");

        PGNO.setEditable(false);
        PGNO.setBackground(new java.awt.Color(204, 255, 255));
        PGNO.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        PGNO.setText("1");

        jLabel8.setText("Total Page:");

        TOTPG.setEditable(false);
        TOTPG.setBackground(new java.awt.Color(204, 255, 255));
        TOTPG.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        TQ.setEditable(false);
        TQ.setBackground(new java.awt.Color(204, 255, 255));
        TQ.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel14.setText("Total Questions :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TQ, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Comp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Test_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(PGNO, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(TOTPG, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Test_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NO1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(NO2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(384, 384, 384))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Test_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Test_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NO1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NO2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(PGNO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TOTPG, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TQ, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ANC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANC8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANC8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int p = Integer.parseInt(TOTPG.getText());
      int PG = Integer.parseInt(PGNO.getText());
      
      if(p == PG)
      {
          JOptionPane.showMessageDialog(null,"End of page reached");
          
      } 
      else
      {                          int m =Integer.parseInt(NO1.getText());
                                  m = m + 25 ;
                                  int n= m -1 ;
                                 
                                  String TestNam = Test_Name.getText();
                                  String comp = Comp_ID.getText();
                                  String usern = Test_ID.getText();
                                  int PGN  = Integer.parseInt(PGNO.getText());
                                  PGN = PGN + 1;
                                  new APTTEST(usern,comp,TestNam,PGN,p,m,n).setVisible(true); 
                                  dispose();
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NO2ActionPerformed

    private void NO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NO1ActionPerformed

    private void Comp_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Comp_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Comp_IDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:4
        int p = Integer.parseInt(TOTPG.getText());
      int PG = Integer.parseInt(PGNO.getText());
      
      if(PG == 1)
      {
          JOptionPane.showMessageDialog(null,"End of page reached");
          
      } 
      else
      {                          int m =Integer.parseInt(NO1.getText());
                                  m = m - 25 ;
                                  int n= 0 ;
                                 
                                  String TestNam = Test_Name.getText();
                                  String comp = Comp_ID.getText();
                                  String usern = Test_ID.getText();
                                  int PGN  = Integer.parseInt(PGNO.getText());
                                  PGN = PGN - 1;
                                  new APTTEST(usern,comp,TestNam,PGN,p,m,n).setVisible(true);  
                                  dispose();
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ANB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANB1ActionPerformed

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
            java.util.logging.Logger.getLogger(APTTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(APTTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(APTTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(APTTEST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new APTTEST().setVisible(true);
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
    private javax.swing.JTextField NO1;
    private javax.swing.JTextField NO2;
    private javax.swing.JTextField OPA1;
    private javax.swing.JTextField OPA10;
    private javax.swing.JTextField OPA11;
    private javax.swing.JTextField OPA12;
    private javax.swing.JTextField OPA13;
    private javax.swing.JTextField OPA14;
    private javax.swing.JTextField OPA15;
    private javax.swing.JTextField OPA16;
    private javax.swing.JTextField OPA17;
    private javax.swing.JTextField OPA18;
    private javax.swing.JTextField OPA19;
    private javax.swing.JTextField OPA2;
    private javax.swing.JTextField OPA20;
    private javax.swing.JTextField OPA21;
    private javax.swing.JTextField OPA22;
    private javax.swing.JTextField OPA23;
    private javax.swing.JTextField OPA24;
    private javax.swing.JTextField OPA25;
    private javax.swing.JTextField OPA3;
    private javax.swing.JTextField OPA4;
    private javax.swing.JTextField OPA5;
    private javax.swing.JTextField OPA6;
    private javax.swing.JTextField OPA7;
    private javax.swing.JTextField OPA8;
    private javax.swing.JTextField OPA9;
    private javax.swing.JTextField OPB1;
    private javax.swing.JTextField OPB10;
    private javax.swing.JTextField OPB11;
    private javax.swing.JTextField OPB12;
    private javax.swing.JTextField OPB13;
    private javax.swing.JTextField OPB14;
    private javax.swing.JTextField OPB15;
    private javax.swing.JTextField OPB16;
    private javax.swing.JTextField OPB17;
    private javax.swing.JTextField OPB18;
    private javax.swing.JTextField OPB19;
    private javax.swing.JTextField OPB2;
    private javax.swing.JTextField OPB20;
    private javax.swing.JTextField OPB21;
    private javax.swing.JTextField OPB22;
    private javax.swing.JTextField OPB23;
    private javax.swing.JTextField OPB24;
    private javax.swing.JTextField OPB25;
    private javax.swing.JTextField OPB3;
    private javax.swing.JTextField OPB4;
    private javax.swing.JTextField OPB5;
    private javax.swing.JTextField OPB6;
    private javax.swing.JTextField OPB7;
    private javax.swing.JTextField OPB8;
    private javax.swing.JTextField OPB9;
    private javax.swing.JTextField OPC1;
    private javax.swing.JTextField OPC10;
    private javax.swing.JTextField OPC11;
    private javax.swing.JTextField OPC12;
    private javax.swing.JTextField OPC13;
    private javax.swing.JTextField OPC14;
    private javax.swing.JTextField OPC15;
    private javax.swing.JTextField OPC16;
    private javax.swing.JTextField OPC17;
    private javax.swing.JTextField OPC18;
    private javax.swing.JTextField OPC19;
    private javax.swing.JTextField OPC2;
    private javax.swing.JTextField OPC20;
    private javax.swing.JTextField OPC21;
    private javax.swing.JTextField OPC22;
    private javax.swing.JTextField OPC23;
    private javax.swing.JTextField OPC24;
    private javax.swing.JTextField OPC25;
    private javax.swing.JTextField OPC3;
    private javax.swing.JTextField OPC4;
    private javax.swing.JTextField OPC5;
    private javax.swing.JTextField OPC6;
    private javax.swing.JTextField OPC7;
    private javax.swing.JTextField OPC8;
    private javax.swing.JTextField OPC9;
    private javax.swing.JTextField OPD1;
    private javax.swing.JTextField OPD10;
    private javax.swing.JTextField OPD11;
    private javax.swing.JTextField OPD12;
    private javax.swing.JTextField OPD13;
    private javax.swing.JTextField OPD14;
    private javax.swing.JTextField OPD15;
    private javax.swing.JTextField OPD16;
    private javax.swing.JTextField OPD17;
    private javax.swing.JTextField OPD18;
    private javax.swing.JTextField OPD19;
    private javax.swing.JTextField OPD2;
    private javax.swing.JTextField OPD20;
    private javax.swing.JTextField OPD21;
    private javax.swing.JTextField OPD22;
    private javax.swing.JTextField OPD23;
    private javax.swing.JTextField OPD24;
    private javax.swing.JTextField OPD25;
    private javax.swing.JTextField OPD3;
    private javax.swing.JTextField OPD4;
    private javax.swing.JTextField OPD5;
    private javax.swing.JTextField OPD6;
    private javax.swing.JTextField OPD7;
    private javax.swing.JTextField OPD8;
    private javax.swing.JTextField OPD9;
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
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
    // End of variables declaration//GEN-END:variables
}
