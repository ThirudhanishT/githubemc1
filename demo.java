import java.lang.System;
import java.util.*;
class book
{
	String campus;
        String location;
        book(String campus,String location)
        {
		this.campus=campus;
                this.location=location;
        }
        void display()
        {
                 System.out.println("CAMPUS: "+campus);
 		 System.out.println("LOCATION: "+location);
        }
        void cal()
        {
        }
}
class UG extends book
{
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int cal(int c)
        {
           if(c<=15)
           {
                    return 0;
           }
               else if(c>15 && c<25)
               {
                    int d=c-15;
                    int v=d*5;
                     return v;
               }
               else 
               {
                    int e=c-15;
                    int f=e-10;
                    int g=f*10;
                    int h=e-f;
                    int o=h*5;
                    int p=g+o;
                    return p; 
               }
        }
        void cal()
        {
        for(int i=0;i<n;i++)
        {
           System.out.println("Enter how many book the student "+(i+1)+" bought: ");
           int a=scan.nextInt();
           int b[]=new int[a];
           int fine[]=new int[a];
           for(int j=0;j<a;j++)
           {
               System.out.println("Enter how many days BOOK"+(j+1)+" with STUDENT"+(i+1)+":");
               int c=scan.nextInt();
               fine[j]=cal(c);
            }
          System.out.println("THE DETAILS OF UG STUDENT"+(i+1));
          System.out.println("CAMPUS:"+campus);
          System.out.println("LOCATION:"+location);
          for(int k=0;k<a;k++)
          {
              System.out.println("THE FINE FOR BOOK "+(k+1)+"="+fine[k]);
          }
          }
         
       }
       UG()
       {
             super("MITCAMPUS","CHROMPET");
       }
}
class PG extends book
{
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int cal(int c)
        {
            if(c<=30)
                {
                    return 0;
                }
               else if(c>30 && c<40)
               {
                    int d=c-30;
                    int v=d*5;
                    return v;
               }
               else 
               {
                    int e=c-30;
                    int f=e-10;
                    int g=f*10;
                    int h=e-f;
                    int o=h*5;
                    int p=g+o;
                    return p; 
               }
        }
        void cal()
        {
        for(int i=0;i<n;i++)
        {
           System.out.println("Enter how many book the student "+(i+1)+" bought: ");
           int a=scan.nextInt();
           int b[]=new int[a];
           int fine[]=new int[a];
           for(int j=0;j<a;j++)
           {
               System.out.println("Enter how many days BOOK"+(j+1)+" with STUDENT"+(i+1)+":");
               int c=scan.nextInt();
               fine[j]=cal(c);
            }
          System.out.println("THE DETAILS OF PG STUDENT"+(i+1));
          System.out.println("CAMPUS:"+campus);
          System.out.println("LOCATION:"+location);
          for(int k=0;k<a;k++)
          {
              System.out.println("THE FINE FOR BOOK "+(k+1)+"="+fine[k]);
          }
          }
         
       }
       PG()
       {
             super("MITCAMPUS","CHROMPET");
       }
}   
class scholar extends book
{
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int cal(int c)
        {
            if(c<=30)
                {
                    return 0;
                }
               else if(c>30 && c<40)
               {
                    int d=c-30;
                    int v=d*5;
                    return v;
               }
               else 
               {
                    int e=c-30;
                    int f=e-10;
                    int g=f*10;
                    int h=e-f;
                    int o=h*5;
                    int p=g+o;
                    return p; 
               }
        }

        void cal()
        {
        for(int i=0;i<n;i++)
        {
           System.out.println("Enter how many book the student "+(i+1)+" bought: ");
           int a=scan.nextInt();
           int b[]=new int[a];
           int fine[]=new int[a];
           for(int j=0;j<a;j++)
           {
               System.out.println("Enter how many days BOOK"+(j+1)+" with STUDENT"+(i+1)+":");
               int c=scan.nextInt();
               fine[j]=cal(c);
            }
          System.out.println("THE DETAILS OF scholar STUDENT"+(i+1));
          System.out.println("CAMPUS:"+campus);
          System.out.println("LOCATION:"+location);
          for(int k=0;k<a;k++)
          {
              System.out.println("THE FINE FOR BOOK "+(k+1)+"="+fine[k]);
          }
          }
         
       }
       scholar()
       {
             super("MITCAMPUS","CHROMPET");
       }
}   
class faculty extends book
{
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int cal(int c)
        {
            if(c<=90)
            {
                    return 0;
            }
               else
               {
                    int d=c-90;
                    int v=d*10;
                    return v;
               }
        }
        void cal()
        {
        for(int i=0;i<n;i++)
        {
           System.out.println("Enter how many book the student "+(i+1)+" bought: ");
           int a=scan.nextInt();
           int b[]=new int[a];
           int fine[]=new int[a];
           for(int j=0;j<a;j++)
           {
               System.out.println("Enter how many days BOOK"+(j+1)+" with STUDENT"+(i+1)+":");
               int c=scan.nextInt();
               fine[j]=cal(c);
            }
          System.out.println("THE DETAILS OF FACULTY"+(i+1));
          System.out.println("CAMPUS:"+campus);
          System.out.println("LOCATION:"+location);
          for(int k=0;k<a;k++)
          {
              System.out.println("THE FINE FOR BOOK "+(k+1)+"="+fine[k]);
          }
          }
         
       }
       faculty()
       {
             super("MITCAMPUS","CHROMPET");
       }
}           
class University
{
	public static void main(String args[])
	{
             System.out.println("1.FOR UG STUDENT");
             System.out.println("2.FOR PG STUDENT");
             System.out.println("3.FOR SCHLORS STUDENT");
             System.out.println("4.FOR FACULTY");
             System.out.println("5.To EXIT");
             while(true)
             {
             System.out.println("\nEnter for which you need to calculate the fine");
             int choice;
             Scanner sa=new Scanner(System.in);
             choice=sa.nextInt();
             switch(choice)
            {
             case 1:System.out.println("Enter how many UG students bought book: ");
                    book u=new UG();
                    u.cal();
                    break;

             case 2:System.out.println("Enter how many PG students bought book: ");
                    book p=new PG();
                    p.cal();
                    break;

             case 3:System.out.println("Enter how many scholars bought book: ");
                    book s=new scholar();
                    s.cal();
                    break;

             case 4:System.out.println("Enter how many faculty bought book: ");
                   book f=new faculty();
                   f.cal();
                   break;

             case 5:System.out.println("Exited Succesfully");
                   return;
            }
          }
        }
}