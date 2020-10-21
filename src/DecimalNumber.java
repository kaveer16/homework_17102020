public class DecimalNumber {

    public static void main(String args[])

    {
        int dn=5, quot, i=1, j;
        int bin_num[] = new int[100];


        quot = dn;

        while(quot != 0)
        {
            bin_num[i++] = quot%2;
            quot = quot/2;
        }

        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}

