import java.time.LocalDate;
import java.util.List;

public interface EmployeeFilter {

    void printMaxSalaries(List<Employee> employeeList);
    void findWomenWithBirthdateAfter(List<Employee> employeeList, LocalDate date);
    void printIfoAbout(List<Employee> employeeList);
    void printSalariesAsc(List<Employee> employeeList);
    void printUniqueSalaries(List<Employee> employeeList);

}
