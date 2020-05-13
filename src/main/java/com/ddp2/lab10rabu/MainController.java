package com.ddp2.lab10rabu;

import com.ddp2.lab10rabu.model.Donatur;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

   @GetMapping("/")
   public String index(Model modelIndex) {
      modelIndex.addAttribute("namaKamu", "Zaky");
      return "index";
   }

   @GetMapping("/form-donasi")
   public String formDonasi(Model modelForm) {
      modelForm.addAttribute("donatur", new Donatur());
      return "form-donasi";
   }

   @PostMapping("/form-donasi")
   public String submitFormDonasi(@ModelAttribute Donatur donatur) {
      Donatur.addDonatur(donatur);
      return "hasil-form-donasi";
   }

   @GetMapping("/daftar-donatur")
   public String daftarDonatur(Model modelDaftar) {
      modelDaftar.addAttribute("daftarDonatur", Donatur.getDaftarDonatur());
      return "daftar-donatur";
   }

   @GetMapping("/total-donasi")
   public String totalDanaTerkumpul(Model modelTotal) {
      modelTotal.addAttribute("danaTerkumpul", Donatur.getTotalDana());
      modelTotal.addAttribute("totalDonatur", Donatur.getDaftarDonatur().size());
      return "total-donasi";
   }

}
