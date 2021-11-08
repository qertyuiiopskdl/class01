class Cal_area               
{
   double length,width,heigth;
   double pi=3.14159;
   double radius;

   void setLength(double l)        
   {
	   length=l;
   }
   void setWidth(double w)        
   {
	   width=w;
   }
   void setHeigth(double h)        
   {
	   heigth=h;
   }
   void setRadius(double r)         
   {
      radius=r;
   }
   void setAll(double l,double w,double h, double r)  
   {
	   length=l;
	   width=w;
	   heigth=h;
       radius=r;
   }
   void show()                 
   {
      System.out.println("area="+(length*width+length*heigth+width*heigth)*2);
      System.out.println("volume="+pi*radius*radius*radius*4/3);
   }
}
public class class01
{
   public static void main(String args[])
   {
	   Cal_area cir1=new Cal_area();

      cir1.setLength(4);  
      cir1.setWidth(5);
      cir1.setHeigth(6);
      cir1.setRadius(10.0);      
      cir1.setAll(4,5,6,10.0);  
      cir1.show();
   }
}