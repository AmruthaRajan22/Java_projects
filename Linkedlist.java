import java.util.*;
public class LinkedList {
     
    class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public Node head=null;
    public Node tail=null;

    public void addData(int data)
    {   
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        } 
        else
        {
            tail.next=newNode;
            tail=newNode;
        }    

    }
    public void display()
    {
       Node current=head;
       if(head==null){
          System.out.println("list is empty");
          return;
        }
        System.out.println("nodes of single link list");
        while(current !=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    public void insertParticularIndex(int pr,int data)
    {    
        
        Node  newNode=new Node(data);
       if(pr==1)
       {   
             newNode.next=head;
             head=newNode;
            
            return;
       }
       Node current=head;
      for(int i=1;i<pr-1 && current!=null;i++){
        current=current.next;
       }
       if(current==null)
       {
        System.out.println("position out of bound");
       }
      
       newNode.next=current.next;
       current.next=newNode;
       
    }
    public void insertBegining(int data)
    {
       
        Node  newNode=new Node(data);
        if(head==null)
        { 
            head=newNode;
            tail= newNode;
        }
        else
        {
            Node temp=head;
            head=newNode;
            head.next=temp;

        }

        }
        
    
    public void insertEnd(int data)
    {
            Node  newNode=new Node(data);
            if(head==null)
            {
             
            head=newNode;
            tail= newNode;   
            } 
            else
            {
                tail.next=newNode;
                tail=newNode;
            }
    }
    public void deleteEnd()
    {
       if(head==null)
       {
        System.out.println("list is empty");
        return;
       }
       else{
        if(head!=tail)
        {
            Node current=head;
            while(current.next!=tail)
            {
                current=current.next;
            }
            tail=current;
            tail.next=null;
        
        }
        else{
            head=tail=null;
        }
        
       }
    }

    public void deleteBegning()
    {
       
        if(head==null)
        {
            System.out.println("link list is empty");
        }
        head=head.next;

    }
    public void deleteParticular(int position)
    {
      Node current=head;
      Node temp=null;
        if(head==null)
        {
            System.out.println("link list is empty");
        }
        else
        {  if(position==1)
            {
                head=head.next;
            }
            else{
            for(int i=1;i<position;i++)
            {   temp=current;
                current=temp.next;
            }
            temp.next=current.next;

        }}

    }
    void search(int data)
    {   int set=0;
        Node current=head;
       
        if(head==null)
            System.out.println("empty list");
        while(current!=null)
        {
            if(current.data==data)
            {  
               System.out.println("element found");
               set=1;
               break;
            }
            current=current.next;
        }    
        if(set==0)
        System.out.println("element not found");
    }
    void FindPosition(int data)
    {
        int set=0;
        Node current=head;
        int pos=0;
       
        if(head==null)
            System.out.println("empty list");
        while(current!=null)
        {   
             pos=pos+1;
            if(current.data==data)
            {  
               System.out.println("element "+data+" found in "+pos+" position");
               set=1;
               break;
            }
            current=current.next;
           
        }    
        if(set==0)
        System.out.println("element not found");
    }
    public static void main(String[] args)
    {
        LinkedList sll=new LinkedList();
        int c;
        Scanner sc=new Scanner(System.in);
        int data,n,ins,pos;

        do{
            System.out.println("*****operation on single link list****");
            System.out.println("1.Creation \n2.Insertion \n3.Find \n4.Deletion \n5.Display \n6.Searching");
            System.out.println("ENTER YOUR CHOICE");
            c=sc.nextInt();

           
            switch(c)
            {
                case 1: System.out.println("Number of node you want to enter");
                        n=sc.nextInt();
                        System.out.println("enter node data");
                         for(int i=1;i<=n;i++)
                         {  
                            data=sc.nextInt();
                            sll.addData(data);
                          }
                         sll.display(); 
                         break;
                case 2:  System.out.println("Insertion\n1.Beginning\n2.Particular location\n3.End\nEnter choice ");
                          ins=sc.nextInt();
                         switch(ins)
                         {
                           case 1:  System.out.println("enter node data");
                                    data=sc.nextInt();
                                     sll.insertBegining(data);
                                     sll.display();
                                     break;
                           case 2:   System.out.println("enter node data");
                                     data=sc.nextInt();
                                     System.out.println("enter position");
                                     pos=sc.nextInt();
                                     sll.insertParticularIndex(pos,data);
                                     sll.display();
                                     break;
                                     
                           case 3:  System.out.println("enter node data");
                                    data=sc.nextInt();
                                    sll.insertEnd(data);
                                    sll.display();
                                    break;           
                           default:System.out.println("invalid data");                         
                         }
                         break;
                case 3:  System.out.println("Enter the data to find its position:");
                         data=sc.nextInt();
                         sll.FindPosition(data);
                         break;          
                case 4:  System.out.println("Deletion\n1.Beginning\n2.Particular location\n3.End\nEnter choice ");
                          ins=sc.nextInt();
                         switch(ins)
                         {
                           case 1:   sll.deleteBegning();
                                     sll.display();
                                     break;
                           case 2:   System.out.println("enter position");
                                     pos=sc.nextInt();
                                     sll.deleteParticular(pos);
                                     sll.display();
                                     break;
                           case 3:  sll.deleteEnd();
                                    sll.display();
                                     break;           
                           default:System.out.println("invalid data");                         
                         }
                         break;
                case 5:  sll.display();
                         break;
                case 6:  System.out.println("enter search node data");
                         data=sc.nextInt();
                         sll.search(data);
                         break;
                         
                default:System.out.println("invalid data");             
                
            }
        }while(c<7);
    }   
}