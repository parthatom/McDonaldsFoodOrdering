import java.io.*;
public class HappyMeal
{
    public static int quantity5[]=new int [6];
    public static int amt5=0;
    public static String l55[]=new String [6];
    static int price5[]= new int[6];
    static int l5[]=new int[6];
    static int d5[]=new int[6];
    static String sp5[]= new String[6];
    public static void menu5()
    {
       try
       {
           BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       int c4,qu4,c24;
       
       String q4[]={"McAloo Tikki™ Happy Meal™          ","Chicken McGrill™ Happy Meal™       ","McVeggie™ Happy Meal™              ","McChicken™ Happy Meal™             ","Chicken McNuggets 4 pcs Happy Meal™","McEgg™ Happy Meal™                 "};
       int r4[]={83,93,125,113,115,83};
  
     do
       {
       System.out.print('\f');
       System.out.println("The Happy Meals are:-");    
       System.out.println("1.McAloo Tikki Happy Meal..............Rs.83");
    System.out.println("2.Chicken McGrill Happy Meal...........Rs.93");
    System.out.println("3.McVeggie Happy Meal..................Rs.125");
    System.out.println("4.McChicken Happy Meal.................Rs.113");
    System.out.println("5.Chicken McNuggets 4 pcs Happy Meal...Rs.115");
    System.out.println("6.McEgg Happy Meal.....................Rs.83");
       
       
       
       System.out.println("Enter your choice");
       c4=Integer.parseInt(in.readLine());
       /**for(int i=0;i<6;i++)
       { 
           HappyMeal.l5[i]=HappyMeal.l55[i].length();
             HappyMeal.d5[i]=23-HappyMeal.l5[i];
             for(int j=0;j<HappyMeal.d5[i];j++)
             HappyMeal.sp5[i]=HappyMeal.sp5[i]+' ';
           
        }*/
       if(c4>6||c4<1)
       System.out.println("wrong choice!!");
       else
       {
       System.out.println("Enter quantity");
       qu4=Integer.parseInt(in.readLine());
       for(int i=0;i<6;i++)
       {       
           if(i==(c4-1))
           { quantity5[i]+=qu4;
             l55[i]=q4[i];  
             price5[i]=r4[i]*qu4;
             System.out.println("You have purchased "+qu4+" "+q4[i].trim()+" for Rs."+price5[i]);
        }
    }
    for(int i=0;i<6;i++)
    amt5=amt5+price5[i];
    }
        System.out.println("Do you want to purchase something else 1-yes/0-no");
        c24=Integer.parseInt(in.readLine());
    }while(c24!=0);
    System.out.println("Total for Happy Meals=Rs."+amt5);
}catch(Exception e){} 
    }} 