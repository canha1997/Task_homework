package controller;

public class DuAnQuanLy implements iDuAn{
    Controller controller=new Controller();

    @Override
    public void nhapDuAn() {
        controller.nhapDuAn();
    }

    @Override
    public void hienThiDuAn() {
        controller.hienThiDuAn();
    }

    @Override
    public void chinhSuaDuAn() {
     controller.chinhSuaDuAn();
    }
}
