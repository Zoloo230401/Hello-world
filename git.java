public class git {
    private String[] queueArray;
      private int first;
      private int last;
      private int size;
      private int maxSize;
      
      public git(int maxSize) {
          this.maxSize = maxSize;
          this.queueArray = new String[maxSize];
          this.first = 0;
          this.last = -1;
          this.size = 0;
      }
      
      public boolean isFull() {
          return size == maxSize;
      }

      public boolean isEmpty() {
          return size == 0;
      }

      
      public void joinQueue(String name) {
          if (isFull()) {
              System.out.println("Sorry " + name + ", the queue is full. Come back later!");
          } else {
              last = (last + 1) % maxSize; 
              queueArray[last] = name;
              size++;
              System.out.println(name + " has taken their place in the queue!");
          }}
      
      public void removePerson() {
      if (isEmpty()) {
          System.out.println("No one is in the queue. It's empty!");
      } else {
          String person = queueArray[first];
          first = (first + 1) % maxSize;  
          size--;
          System.out.println("Ticket #" + (first + 1) + ": " + person + ", it's your turn! Come on down!");
      }
  }
      
      public String peekFront() {
          if (isEmpty()) {
              return "No one is at the front of the queue.";
          } else {
              return queueArray[first];
          }
      }
      
      

      

  public static void main(String[] args) {
      git queue = new git(2);
      queue.joinQueue("Alice");
      queue.joinQueue("Bob");
      
      System.out.println("The person at the front is: " + queue.peekFront());

      queue.removePerson();

  }

}
