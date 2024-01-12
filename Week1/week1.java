/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sisterslab;

import java.util.Scanner;

/**
 *
 * @author yusuf
 */
public class SistersLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double price,priceWithKDV;
            //Describe Scanner object
            Scanner input =new Scanner(System.in);
            //Take the notes for each lesson
            
            /*
            Soru 1 ve 2 için ortak
            System.out.print("Fiyatı Giriniz : ");
            price=input.nextInt();
            */
            
            /* 
            // Soru 1
            priceWithKDV=price+(price*0.3);
            System.out.println("Girilen Fiyat: " +price+"\nKDV: "+(price*0.3)+"\nKDV'li Fiyat: "+priceWithKDV);
            */
            
            /*
            // Soru 2
            double kdv=0;
            if(price>= 1000){
                kdv=price*0.22;   
            }
            else{
                kdv=price*0.10;
            }
            priceWithKDV=price+kdv;
            System.out.println("Girilen Fiyat: " +price+"\nKDV: "+kdv+"\nKDV'li Fiyat: "+priceWithKDV);
            */
            
            
            
        /*  
        // Soru 3
        int not;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("Notunuzu girin: ");
        not = inp. nextInt();

        if(not>=0&&not<=49){
            System.out.println("Harf Notunuz FF");
        }
        else if(not>=50&&not<=59){
            System.out.println("Harf Notunuz CC");
        }
        else if(not>=60&&not<=69){
            System.out.println("Harf Notunuz CB");
        }
        else if(not>=70&&not<=79){
            System.out.println("Harf Notunuz BB");
        }
        else if(not>=80&&not<=89){
            System.out.println("Harf Notunuz BA");
        }
        else if(not>=90&&not<=100){
            System.out.println("Harf Notunuz AA");
        }
        else{
            System.out.println("Geçersiz Not Girdiniz");
        }
        */ 
          
        /*
        //Soru 4
        int n1,n2,select;
        //Take the height and weight
        System.out.print("Birinci sayıyı girin : ");
        n1=input.nextInt();
        System.out.print("\nİkinci sayıyı girin : ");
        n2=input.nextInt();
        System.out.print("\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nYapmak istediğiniz işlemin rakamını seçiminiz: ");
        select=input.nextInt();
        //Calculate 
        
        if(select == 1){
            System.out.println("Toplama : "+(n1+n2));
        }
        else if(select == 2){
            System.out.println("Çıkarma : "+(n1-n2));
        }
        else if(select == 3){
            System.out.println("Çarpma : "+(n1*n2));
        }
        else if(select == 4){
            System.out.println("bölme : "+(n1/n2));
        }
        */
        /*
        // Soru 5
        int num;
        System.out.println("Bir sayı girin : ");
        num=input.nextInt();
        
        if(num%2 == 0){
            System.out.println(num +" sayısı çift sayıdır");
        }
        else{
            System.out.println(num +" sayısı tek sayıdır");
        }
        */
        
        
        /*
        // Soru 6
        int n1,n2,n3,first,second,third;
        System.out.print("1. sayıyı girin: ");
        n1 = input. nextInt();
        System.out.print("2. sayıyı girin: ");
        n2 = input. nextInt();
        System.out.print("3. sayıyı girin: ");
        n3 = input. nextInt();
 
        if(n1<n2&&n1<n3){
            first=n1;
            if(n2<n3){
                second=n2;
                third=n3;
            }else{
                second=n3;
                third=n2;
            }
        }
        else if(n2<n1&&n2<n3){
            first=n2;
            if(n1<n3){
                second=n1;
                third=n3;
            }else{
                second=n3;
                third=n1;
            }
        }
        else{
            first=n3;
            if(n1<n2){
                second=n1;
                third=n2;
            }else{
                second=n2;
                third=n1;
            }
        }        
        System.out.println("Küçükten büyüğe sıralama: "+first+"<"+second+"<"+third);
        */
        /*
        // Soru 7
        int num;
        System.out.print("Kodu Girin (1-4) : ");
        num=input.nextInt();
        switch(num){
            case 1:
                System.out.println("Güneşli");
                break;
            case 2:
                System.out.println("Yağmurlu");
                break;
            case 3:
                System.out.println("Güneşli Bulutlu");
                break;
            case 4:
                System.out.println("Rüzgarlı");
                break;
            default:
                System.out.println("Bu kod Hatalı");
                break;
        }
        */
        /*
        // Soru 8
        int n1,n2,select;
        System.out.print("Birinci sayıyı girin : ");
        n1=input.nextInt();
        System.out.print("\nİkinci sayıyı girin : ");
        n2=input.nextInt();
        System.out.print("\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nYapmak istediğiniz işlemin rakamını seçiminiz: ");
        select=input.nextInt();
        //Calculate 
        switch(select){
            case 1:
                System.out.println("Toplama : "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma : "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma : "+(n1*n2));
                break;
            case 4:
                System.out.println("bölme : "+(n1/n2));
                break;
        }
        */
        /*
        //Soru 9
        int secim,height,width;
        System.out.println("\n1-Dikdörtgen\n2-Kare\n3-Üçgen\nAlanını hesaplamak istediğiniz geometrik şekli seçiniz :");
        secim=input.nextInt();
        System.out.println("\nYüksekliği giriniz :");
        height=input.nextInt();
        System.out.println("\nGenişliği giriniz :");
        width=input.nextInt();
        
        switch(secim){
            case 1,2:
                System.out.println("Alan : "+(height*width));
                break;
            case 3:
                System.out.println("Çarpma : "+(height*width)/2);
                break;
        }
        */
    }
    
}
