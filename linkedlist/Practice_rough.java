package linkedlist;

public class Practice_rough {

    public static class Node { 

        int data ;
        Node next ;
        Node(int data) { 
            this.data = data;
        }
    }

    public static class ll {
        Node head = null;
        Node tail = null;

        void display() {
            Node temp = head;
            while(temp !=null){
                System.out.println(temp.data + " ");
                temp = temp.next;
            } 
        }

        void insertAthead(int data) { 
            Node temp = new Node(data);
            if(head == null){
                tail = temp;
            }else {
                temp.next = head;
            }
            head = temp;
        }

        void insertatEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }else { 
                temp.next = tail;
            }
            tail = temp;
        }

        int size(){
            int count =0;
            Node temp = head;
            while(temp != null) { 
                count ++;
                temp = temp.next;
            }            
            return count;
        }
    }




    public static void main(String[] args) {
        ll newll = new ll();
        newll.insertAthead(2);
        newll.insertAthead(3);
        newll.insertAthead(4);
        newll.display();
    }
    
}
