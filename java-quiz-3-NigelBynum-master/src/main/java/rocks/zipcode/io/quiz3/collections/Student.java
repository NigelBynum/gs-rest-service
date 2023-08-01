package rocks.zipcode.io.quiz3.collections;

import java.util.List;
import java.util.TreeMap;
import java.util.Map;
/**
 * @author leon on 10/12/2018.
 */
public class Student {
    Map<Lab, LabStatus> labMap;
    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
    }

    public Lab getLab(String labName) {
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
    }

    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        return null;
    }
}
