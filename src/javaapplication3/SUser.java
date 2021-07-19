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
public class SUser {

    private final String cnam;
    
    
    private String year,comp_ID,datime;
    
    public SUser(String comp_ID,String cnam,String year,String datime)
    {
        this.comp_ID = comp_ID;
        this.cnam=cnam;
        this.year=year;
        this.datime=datime;
        
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
      public String getdatime()
    {
        return datime;
    }
    
   
}
