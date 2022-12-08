package Data_Analysis.linkedlist;

public class Linked_List{
    Node head;
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
// TO ADD DATA
    public void Add_data(int data){
        Node n1=new Node(data);
        n1.next=head;
        head=n1;
    }
// CALCULATING MEAN
    public void mean(){
        Node temp=head;
        int sum=0;
        int no_of_nodes=0;
        while(temp!=null){
            sum=sum+temp.data;
            no_of_nodes++;
            temp=temp.next;
        }
        float mean=sum/no_of_nodes;
        System.out.println();
        System.out.println("1.MEAN IS :"+mean);
    }
// CALCULATING MEDIAAN
    public void median(){
        Node temp=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        if(n%2==0){
            // EVEN
            int a=(n/2)+1;
            int b=n/2;
            float median=(a+b)/2;
            System.out.println("2.MEDIAN IS : "+median);
        }
        else{
            // ODD
            float median=(n+1)/2;
            System.out.println("2.MEDIAN IS : "+median);
        }
    }
// CALCULATING STANDARD DEVIATION
    public void standard_deviation(){
        Node temp=head;
        int sum=0;
        int no_of_nodes=0;
        while(temp!=null){
            sum=sum+temp.data;
            no_of_nodes++;
            temp=temp.next;
        }
        float mean=sum/no_of_nodes;

        Node temp2=head;
        float sum_2=0;
        float sum_final=0;
        while(temp2!=null){
            sum_2=sum_2+(temp2.data-mean);
            sum_final=sum_2*sum_2;
            temp2=temp2.next;
        }
        Double standard_deviation=Math.sqrt(sum_final/no_of_nodes);
        System.out.println("4.STANDARD DEVIATION IS :"+standard_deviation);
        System.out.println();
    }
    // CALCULATING MODE
    public void mode(){
        Node temp=head;
        int total_count=0,max_count=0,res=-1;

        while(temp!=null){
            int count=1;
            Node temp2=temp.next;
            while(temp2!=null){
                if(temp.data==temp2.data){
                    count++;
                }
                temp2=temp2.next;
            }
            if (count > max_count){
            max_count = count;
            res = temp.data;
        }
 
        temp = temp.next;
        total_count++;
        }
        if (max_count >= total_count / 2)
        System.out.println("3.MEAN IS : "+res);
    }
// TO PRINT A LINKEDLIST
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}