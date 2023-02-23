package com.assigenement.day_3.emp_wage;

public class EmployeeWage {
     public static final int IS_FULL_TIME = 1;
     public static final int IS_PART_TIME = 2;
     public static final int EMP_RATE_PER_HR = 20;

    public static void main(String[] args) {

        int empHrs = 0;
        int empWage = 0;

        double empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
            switch ((int) empCheck) {
                case  IS_PART_TIME :
                    empHrs = 4;
                    System.out.println("Employee Present Half time :");
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Employee Present Full time :");
                    break;
                default:
                    empHrs = 0;
                    System.out.println("Employee Absent :");

            }
            empWage = empHrs * EMP_RATE_PER_HR;
            System.out.println("Emp Wage: " + empWage);

    }
}
