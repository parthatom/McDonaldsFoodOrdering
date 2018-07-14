import java.io.*;

public class McDonalds 
{
    static int tot=0;
    static int bill=1;
    public static void McD()throws IOException
    { 
      BufferedReader in=new BufferedReader(new InputStreamReader(System.in)); 
       int ch,ch2;
       double F_amount=0,tax;
       
       System.out.println(" WW      WW EEEEE L     CCC OOOO   MM  MM   EEEEE    TTTTT OOOO");
       System.out.println("  WW WW WW  EEE   L    C    O  O  MM MM MM  EEE        T   O  O");
       System.out.println("   WW  WW   EEEEE LLLL  CCC OOOO MM      MM EEEEE      T   OOOO");
       System.out.println("");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println("");
       System.out.println("     MM  MM        DDD  OOOO NN  N    A    L    DDD  SSSS");
       System.out.println("    MM MM MM   CCC D  D O  O N N N   A A   L    D  D  S  ");
       System.out.println("   MM      MM C    D  D O  O N  NN  AAAAA  L    D  D   S ");  
       System.out.println("  MM        MM CCC DDD  OOOO N   N A     A LLLL DDD  SSSS");
       System.out.println("");
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println(""); 
       System.out.println("                      I'M LOVIN' IT                            ");
       System.out.println(""); 
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       System.out.println(""); 
       do
        {
       System.out.println("1.Burgers and wraps");
       System.out.println("2.Sides");
       System.out.println("3.Beverages ");
       System.out.println("4.Deserts");
       System.out.println("5.Happy Meal");
       
       System.out.println("Enter your choice");
       ch=Integer.parseInt(in.readLine());
       
       switch(ch)
       {
           case 1:
           burgers_wraps bw= new burgers_wraps();
           bw.menu1();
           break;
           case 2:
           Sides sides= new Sides();
           sides.menu2();
           break;
           case 3:
           Beverages bever=new Beverages();
           bever.menu3();
           break;
           case 4:
           Deserts deser=new Deserts();
           deser.menu4();
           break;
           case 5: 
           HappyMeal hm=new HappyMeal();
           hm.menu5();
           break;
           default:
           System.out.println("wrong choice!!");
        }
       System.out.println("do u want to purchase some other option else 1-yes/0-no");
        ch2=Integer.parseInt(in.readLine());
     }while(ch2!=0);
     if(ch2==0)
     { 
        tot=burgers_wraps.amt1+Sides.amt2+Beverages.amt3+Deserts.amt4+HappyMeal.amt5;
     }    
     tax=0.04*tot;
     F_amount=tot+tax;  
     date ob=new date();
     ob.date1();
     System.out.println("Bill no>>>>>>>>>>>"+(bill++));
     System.out.println(""); 
     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
     System.out.println("                    McDonalds");  
     System.out.println("                  I'm Lovin' it ");
     System.out.println("Item"+"\t\t\t"+"          Quantity"+"\t\t\t  "+"Price");
     System.out.println("=================================================================================="); 
     for(int i=0;i<19;i++)
     {
         if(burgers_wraps.quantity1[i]>0)
         { 
             
             System.out.println(burgers_wraps.l11[i]+"\t\t"+burgers_wraps.quantity1[i]+"\t\t\t"+burgers_wraps.price1[i]);
         }
     } 
     for(int i=0;i<12;i++)
     {
        if(Sides.quantity2[i]>0)
        {
            
            System.out.println(Sides.l22[i]+"\t\t"+Sides.quantity2[i]+"  \t\t\t"+Sides.price2[i]);
        }
     }
     for(int i=0;i<23;i++)
     {
        if(Beverages.quantity3[i]>0)
        {
            
            System.out.println(Beverages.l33[i]+" \t"+Beverages.quantity3[i]+" \t \t   \t"+Beverages.price3[i]);
        }
     }
     for(int i=0;i<11;i++)
     {
        if(Deserts.quantity4[i]>0)
        {
            
            System.out.println(Deserts.l44[i]+"   "+Deserts.quantity4[i]+"  \t\t\t"+Deserts.price4[i]);
        }
     }
     for(int i=0;i<6;i++)
     {
        if(HappyMeal.quantity5[i]>0)
        {
            
            System.out.println(HappyMeal.l55[i]+"  \t"+HappyMeal.quantity5[i]+"  \t\t\t"+HappyMeal.price5[i]);
        }
     }
     System.out.println("");
     System.out.println("total="+tot);
     System.out.println("tax="+tax);
     System.out.println("Total amount with tax="+F_amount);
     Payment pay=new Payment();
     pay.Pay();
     System.out.println("");
     System.out.println("-----------Thank you----------");
     System.out.println("**** :) Visit again :)**** ");
      
   }
}