package HW_21;

public class QueueArray <T> {

	Object [] ArrayQueue;
	int rear , front,Size;
	//read last item added , front first element added
	public QueueArray(int size) {
		this.Size=size;
		ArrayQueue=new Object[this.Size];
		front=-1;
		rear=-1;
		
	}
	Boolean isFull () {
		return(rear==Size-1);
			
	}
	Boolean isEmpty () {
		return(front==-1 || front>rear);
			
	}
	public void Queue(Object NewItem) {
		if(isFull()) {
			System.out.println("it is full");
			return;
		}
		rear=rear+1;
		ArrayQueue[rear]=NewItem;
		if(front==-1)
			front=0;
	}
	public T DeQueue() {
		if(isEmpty()) {
			System.out.println("it is Empty");
		return null;
		}
		T objectOut=(T)ArrayQueue[front];
		front=front+1;
		return objectOut;
	}
	

}
