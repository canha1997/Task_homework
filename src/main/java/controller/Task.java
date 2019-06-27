package controller;

public class Task implements iTask {
    Controller controller=new Controller();
    @Override
    public void nhapTask() {
        controller.nhapTask();
    }

    @Override
    public void hienThiTask() {

    }
}
