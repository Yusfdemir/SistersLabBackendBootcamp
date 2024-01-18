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
     static int fibo(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
    
    static int faktorizasyon(int num){
        int z,result=1;
        for(z=1;z<=num;z++){
            result*=z;
        }
        
        return result;
    }
    static double permutation(int num1, int num2){
        int x,y;
        double result;
        if(num1>num2){
            x=num1;
            y=num2;
        }else{
            x=num2;
            y=num1;
        }
        result=faktorizasyon(x)/faktorizasyon(x-y);
        return result;
    }
    
    public static boolean isPrime(int num, int divider){
        if (num < 2) { // 2'den kücük sayılar asal değil.
            return false;
        }
        if (num == 2){ // 2 asal bir sayıdır.
            return true;
        }
        if (num % divider == 0) { // Eğer sayı bölündüyse asal değildir.
            return false;
        }
        if (divider * divider > num){ // Sayının karekokunden büyük sayılara bölünmezse asaldır.
            return true;
        }
        return isPrime(num, divider +1); //Böleni arttırarak fonksiyonu tekrar çağırır.
    }
    // SORU 5
    
    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
    
    static void mod(){
        Scanner scan =new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz :");
        int num1=scan.nextInt();
        System.out.print("Kaça göre modu alınacak giriniz :");
        int num2=scan.nextInt();
        
        System.out.println(num1+" % "+num2+" = "+num1%num2);
    }
    
    static void area(){
        Scanner scan =new Scanner(System.in);
        System.out.print("Dikdörtgenin genişliğini girin :");
        int width=scan.nextInt();
        System.out.print("Dikdörtgenin uzunluğunu girin :");
        int height=scan.nextInt();
        
        System.out.println("Dikdörtgenin alanı = "+width*height);
    }
    public static void main(String[] args) {
        //Describe Scanner object
        Scanner input =new Scanner(System.in);
        
        /*
        // Soru 1
        int number;
        System.out.print("Sayı Girin:");
        number = input.nextInt();
        System.out.println(fibo(number));
        */
        
        /*
        // Soru 2:
        System.out.println(isPalindrome("kavak"));
        */
        
        /*
        //Soru 3
        int number1,number2;
        System.out.print("1.sayıyı Girin:");
        number1 = input.nextInt();
        System.out.print("2.sayıyı Girin:");
        number2 = input.nextInt();
        System.out.print(number1+"'in "+number2+"'li permütasyonu : "+permutation(number1,number2));
        */
        
        /*
        // Soru 4
        System.out.print("Bir sayı girin: ");
        int num = input.nextInt();
        if (isPrime(num,2)){
            System.out.println(num + " asal bir sayıdır.");
        } else {
            System.out.println(num + " asal bir sayı değildir.");
        }
        */
        /*
        //Soru 5
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    area();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
        */
        
        /*
        //Soru 6
        int n1,n2,ebob=1,ekok=1,i=1;
        System.out.print("İlk sayıyı girin : ");
        n1=input.nextInt();
        System.out.print("\nİkinci sayıyı girin : ");
        n2=input.nextInt();
        
        if(n1<n2){
            while(i<=n1){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                }
                i++;  
            }
        }
        ekok=(n1*n2)/ebob;
        if(ebob==1){
            ekok=n1;
        }
        System.out.println("Ebob: "+ebob+" Ekok: "+ekok);
        */
        /*
        //Soru 7
         int basamak_sayisi = 0, rakam;
		int toplam = 0;
		
		System.out.print("Bir sayi giriniz: ");
		int sayi = input.nextInt();
		int gecici = sayi;
		int gecici2 = sayi;
		
		while(gecici > 0) {
			gecici /= 10;
			basamak_sayisi++;
		}
		while(sayi > 0) {
			rakam = sayi % 10;
			toplam += Math.pow(rakam, basamak_sayisi);
			sayi /= 10;
		}
		if(toplam == gecici2) {
			System.out.println(gecici2 + " sayisi armstrong bir sayidir.");
		}
		else {
			System.out.println(gecici2 + " sayisi armstrong bir sayi degildir.");
		}
        */    
       
    }
    
}
