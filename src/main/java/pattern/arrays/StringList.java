package pattern.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {
    public static void main(String[] args){
    List<String> strlist =  new ArrayList<>();

        strlist.add("JPM");
        strlist.add("UBS");
        strlist.add("DBS");
        strlist.add("SGX");
        strlist= strlist.stream().filter(x->x.contains("S")).collect(Collectors.toList());

        for(String s : strlist){
        System.out.println(s);
        }
    }
}
