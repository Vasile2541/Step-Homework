import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private Integer salary;
    private Integer gen;
    private LocalDate date;

    public Employee(String name, Integer salary, Integer gen, LocalDate date) {
        this.name = name;
        this.salary = salary;
        this.gen = gen;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public  Integer getSalary() {
        return salary;
    }

    public Integer isGen() {
        return gen;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", salary=" + salary +
            ", gen=" + gen +
            ", date=" + date +
            '}';
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add( new Employee("Maria", 10000, 0, LocalDate.of(1992, 5, 17) ) );
        employeeList.add( new Employee("Dorina", 12000, 0, LocalDate.of(1990, 5, 17); );
        employeeList.add( new Employee("Marianaa", 13000, 0, LocalDate.of(1993, 5, 17); );

        employeeList.add( new Employee("Dumitru", 13000, 1, LocalDate.of(1990, 5, 17); );
        employeeList.add( new Employee("Alex", 13000, 1, LocalDate.of(1961, 5, 17); );
        employeeList.add( new Employee("Sam", 11000, 1, LocalDate.of(1999, 5, 17); ) );


        ClassicEmployeeFilter classic = new ClassicEmployeeFilter();

        classic.printIfoAbout(employeeList);
        classic.findWomenWithBirthdateAfter(employeeList, LocalDate.of(1990, 1, 1) );
        classic.printMaxSalaries(employeeList);
        classic.printUniqueSalaries(employeeList);


    }
}
