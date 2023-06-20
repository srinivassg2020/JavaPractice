package pattern.Strings;

public class StringClass {
    public static void main(String[] args){
    // get the nuumber of upper case letters.
    String str = "Srinivas Mekala";
    int count=0;
    for(int i=0; i<str.length(); i++){
        if(Character.isUpperCase(str.charAt(i))){
            count++;
        }
    }
    System.out.print(count);
    }

}
