import com.workintech.developers.Employee;

class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10]; // Assuming a fixed size for simplicity
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
        setSalary(getSalary() + 1000); // Example salary update
    }

    public void addEmployee(JuniorDeveloper developer) {
        addEmployee(developer, juniorDevelopers);
    }

    public void addEmployee(MidDeveloper developer) {
        addEmployee(developer, midDevelopers);
    }

    public void addEmployee(SeniorDeveloper developer) {
        addEmployee(developer, seniorDevelopers);
    }

    private <T> void addEmployee(T developer, T[] developers) {
        for (int i = 0; i < developers.length; i++) {
            if (developers[i] == null) {
                developers[i] = developer;
                System.out.println(developer.getClass().getSimpleName() + " added at index " + i);
                return;
            }
        }
        System.out.println("No available slot to add " + developer.getClass().getSimpleName());
    }
}