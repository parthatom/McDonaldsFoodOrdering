import java.io.*;
public class burgers_wraps
{
   public static int quantity1[]=new int [19];
   public static int amt1=0;
   public static String l11[]=new String [19];
   static int price1[]= new int[19];
   public static void menu1()
    {
      
    try
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int c,qu,c2;       
       
       String q[]={"McAloo Tikki(veg)       ","Aloo wrap(veg)          ","McVeggie                ","Masala Grill(veg)       ","McSpicy Paneer(veg)     ","Spicy Panner Wrap(veg)  ","McPaneer Royale(veg)    ","McEgg                   ","Egg wrap                ","Chicken McGrill         ","Chicken Maharaja Mac    ","Masala Grill Chicken    ","Grilled Chicken Wrap    ","McChicken               ","Filet-O-Fish            ","McSpicy Chicken         ","Spicy Chicken Wrap      ","Grilled Chicken Royale  ","Chicken McNuggets(6 pcs)"};
        /*for(int i=0;i<19;i++)
       { 
           System.out.println(q[i].length());
        }*/
       
         
        int r[]={32,55,70,50,120,150,125,35,59,46,110,63,65,108,128,155,135,105,105};
       do
       {
       System.out.print('\f');
       System.out.println("The Burger and Wraps are:-");   
       System.out.println("1.McAloo Tikki(veg)...........Rs.32");
       System.out.println("2.Aloo wrap(veg)..............Rs.55");
       System.out.println("3.McVeggie....................Rs.70");
       System.out.println("4.Masala Grill(veg)...........Rs.50");
       System.out.println("5.McSpicy Paneer(veg).........Rs.120");
       System.out.println("6.Spicy Panner Wrap(veg)......Rs.150");
       System.out.println("7.McPaneer Royale(veg)........Rs.125");
       System.out.println("8.McEgg.......................Rs.35");
       System.out.println("9.Egg wrap....................Rs.59");
       System.out.println("10.Chicken McGrill............Rs.46");
       System.out.println("11.Chicken Maharaja Mac.......Rs.110");
       System.out.println("12.Masala Grill Chicken.......Rs.63");
       System.out.println("13.Grilled Chicken Wrap.......Rs.65");
       System.out.println("14.McChicken..................Rs.108");
       System.out.println("15.Filet-O-Fish...............Rs.128");
       System.out.println("16.McSpicy Chicken............Rs.155");
       System.out.println("17.Spicy Chicken Wrap.........Rs.135");
       System.out.println("18.Grilled Chicken Royale.....Rs.105");
       System.out.println("19.Chicken McNuggets(6 pcs)...Rs.105");       
       
       System.out.println("Enter your choice");
       c=Integer.parseInt(in.readLine());
            
       if(c>19||c<1)
       System.out.println("wrong choice!!");
       else
       {
       System.out.println("Enter quantity");
       qu=Integer.parseInt(in.readLine());
       for(int i=0;i<19;i++)
       {       
           if(i==(c-1))
           { quantity1[i]+=qu;
             l11[i]=q[i];  
             price1[i]=r[i]*qu;
             System.out.println("You have purchased "+qu+" "+q[i].trim()+" for Rs."+price1[i]);
        }
    }
    for(int i=0;i<19;i++)
    amt1=amt1+price1[i];
    }
        System.out.println("Do you want to purchase something else 1-yes/0-no");
        c2=Integer.parseInt(in.readLine());
    }while(c2!=0);
    System.out.println("Total for burgers and wraps=Rs."+amt1);
    /*for(int i=0;i<19;i++)
       { 
           l1[i]=l11[i].length();
             d1[i]=23-l1[i];
             for(int j=0;j<d1[i];j++)
             sp1[i]=sp1[i]+' ';
        }*/ 
    /*for(int i=0;i<19;i++)
       {
            System.out.println(sp1[i]+q[i]);
        }*/
    }catch(Exception e){}
  }
}