package oopconcept;

public class Execution {
    public static void main(String[] args) {
        Employee emp = new Employee();
        programmertest p = new programmertest();
        testing_team t = new testing_team();
        Arch a = new Arch();

        emp.getHolidays();
        p.programming();
        p.work();
        a.getSalary();

        Organize o = new Organize();
        o.meeting();


        emp.meeting();
        a.hireEmployee();
    }
}
