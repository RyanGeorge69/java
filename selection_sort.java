package class10;
public class selection_sort
{
    public static void main()
    {
        int a[] = {10, 2, 1, 32, 65, 23, 89, 21, 55, 10};
        int t;

        System.out.println("Oridinal Array....:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }

        System.out.println("\nSorted Array....:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
