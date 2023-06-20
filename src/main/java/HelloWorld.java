public class HelloWorld {

    public static void main (String[] args){
        // hello world ##smile, what a good day##laugh
        String input ="hello world ##smile, what a good day##laugh";

        // Output :   hello world SMILE, hello world LAUGH
        String output= translate_chat_messgae(input);
        System.out.println(output);
        //hello world SMILE, what a good dayLAUGH
    }
    public static String translate_chat_messgae(String input){
         String out ="";
        String out1 ="";
        if (input != null){
            out= input.replace("##smile","SMILE").replace("##laugh","LAUGH");
           // System.out.print(out);
            //out1= input.replace("##laugh","LAUGH");
        }
        return out;
    }
}
