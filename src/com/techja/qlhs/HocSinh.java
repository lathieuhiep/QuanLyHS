package com.techja.qlhs;

import java.util.List;

public class HocSinh {
    private String ten;
    private int tuoi;
    private String gioiTinh;

    public HocSinh(String ten, int tuoi , String gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public String toString() {
        return ten + ":" + tuoi + ":" + gioiTinh;
    }

    public void timKiemHSNu(ITimKiem tk) {
        List<HocSinh> dskq = tk.timKiemDSHSNu();

        System.out.println("DS HS nữ: " + dskq);
    }
}
