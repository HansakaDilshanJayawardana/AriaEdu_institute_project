package util;

public class QueryAttendance {

    public static final String ADD_ATTENDANCE_MARKER ="INSERT INTO attendancemarker(fname,lname,dob,nic,address,gender,phone,email,teacher) values(?,?,?,?,?,?,?,?,?)";
    public static final String ADD_ATTEND_SUBJECT ="INSERT INTO attendsubject(fname,lname,subject) values(?,?,?)";
    public static final String SEE_ATTEND_MARKERS ="SELECT * FROM attendancemarker";
    public static final String SEE_STUDENT="SELECT * FROM studentdetails";
    public static final String FIND_STUDENT="SELECT * FROM studentdetails where";
    public static final String ADD_ATT ="INSERT INTO attendance(sid,status) values(?,?) ";
    public static final String SEE_ATT="select  * from studentdetails where id in(select sid from attendance )";
}
