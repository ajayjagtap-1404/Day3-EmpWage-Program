package com.assigenement.day_3.emp_wage;

public class EmployeeWage {
     public static final int IS_FULL_TIME = 1;
     public static final int IS_PART_TIME = 2;
     public static final int EMP_RATE_PER_HR = 20;
     public static final int NUM_OF_WORKING_DAYS = 10;

     public static final int MAX_HRS_IN_MONTH = 50;
    public static void main(String[] args) {

        int empHrs = 0, totalEmpHrs = 0,   totalWorkingDays = 0;

        while (totalWorkingDays < NUM_OF_WORKING_DAYS && totalEmpHrs < MAX_HRS_IN_MONTH ){
                totalWorkingDays++;
            double empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_PART_TIME:
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

            totalEmpHrs += empHrs;
            System.out.println("Day : " + totalWorkingDays + " :Emp Hrs: " + empHrs);
        }
            int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
          System.out.println("Total Emp wage: " + totalEmpWage);
    }
}
