package exam;
public class PatternI {
    void I() {

        int n = 5;

        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            ch -= 2;
            for (int k = i - 1; k >= 0; k--) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }

    
    void II() {
        int n = 5;

        for (int i = 0; i < n; i++) {
            int num = i + 1;
            for (int j = 0; j <= i; j++) {
                switch (j) {
                    case 0:
                        System.out.print(num);
                        break;
                    default:
                        System.out.print(" " + num);
                }
                num--;
            }
            System.out.println();
        }

    }

    public static void main(String args[])
    {
        PatternI ob=new PatternI();
        ob.I();
        ob.II();
    }
}
