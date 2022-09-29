public class WhileLoops
{

    int k = 6;
    int i = 14;
    int a = 9;
    int b = 19;
    
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " less then 0");
        }
        while (k > 5) {
            System.out.println("k is " + i + " greater then 0");
        }
        while (a > 10 && b <= 20) {
            System.out.println("a and b is " + i + " different..");
        }
    }
    
    
    public static void main(String[] args)
    {        
        WhileLoops hw = new WhileLoops();
        hw.run();
    }
}


