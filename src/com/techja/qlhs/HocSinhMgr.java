package com.techja.qlhs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HocSinhMgr implements ITimKiem {
    private static final String GIOI_TINH_NU = "Nu";
    private ArrayList<HocSinh> listHS;
    private static HocSinhMgr instance;

    private HocSinhMgr() {
        listHS = new ArrayList<>();
    }

    public static HocSinhMgr getInstance() {
        if (instance == null) {
            instance = new HocSinhMgr();
        }

        return instance;
    }

    public void themHS(HocSinh hocSinh) {
        listHS.add(hocSinh);
    }

    public void inHS() {
        System.out.println("Danh sach hoc sinh");

        for (HocSinh hs : listHS) {
            System.out.println(hs);
        }
    }

    public void sapXepHSTuoiTD() {
        System.out.println("Sap xep hs tuoi tang dan");

        Collections.sort(listHS, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh hs1, HocSinh hs2) {
                return Integer.compare(hs1.getTuoi(), hs2.getTuoi());
            }
        });

        inHS();
    }

    public void timHSNhieuTuoiNhat() {
        if ( listHS.isEmpty() ) {
            System.out.println("Chưa có danh sách học sinh");

            return;
        }

        HocSinh hsNhieuTuoiNhat = listHS.getFirst();

        for (HocSinh hs : listHS) {
            if ( hs.getTuoi() > hsNhieuTuoiNhat.getTuoi() ) {
                hsNhieuTuoiNhat = hs;
            }
        }

        System.out.println("Hoc sinh nhieu tuoi nhat: " + hsNhieuTuoiNhat.toString());
    }

    @Override
    public List<HocSinh> timKiemDSHSNu() {
        List<HocSinh> dsKQ = new ArrayList<>();

        for (HocSinh hs : listHS) {
            if (hs.getGioiTinh().equals(GIOI_TINH_NU)) {
                dsKQ.add(hs);
            }
        }
        
        return dsKQ;
    }
}
