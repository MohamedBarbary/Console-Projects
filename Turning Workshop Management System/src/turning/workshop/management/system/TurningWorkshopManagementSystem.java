package turning.workshop.management.system;
import java.util.Scanner;
public class TurningWorkshopManagementSystem {
 static Scanner sc = new Scanner(System.in);
 public static void main(String[] args) {
 System.out.println("For Iron Press>> 1");
 System.out.println("For Yellow Copper Press>> 2");
 System.out.println("For Red Copper Press>> 3");
 System.out.print("Enter Type Of Material>>>> ");
 int x = 8; 
 double y = 8.73;
 double z = 8.94; 
 int operation1 = sc.nextInt();
 System.out.println("****************************");
 switch (operation1) {
 case 1: 
 System.out.println("For Coiled Press>> 1");
 System.out.println("For Hexa Press>>2");
 System.out.println("For Square press>> 3");
 System.out.print("Enter Type Of Shape>>> ");
 int operationi = sc.nextInt();
 System.out.println("*****************************");
 switch (operationi) {//start operationiron
 case 1:
 //start case 11
 double weight1,price1 , prim1 , num1 ,len1, p_mat1,num_need1,we1;
 System.out.print("Enter Diameter For Coiled >> ");
 int n1 = sc.nextInt();
 weight1 = coiled(n1) * x;
 System.out.printf("Weight = %,.3f kg \n" ,weight1);
 System.out.println("*******************************");
 System.out.print("Enter Price For Kilo >> ");
 price1 = sc.nextDouble();
 prim1 = weight1 * price1;
 System.out.printf("Price For Meter = %,.3f pound\n", prim1);
 System.out.println("********************************");
 System.out.print("Enter Length OF Material >> ");
 len1 = sc.nextDouble();
 num1 = 967 / len1;
 System.out.printf("Number OF Pieces Material = %,.1f piece\n", num1);
 p_mat1 = prim1 / num1;
 System.out.printf("Casting Of Material = %,.2f pound\n", p_mat1);
     System.out.println("*****************************************");
     System.out.print("Enter number of order >>> ");
     double oi = sc.nextInt();
     num_need1=(oi/num1)*(weight1);
      we1 = oi/num1;
     System.out.printf("Number of meters = %,.1f m\n",we1);
     System.out.printf("We will order = %,.0f kg\n",num_need1);
 break;
 case 2 :
 //start case 21
 double weight2,price2 , prim2, len2 , num2, p_mat2,num_need2,we2;
 System.out.print("Enter Diameter For Hexa >> ");
 int n2 = sc.nextInt();
 weight2 = hexa(n2) * x;
 System.out.printf("Weight = %,.3f kg\n" ,weight2);
 System.out.println("*******************************");
 System.out.print("Enter Price For Kilo >> ");
 price2= sc.nextDouble();
 prim2 = weight2 * price2;
 System.out.printf("Price For Meter = %,.3f pound\n" , prim2);
 System.out.println("********************************");
 System.out.print("Enter Length OF Material >> ");
 len2 = sc.nextDouble();
 num2 = 967 / len2;
 System.out.printf("Number OF Pieces Material = %,.1f piece\n", num2);
 p_mat2 = prim2 / num2;
 System.out.printf("Casting Of Material = %,.2f pound\n", p_mat2);
     System.out.println("*****************************************");
  System.out.print("Enter number of order >>> ");
     int op = sc.nextInt();
     num_need2=weight2*(op/num2);
     we2 = op/num2;
     System.out.printf("Number of meters = %,.1f m \n",we2);
     System.out.printf("We will order = %,.0f kg\n",num_need2);
 break;
 //end case 21
 case 3 :
 //start case 31
 double weight3 , price3,we3 , prim3 , len3, num3, p_mat3,num_need3;
 System.out.print("Enter Diameter For Square>> ");
 int n3 = sc.nextInt();
 weight3 = square(n3) * x;
 System.out.printf("Weight = %,.3f kg \n" , weight3);
 System.out.println("*******************************");
 System.out.print("Enter Price For Kilo >> ");
 price3= sc.nextDouble();
 prim3 = weight3 * price3;
 System.out.printf("Price For Meter = %,.3f pound \n" , prim3);
 System.out.println("********************************");
 System.out.print("Enter Length OF Material >> ");
 len3 = sc.nextDouble();
 num3 = 967 / len3;
 System.out.printf("Number OF Pieces Material = %,.1f piece\n", num3);
 p_mat3 = prim3 / num3;
 System.out.printf("Casting Of Material = %,.2f pound\n", p_mat3);
     System.out.println("**************************************");
   System.out.print("Enter number of order >>> ");
     int opp = sc.nextInt();
     num_need3=weight3*(opp/num3);
     we3=opp/num3;
     System.out.printf("Number of meters = %,.1f m \n",we3);
     System.out.printf("We will order = %,.0f kg \n",num_need3);
 break;
 } break;
 case 2:
 //end case
 System.out.println("For Coiled Press>> 1");
 System.out.println("For Hexa Press>>2");
 System.out.println("For Square press>> 3");
 System.out.print("Enter Type Of Shape>>> ");
 int operationcy = sc.nextInt();
 System.out.println("*****************************");
 switch(operationcy){
 case 1 :
 double weight5,price5 ,prim5 , num5 ,len5, p_mat5,num_need5,we5;
 System.out.print("Enter Diameter For Coiled >> ");
 int n1 = sc.nextInt();
 weight5 = coiled(n1) * y;
 System.out.printf("Weight = %,.3f kg \n" ,weight5);
 System.out.println("*******************************");
 System.out.print("Enter Price For Kilo >> ");
 price5 = sc.nextDouble();
 prim5 = weight5 * price5;
 System.out.printf("Price For Meter = %,.3f pound\n", prim5);
 System.out.println("********************************");
 System.out.print("Enter Length OF Material >> ");
 len5 = sc.nextDouble();
 num5 = 967 / len5;
 System.out.printf("Number OF Pieces Material = %,.1f piece\n", num5);
 p_mat5 = prim5 / num5;
 System.out.printf("Casting Of Material = %,.2f pound\n", p_mat5);
     System.out.println("***************************************");
   System.out.println("Enter number of order >>> ");
     int po = sc.nextInt();
     num_need5=weight5*(po/num5);
     we5= po/num5;
     System.out.printf("Number of metres = %,.1f m \n",we5);
     System.out.printf("We will order = %,.0f kg \n",num_need5);
 break;

 case 2 :
 double weight4 , price4 , prim4 , num4 ,len4,we4 ,p_mat4,num_need4;
 System.out.print("Enter Diameter For Hexa >> ");
 int n2 = sc.nextInt();
 weight4 = hexa(n2) * y;
 System.out.printf("Weight = %,.3f kg \n" ,weight4);
 System.out.println("*******************************");
 System.out.print("Enter Price For Kilo >> ");
 price4 = sc.nextDouble();
 prim4 = weight4 * price4;
 System.out.printf("Price For Meter = %,.3f pound\n", prim4);
 System.out.println("********************************");
 System.out.print("Enter Length OF Material >> ");
 len4 = sc.nextDouble();
 num4 = 967 / len4;
 System.out.printf("Number OF Pieces Material = %,.1f piece \n", num4);
 p_mat4 = prim4 / num4;
 System.out.printf("Casting Of Material = %,.2f pound \n", p_mat4);
     System.out.println("****************************************");
   System.out.println("Enter number of order >>> ");
     int io = sc.nextInt();
     num_need4=weight4*(io/num4);
     we4=io/num4;
     System.out.printf("Number of meters = %,.1f m\n",we4);
     System.out.printf("We will order = %,.0f kg\n",num_need4);
 break;
 /////////////////end cae22
 case 3 :
 double weight6 , price6 ,we6 ,prim6 , num6 ,len6, p_mat6,num_need6;
 System.out.print("Enter Diameter For Square >> ");
 int n3 = sc.nextInt();
 weight6 = square(n3) * y;
 System.out.printf("Weight = %,.3f kg \n" ,weight6);
 System.out.println("*******************************");
 System.out.print("Enter Price For Kilo >> ");
 price6 = sc.nextDouble();
 prim6 = weight6 * price6;
 System.out.printf("Price For Meter = %,.3f pound \n", prim6);
 System.out.println("********************************");
 System.out.print("Enter Length OF Material >> ");
 len6 = sc.nextDouble();
 num6 = 967 / len6;
 System.out.printf("Number OF Pieces Material = %,.1f piece \n", num6);
 p_mat6 = prim6 / num6;
 System.out.printf("Casting Of Material = %,.2f pound \n", p_mat6);
        System.out.println("****************************************");
   System.out.print("Enter number of order >>> ");
     int iio = sc.nextInt();
     num_need6=weight6*(iio/num6);
     we6 = iio/num6;
     System.out.printf("Number of meters = %,.1f m \n",we6);
     System.out.printf("We will order = %,.0f kg \n",num_need6);
 break;
 } break;
 case 3:
 System.out.println("For Coiled Press>> 1");
 System.out.println("For Hexa Press>>2");
 System.out.println("For Square press>> 3");
 System.out.print("Enter Type Of Shape>>> ");
 int operationcr = sc.nextInt();
 System.out.println("*****************************");
 switch(operationcr){
 case 1 :
 double weight6 , price6 , prim6 , num6 ,len6, p_mat6, we6 ,num_need6;
 System.out.print("Enter Diameter For Coiled >> ");
 int n3 = sc.nextInt();
 weight6 = coiled(n3) * z;
 System.out.printf("Weight = %,.3f kg \n" ,weight6);
 System.out.println("*******************************");
 System.out.print("Enter Price For Kilo >> ");
 price6 = sc.nextDouble();
 prim6 = weight6 * price6;
 System.out.printf("Price For Meter = %,.3f pound \n", prim6);
 System.out.println("********************************");
 System.out.print("Enter Length OF Material >> ");
 len6 = sc.nextDouble();
 num6 = 967 / len6;
 System.out.printf("Number OF Pieces Material = %,.1f picec \n", num6);
 p_mat6 = prim6 / num6;
 System.out.printf("Casting Of Material = %,.2f pound \n", p_mat6);
      System.out.println("****************************************");
   System.out.print("Enter number of order >>> ");
     int iio = sc.nextInt();
     num_need6=weight6*(iio/num6);
     we6=iio/num6;
     System.out.printf("Number of meters = %,.1f m \n",we6);
     System.out.printf("We will order = %,.0f\n",num_need6);
 break;
 //end case 13
 case 2 :
 double weight4 , price4,we4 , prim4 , num4 ,len4, p_mat4,num_need4;
 System.out.print("Enter Diameter For Hexa >> ");
 int n2 = sc.nextInt();
 weight4 = hexa(n2) * z;
 System.out.printf("Weight = %,.3f kg \n" ,weight4);
 System.out.println("*******************************");
 System.out.print("Enter Price For Kilo >> ");
 price4 = sc.nextDouble();
 prim4 = weight4 * price4;
 System.out.printf("Price For Meter = %,.3f pound \n", prim4);
 System.out.println("********************************");
 System.out.print("Enter Length OF Material >> ");
 len4 = sc.nextDouble();
 num4 = 967 / len4;
 System.out.printf("Number OF Pieces Material = %,.1f piece \n", num4);
 p_mat4 = prim4 / num4;
 System.out.printf("Casting Of Material = %,.2f pound \n", p_mat4);
  System.out.println("****************************************");
   System.out.print("Enter number of order >>> ");
     int io = sc.nextInt();
     num_need4=weight4*(io/num4);
     we4=io/num4;
     System.out.printf("Number of meters = %,.1f \n",we4);
     System.out.printf("We will order = %,.0f\n",num_need4);
 break;
 case 3 :
 double weight5,price5 , prim5 , num5 ,we5,len5, p_mat5,num_need5;
 System.out.print("Enter Diameter For Square >> ");
 int n1 = sc.nextInt();
 weight5 = square(n1) * z;
 System.out.printf("Weight = %,.3f kg \n" ,weight5);
 System.out.println("*******************************");
 System.out.print("Enter Price For Kilo >> ");
 price5 = sc.nextDouble();
 prim5 = weight5 * price5;
 System.out.printf("Price For Meter = %,.3f pound \n", prim5);
 System.out.println("********************************");
 System.out.print("Enter Length OF Material >> ");
 len5 = sc.nextDouble();
 num5 = 967 / len5;
 System.out.printf("Number OF Pieces Material = %,.1f piece \n", num5);
 p_mat5 = prim5 / num5;
 System.out.printf("Casting Of Material = %,.2f pound \n", p_mat5);
   System.out.println("***************************************");
   System.out.print("Enter number of order >>> ");
     int po = sc.nextInt();
     num_need5=weight5*(po/num5);
     we5=po/num5;
     System.out.printf("Number of meters = %,.1f m \n",we5);
     System.out.printf("We will order = %,.0f kg \n",num_need5);
 break;
 }
 break; 
 default:
 System.err.println("Erorr");
 
 }////End_Main
 }
 /////start_method////////
 static double n1, n2, r, n4 = 0.001, n5;
 //this method for area hexa
 public static double hexa(double l) {
 n1 = 12;
 n2 = 0.5;
 r = l / 2;
 n5 = (r / Math.sqrt(3));
 double Hexa = (n1 * n2 * n4 * r * n5);
 return Hexa;
 }//end area method
 //this method for area square
 public static double square(double n1) {
 double square = ((n1 * n1) * n4);
 return square;
 }//end square method
 //this method for area hexa
 public static double coiled(double n2) {
 double pai = 3.14159;
 r = n2 / 2;
 double coiled = ((r * r) * pai * n4);
 return coiled;
 }///end_methods


}