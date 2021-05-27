package lesson38.Ex5;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<RegisterJob> registerJobList = new ArrayList<>();

        //tạo đối tượng với Employee (Gồm các thuộc thính id, fullName)
        Employee employee1 = new Employee("P1", "Trần Đức Bo");
        Employee employee2 = new Employee("P2", "Nguyễn Văn Đức");
        Employee employee3 = new Employee("P3", "Nguyễn Văn An");


        //tạo đối tượng với Job  (gồm các thuộc tính id, nameJob)
        Job job1 = new Job("J1", "Dancer");
        Job job2 = new Job("J2", "Lái xe");
        Job job3 = new Job("J3", "Developer");


        //tạo đối tượng ghép cặp idEmp, fullName, idJob, jobName
        RegisterJob registerJob1 = new RegisterJob(employee1, job1, 24);
        RegisterJob registerJob2 = new RegisterJob(employee2, job2, 8);
        RegisterJob registerJob3 = new RegisterJob(employee3, job3, 24);


        //thêm mới vào List
        create(registerJobList, registerJob1);
        create(registerJobList, registerJob2);
        create(registerJobList, registerJob3);


        //hiển thị ra mà hình
        showResult(registerJobList);
    }

    private static void showResult(List<RegisterJob> registerJobList) {
        for (var item : registerJobList) {
            System.out.println(item);
        }
    }

    private static void create(List<RegisterJob> registerJobList, RegisterJob other) {
        if (!registerJobList.contains(other)) {
            registerJobList.add(other);
        } else {
            System.out.println("Đối tượng " + other + " đã tồn tại");
        }
    }
}