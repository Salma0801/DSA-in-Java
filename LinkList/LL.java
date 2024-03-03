public class LL {
  /**
   *  Node
   */
  Node head;
  private int size;
  LL(){
    this.size=0;
  }
  public class  Node {
  
    String data;
    Node next;
    Node(String val){
      this.data=val;
      this.next=null;
      size++;
    }
  }
  //add first
  public void addFist(String d){
    Node newNode= new Node(d);
    //check linklist is empty
    if(head==null){
      head=newNode;
      return;
    }
    newNode.next=head;
    head=newNode;
  }
  //add last
  public void addLast(String d){
    Node newNode= new Node(d);
    //check linklist is empty
    if(head==null){
      head=newNode;
      return;
    }
    //Assing current node
    Node currNode=head;
   //travers current node next until null
   while(currNode.next!=null){
    currNode=currNode.next;//Update currNode
   }
    currNode.next=newNode;
  }
  //Print
  public void printLinkList(){
      //Assaing current node
      Node currNode=head;
    //check linklist is empty
    if(head==null){
      System.out.println("The list is empty");
    }
   //travers current node until null
   while(currNode!=null){
    System.out.print(currNode.data+ "->");
    currNode=currNode.next;
   }
    System.out.println("null");
  }
  //Delete first
  public void removeFist(){
    //check linklist is empty
    if(head==null){
     System.out.println("the list is empty");
    }
    size--;
    //Assaing head.next
    head=head.next;
  }
  //Delete last
  public void removeLast(){
    //check linklist is empty
    if(head==null){
     System.out.println("the list is empty");
    }
    size--;
    if(head.next==null){
      head=null;
      return;
    }
    Node secondLast=head;
    Node lastNode=head.next;
    while (lastNode.next!=null) {
      lastNode=lastNode.next;
      secondLast=secondLast.next;
    }
    secondLast.next=null;
  }
//Size function
public int getSize(){
  return size;
}
  public static void main(String[] args) {
    LL list= new LL();
    list.addFist("a");
    list.addFist("is");
    list.printLinkList();
    list.addLast("list");
    list.addFist("This");
    list.printLinkList();
    System.out.println("Total size"+" " +list.getSize());
    list.removeFist();
    list.printLinkList();
    System.out.println("Total size"+" " +list.getSize());
    list.removeLast();
    list.printLinkList();
    System.out.print("Total size"+" " +list.getSize());
  }
}
