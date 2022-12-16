public class Experiment1 {
    public static void main(String[] args){
        int[] empId = new int[]{1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] name = new String[]{"Ashish", "Shushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = new String[]{"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        char[] desigCode = new char[]{'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] dept = new String[]{"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = new int[]{20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = new int[]{8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = new int[]{3000, 9000, 1000, 2000, 20000, 4400, 10000};

        int employee = Integer.parseInt(args[0]);
        int index = -1;

        for(int i=0; i<empId.length; i++){
            if(empId[i]==employee){
                index=i;
                break;
            }
        }

        if(index==-1){
            System.out.println("There is no employee with empId: "+employee);
        }
        else{
            String designation="";
            int da = 0;

            switch (desigCode[index]) {
                case 'e' -> {
                    designation = "Engineer";
                    da = 20000;
                }
                case 'c' -> {
                    designation = "Consultant";
                    da = 32000;
                }
                case 'k' -> {
                    designation = "Clerk";
                    da = 12000;
                }
                case 'r' -> {
                    designation = "Receptionist";
                    da = 15000;
                }
                case 'm' -> {
                    designation = "Manager";
                    da = 40000;
                }
            }

            int salary = basic[index]+hra[index]+da-it[index];

            System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Emp No.", "Emp Name", "Department", "Designation", "Salary");

            System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", empId[index], name[index], dept[index], designation, salary);

        }
    }
}
