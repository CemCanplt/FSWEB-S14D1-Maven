import com.workintech.developers.Employee;

class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Mid Developer starts to working");
        setSalary(getSalary() + 1000); // Example salary update
    }
}
