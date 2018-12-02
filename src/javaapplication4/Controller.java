/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Marijana
 */


public class Controller {
    
     public Model kreirajModel(double strA, double strB, double strC) 
                                          {
        Model model = new Model();
        
        model.setStrA(strA);
        model.setStrB(strB);
        model.setStrC(strC);
        return model;
    }
    public void izracunajPovrsinuTrokuta(Model model){
    
        double povrsina = model.getStrA()+model.getStrB()+model.getStrC();
        model.setStambenaPovrsina(povrsina);
}
      String ispisiPodatke(Model model) {
        String ispis = "Duljina stranice A je: "+model.getStrA()+"\n"+
            "Duljina stranice B je:"+model.getStrB()+"\n"+
            "Duljina stranice C je:"+model.getStrC()+"\n"+
            "Povrsinaje:"+model.getStambenaPovrsina();
        return ispis;
    }
}
