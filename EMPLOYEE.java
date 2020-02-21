/*Activity #1

1. Create a Class EMPLOYEE with the following fields:
	employee number
	employee lastname
	employee firstname
	employee middle initial
	employee status
	employment status
	hours worked

2. Provide a constructor, default constructor, setters, getters and toString methods.

3. Create a TEST class for your EMPLOYEE class. Provide the necessary input validation and error trappings.*/

import java.text.DecimalFormat;

public class EMPLOYEE{
   
   DecimalFormat formatter = new DecimalFormat("#0.00");
   private int employeenum;
   private String employeelname;
   private String employeefname;
   private char employeemiddle;
   private char employeestatus;
   private char employmentstatus;
   private double hours;
   private double regularrate;
   private double overtimepay;
   private double time;
   private double basicpay;
   private double grossearnings;
   private double tax;
   private double sss;
   private double pag_ibig;
   private double phil_health;
   private double totaldeduc;
   private double netearnings;
   
   public EMPLOYEE(int employeenum,String employeelname,String employeefname,char employeemiddle,char employeestatus,char employmentstatus,double hours){
      this.employeenum=employeenum;
      this.employeelname=employeelname;
      this.employeefname=employeefname;
      this.employeemiddle=employeemiddle;
      this.employeestatus=employeestatus;
      this.employmentstatus=employmentstatus;
      this.hours=hours;
   }
   
   public EMPLOYEE(){
   //you can leave it blank
   }
   
   public void setNum(int employeenum){
      if(employeenum>0)
      this.employeenum=employeenum;
      else
      this.employeenum=0;}
   
   public void setEmployeelname(String employeelname){
      this.employeelname=employeelname;}
   
   public void setEmployeefname(String employeefname){
      this.employeefname=employeefname;}
   
   public void setMiddle(char employeemiddle){
      this.employeemiddle=employeemiddle;}
   
   public void setEmployeestatus(char employeestatus){
      this.employeestatus=employeestatus;}
   
   public void setEmploymentstatus(char employmentstatus){
      this.employmentstatus=employmentstatus;}
   
   public void setHours(double hours){
      if(hours>0)
      this.hours=hours;
      else
      this.hours=0;}
   
   public void setRegularrate(){
      if(employmentstatus=='R'||employmentstatus=='r'){
         regularrate=590.88;}
      
      else if(employmentstatus=='P'||employmentstatus=='p'){
         regularrate=525.38;}
      
      else if(employmentstatus=='C'||employmentstatus=='c'){
         regularrate=488.56;}
      
      else if(employmentstatus=='T'||employmentstatus=='t'){
         regularrate=415.10;}
      
      else{
         regularrate=0;}
   }
   
   public void setOvertimepay(){
      if(hours>120){
         time=hours-120;
         overtimepay=time*((regularrate/8)*1.5);}
         
      else{
         overtimepay=0;}
   }  
    
   public void setBasicpay(){
      if(hours>=120){
         basicpay=regularrate*(120/8);}
         
      else{
         basicpay=regularrate*hours;}
   }
   
   public void setGrossearnings(){
      grossearnings=basicpay+overtimepay;}
   
   public void setTax(){
      if(employeestatus=='S'||employeestatus=='s')
      tax=grossearnings*.1575;
      else if(employeestatus=='M'||employeestatus=='m')
      tax=grossearnings*.1012;
      else if(employeestatus=='W'||employeestatus=='w')
      tax=grossearnings*.1235;
      else if(employeestatus=='D'||employeestatus=='d')
      tax=grossearnings*.1260;
      else
      tax=0;}
   
   public void setSSS(){
      if(grossearnings>=12000)
      sss=grossearnings*.115;
      else if(grossearnings>=9500)
      sss=grossearnings*.105;
      else if(grossearnings>=0)
      sss=grossearnings*.0916;
      else
      sss=0;}
   
   public void setPhilhealth(){
      if(grossearnings>=12000)
      phil_health=420;
      else if(grossearnings>=9500)
      phil_health=380;
      else if(grossearnings>=0)
      phil_health=290;
      else
      phil_health=0;}
   
   public void setPagibig(){
      if(employeestatus=='S'||employeestatus=='s')
      pag_ibig=grossearnings*.0275;
      else if(employeestatus=='M'||employeestatus=='m')
      pag_ibig=grossearnings*.0375;
      else if(employeestatus=='W'||employeestatus=='w')
      pag_ibig=grossearnings*.0255;
      else if(employeestatus=='D'||employeestatus=='d')
      pag_ibig=grossearnings*.0255;
      else
      pag_ibig=0;}
   
   public void setTotaldeduc(){
      totaldeduc=tax+sss+phil_health+pag_ibig;}
   
   public void setNetearnings(){
      netearnings=grossearnings-totaldeduc;}
   
   public int getNum(){
      return employeenum;}
   
   public String getEmployeelname(){
      return employeelname;}
   
   public String getEmployeefname(){
      return employeefname;}
   
   public char getMiddle(){
      return employeemiddle;}
   
   public char getEmployeestatus(){
      return employeestatus;}
   
   public char getEmploymentstatus(){
      return employmentstatus;}
   
   public double getHours(){
      return hours;}
   
   public double getRegularrate(){
      return regularrate;}
   
   public double getOvertimepay(){
      return overtimepay;}
   
   public double getBasicpay(){
      return basicpay;}
   
   public double getGrossearnings(){
      return grossearnings;}
   
   public double getSSS(){
      return sss;}
   
   public double getTax(){
      return tax;}
   
   public double getPagibig(){
      return pag_ibig;}
   
   public double getPhilhealth(){
      return phil_health;}
   
   public double getTotaldeduc(){
      return totaldeduc;}
   
   public double getNetearnings(){
      return netearnings;}
   
   public String toString(){
      return "\nEmployee Number: "+employeenum+
             "    Employee's Lastname: "+employeelname+
             "    Employee's Firstname: "+employeefname+
             "    Employee's Middle Initial: "+employeemiddle+
             "    Employee's Status: "+employeestatus+
             "    Employment Status: "+employmentstatus+
             "    Hours Worked: "+hours+
             "    Gross Earnings: "+formatter.format(grossearnings)+
             "    Total Deductions: "+formatter.format(totaldeduc)+
             "    Net Earnings: "+formatter.format(netearnings)+
             "    Overtime Pay: "+formatter.format(overtimepay)+
             "    Basic Pay: "+formatter.format(basicpay);
   } 
}
