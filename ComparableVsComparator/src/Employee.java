import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    Integer id;
    String name;

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return o.name.compareTo(this.name);
    }

    public static Comparator<Employee> nameComparator =new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return 0;
        }
    };
}
