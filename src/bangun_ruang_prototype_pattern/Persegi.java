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
public class Persegi extends BangunRuang {

   public Persegi(){
     type = "Persegi";
   }

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
