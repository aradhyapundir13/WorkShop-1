import java.util.*;

class KthElement {


    static void kLargest(int a[], int n, int k)
    {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int i = 0; i < n; ++i) {


            pq.add(a[i]);


            if (pq.size() > k) {
                pq.poll();
            }
        }



            System.out.print(pq.peek() + " ");

        System.out.println();
    }

    public static void main(String[] args)
    {

        int a[]   = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
        int n = a.length;
        int k = 3;
        System.out.print(k + " largest element is : ");

        kLargest(a, n, k);
    }
};

