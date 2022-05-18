public  class subSec{
    public static void main(String[] args) {
        subs("","abc");
    }
    static void subs(String a,String b){
        if(b.isEmpty()){
            System.out.println(a);
            return;
        }
        char ch=b.charAt(0);
        subs(a+ch,b.substring(1));
        subs(a,b.substring(1));
    }
}
