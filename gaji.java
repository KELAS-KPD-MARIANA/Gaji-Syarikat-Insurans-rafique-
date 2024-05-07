package gaji_jualan_insurans;
import java.util.Scanner;
public class gaji {
     public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
         
         int pelanggan;
         double bonus;
         double gaji_asas = 1100.00;
         double jumlah_gaji;
         
     System.out.print("Masukkan bilangan pelanggan = ");
     pelanggan = input.nextInt();
         
          if(pelanggan >=40)
       {
         bonus = 10000.00; 
       }
          else if(pelanggan >= 30 && pelanggan <= 39 )
       {
         bonus = 8000.00; 
       }
          else if(pelanggan >= 20 && pelanggan <= 29 )
       {
         bonus = 6000.00; 
       }
        else if(pelanggan >= 10 && pelanggan <= 19 )
       {
         bonus = 4000.00; 
       }
         else if(pelanggan >= 1 && pelanggan <= 9 )
       {
         bonus = 6000.00; 
       }
           else 
       {
           
         bonus = 0.00; 
       }
          
          jumlah_gaji = bonus + gaji_asas;
          
          
        System.out.println("Bilangan pelanggan adalah =" + pelanggan);
        System.out.println("Jumlah gaji : RM" + jumlah_gaji);
        
}}
    

