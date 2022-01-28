import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Sum_of_last_n_nodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            Node head = new Node(sc.nextInt());
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution obj = new Solution();
            System.out.println(obj.sum(head, k));
        }
        sc.close();
    }
}

class Solution {
    public int sum(Node head, int k) {
        Node temp = head;
        int M = 0, sum1 = 0, sum2 = 0, i = 1;
        while (temp != null) {
            sum1 = sum1 + temp.data;
            temp = temp.next;
            M++;
        }
        temp = head;
        while (i <= M - k) {
            sum2 = sum2 + temp.data;
            temp = temp.next;
            i++;
        }
        return sum1 - sum2;
    }
}