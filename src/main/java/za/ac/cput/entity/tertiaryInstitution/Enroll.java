package za.ac.cput.entity.tertiaryInstitution;
/**
 * Enroll.java
 * Entity for enroll using builder pattern
 * Author: Tisetso Kotoana
 * Date:01 June 2021
 */
import java.util.Date;
public class Enroll {
    private String studentID;
    private String courseCode;
    private Date date;
    private boolean paymentReceived;

    private Enroll(EnrollBuilder enroll) {
        this.studentID = enroll.studentID;
        this.courseCode = enroll.courseCode;
        this.date = enroll.date;
        this.paymentReceived = enroll.paymentReceived;
    }

    public String getStudentID() {
        return studentID;
    }
    @Override
    public String toString() {
        return "EnrollBuilder{" +
                "studentID=" + studentID +
                ", courseCode='" + courseCode + '\'' +
                ", date=" + date +
                ", paymentReceived=" + paymentReceived +
                '}';
    }

    public static class EnrollBuilder{
        private String studentID;
        private String courseCode;
        private Date date;
        private boolean paymentReceived;

        public EnrollBuilder setStudentID(String studentID) {
            this.studentID = studentID;
            return this;
        }

        public EnrollBuilder setCourseCode(String courseCode) {
            this.courseCode = courseCode;
            return this;
        }

        public EnrollBuilder setDate(Date date) {
            this.date = date;
            return this;
        }

        public EnrollBuilder setPaymentReceived(boolean paymentReceived) {
            this.paymentReceived = paymentReceived;
            return this;
        }
        public Enroll build(){

            return new Enroll(this);
        }
        public Enroll.EnrollBuilder copy(Enroll enroll){
            this.studentID=enroll.studentID;
           this.courseCode=enroll.courseCode;
           this.date=enroll.date;
           this.paymentReceived=enroll.paymentReceived;


            return this;
        }


    }
}
