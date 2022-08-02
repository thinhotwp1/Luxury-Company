/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author onthi
 */
public class QLNV extends Nhanvien{
    private double hoahong,tongthunhap;

    public QLNV() {
    }

    public QLNV(double hoahong, double tongthunhap) {
        this.hoahong = hoahong;
        this.tongthunhap = tongthunhap;
    }

    public double getHoahong() {
        return hoahong;
    }

    public void setHoahong(double hoahong) {
        this.hoahong = hoahong;
    }

    public double getTongthunhap() {
        return tongthunhap;
    }

    public void setTongthunhap(double tongthunhap) {
        this.tongthunhap = tongthunhap;
    }
    
}
