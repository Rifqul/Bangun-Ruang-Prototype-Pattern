/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun_ruang_prototype_pattern;

/**
 *
 * @author ammar
 */
public class Bangun_Ruang_Prototype_Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      BangunRuangCache.loadCache();
      
      BangunRuang clonedBangunRuang = (BangunRuang) BangunRuangCache.getBangunRuang("1");
      System.out.println("BangunRuang : " + clonedBangunRuang.getType());		

      BangunRuang clonedBangunRuang2 = (BangunRuang) BangunRuangCache.getBangunRuang("2");
      System.out.println("BangunRuang : " + clonedBangunRuang2.getType());		

      BangunRuang clonedBangunRuang3 = (BangunRuang) BangunRuangCache.getBangunRuang("3");
      System.out.println("BangunRuang : " + clonedBangunRuang3.getType());
    }
    
}
