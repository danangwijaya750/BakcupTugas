/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dngwjy.aplikasinilai;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author wijaya
 */
public class Chall1 {

    static ArrayList<Double> data = new ArrayList<>();

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String ans = "";
            while (!ans.equals("5")) {
                printMenu();
                ans = br.readLine();
                switch (ans) {
                    case "1":
                        inputData(br);
                        break;
                    case "2":
                        lihatData();
                        break;
                    case "3":
                        searchLowestData(br);
                        break;
                    case "4":
                        searchLargestData(br);
                        break;
                    case "5":
                        break;
                }
            }
        } catch (Exception ex) {

        }
    }

    static void inputData(BufferedReader br) {
        try {
            String loopInput = "y";
            while (loopInput.equals("y")) {
                System.out.print("Masukan Nilai? : ");
                data.add(Double.parseDouble(br.readLine()));
                System.out.print("masukan lagi? (y/n): ");
                loopInput = br.readLine();
            }
        } catch (Exception ex) {
        }
    }

    static void lihatData() {
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i) + " ");
        }
    }

    static void searchLargestData(BufferedReader br) {
        try {
            String loopInput = "y";
            while (loopInput.equals("y")) {
                System.out.print("Masukan peringkat : ");
                int peringkat = Integer.parseInt(br.readLine());
                ArrayList<Double> sorted = data;
                Collections.sort(sorted);
                System.out.println(sorted.get(peringkat - 1));
                System.out.print("cari lagi? (y/n): ");
                loopInput = br.readLine();
            }
        } catch (Exception ex) {
        }
    }

    static void searchLowestData(BufferedReader br) {
        try {
            String loopInput = "y";
            while (loopInput.equals("y")) {
                System.out.print("Masukan peringkat : ");
                int peringkat = Integer.parseInt(br.readLine());
                ArrayList<Double> sorted = data;
                Collections.sort(sorted, Collections.reverseOrder());
                System.out.println(sorted.get(peringkat - 1));
                System.out.print("cari lagi? (y/n): ");
                loopInput = br.readLine();
            }
        } catch (Exception ex) {
        }
    }

    static void printMenu() {
        System.out.println("Pilih menu :");
        System.out.println("1. Input Data :");
        System.out.println("2. Lihat Data:");
        System.out.println("3. Cari tertinggi:");
        System.out.println("4. Cari Terendah :");
        System.out.println("5. Keluar:");
        System.out.print("Masukan PIlihan :");
    }

}
