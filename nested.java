class outer{
    void display()
    {
        System.out.println("Outer class display method");
    }
    class inner{
        void display()
        {
            System.out.println("Inner class display method");
        }
    }
}
public class nested {
    public static void main(String[] args){
        String title0="Lab 8 program-Nested class";
        String title1="Develop a java program to create anouter class function display";
        String title2="Create another class inside the outer class named inner witha function called display";
        String title3="Call the two functions in the main class";
        System.out.println(title0+"\n"+title1+"\n"+title2+"\n"+title3+"\n");
        outer o1=new outer();
        o1.display();
        outer.inner i1=o1.new inner();
        i1.display();
    }
}
