import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] empArr = new Employee[5];

        empArr[0] = new Employee(1,"ankit");
        empArr[1] = new Employee(2,"bnkit");
        empArr[2] = new Employee(3,"cnkit");
        empArr[3] = new Employee(4,"dnkit");
        empArr[4] = new Employee(5,"enkit");

        // Testing Comparable
        // Arrays.sort(empArr);

        // Testing Comparator
        // Arrays.sort(empArr, Employee.nameComparator);
        Arrays.sort(empArr, new EmployeeNameComparatorTest());
        System.out.println(Arrays.toString(empArr));
    }
}