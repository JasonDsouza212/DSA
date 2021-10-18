public class palinromeString {
    public static void main(String[] args) {
        String name=null;
        System.out.println(ans(name));
    }
    static boolean ans(String name){
        if(name==null||name.length()==0){
            return true;
        }
        int start =0;
        int end=name.length()-1;
        while(start<=end){
            if(name.charAt(start)==name.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
