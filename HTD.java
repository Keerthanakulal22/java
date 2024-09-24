package pkg1;

class human{
    public void job(){
        System.out.println("Working Professional");
    }
}
class teacher extends human{
    public void job(){
        System.out.println("Teacher");
    }
}
class doctor extends human{
    public void job(){
        System.out.println("Doctor");
    }
}
public class HTD{
    public static void main(String[] args){
    human amar=new human();
    teacher babu=new teacher();
    doctor chandra=new doctor();
    human dinesh=new doctor();
    amar.job();
    babu.job();
    chandra.job();
    dinesh.job();
    }
}


