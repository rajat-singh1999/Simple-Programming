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
        }
        return 0;
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

    static int findMergeNode(Node headA, Node headB) {
        Node currentA = headA;
        Node currentB = headB;
    
        //Do till the two nodes are the same
        while(currentA != currentB){
            //If you reached the end of one list start at the beginning of the other one
            //currentA
            if(currentA.next == null){
                currentA = headB;
            }else{
                currentA = currentA.next;
            }
            //currentB
            if(currentB.next == null){
                currentB = headA;
            }else{
                currentB = currentB.next;
            }
        }
        return currentB.data;    
    }
    

}

public class HackerrankLinkedList{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int p = 0;p<t;p++){
            
            int n = sc.nextInt();
            LList l1 = new LList();
            for(int i=0;i<n;i++){
                l1.add(sc.nextInt());
            }
            
            int m = sc.nextInt();
            LList l2 = new LList();
            for(int i=0;i<m;i++){
                l2.add(sc.nextInt());
            }
            
            LList ll = new LList();
            
            int i=0;
            int j=0;
            while(true){
                if(i>l1.size()-1){
                    for(int q=j;q<l2.size();q++){
                        ll.add(l2.get(q));
                    }
                    break;
                }
                else if(j>l2.size()-1){
                    for(int q=i;q<l1.size();q++){
                        ll.add(l1.get(q));
                    }
                    break;
                }
                else{
                    if(l1.get(i)<l2.get(j)){
                        ll.add(l1.get(i));
                        i++;
                        continue;
                    }
                    else if(l1.get(i)>l2.get(j)){
                        ll.add(l2.get(j));
                        j++;
                    }
                    else{
                        ll.add(l1.get(i));
                        i++;
                    }
                }
            }
            
            for(int q=0;q<ll.size();q++){
                System.out.print(ll.get(q) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
n
m
min
max
O(min*(max-min))
*/
