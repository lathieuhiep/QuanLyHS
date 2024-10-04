import com.techja.qlhs.HocSinh;
import com.techja.qlhs.HocSinhMgr;

public class Main {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh("Thanh", 23, "Nam");
        HocSinh hs2 = new HocSinh("Tai", 25, "Nam");
        HocSinh hs3 = new HocSinh("Lan", 28, "Nu");
        HocSinh hs4 = new HocSinh("Duc", 21, "Nam");
        HocSinh hs5 = new HocSinh("Hung", 29, "Nam");

        HocSinhMgr.getInstance().themHS(hs1);
        HocSinhMgr.getInstance().themHS(hs2);
        HocSinhMgr.getInstance().themHS(hs3);
        HocSinhMgr.getInstance().themHS(hs4);
        HocSinhMgr.getInstance().themHS(hs5);

        HocSinhMgr.getInstance().inHS();

        HocSinhMgr.getInstance().sapXepHSTuoiTD();
        HocSinhMgr.getInstance().timHSNhieuTuoiNhat();

        hs1.timKiemHSNu(HocSinhMgr.getInstance());
    }
}