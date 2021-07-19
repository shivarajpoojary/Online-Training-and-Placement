/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author User
 */
public class CUser {
    
    
  
    private int degag;
    private int degpas,sslcper,pucper,backlog;
    private String snam;
    private String cnam,year,comp_ID;
    
    public CUser(String comp_ID,String cnam,String year,int sslcper,int pucper,int degag,int degpas,int backlog)
    {
        this.comp_ID = comp_ID;
        this.cnam=cnam;
        this.year=year;
        this.sslcper=sslcper;
        this.pucper=pucper;
        this.degag=degag;
        this.degpas=degpas;
        this.backlog=backlog;
    }
    public String getcomp_ID()
    {
        return comp_ID;
    }
    public String getcname()
    {
        return cnam;
    }
     public String getyear()
    {
        return year;
    }
    
         public int getdegagg()
    {
        return degag;
    }
       public int getdegpass()
    {
        return degpas;
    }
         public int getsslcperc()
    {
        return sslcper;
    }
          
     public int getpucperc()
    {
        return pucper;
    }
      
         public int getbacklogs()
    {
        return backlog;
    }
    
    
}
