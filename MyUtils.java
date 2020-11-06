/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MyUtils {
  static float ucgenCevre(float a,float b,float c){
      return a+b+c;
  }
  static float ucgenAlan(float a,float b){
      return a*b/2;
  }
  static float cokgenCevre(){
      float toplam =0;
      Scanner giris = new Scanner(System.in);
      System.out.print("lutfen cokgeninizin kac kenarı oldugunu yazınız:");
      int KenarSayisi =giris.nextInt();
      for(int i=1;i<KenarSayisi+1;i++){
      System.out.print( i +".kenarı giriniz:");
      float kUzunlugu =giris.nextInt();
      toplam += kUzunlugu;
      }
      return toplam; 
}
  static float cokgenAlan(float a,float b){
     //formül= cokgenin cevresi/2*apotem 
     
      return a/2*b;
  }
 
     
    public static void main(String[] args) {
        
        System.out.println(ucgenCevre(5,5,5));
        System.out.println(ucgenAlan(5,2));
        System.out.println(cokgenCevre());
        System.out.println(cokgenAlan(10,3));
   
    }
    
}
