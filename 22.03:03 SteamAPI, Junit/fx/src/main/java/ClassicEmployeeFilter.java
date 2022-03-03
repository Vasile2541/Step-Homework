import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassicEmployeeFilter implements EmployeeFilter {
    @Override
    public void printMaxSalaries(List<Employee> employeeList) {
        int x=0;
        for( Employee emp : employeeList){

        }
    }

    @Override
    public void findWomenWithBirthdateAfter(List<Employee> employeeList, LocalDate date) {

    }

    @Override
    public void printIfoAbout(List<Employee> employeeList) {
        for( Employee emp : employeeList){
            System.out.println( emp );
        }
    }

    @Override
    public void printSalariesAsc(List<Employee> employeeList) {
    s
    }

    @Override
    public void printUniqueSalaries(List<Employee> employeeList) {

    }
}
