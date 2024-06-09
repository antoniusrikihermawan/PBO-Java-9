/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbojava9;

/**
 */
import com.mycompany.pbojava9.sistemlogic.SistemPerkuliahan;
import com.mycompany.pbojava9.ui.textUI;
import java.util.Scanner;

public class main {

   // private static DataManager dataManager;
    

    public static void main(String[] args) {
        // Create DataManager instance (specify array sizes)
        //dataManager = new DataManager(100, 50, 20, 200);
        SistemPerkuliahan pbojava9 = new SistemPerkuliahan();
        textUI ui = new textUI();
        ui.run();
    }
}