package class10;
public class DDA
{
    public static void main()
    {
        int a[][]={{1,2},//{10,1},
                   {5,6}// {20,5},
                  };
        int b[][]={{10,1},
                   {20,5},
                  };
      int c=(a[0][0]*b[0][0])+(a[0][1]*b[1][0]);
      int d=(a[0][0]*b[0][1])+(a[0][1]*b[1][1]);
      System.out.print(c+"\t"+d+"\t");
        /**for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }  }*/
    }
}
