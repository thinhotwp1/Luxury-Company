/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author onthi
 */
public class Nhanvien implements Serializable{
    
    private int ma;
    private String ten,chucvu;
    private double luong;
    public static int sma=1000;

    public Nhanvien() {
    }

    public Nhanvien(String ten, String chucvu, double luong) {
        this.ma = sma++;
        this.ten = ten;
        this.chucvu = chucvu;
        this.luong = luong;
    }
    
    public Nhanvien(int ma,String ten, String chucvu, double luong) {
        this.ma = ma;
        this.ten = ten;
        this.chucvu = chucvu;
        this.luong = luong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Nhanvien.sma = sma;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            ma,ten,chucvu,luong
        };
    }
    
    
}
