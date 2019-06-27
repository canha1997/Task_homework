package controller;

import java.util.ArrayList;

public class NhanVienQuanly implements iNhanVien {
    Controller controller=new Controller();

    @Override
    public void nhapNhanVien() {
        controller.nhapNhanVien();
    }

    @Override
    public void hienthiNhanVienList() {
      controller.hienthiNhanVienList();
    }

    @Override
    public void themNhanVien() {
      controller.themNhanVien();
    }

    @Override
    public void xoaNhanVien() {
      controller.xoaNhanVien();
    }
}
