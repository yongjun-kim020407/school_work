class BankUtil{
    static String generateAcctNum(int fLower, int fUpper, int sLower, int sUpper){
        int x ,y;
        x = RandomUtil.intrandIntInRange(fLower, fUpper-1);
        y = RandomUtil.intrandIntInRange(sLower, sUpper);
        return x + "-" + y; //자동 형변환 

    }
 
}
public class RandomUtil{
        public static int intrandIntInRange(int lower, int upper) {
        int num= ((int) (Math.random() * 
        Integer.MAX_VALUE) % (upper -lower + 1)) + lower;
        return num;
    }
}