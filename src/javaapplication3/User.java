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
class User {

   
    private int stdi;
    private int degag;
    private int degpas,sslcper,sslcpas,pucper,pucpas,backlog;
    private String snam;
    private String passwor,mnam,fnam,emai,clnam,gende,dobr;
    
    public User(String snam,String passwor,int stdi,String mnam,String fnam,String gende,String dobr,String emai,String clnam,int degag,int degpas,int sslcper,int sslcpas,int pucper,int pucpas,int backlog)
    {
        this.snam=snam;
        this.passwor=passwor;
        this.stdi=stdi;
        this.mnam=mnam;
        this.fnam=fnam;
        this.gende=gende;
        this.dobr=dobr;
        this.emai=emai;
        this.clnam=clnam;
        this.degag=degag;
        this.degpas=degpas;
        this.sslcper=sslcper;
        this.sslcpas=sslcpas;
        this.pucper=pucper;
        this.pucpas=pucpas;
        this.backlog=backlog;
    }
    public String getsname()
    {
        return snam;
    }
     public String getpassword()
    {
        return passwor;
    }
      public int getstdid()
    {
        return stdi;
    }
     public String getmname()
    {
        return mnam;
    }
      public String getfname()
    {
        return fnam;
    }
     public String getgender()
    {
        return gende;
    } 
      public String getdob()
    {
        return dobr;
    }
        public String getemail()
    {
        return emai;
    }
      
      
       public String getclname()
    {
        return clnam;
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
           public int getsslcpass()
    {
        return sslcpas;
    }
     public int getpucperc()
    {
        return pucper;
    }
       public int getpucpass()
    {
        return pucpas;
    }
         public int getbacklogs()
    {
        return backlog;
    }
    
}
