package pattern.java8;

public class User3 extends  User2{
    static{
        System.out.println("child");
    }
    public  static  void main(String[] args){
        User3 s = new User3();
    }
}
