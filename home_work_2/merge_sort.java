public class Main {
    public static void MergeSort(int a[], int s, int e, int tmp[]) {
        if (s < e) {
            int m = s + (e - s) / 2;
            MergeSort(a, s, m, tmp);
            MergeSort(a, m + 1, e, tmp);
            Merge(a, s, m, e, tmp);
        }
    }
    public static void Merge(int a[], int s, int m, int e, int tmp[]) {
        int pb = 0;
        int p1 = s;
        int p2 = m + 1;
        while (p1 <= m && p2 <= e) {
            if (a[p1] < a[p2])
                tmp[pb++] = a[p1++];
            else
                tmp[pb++] = a[p2++];
        }
        while (p1 <= m)
            tmp[pb++] = a[p1++];
        while (p2 <= e)
            tmp[pb++] = a[p2++];
        for (int i = 0; i < e - s + 1; i++)
            a[s + i] = tmp[i];
    }
    public static void main(String[] args) {
        int[] a = {36, 27, 43, 9, 3, 82, 10};
        int[] tmp = new int[a.length];
        MergeSort(a, 0, 6, tmp);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
