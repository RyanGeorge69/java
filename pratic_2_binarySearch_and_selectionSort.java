package class10;
import lang.stride.*;
import java.util.*;
import java.io.*;
public class pratic_2_binarySearch_and_selectionSort
{
    static public void main()
    {
        int[] a = {14, 365, 643, 73, 357, 367, 764, 63, 687, 11};
        /* Array elements--> compulsory --> sorted order (asc / desc)*/
        int t = 0;
        int i = 0;
        while (i < a.length) {
            int j = i + 1;
            while (j < a.length) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
                j = j + 1;
            }
            i = i + 1;
        }
        int s = 365;
        System.out.println("Welcome to Binary Search Technique");
        boolean flag = false;
        int lb = 0;
        int ub = a.length - 1;
        int mid;
        while (lb <= ub) {
            mid = (lb + ub) / 2;
            if (a[mid] == s) {
                flag = true;
                break;
            }
            else if (a[mid] > s) {
                ub = mid - 1;
            }
            else if (a[mid] < s) {
                lb = mid + 1;
            }
        }
        if (flag == true) {
            System.out.println("Found the element");
        }
        else {
            System.out.println("Found not the element");
        }
    }
}
