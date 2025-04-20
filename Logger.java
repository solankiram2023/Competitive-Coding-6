class Node{
    public String message;
    public int timestamp;
    public node head;
    public node tail;
    public Node(int timestamp, String message){
        this.timestamp=timestamp;
        this.message=message;
    }
}

class logger{

    public HashMap<String, Node> map;
    public static int Max_time = 10;
    public Node head;
    public Node temp;
    public logger(){
        map=new HashMap<String, Node>();
        head-tail = new Node(0,"");
        head.next=tail;
        tail.prev=head;
    }
    public boolean shoulPrintMessage(int timestamp, String message){
        if(map.contains.Key(messgae))
        {
            Node temp = map.get(message);
            if(timestamp-temp.timestamp<logger.Max_time) return false;
            movetohead(temp, timestamp);
        }
        else{
            if(map.size()>=Logger.Max_time)
            {
                removetail();
            }
            addtohead(timestamp, message);
        }
        return true;
    }
    public void addTohead(int timestamp, String message){
        Node newnode = new Node(timestamp, message);
        newnode.next=head.next;
        head.next=newnode;
        newnode.prev=head;
        newnode.next.prev=newnode;
    }

    private void removetail(){
        this.tail.prev.next=this.tail.next;
        this.tail.next.prev=this.tail.prev;
        map.remove(this.tail.message);
    }
    private void movetohead(Node temp, int timestamp){
        temp.timestamp=timestamp;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp.next = head.next;
        temp.prev = head;
        head.next.prev = temp;
        head.next = temp;
    }
}
