import java.io.*;
public class Sides
{
    public static int quantity2[]=new int [12];
    public static int amt2=0;
    public static String l22[]=new String [12];
    static int price2[]= new int[12];
    public static void menu2()
    {
       try
       {
           BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int c1,qu1,c21;
       
       String q1[]={"2pcs Chilli Paneer Pockets(veg)","3pcs Chilli Paneer Pockets     ","4pcs Chilli Paneer Pockets     ","Veg. Pizza McPuff              ","Medium French Fries            ","Chicken McNuggets® 6 pcs.      ","Small French Fries             ","Large French Fries             ","Chicken McNuggets® 9 pcs.      ","Extra Ketchup                  ","Extra Chilli Sauce             ","Chicken McNuggets®20 pcs.      "};
       int r1[]={29,39,49,25,75,105,60,95,138,1,1,268};
      /* for(int i=0;i<12;i++)
       { 
           System.out.println(q1[i].length());
        }
        for(int i=0;i<12;i++)
       {
       System.out.println("System.out.println("+(i+1)+"."+q1[i]+"....Rs."+r1[i]+");");
       }*/
      do
       {
      System.out.print('\f');
      System.out.println("The Sides are:-");       
      System.out.println("1.2pcs Chilli Paneer Pockets(veg)....Rs.29");
      System.out.println("2.3pcs Chilli Paneer Pockets.........Rs.39");
      System.out.println("3.4pcs Chilli Paneer Pockets.........Rs.49");
      System.out.println("4.Veg. Pizza McPuff..................Rs.25");
      System.out.println("5.Medium French Fries................Rs.75");
      System.out.println("6.Chicken McNuggets® 6 pcs...........Rs.105");
      System.out.println("7.Small French Fries.................Rs.60");
      System.out.println("8.Large French Fries.................Rs.95");
      System.out.println("9.Chicken McNuggets® 9 pcs...........Rs.138");
      System.out.println("10.Extra Ketchup.....................Rs.1");
      System.out.println("11.Extra Chilli Sauce................Rs.1");
      System.out.println("12.Chicken McNuggets®20 pcs..........Rs.268");
      
       System.out.println("Enter your choice");
       c1=Integer.parseInt(in.readLine());
      
       if(c1>12||c1<1)
       System.out.println("wrong choice!!");
       else
       {
       System.out.println("Enter quantity");
       qu1=Integer.parseInt(in.readLine());
       for(int i=0;i<12;i++)
       {       
           if(i==(c1-1))
           { quantity2[i]+=qu1;
             l22[i]=q1[i];  
             price2[i]=r1[i]*qu1;
             System.out.println("You have purchased "+qu1+" "+q1[i].trim()+" for Rs."+price2[i]);
        }
    }
    for(int i=0;i<12;i++)
    amt2=amt2+price2[i];
    }
        System.out.println("Do you want to purchase something else 1-yes/0-no");
        c21=Integer.parseInt(in.readLine());
    }while(c21!=0);
    System.out.println("Total for sides="+amt2); 
    /*for(int i=0;i<12;i++)
       {
       Sides.l2[i]=Sides.l22[i].length();
       Sides.d2[i]=31-Sides.l2[i];
       for(int j=0;j<Sides.d2[i];j++)
       Sides.sp2[i]=Sides.sp2[i]+' ';
       }*/
      }catch(Exception e){} 
    }}