import java.util.*;

class Node{
    int data;
    Node next=null;
    Node(){
        data=-9999;
    }
    Node(int d){
        data = d;
    }
}

class LList{
    Node head;
    
    int size(){
        if(head==null){
            return 0;
        }
        else{
            int c=0;
            Node temp = head;
    
            while(temp!=null){
                c++;
                temp=temp.next;
            }
            return c;
        }
    }
    
    void printList(){
        Node temp = head;
        if(head==null){
            System.out.println("Nothing to print...");
        }
        else{
            System.out.println();
            do{
                System.out.print(temp.data+"--> ");
                temp = temp.next;
            }while(temp!=null);
        }
    }

    void printListInReverse(){
        if(head==null){
            System.out.println("Nothing to print...");
        }
        else{
            reversePrint(head);
        }
    }
    
    void reversePrint(Node head){
        if(head==null) return;

        reversePrint(head.next);

        System.out.print(" <--" + head.data);
    }

    void add(int d){
        Node temp = head;
        Node newNode = new Node(d);
        if(head==null){
            head=newNode;
            head.next = null;
        }
        
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            newNode.next=null;
            temp.next=newNode;
        }
    }
    
    void addFirst(int d){
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
    }

    void add(int d, int index){
        int size = size();
        if(index==0){
            addFirst(d);
        }
        else if(index==size-1){
            add(d);
        }
        else if(index>0 && index<size-1){
            Node newNode = new Node(d);
            Node temp = head;

            for(int i=0;temp!=null;i++){
                if(i==index-1){
                    newNode.next = temp.next;
                    temp.next = newNode;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    void deleteEnd(){
        if(head==null){
            System.out.println("Nothing to remove or delete.");
        }
        else{
            Node temp = head;
            while(temp!=null){
                if(temp.next==null){
                    System.out.println(temp.data + " Deleted");
                    head=temp=null;
                    break;
                }
                if(temp.next.next==null){
                    System.out.println(temp.next.data + " Deleted");
                    temp.next=null;
                    break;
                }
                temp=temp.next;
            }
        }
    }

    void deleteHead(){
        if(head==null){
            System.out.println("Nothing to remove or delete.");
        }
        else{
            Node temp = head.next;
            System.out.println("\n" + head.data + " deleted.");
            head=temp;
        }
    }

    void delete(int index){
        if(head==null){
            System.out.println("Nothing to delete...");
        }
        else if(index>size()-1 || index<0){
            System.out.println("\nThis index does not exist yet.");
        }
        else{
            Node temp = head;
            for(int i=0;temp!=null;i++){
                if(i==index-1){
                    System.out.println("\n" + temp.next.data + " deleted");
                    temp.next = temp.next.next;
                    break;
                }
                temp=temp.next;
            }
        }
    }

    void deleteFirstOccur(int d){
        if(head==null){
            System.out.println("Nothing to delete...");
        }
        else{
            Node temp = head;
            Node prev = null;
            while(temp!=null){
                if(temp.data==d){
                    if(prev==null){
                        head = head.next;
                        return;
                    }
                    else{
                        prev.next=temp.next;
                        return;
                    }
                }
                prev = temp;
                temp = temp.next;
            }
        }

    }

    void physicalReverse(){
        if(head==null){
            System.out.println("Nothing to show...");
            return;
        }
        
        Node mid = head;
        Node left = null;
        Node right = null;
        while(mid!=null){
            right = mid.next;
            mid.next = left;
            left = mid;
            mid = right;
        }
        head = left;
    }

    int get(int index){
        if(head==null){
            System.out.println("List is empty");
            return -9999;
        }
		else if(index<0 || index>size()-1){
			System.out.println("Index out of bounds...");
			return -9999;
		}
        else{
            int i = 0;
			Node temp = head;
			while(temp!=null){
				if(i==index)
					return temp.data;
				temp = temp.next;
				i++;
			}
            return 0;
        }
    }

    void removeDuplicates(){
        if(head==null){
            System.out.println("List is empty!");
        }

        else{
            Node temp = head;
            ArrayList<Integer> arr = new ArrayList<>();
            Node prev = null;

            while(temp!=null){
                if(arr.contains(temp.data)){
                    prev.next = temp.next;
                    temp = temp.next;
                    continue;
                }
                arr.add(temp.data);
                prev = temp;
                temp = temp.next;
            }
        }
    }

    int detectLoop(){
        ArrayList<Node> arr = new ArrayList<>();
        Node temp = head;
        while(temp!=null){
            if(arr.contains(temp)){
                return 1;
            }
            arr.add(temp);
            temp = temp.next;
        }
        return 0;
    }
}

public class linkedList{
    public static void main(String args[]){
        LList ll = new LList();
        ll.add(20);
        ll.add(30);
        ll.add(30);
        ll.add(50);
        ll.add(30);
        ll.add(50);
        ll.add(58);
        ll.add(51);
        ll.add(70);
        ll.add(340);
        ll.add(56);

        ll.printList();
        ll.removeDuplicates();
        System.out.println();
        ll.printList();
    }
}

// class test {
//     public static void main(String[] args) {
//         LinkedList<String> ll = new LinkedList<>();
//         ArrayList<Integer> arr = new ArrayList<>();

//         ll.add("A");
//         ll.add("B");
//         ll.add("C");
//         ll.addLast("C");
//         ll.addFirst("D");
//         ll.add(2,"E");

//         System.out.println(ll);

//         ll.remove("B");
//         ll.remove(3);
//         ll.removeFirst();
//         ll.removeLast();
//         System.out.println(ll.size());
//     }
// }
