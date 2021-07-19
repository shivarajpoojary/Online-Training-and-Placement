/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public final class SELSTUD extends javax.swing.JFrame {

    /**
     * Creates new form SELSTUD
     */
    public SELSTUD() {
        initComponents();

    }
     public ArrayList<User> userList()
    {
        ArrayList<User> usersList = new ArrayList<>();
        
         try
        {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
              PreparedStatement pst1,pst2;
              String query1,query2;
              query1="SELECT `Crsslcperc`,`Crpucperc`,`Crdegagg` ,`Crdegpass`,`Crbacklogs` FROM `criteria` WHERE comp_name = ? AND YEAR = ? AND comp_ID = ? LIMIT 0 , 30";
              pst1 = con.prepareStatement(query1);
             if(jList1.isSelectedIndex(7))
             {
                       pst1.setString(1,jTextField1.getText());
                       
             }
            else
             {   
                      pst1.setString(1,jList1.getSelectedValue());
             }
            pst1.setString(2,jTextField2.getText());
            pst1.setString(3,comp_ID.getText());
            ResultSet rs1=pst1.executeQuery();
            if(rs1.next())
            {  
             
               int Crsslcperc = rs1.getInt(1);
               int Crpucperc = rs1.getInt(2);
               int Crdegagg = rs1.getInt(3);
               int Crdegpass = rs1.getInt(4);
               int Crbacklogs = rs1.getInt(5);
              
               String query="SELECT * FROM `stdreg` where sslcperc >= ? AND pucperc >= ? AND degagg >= ? AND degpass = ? AND backlogs <= ? ";
               PreparedStatement pst;
               pst = con.prepareStatement(query);
               pst.setInt(1,Crsslcperc);
               pst.setInt(2,Crpucperc);
               pst.setInt(3,Crdegagg);
               pst.setInt(4,Crdegpass);
               pst.setInt(5,Crbacklogs);
               ResultSet rs=pst.executeQuery();
                    User user;
                    while(rs.next())
                    {
                        user = new User(rs.getString("sname"),rs.getString("password"),rs.getInt("stdid"),rs.getString("mname"),rs.getString("fname"),rs.getString("gender"),rs.getString("dob"),rs.getString("email"),rs.getString("clname"),rs.getInt("degagg"),rs.getInt("degpass"),rs.getInt("sslcperc"),rs.getInt("sslcpass"),rs.getInt("pucperc"),rs.getInt("pucpass"),rs.getInt("backlogs"));
                        usersList.add(user);
                    }
            }
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return usersList;
    }
    
    public void show_user()
    {
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable_Display_User2.getModel();
        Object[] row = new Object[0x10];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getsname();
            
             row[1]=list.get(i).getpassword();
             row[2]=list.get(i).getstdid();
             row[3]=list.get(i).getmname();
             row[4]=list.get(i).getfname();
             row[5]=list.get(i).getgender();
             row[6]=list.get(i).getdob();
             row[7]=list.get(i).getemail();
             row[8]=list.get(i).getclname();
             row[9]=list.get(i).getdegagg();
             row[10]=list.get(i).getdegpass();
             row[11]=list.get(i).getsslcperc();
             row[12]=list.get(i).getsslcpass();
             row[13]=list.get(i).getpucperc();
             row[14]=list.get(i).getpucpass();
             row[15]=list.get(i).getbacklogs();
            model.addRow(row);
        }
    }
    public void clear_user()
    {
        DefaultTableModel model = (DefaultTableModel) jTable_Display_User2.getModel();
        while(model.getRowCount()>0)
        {
            for(int i=0;i<model.getRowCount();i++)
            {
                model.removeRow(i);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Display_User2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comp_ID = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 255));
        jLabel1.setText("SELECTED STUDENT INFORMATION");

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setForeground(new java.awt.Color(51, 51, 255));
        jButton3.setText("<< BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("SEND MAIL");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable_Display_User1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "sname", "pssword", "stdid", "mname", "fname", "gender", "dob", "email", "clname", "degagg", "degpass", "sslcperc", "sslcpass", "pucperc", "pucpass", "backlogs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User1);
        if (jTable_Display_User1.getColumnModel().getColumnCount() > 0) {
            jTable_Display_User1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable_Display_User1.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable_Display_User1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable_Display_User1.getColumnModel().getColumn(7).setPreferredWidth(200);
            jTable_Display_User1.getColumnModel().getColumn(8).setPreferredWidth(200);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(671, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(552, 552, 552))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable_Display_User2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "sname", "password", "stdid", "mname", "fname", "gender", "dob", "email", "clname", "degagg", "degpass", "sslcperc", "sslcpass", "pucperc", "pucpass", "backlogs"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_Display_User2);
        if (jTable_Display_User2.getColumnModel().getColumnCount() > 0) {
            jTable_Display_User2.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable_Display_User2.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable_Display_User2.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable_Display_User2.getColumnModel().getColumn(7).setPreferredWidth(170);
            jTable_Display_User2.getColumnModel().getColumn(8).setPreferredWidth(170);
        }

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("<< BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setText("SEND MAIL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1490, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("SELECTED STUDENT INFORMATIONS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(457, 457, 457))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "WIPRO", "INFOSYS", "TCS", "DELOITTE", "COGNIZANT", "CONCENTRIX", "MICROSOFT", "OTHER" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setName("LIST"); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList1);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("If Other company? Specify it.");

        jTextField1.setEditable(false);
        jTextField1.setToolTipText("Specify the company");

        jButton5.setText("SHOW");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("YEAR");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Company ID");

        comp_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comp_IDKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(512, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comp_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable_Display_User2.getModel();
      if(model.getRowCount()==0)
        {
         JOptionPane.showMessageDialog(null,"students not found");   
        }
      else if(jList1.isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please select company first");
        }
        else if(jTextField2.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Please Specify year");
        }
        else if(comp_ID.getText().equals(""))
        {
                         JOptionPane.showMessageDialog(null,"Please Enter company ID");

        }
        
          
        else
        {
             try
            {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
              PreparedStatement pst1;
              String query1;
              query1="SELECT * FROM `criteria` WHERE comp_name = ? AND YEAR = ? AND comp_ID = ? LIMIT 0 , 30";
              pst1 = con.prepareStatement(query1);
             if(jList1.isSelectedIndex(7))
             {
                       pst1.setString(1,jTextField1.getText());
             }
            else
             {   
                      pst1.setString(1,jList1.getSelectedValue());
             }
            pst1.setString(2,jTextField2.getText());
            pst1.setString(3,comp_ID.getText());
            ResultSet rs1=pst1.executeQuery();
            if(rs1.next())
            {  
                String compname;
                    if(jList1.isSelectedIndex(7))
             {
                      compname = jTextField1.getText();
                      
             }
            else
             {   
                     compname = jList1.getSelectedValue();
             }
        String YR = jTextField2.getText();
        String ID = comp_ID.getText();
       new EMAIL(compname,YR,ID).setVisible(true);
            }
            else
            {
                    JOptionPane.showMessageDialog(null,"Company doesn't exists");
                   jTextField2.setText("");
                   jList1.clearSelection();
                   comp_ID.setText("");
                    clear_user();
  
            }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        }
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
         if(!(jList1.isSelectedIndex(7)))
        {
                       jTextField1.setEditable(false);
        }
        else
        {
                      JOptionPane.showMessageDialog(null,"Specify it");
                      jTextField1.setEditable(true);
        }
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(jList1.isSelectionEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please select company first");
        }
        else if(jTextField2.getText().equals(""))
        {
             JOptionPane.showMessageDialog(null,"Please Specify year");
        }
        else if(comp_ID.getText().equals(""))
        {
                         JOptionPane.showMessageDialog(null,"Please Enter company ID");

        }
        else
        {
            try
            {
              Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
              PreparedStatement pst1;
              String query1;
              query1="SELECT * FROM `criteria` WHERE comp_name = ? AND YEAR = ? AND comp_ID = ? LIMIT 0 , 30";
              pst1 = con.prepareStatement(query1);
             if(jList1.isSelectedIndex(7))
             {
                       pst1.setString(1,jTextField1.getText());
             }
            else
             {   
                      pst1.setString(1,jList1.getSelectedValue());
             }
            pst1.setString(2,jTextField2.getText());
            pst1.setString(3,comp_ID.getText());
            ResultSet rs1=pst1.executeQuery();
            if(rs1.next())
            {  
                    if(jList1.isSelectedIndex(0))
                     {    
                         clear_user();
                       show_user();
                     }
                     else if(jList1.isSelectedIndex(1))
                     {
                          clear_user();
                         show_user(); 
                     }
                     else if(jList1.isSelectedIndex(2))
                     {
                          clear_user();
                         show_user(); 
                     }
                    else if(jList1.isSelectedIndex(3))
                     {
                          clear_user();
                         show_user(); 
                     }
                   else if(jList1.isSelectedIndex(4))
                     {
                          clear_user();
                         show_user(); 
                     }
                      else if(jList1.isSelectedIndex(5))
                     {
                          clear_user();
                         show_user(); 
                     }
                      else if(jList1.isSelectedIndex(6))
                     {

                          clear_user();
                         show_user(); 
                     }
                      else if(jList1.isSelectedIndex(7))
                     {

                          clear_user();
                         show_user(); 
                     }
                     else
                      {
                          clear_user();
                         show_user(); 

                      }
            }
            else
            {
                    JOptionPane.showMessageDialog(null,"Company doesn't exists");
                   jTextField2.setText("");
                   jList1.clearSelection();
                   comp_ID.setText("");
                    clear_user();
  
            }
        }
        catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling co        de here:
           
      if(!(jList1.isSelectedIndex(7)))
      {
          jTextField1.setText("");
      }
    }//GEN-LAST:event_jList1MouseClicked

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            jTextField2.setEditable(true);
        }
        else
        {
            jTextField2.setEditable(false);
           
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void comp_IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comp_IDKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isISOControl(c)||evt.isActionKey())
        {
            comp_ID.setEditable(true);
        }
        else
        {
            comp_ID.setEditable(false);
           
        }
    }//GEN-LAST:event_comp_IDKeyPressed

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
            java.util.logging.Logger.getLogger(SELSTUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SELSTUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SELSTUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SELSTUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SELSTUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField comp_ID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Display_User1;
    private javax.swing.JTable jTable_Display_User2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
