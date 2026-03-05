package com.getter.setter;


import java.util.*;

public class MessAttendance {
    public static void main(String[] args) {


    	        Scanner sc = new Scanner(System.in);

    	        int studentId = Integer.parseInt(sc.nextLine().trim());

    	        String studentName = sc.nextLine().trim(); 
    	        
    	        int daysPresent = Integer.parseInt(sc.nextLine().trim());
    	        
    	        int leaveDays = Integer.parseInt(sc.nextLine().trim());

    	        double pendingBill = Double.parseDouble(sc.nextLine().trim());

    	        MessLeaveAccount mess = MessLeaveAccount.getMessObject(
    	                studentId, studentName, daysPresent, leaveDays, pendingBill
    	        );

    	        System.out.println(mess);

    	        sc.close();
    	    }
/*Student ID: 901 
Student Name: Swati 
Adjusted Mess Bill: 2400.0 
Late Fine Applied: 350.0 
Leave Fine Applied: 300.0 
Disciplinary Fine Applied: 500.0 
Final Bill Status: Pending 
Total Bill Payable: 3650.0*/
    }


class MessLeaveAccount{

        private int studentId; 
        private String studentName; 
        private static double dailyMessFee = 200;
        private int daysPresent; 
        private int leaveDays; 
        private double pendingBill;
        private double lateFine;
        private double leaveFine; 
        private double attendanceFine; 
        private double finalBill ;  



        private MessLeaveAccount(int studentId , String studentName , int daysPresent , int leaveDays , double pendingBill){ 
            this.studentId = studentId;
            this.studentName = studentName;
            this.daysPresent = daysPresent; 
            this.leaveDays = leaveDays; 
            this.pendingBill  = pendingBill; 

        }


        ///Creating object of MESS 
        public static MessLeaveAccount getMessObject(int studentId, String studentName , int daysPresent , int leaveDays , double pendingBill){
          return new MessLeaveAccount(studentId , studentName , daysPresent , leaveDays , pendingBill);  
        }

        //Set student ID; 
       public void setStudentId(int id){
            if(id>0){
                this.studentId = studentId; 
            }
            else{
                IO.println("ERROR");
                System.exit(0);
            }
       }

        //Set student name; 
       public void setStudentName(String name){
            if(!studentName.isBlank()){ 
                this.studentName = studentName;
            }
            else{
                IO.println("ERROR");
                System.exit(0);
            }
        } 


        //Set student Present Days; 
        public void setPresentDays(int days){
            if(days>=0 && days<=30){
                this.daysPresent = days; 
            }
            else{
                IO.println("ERROR");
                System.exit(0);
            }

        }

        public void setLeaveDays(int days){
            if(days>=0 && days<=30){
                this.leaveDays = days; 
            }
            else{
                IO.println("ERROR");
                System.exit(0);
            }

        } 

        private double billCalculationRule(){ 
            double baseBill =(daysPresent*dailyMessFee);

            double adjustmentBill = setLeaveFine(baseBill); //Adjusted bill as per Leave fine ; 

            setAttendanceFine(adjustmentBill);
            double disciplinaryFine= getAttendanceFine(); 
            
            
            setpendingBillFine(adjustmentBill); 
            double pendingBillFine = getpendingBillFine(); 

            this.finalBill = adjustmentBill; 

            return finalBill; //reutnring total payable bill  

        }


        private double setpendingBillFine(double adjustedBill){
            
            double extrawLateFine = 0.0; 
            //10% of pending bill 

            if(pendingBill > 3000){
                extrawLateFine = 10*100/pendingBill;
                this.lateFine = extrawLateFine;
                adjustedBill = (extrawLateFine+adjustedBill); 
                return adjustedBill; 
            } 
            this.lateFine = extrawLateFine;
           adjustedBill = (adjustedBill+extrawLateFine); 
           return adjustedBill;  
        }
        public double getpendingBillFine(){
            return lateFine; 
        } 
        


        private double setAttendanceFine(double adjustedBill){
            double attndancePercentage = daysPresent*100/30.0;
            
          double disciplinaryFine = 0.0; 

            if(attndancePercentage <75.0){
                //Disciplinary Fine     
                disciplinaryFine =500.0; 
                this.attendanceFine = disciplinaryFine; 
                adjustedBill=(adjustedBill+disciplinaryFine); 
                return adjustedBill; 
            } 
            this.attendanceFine =  disciplinaryFine; 
            adjustedBill = (adjustedBill+disciplinaryFine);
            return  adjustedBill ;
        }
        public double getAttendanceFine(){
            
            return attendanceFine; 
        }

        private double setLeaveFine(double baseBill){

            double additionalLeaveFine = 0.0; 
           
           double deduct= (this.leaveDays * dailyMessFee); 
            
             if(leaveDays>5){               
                //Additional added fine if above 5 days leave 
                additionalLeaveFine = (leaveDays - 5)*100.0; 
                
                this.leaveFine = additionalLeaveFine;  
                baseBill =  (baseBill + additionalLeaveFine)-deduct;  
                return baseBill;
            } 
            
            this.leaveFine = additionalLeaveFine;
            return baseBill;   

        }
        public double getleaveDaysFine(){
            return leaveFine;
        }



        public double getFinalBill(){
            return finalBill; 
        }


       public String getFineAmount(){
            if(getAttendanceFine() == 0.0 || getpendingBillFine() == 0.0 || getleaveDaysFine() ==0.0){
                return "\nNo Fine Applied"+"\nFinal Bill Status: "+getStatus() +"\n"; 
            }
         
                 return "\nLate Fine Applied: "+ getpendingBillFine() + "\nLeave Fine Applied: "+getleaveDaysFine() + "\nDisciplinary Fine Applied: "+getAttendanceFine()+"\nFinal Bill Status: "+ getStatus()+"\n";  

        } 

        public String getStatus(){
            if(finalBill != 0.0){
                return "Pending";
            }
            else{
                return "Clear"; 
            }

        } 
        
        public String toString(){
            return "Student ID: "+studentId + "\nStudent Name: "+studentName+"\nAdjusted Mess Bill: "+billCalculationRule()+getFineAmount()+"Total Bill Payable: "+getFinalBill();
        }















}
