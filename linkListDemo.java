public class linkListDemo {
    
}
class LinkList{
   private Node header;
   private Node lastNode;
   private int size;
   public LinkList(){
      header = new Node(null);
      lastNode =header;
   }
}
class Node{
    public Integer data;
    public Node next;
     public Node(Integer data){
        this.data = data;
        next=null;
     }
}