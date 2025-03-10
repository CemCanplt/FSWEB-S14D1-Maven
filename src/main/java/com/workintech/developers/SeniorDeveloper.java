import com.workintech.developers.Employee;

class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer starts to working");
        setSalary(getSalary() + 1500); // Example salary update
    }
}