package model;

public class Task {
    private String IDtask;
    private String taskTitle;
    private String tinhTrangTask;
    private String status;
    private String taskNhanVien;
    private String taskDuAn;

    public String getIDtask() {
        return IDtask;
    }

    public void setIDtask(String IDtask) {
        this.IDtask = IDtask;
    }

    public String getTinhTrangTask() {
        return tinhTrangTask;
    }

    public void setTinhTrangTask(String tinhTrangTask) {
        this.tinhTrangTask = tinhTrangTask;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaskNhanVien() {
        return taskNhanVien;
    }

    public void setTaskNhanVien(String taskNhanVien) {
        this.taskNhanVien = taskNhanVien;
    }

    public String getTaskDuAn() {
        return taskDuAn;
    }

    public void setTaskDuAn(String taskDuAn) {
        this.taskDuAn = taskDuAn;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }
}
