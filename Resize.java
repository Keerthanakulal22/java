interface resizable{
    void resizewidth(int width);
    void resizeheight(int height);
}
class Rectangle implements resizable{
    private int width;
    private int height;
    public Rectangle(int width,int height){
      this.width=width;
      this.height=height;
    }
    public void resizewidth(int width){
        this.width=width;
    }
    public void resizeheight(int height){
        this.height=height;
    }
    public void display(){
        System.out.println("Rectangle width: "+width);
        System.out.println("Rectangle height "+height);
    }
    }
    
public class Resize {
    public static void main(String[] args){
        String title0="Lab 7 program-Resizeable Interface";
        String title1="Develop a java program to createan interface Resizeablewith methods resizewidth(int width) and resizeheight(int height) that allowan object to be resized";
        String title2="Create a class Rectangle that implements theresizeable interfaceand implementsthe resize mathods ";
        System.out.println(title0+"\n"+title1+"\n"+title2);
        
        Rectangle r1=new Rectangle(5,10);
        System.out.println("\nOriginal Recatanle: ");
        r1.display();
        r1.resizewidth(8);
        r1.resizeheight(12);
        System.out.println("\nResized Rectangle: ");
        r1.display();
    }
}
        
    

