/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Maihandler {
    
    
    public void composeMail(String to, String subjec, String msg)
       {
        String ToEmail =to;  
        String FromEmail = subjec;
        String FromEmailPassword = "7890(****)";
        String Subjects = subjec;
        
        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
          
        Session session;
        session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
            
        @Override
        protected PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(FromEmail, FromEmailPassword);
                
        }
           
            
        });
                
       try
       {
           MimeMessage message = new MimeMessage(session);
           message.setFrom(new InternetAddress(FromEmail));
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(ToEmail));
           message.setSubject(Subjects);
           message.setText(msg);
           Transport.send(message);
           JOptionPane.showMessageDialog(null,"Message sent succesfully");
       }
       catch(MessagingException ex)
       {
           System.out.println(""+ex);
       }   
       }     
    
}
