public class SearchinginString {
    public static void main(String[] args) {
        String name="jason Dsouza";
        char[] ch=name.toCharArray();

        System.out.println( reverse(ch,'s'));
    }
    static boolean reverse(char[] ch ,char target){
        for(int i=0;i<ch.length;i++){
            if(ch[i]==target){
                return true;
            }
        }
        return false;
    }
}
