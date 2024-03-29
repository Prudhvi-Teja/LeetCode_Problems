//{ Driver Code Starts
import java.util.*;
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}

class GfG {
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}





// } Driver Code Ends


/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
	    QueueNode node = new QueueNode(a);
        // Your code here
        
        if(front== null){
            node.next = null;
            front = node; 
            rear = node;
        }
        else{
            node.next = null;
            rear.next = node;
            rear = node;
        }
        
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        int ans = -1;
        
        if(front== null)
            return ans;
        
        if(front == rear){
            ans = front.data;
            front = null;
            rear = null;
        }
        else{
            ans = front.data;
            front = front.next;
        }
        
        return ans;
        
	}
}




