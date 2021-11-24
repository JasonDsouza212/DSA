public class findbitindex {
    public static void main(String[] args) {
        System.out.println(changeindex(47, 5));
        System.out.println(findindex(47, 4));
        System.out.println(changeindexx(7));
    }

    static int findindex(int num, int index) {
        int value = num & (1 << index - 1);
        if (value >0){
            return  1;
        }
        return 0;
    }

    static int changeindex(int num, int index) {
        int value = num ^ (1 << index - 1);

        return value;
    }
    static int changeindexx(int num) {

        int i=1;
        while(num>0){
            int temp = num & 1;
            if(temp>0){
                return i;
            }else{
                num=num>>1;
                i++;
            }

        }

        return -1;
    }
}
