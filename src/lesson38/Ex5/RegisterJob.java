package lesson38.Ex5;

public class RegisterJob<emp, job> {
    private emp employee;
    private job work;
    private float workTime;

    public RegisterJob(emp employee, job work, float workTime) {
        this.employee = employee;
        this.work = work;
        this.workTime = workTime;
    }

    public final emp getEmployee() {
        return employee;
    }

    public final void setEmployee(emp employee) {
        this.employee = employee;
    }

    public final job getWork() {
        return work;
    }

    public final void setWork(job work) {
        this.work = work;
    }

    public final float getWorkTime() {
        return workTime;
    }

    public final void setWorkTime(float workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "RegisterJob{" +
                "employee=" + employee +
                ", work=" + work +
                ", workTime=" + workTime +
                '}';
    }
}
