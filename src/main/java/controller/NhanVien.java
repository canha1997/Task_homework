package controller;

public class NhanVien implements iNhanVien {
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
