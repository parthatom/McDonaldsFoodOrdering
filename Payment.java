 import java.util.*;
 import java.io.*; 
 class Payment
 {
     static void Pay()throws IOException
     {
         //Scanner in=new Scanner(System.in);
         BufferedReader in=new BufferedReader(new InputStreamReader(System.in)); 
         int ch,b,edm,edy,cv,pw;
         String n,id,add;
         long cd;
         System.out.println("");
         System.out.println("How do you want to pay the bill");
         System.out.println("Payment Options");
         System.out.println("1. Debit card");
         System.out.println("2. Credit card");
         System.out.println("3. Net banking");
         System.out.println("4. Cash on delivery");
         System.out.println("Enter your choice");
         ch=Integer.parseInt(in.readLine());
         if(ch<=0||ch>4)
         {
             System.out.println("Invalid choice please enter again");
             ch=Integer.parseInt(in.readLine());
         }
         Calendar c=Calendar.getInstance();
         if(ch>=1&&ch<=3)
         {    
             System.out.println("The name of banks are:");
             System.out.println("1. HDFC BANK");
             System.out.println("2. ICICI BANK");
             System.out.println("3. BANK OF BARODA");
             System.out.println("4. SBI BANK");
             System.out.println("Enter the bank through which you want to pay");
             b=Integer.parseInt(in.readLine());
         }
         if(ch==1||ch==2)
         {             
             System.out.println("Enter the name on the card");
             n=in.readLine();
             System.out.println("Enter the 16 digit card number");
             cd=Long.parseLong(in.readLine()); 
             if(cd/Math.pow(10,15)<1||cd/Math.pow(10,15)>9)
             {
                 System.out.println("invalid card number please enter again");
                 cd=Long.parseLong(in.readLine());
             }
             System.out.println("Enter the month in the format MM");
             edm=Integer.parseInt(in.readLine()); 
             if(edm<0||edm>12)
             {
                 System.out.println("Invalid month please enter again");    
                 edm=Integer.parseInt(in.readLine()); 
             }
             System.out.println("Enter the year in the format YY");
             edy=Integer.parseInt(in.readLine()); 
             if(edy<15)
             {
                 System.out.println("Your card has already expired!!!");                     
             }   
             if(edy==c.get(Calendar.YEAR))
             {
                 if(edm<=(c.get(Calendar.MONTH)+1))
                 System.out.println("Your card has already expired!!!");
             }
             System.out.println("Enter the CVV/CVC number");
             cv=Integer.parseInt(in.readLine());
             if(cv/Math.pow(10,2)<1||cv/Math.pow(10,2)>9)
             System.out.println("Invalid CVV/CVC number please enter again");
         }
         if(ch==3)
         {
             System.out.println("Enter your customer ID");
             id=in.readLine();
             System.out.println("Enter your passsword");
             pw=Integer.parseInt(in.readLine());
         }
         if(ch==4)
         {
             System.out.println("You will have to submit your cash when the delivery boy comes at your address");
           }
         if(ch>=1&&ch<=4)
         {
             System.out.println("Please enter your address, all in one line");           
             add=in.readLine();
             System.out.println("Your order will be delivered withtin 30 minutes or else it will be free!");
         }                  
     }
}
