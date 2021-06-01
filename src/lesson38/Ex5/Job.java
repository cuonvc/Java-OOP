package lesson38.Ex5;

public class Job {
    private String jobId;
    private String jobName;
    private String describe;

    public Job() {
    }

    public Job(String jobId, String jobName) {
        this.jobId = jobId;
        this.jobName = jobName;
    }

    public final String getJobId() {
        return jobId;
    }

    public final void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public final String getJobName() {
        return jobName;
    }

    public final void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public final String getDescribe() {
        return describe;
    }

    public final void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobId='" + jobId + '\'' +
                ", jobName='" + jobName + '\'' +
                '}';
    }
}
