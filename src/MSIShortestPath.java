import java.util.ArrayList;
import java.util.List;

// Create a DFS function to find PATH from roots to workers (list or stack)
// Call it for both workers then compare paths from root to worker
// Last match is your goal

public class MSIShortestPath {
    // IMPORTANT: DO NOT MODIFY THIS CLASS
    public static class Employee {

        private final int id;
        private final String name;
        private List<Employee> reports;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
            this.reports = new ArrayList<Employee>();
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public List<Employee> getReports() {
            return reports;
        }

        public void addReport(Employee employee) {
            reports.add(employee);
        }
    }

    /*
     * Read the attached PDF for more explanation about the problem
     * Note: Don't modify the signature of this function
     * @param ceo
     *
     * @param firstEmployee
     *
     * @param secondEmployee
     *
     * @return the shortest path from First Employee to the Second Employee.
     */
    @SuppressWarnings("unused")
    public static String shortestPath(Employee ceo, Employee firstEmployee, Employee secondEmployee) {
        // Implement me
        return null;
    }

    public static void main(String[] args) {
        Employee Eugene = new Employee(1, "Eugene");
        Employee Jose = new Employee(2, "Jose");
        Employee Kelvin = new Employee(3, "Kelvin");
        Employee Terence = new Employee(4, "Terence");
        Employee Dennis = new Employee(5, "Dennis");
        Employee Eunice = new Employee(6, "Eunice");
        Employee Bryan = new Employee(7, "Bryan");
        Employee Gabriel = new Employee(8, "Gabriel");
        Employee Jimmy = new Employee(9,"Jimmy");

        Eugene.addReport(Jose);
        Eugene.addReport(Kelvin);
        Eugene.addReport(Terence);

        Jose.addReport(Dennis);
        Jose.addReport(Eunice);
        Jose.addReport(Bryan);

        Eunice.addReport(Gabriel);
        Eunice.addReport(Jimmy);

        //pls add other test cases to fully cover different scenarios.
        System.out.println(shortestPath(Eugene, Gabriel, Jimmy));
    }
}
