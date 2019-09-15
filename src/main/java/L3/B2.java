package L3;

public class B2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; ++i) 
        {
            System.out.println();
            System.out.println("Cuu chuong " + i);

            for(int j = 1; j <= 10; ++j) 
            {
                System.out.print(i + " x " + j + " = " + i * j);
                System.out.println();
            }
        }

    }
}