package com.ddp2.lab10rabu.model;

import java.util.ArrayList;

public class Donatur {
   private static ArrayList<Donatur> daftarDonatur = new ArrayList<Donatur>();
   private String nama;
   private int jumlahDonasi;
   private String asalDaerah;

   public String getNama() {
      return this.nama;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   public int getJumlahDonasi() {
      return jumlahDonasi;
   }

   public void setJumlahDonasi(int jumlahDonasi) {
      this.jumlahDonasi = jumlahDonasi;
   }

   public String getAsalDaerah() {
      return asalDaerah;
   }

   public void setAsalDaerah(String asalDaerah) {
      this.asalDaerah = asalDaerah;
   }

   public static ArrayList<Donatur> getDaftarDonatur() {
      return daftarDonatur;
   }

   // fungsi untuk menambahkan donatur baru ke dalam daftar donatur
   public static void addDonatur(Donatur donatur) {
      daftarDonatur.add(donatur);
   }

   public static int getTotalDana() {
      int totalDana = 0;
      for (Donatur donatur : daftarDonatur) {
         totalDana += donatur.getJumlahDonasi();
      }
      return totalDana;
   }

   public static int getTotalDonatur() {
      return daftarDonatur.size();
   }


}
