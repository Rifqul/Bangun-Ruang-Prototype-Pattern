/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun_ruang_prototype_pattern;

import java.util.Hashtable;

/**
 *
 * @author ammar
 */
public class BangunRuangCache {
	
   public static Hashtable<String, BangunRuang> bangunruangMap  = new Hashtable<String, BangunRuang>();

   public static BangunRuang getBangunRuang(String bangunruangId) {
      BangunRuang cachedBangunRuang = bangunruangMap.get(bangunruangId);
      return (BangunRuang) cachedBangunRuang.clone();
   }

   // for each bangunruang run database query and create bangunruang
   // bangunruangMap.put(bangunruangKey, bangunruang);
   // for example, we are adding three bangunruangs
   
   public static void loadCache() {
      Lingkaran lingkaran = new Lingkaran();
      lingkaran.setId("1");
      bangunruangMap.put(lingkaran.getId(),lingkaran);

      Persegi persegi = new Persegi();
      persegi.setId("2");
      bangunruangMap.put(persegi.getId(),persegi);

      PersegiPanjang persegipanjang = new PersegiPanjang();
      persegipanjang.setId("3");
      bangunruangMap.put(persegipanjang.getId(), persegipanjang);
   }
}