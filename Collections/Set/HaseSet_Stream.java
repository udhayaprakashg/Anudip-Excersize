package Set_Method;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
class HaseSet_Stream {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        HashSet<String> ht = new HashSet<String>();
        ht.add("Srilekha");
        ht.add("Raju");
        ht.add("Anu");
        ht.add("Anudip");
        System.out.println(ht);
        System.out.println("After sorting");
        List<String> sortedList=ht.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println("--------------------------------------------"
        		+"Desorting Method");
       List<String>DesortedList=ht.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        //List<String>sortedlist=ht.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());;
        System.out.println(DesortedList);

        System.out.println("------------------------------------------+"
        		+ "Sorting Based on Length");
        List<String> out = ht.stream().sorted((s1, s2) -> {
            int l1 = s1.length();
            int l2 = s2.length();
            if (l1 < l2) return -1;
            else if (l1 > l2) return +1;
            else return s1.compareTo(s2);
        }).collect(Collectors.toList());
        out.forEach(System.out::println);
    }}

