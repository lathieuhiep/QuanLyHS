import com.techja.qlhs.HocSinh;
import com.techja.qlhs.HocSinhMgr;

public class Main {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("Thanh", 23, "Nam");
        HocSinh hs2 = new HocSinh("Tai", 25, "Nam");
        HocSinh hs3 = new HocSinh("Lan", 28, "Nu");
        HocSinh hs4 = new HocSinh("Duc", 21, "Nam");
        HocSinh hs5 = new HocSinh("Hung", 29, "Nam");

        HocSinhMgr hocSinhMgr = HocSinhMgr.getInstance();
        hocSinhMgr.themHS(hs1);
        hocSinhMgr.themHS(hs2);
        hocSinhMgr.themHS(hs3);
        hocSinhMgr.themHS(hs4);
        hocSinhMgr.themHS(hs5);

        hocSinhMgr.inHS();

        hocSinhMgr.sapXepHSTuoiTD();
        hocSinhMgr.timHSNhieuTuoiNhat();

        System.out.println();
        hs1.timKiemHSNu(hocSinhMgr);
    }
}