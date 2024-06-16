
public class ClearTheIthBit {
    public static void main(String[] args) {
        int n = 13 , i = 2;//1101 1011 1001
        int p = ~(1<<i);
        System.out.println(p & n);
    }
}