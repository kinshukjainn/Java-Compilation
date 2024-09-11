
package linkedlist;
public class LinkedlistImplementation{

    public class Node { 
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public class llist{
        Node head = null;
        Node tail = null;

        void displayoflinkedlist(){ 
            Node temp = head;
            while(temp !=null){
                System.out.println(temp.data + " ");
                temp.next = temp;
            }

        }

        void insertathead(int data) {
            Node temp = new Node(data);
            if (head == null) { 
                tail = temp;
            } else {
                temp.next = head;   
            }
            head = temp;

        }

        void insertatEnd(int data) {
            Node temp = new Node(data);
            if(head == null) { 
                head = temp;
            }else {
                tail.next = temp;
            }
            tail = temp;
        }

        int size() {
            Node temp = head;
            int count = 0;
            while(temp !=null){
                count++;
                temp.next = temp;
            }
            return count;
        }

        void 


    }

    public static void main(String[] args) {
        
    }

}