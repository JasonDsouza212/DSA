import java.util.ArrayList;

public class subSec {
    public static void main(String[] args) {
//        sub("abc","");
        System.out.println(subseRet("","abc"));
    }
    static void sub(String name,String formed){
        if(name.isEmpty()){
            System.out.println(formed);
            return;
        }
        char ch=name.charAt(0);
        sub(name.substring(1),formed+ch);
        sub(name.substring(1),formed);
        sub(name.substring(1),formed+(ch+0));
    }
    static ArrayList<String> subseRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> left=subseRet(p+ch,up.substring(1));
        ArrayList<String> right=subseRet(p,up.substring(1));
        left .addAll(right);
        return left;
    }
}
