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
public class Sanpham implements Serializable{
    
    private int ma;
    private String ten,loai;
    private double gia;
    private int soluong;
    public static int sma=1000;

    public Sanpham() {
    }

    public Sanpham( String ten, String loai, double gia) {
        this.ma = sma++;
        this.ten = ten;
        this.loai = loai;
        this.gia = gia;
        this.soluong = soluong;
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sanpham.sma = sma;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public Object[] toObjects(){
        return new Object[]{
          ma,ten,loai,gia  
        };
    }
    
    
}
