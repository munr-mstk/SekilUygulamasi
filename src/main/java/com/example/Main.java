package com.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secim;
        char sembol = '*';

        komutlar();

        while (true) {
            System.out.print("Bir seçenek girin (1-9): ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    test();
                    break;
                case 2:
                    cizKucukKare(sembol);
                    break;
                case 3:
                    istediginKare(scanner, sembol);
                    break;
                case 4:
                    cizDikdortgen(scanner, sembol);
                    break;
                case 5:
                    cizUcgen(scanner, sembol);
                    break;
                case 6:
                    cizDaire(scanner, sembol);
                    break;
                case 7:
                    cizYildiz(scanner, sembol);
                    break;
                case 8:
                    sembolDegistir(scanner);
                    sembol = scanner.nextLine().charAt(0); // Yeni sembolü al
                    break;
                case 9:
                    System.out.println("Uygulama kapatiliyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Yanlis secim yaptın. Lutfen tekrar deneyin.");
            }
        }
    }

    private static void komutlar() {
        System.out.println();
        System.out.println("Konsol Uygulamasi Komutlari:");
        System.out.println(); // Boş
        System.out.println("1. 'test': Programin calisip calismadigini kontrol eder.");
        System.out.println("2. 'kare': Ekrana 3x3 kare oluşturur.");
        System.out.println("3. 'istedigin kare': İstediğin buyuklukte kare oluşturur.");
        System.out.println("4. 'dikdortgen': Ekrana istediğin boyutta dikdörtgen oluşturur.");
        System.out.println("5. 'ucgen': Ekrana bir üçgen çizer.");
        System.out.println("6. 'daire': Ekrana bir daire çizer.");
        System.out.println("7. 'yıldız': Ekrana bir yıldız çizer.");
        System.out.println("8. 'sembol değiştir': Çizim için kullanılan sembolü değiştir.");
        System.out.println("9. 'kapat': Uygulamayi kapatir.");
    }

    private static void test() {
        System.out.println("_-_-_-_-_-_");
    }

    private static void cizKucukKare(char sembol) {
        System.out.println("3x3 Kare:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sembol + " ");
            }
            System.out.println();
        }
    }

    private static void istediginKare(Scanner tarayici, char sembol) {
        System.out.print("Kare buyuklugunu girin: ");
        int boyut = tarayici.nextInt();
        tarayici.nextLine();

        System.out.println(boyut + "x" + boyut + " Kare:");
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print(sembol + " ");
            }
            System.out.println();
        }
    }

    private static void cizDikdortgen(Scanner tarayici, char sembol) {
        System.out.print("Dikdörtgenin genişliğini girin: ");
        int genislik = tarayici.nextInt();
        System.out.print("Dikdörtgenin yüksekliğini girin: ");
        int yukseklik = tarayici.nextInt();
        tarayici.nextLine();

        System.out.println(genislik + "x" + yukseklik + " Dikdörtgen:");
        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < genislik; j++) {
                System.out.print(sembol + " ");
            }
            System.out.println();
        }
    }

    private static void cizUcgen(Scanner tarayici, char sembol) {
        System.out.print("Üçgenin yüksekliğini girin: ");
        int yukseklik = tarayici.nextInt();
        tarayici.nextLine();

        System.out.println("Üçgen:");
        for (int i = 1; i <= yukseklik; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sembol + " ");
            }
            System.out.println();
        }
    }

    private static void cizDaire(Scanner tarayici, char sembol) {
        System.out.print("Dairenin çapını girin: ");
        int cap = tarayici.nextInt();
        tarayici.nextLine();

        System.out.println(cap + " çapında Daire:");
        double r = cap / 2.0;
        for (int i = 0; i <= cap; i++) {
            for (int j = 0; j <= cap; j++) {

                double distance = Math.sqrt(Math.pow(i - r, 2) + Math.pow(j - r, 2));
                if (distance > r - 0.5 && distance < r + 0.5) {
                    System.out.print(sembol + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void cizYildiz(Scanner tarayici, char sembol) {
        System.out.print("Yıldızın boyutunu girin: ");
        int boyut = tarayici.nextInt();
        tarayici.nextLine();

        System.out.println(boyut + " boyutunda Yıldız:");
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                if (i == j || i + j == boyut - 1) {
                    System.out.print(sembol + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void sembolDegistir(Scanner scanner) {
        System.out.print("Yeni sembolü girin: ");
        char yeniSembol = scanner.nextLine().charAt(0);
        System.out.println("Sembol değiştirildi: " + yeniSembol);



    }
}