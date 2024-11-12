
public class University {
    private String name;
    public University(String name){
        this.name=name;
    }
    public class Department{
        private String deptname;
        public Department(String deptname){
            this.deptname=deptname;
        }
        public void printDetails(){
            System.out.println("University: "+University.this.name);
            System.out.println("Department :"+deptname);
        }
    }
    public static void main(String[] args){
        University uni=new University("SMVITM University");
        University.Department department=uni.new Department("Computer Science");
        department.printDetails();
    }
}
