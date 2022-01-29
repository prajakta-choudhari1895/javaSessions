public class revString {

    public static void main(String [] args){
        String name = "prajakta",rev="";
        char ch;
        for(int i=0;i<name.length();i++)
        {
            ch=name.charAt(i);
            rev=ch+rev;
        }
    System.out.println("Reversed string:" +rev);

        for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j < 5 - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k+ " ");
            }
            System.out.println();
        }


    }
}
