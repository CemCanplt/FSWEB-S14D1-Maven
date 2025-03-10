import com.workintech.developers.Employee;

class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer starts to working");
        setSalary(getSalary() + 500); // Example salary update
    }
}