package HW_21;
import java.util.Deque;
import java.util.ArrayDeque;
public class QueueArrayDemo {

	public static void main(String[] args) {
	Deque<String>deque=new ArrayDeque<>();
	deque.add("Ammar");
	deque.add("Do not worry");
	deque.add("You are in Top");
	deque.add("Always do not tired");
	deque.addFirst("So");
	System.out.println(deque);
	deque.remove();
	System.out.println(deque);
	deque.removeLast();
	System.out.println(deque);
	}

}
