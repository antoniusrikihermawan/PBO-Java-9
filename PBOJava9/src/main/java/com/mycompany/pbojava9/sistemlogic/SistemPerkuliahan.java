/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbojava9.sistemlogic;

/**
 *
 * @author A-8
 */
public class SistemPerkuliahan {
    private Perkuliahan[] dataPerkuliahans;
    private Dosen[] dataDosens;
    private Mahasiswa[] dataMahasiswas;
    private Staff[] dataStafs;

    public SistemPerkuliahan() {
    }

    public SistemPerkuliahan(int maxPerkuliahan, int MaxDosen, Mahasiswa[] dataMahasiswas, Staff[] dataStaffs) {
        this.dataPerkuliahans = dataPerkuliahans;
        this.dataDosens = dataDosens;
        this.dataMahasiswas = dataMahasiswas;
        this.dataStafs = dataStaffs;
    }
    
    
    
        
}
