import java.util.InputMismatchException;
import java.util.Scanner;

public class fms {
    String studentName;
    int studentID;
    long contactNumber;
    int paymentAmount = 0;
    int outstandingFees;
    int depositAmount = 0;

    Scanner sc = new Scanner(System.in);
    int choice;

    void printLine() {
        System.out.println("*************** FEES MANAGEMENT SYSTEM **************");
        System.out.println("|                                                   |");
        System.out.println("|                                                   |");
        System.out.println("|                                                   |");
        System.out.println("|   1. Add Student Information                      |");
        System.out.println("|   2. Show Student Information                     |");
        System.out.println("|   3. Fees Structure                               |");
        System.out.println("|   4. Payment History                              |");
        System.out.println("|   5. Outstanding Fees                             |");
        System.out.println("|   6. Deposit Fees                                 |");
        System.out.println("|   7. Exit                                         |");
        System.out.println("*****************************************************");
    }

    void userInput() {
        try{
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            }
        catch(InputMismatchException e){
            System.out.println("Invalid Input!");
            sc.next(); // consume the invalid input
        }
    }

    public void start() {
        while (true) {
            if (choice == 1) {
                AddstudentInformation();
            }else if (choice == 2) {
                ShowStudentInformation();
            } else if (choice == 3) {
                feesStructure();
            } else if (choice == 4) {
                paymentHistory();
            } else if (choice == 5) {
                outstandingFees();
            } else if (choice == 6) {
                depositFees();
            } else if (choice == 7) {
                System.out.println("Thank you for using Fees Management System");
                break;
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
            printLine();
            userInput();
        }
    }

    public void AddstudentInformation() {
            System.out.println("*************** STUDENT INFORMATION **************");

            System.out.print("Enter student name: ");
            studentName = sc.next();

            System.out.print("Enter student ID: ");
            studentID = sc.nextInt();

            System.out.print("Enter contact number: ");
            contactNumber = sc.nextLong();


        }

        private void ShowStudentInformation() {
            System.out.println("*****************************************************");
            // Display gathered information
            System.out.println("Student Name: " + studentName);
            System.out.println("Student ID: " + studentID);
            System.out.println("Contact Number: " + contactNumber);
            System.out.println("Deposited Fees: $" + depositAmount); // Display deposited fees

            // Calculate remaining fees
            outstandingFees = 5500 - paymentAmount;
            System.out.println("Outstanding Fees: $" + outstandingFees);

            System.out.println("*****************************************************");
        }



    private void feesStructure() {
            System.out.println("*************** FEES STRUCTURE **************");

            // Display the fee structure
            System.out.println("1. Tuition Fees: $5000 per semester");
            System.out.println("2. Library Fees: $200 per semester");
            System.out.println("3. Examination Fees: $300 per semester");

            System.out.println("********************************************");
        }


    private void paymentHistory() {
            System.out.println("*************** PAYMENT HISTORY **************");
            System.out.println("Total Fees: $5500");


            System.out.println("Amount Paid: $" + paymentAmount);


            System.out.println("*********************************************");
        }


    private void outstandingFees() {

            System.out.println("*************** OUTSTANDING FEES **************");
            System.out.println("Total Fees: $5500");

            outstandingFees = 5500 - paymentAmount;
            System.out.println("Outstanding Fees: $" + outstandingFees);

            System.out.println("***********************************************");
        }


    private void depositFees() {
            System.out.println("*************** DEPOSIT FEES **************");

            System.out.print("Enter the deposit amount: ");
            depositAmount = sc.nextInt();

            paymentAmount += depositAmount;

            System.out.println("Deposit Successful. Thank you!");
            System.out.println("*******************************************");
        }

    public static void main(String[] args) {
        fms myClassfms = new fms();
        myClassfms.printLine();
        myClassfms.userInput();
        myClassfms.start();
    }

}
