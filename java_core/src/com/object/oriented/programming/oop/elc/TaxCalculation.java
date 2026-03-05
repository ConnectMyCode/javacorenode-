package com.object.oriented.programming.oop.elc;
import java.util.Scanner;

public class TaxCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {

            case 1:
                {
                    int employeeId = Integer.parseInt(sc.nextLine());
                    String empName = sc.nextLine();
                    double basicSalary = Double.parseDouble(sc.nextLine());
                    double HRAPer = Double.parseDouble(sc.nextLine());
                    double DAPer = Double.parseDouble(sc.nextLine());

                    Employee emp01 = new Employee(employeeId, empName, basicSalary, HRAPer, DAPer);
                    TaxUtil tax = new TaxUtil();
                    double employeTax = tax.calculateTax(emp01);

                    System.out.println("Gross Salary : " + emp01.getGrossSalary());
                    System.out.println("Tax : " + employeTax);
                }
                break;

            case 2:
                {
                    int trainerId = Integer.parseInt(sc.nextLine());
                    String trainerName = sc.nextLine();
                    double basicSalary = Double.parseDouble(sc.nextLine());
                    double HRAPer = Double.parseDouble(sc.nextLine());
                    double DAPer = Double.parseDouble(sc.nextLine());
                    int batchCount = Integer.parseInt(sc.nextLine());

                    Trainer trainer01 = new Trainer(trainerId, trainerName, basicSalary, HRAPer, DAPer, batchCount);
                    TaxUtil tax = new TaxUtil();
                    double trainerTax = tax.calculateTax(trainer01);

                    System.out.println("Gross Salary : " + trainer01.getGrossSalary());
                    System.out.println("Tax : " + trainerTax);
                }
                break;

            case 3:
                {
                    int managerId = Integer.parseInt(sc.nextLine());
                    String managerName = sc.nextLine();
                    double salary = Double.parseDouble(sc.nextLine());
                    double HRAPer = Double.parseDouble(sc.nextLine());
                    double DAPer = Double.parseDouble(sc.nextLine());
                    double projectAllowance = Double.parseDouble(sc.nextLine());

                    Manager manage01 = new Manager(managerId, managerName, salary, HRAPer, DAPer, projectAllowance);
                    TaxUtil tax = new TaxUtil();
                    double managerTax = tax.calculateTax(manage01);

                    System.out.println("Gross Salary : " + manage01.getGrossSalary());
                    System.out.println("Tax : " + managerTax);
                }
                break;

            case 4:
                {
                    int sourceId = Integer.parseInt(sc.nextLine());
                    String sourceName = sc.nextLine();
                    double basicSalary = Double.parseDouble(sc.nextLine());
                    double HRAPer = Double.parseDouble(sc.nextLine());
                    double DAPer = Double.parseDouble(sc.nextLine());
                    int enrollementTarget = Integer.parseInt(sc.nextLine());
                    int enrollementReached = Integer.parseInt(sc.nextLine());
                    double perkPerEnrollement = Double.parseDouble(sc.nextLine());

                    Source source01 = new Source(sourceId, sourceName, basicSalary, HRAPer, DAPer,
                            enrollementTarget, enrollementReached, perkPerEnrollement);

                    TaxUtil tax = new TaxUtil();
                    double sourceTax = tax.calculateTax(source01);

                    System.out.println("Gross Salary : " + source01.getGrossSalary());
                    System.out.println("Tax : " + sourceTax);
                }
                break;

            default:
                break;
        }

        sc.close();
    }
}

class Employee {
    private int employeeId;
    private String empName;
    private double basicSalary;
    private double HRAPer;
    private double DAPer;

    Employee(int employeeId, String empName, double basicSalary, double HRAPer, double DAPer) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
    }

    public double calculateGrossSalary() {
        double grossSalary = basicSalary + HRAPer + DAPer;
        return grossSalary;
    }

    public double getGrossSalary() {
        return calculateGrossSalary();
    }
}

class Trainer {
    private int trainerId;
    private String trainerName;
    private double basicSalary;
    private double HRAPer;
    private double DAPer;
    private int batchCount;
    private static double perkPerBatch = 9000;

    Trainer(int trainerId, String trainerName, double basicSalary, double HRAPer, double DAPer, int batchCount) {
        this.trainerId = trainerId;
        this.trainerName = trainerName;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.batchCount = batchCount;
    }

    public double calculateGrosSalary() {
        double grossSalary = basicSalary + HRAPer + DAPer + (batchCount * perkPerBatch);
        return grossSalary;
    }

    public double getGrossSalary() {
        return calculateGrosSalary();
    }
}

class Manager {
    private int managerId;
    private String managerName;
    private double salary;
    private double HRAPer;
    private double DAPer;
    private double projectAllowance;

    Manager(int managerId, String managerName, double salary, double HRAPer, double DAPer, double projectAllowance) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.salary = salary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.projectAllowance = projectAllowance;
    }

    public double calculateGrosSalary() {
        double grossSalary = salary + HRAPer + DAPer + projectAllowance;
        return grossSalary;
    }

    public double getGrossSalary() {
        return calculateGrosSalary();
    }
}

class Source {
    private int sourceId;
    private String sourceName;
    private double basicSalary;
    private double HRAPer;
    private double DAPer;
    private int enrollementTarget;
    private int enrollementReached;
    private double perkPerEnrollement;

    Source(int sourceId, String sourceName, double basicSalary, double HRAPer, double DAPer,
           int enrollementTarget, int enrollementReached, double perkPerEnrollement) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.basicSalary = basicSalary;
        this.HRAPer = HRAPer;
        this.DAPer = DAPer;
        this.enrollementTarget = enrollementTarget;
        this.enrollementReached = enrollementReached;
        this.perkPerEnrollement = perkPerEnrollement;
    }

    public double calculateGrosSalary() {
        double grossSalary = ((enrollementReached + enrollementTarget) * 100) * perkPerEnrollement;
        return grossSalary;
    }

    public double getGrossSalary() {
        return calculateGrosSalary();
    }
}

class TaxUtil {

    public double calculateTax(Employee e) {
        double grossSalary = e.getGrossSalary();
        if (grossSalary > 50000) {
            return 20 * grossSalary / 100.0;
        } else {
            return 5 * grossSalary / 100.0;
        }
    }

    public double calculateTax(Manager m) {
        double grossSalary = m.getGrossSalary();
        if (grossSalary > 50000) {
            return 20 * grossSalary / 100.0;
        } else {
            return 5 * grossSalary / 100.0;
        }
    }

    public double calculateTax(Trainer t) {
        double grossSalary = t.getGrossSalary();
        if (grossSalary > 50000) {
            return 20 * grossSalary / 100.0;
        } else {
            return 5 * grossSalary / 100.0;
        }
    }

    public double calculateTax(Source s) {
        double grossSalary = s.getGrossSalary();
        if (grossSalary > 50000) {
            return 20 * grossSalary / 100.0;
        } else {
            return 5 * grossSalary / 100.0;
        }
    }
}



