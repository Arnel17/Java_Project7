import java.util.Scanner;

public class Test_EMPLOYEE{
   public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter how many employee: ");
      int num = sc.nextInt();
      EMPLOYEE emp1[] = new EMPLOYEE[num];
      int empnum[] = new int[num];
      String lname[] = new String[num];
      String fname[] = new String[num];
      char middleinitial[] = new char[num];
      char employeestatus[] = new char[num];
      char employmentstatus[] = new char[num];
      double hours[] = new double[num];
      int select=0;
      int temp1;
      String temp2;
      char temp3;
      double temp4;
      int decrement=0;
      int counter=0;
      char back;
      char ascend;
      while(select>6||select<=0){
      do{
      
      System.out.println("\n\nMenu");
      System.out.println("1. Create");
      System.out.println("2. View");
      System.out.println("3. Sort");
      System.out.println("4. Search");
      System.out.println("5. Delete");
      System.out.println("6. Quit");

      System.out.print("Input Choice: ");
      select = sc.nextInt();
      if(select==1){
      for(;counter<emp1.length;){
      sc = new Scanner(System.in);
      do{
      System.out.print("(P/p)Proceed,(B/b)Back ");
      back = sc.nextLine().charAt(0);
      }while(back!='p'&&back!='P'&&back!='b'&&back!='B');
      if(back=='p'||back=='P'){
      System.out.print("\nEmployee Number: ");
      empnum[counter] = sc.nextInt();
      while(empnum[counter]<0){
         System.out.print("\nEmployee Number: ");
         empnum[counter] = sc.nextInt();}
         
      sc = new Scanner(System.in);
      
      System.out.print("Employee Lastname: ");
      lname[counter] = sc.nextLine();
      System.out.print("Employee Firstname: ");
      fname[counter] = sc.nextLine();
      System.out.print("Employee Middle Initial: ");
      middleinitial[counter] = sc.nextLine().charAt(0);
      do{
      System.out.print("Employee Status (S/s)Single,(M/m)Married,(W/w)Widow,(D/d)Widower): ");
      employeestatus[counter] = sc.nextLine().charAt(0);
      }while(employeestatus[counter]!='S'&&employeestatus[counter]!='s'&&employeestatus[counter]!='M'&&employeestatus[counter]!='m'
            &&employeestatus[counter]!='W'&&employeestatus[counter]!='w'&&employeestatus[counter]!='D'&&employeestatus[counter]!='d');
      do{
      System.out.print("Employment Status (R/r)Regular,(P/p)Probationary,(C/c)Casual,(T/t)Part-Time): ");
      employmentstatus[counter] = sc.nextLine().charAt(0);
      }while(employmentstatus[counter]!='R'&&employmentstatus[counter]!='r'&&employmentstatus[counter]!='P'&&employmentstatus[counter]!='p'
            &&employmentstatus[counter]!='C'&&employmentstatus[counter]!='c'&&employmentstatus[counter]!='T'&&employmentstatus[counter]!='t');
      do{
      System.out.print("Hours Worked: ");
      hours[counter] = sc.nextDouble();
      }while(hours[counter]<0);
      counter++;
      }
      else
      break;
      }
      }
      else if(select==2){
      for(int counter2=0;counter2<counter-decrement;counter2++){
      emp1[counter2] = new EMPLOYEE(empnum[counter2],lname[counter2],fname[counter2],middleinitial[counter2],employeestatus[counter2],employmentstatus[counter2],hours[counter2]);
      emp1[counter2].setRegularrate();
      emp1[counter2].setOvertimepay();
      emp1[counter2].setBasicpay();
      emp1[counter2].setGrossearnings();
      emp1[counter2].setTax();
      emp1[counter2].setSSS();
      emp1[counter2].setPhilhealth();
      emp1[counter2].setPagibig();
      emp1[counter2].setTotaldeduc();
      emp1[counter2].setNetearnings();
      }
      for(int counter3=0;counter3<counter-decrement;counter3++){
         System.out.print(emp1[counter3]);}
      }
      else if(select==3){
      sc = new Scanner(System.in);
      do{
      System.out.print("\n(A)Ascending,(D)Descending ");
      ascend = sc.nextLine().charAt(0);
      }while(ascend!='a'&&ascend!='A'&&ascend!='d'&&ascend!='D');
      if(ascend=='a'||ascend=='A'){
      for(int counter4=0;counter4<counter-decrement;counter4++){
         for(int counter5=counter4+1;counter5<counter-decrement;counter5++){
         if(empnum[counter4]>empnum[counter5]){
            temp1 = empnum[counter4];
            empnum[counter4] = empnum[counter5];
            empnum[counter5] = temp1;
            
            temp2 = lname[counter4];
            lname[counter4] = lname[counter5];
            lname[counter5] = temp2;
            
            temp2 = fname[counter4];
            fname[counter4] = fname[counter5];
            fname[counter5] = temp2;
            
            temp3 = middleinitial[counter4];
            middleinitial[counter4] = middleinitial[counter5];
            middleinitial[counter5] = temp3;
            
            temp3 = employeestatus[counter4];
            employeestatus[counter4] = employeestatus[counter5];
            employeestatus[counter5] = temp3;
            
            temp3 = employmentstatus[counter4];
            employmentstatus[counter4] = employmentstatus[counter5];
            employmentstatus[counter5] = temp3;
            
            temp4 = hours[counter4];
            hours[counter4] = hours[counter5];
            hours[counter5] = temp4;
         }
         }
      }
      }
      else
      for(int counter4=0;counter4<counter-decrement;counter4++){
         for(int counter5=counter4+1;counter5<counter-decrement;counter5++){
         if(empnum[counter4]<empnum[counter5]){
            temp1 = empnum[counter4];
            empnum[counter4] = empnum[counter5];
            empnum[counter5] = temp1;
            
            temp2 = lname[counter4];
            lname[counter4] = lname[counter5];
            lname[counter5] = temp2;
            
            temp2 = fname[counter4];
            fname[counter4] = fname[counter5];
            fname[counter5] = temp2;
            
            temp3 = middleinitial[counter4];
            middleinitial[counter4] = middleinitial[counter5];
            middleinitial[counter5] = temp3;
            
            temp3 = employeestatus[counter4];
            employeestatus[counter4] = employeestatus[counter5];
            employeestatus[counter5] = temp3;
            
            temp3 = employmentstatus[counter4];
            employmentstatus[counter4] = employmentstatus[counter5];
            employmentstatus[counter5] = temp3;
            
            temp4 = hours[counter4];
            hours[counter4] = hours[counter5];
            hours[counter5] = temp4;
         }
         }
      }
      }
      else if(select==4){
         System.out.print("Search employee number: ");
         int searchnum = sc.nextInt();
         boolean isFound=false;
         for(int counter6=0;counter6<counter-decrement;counter6++){
            if(searchnum==empnum[counter6]){
               isFound = true;
               break;}
         }
         if(isFound)
            System.out.print("\nIt is found\n");
        
         else
            System.out.print("\nNot found\n");

      }
      else if(select==5){
      if(counter==num){
         int count=0;
         sc = new Scanner(System.in);
         System.out.print("Enter employee number you want to delete: ");
         int del = sc.nextInt();
        for(int counter7=0;counter7<counter;counter7++){
         if(del==empnum[counter7]){
            for(int counter8=counter7;counter8<counter-1;counter8++){
               empnum[counter8]=empnum[counter8+1];
               lname[counter8]=lname[counter8+1];
               fname[counter8]=fname[counter8+1];
               middleinitial[counter8]=middleinitial[counter8+1];
               employeestatus[counter8]=employeestatus[counter8+1];
               employmentstatus[counter8]=employmentstatus[counter8+1];
               hours[counter8]=hours[counter8+1];
            }
            count++;
            decrement++;
            break;
         }
        }
        if(count==0)
        System.out.print("\nNot found");
        else
        System.out.print("'nDeleted");
      }
      else
      System.out.print("\nFinish your inputs first");
      }
      }while(select>0&&select<6);
      }
   }
}