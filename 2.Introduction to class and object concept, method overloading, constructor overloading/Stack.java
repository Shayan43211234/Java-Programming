import java.util.Scanner;

class Stack
{
	int arr[] = new int[10];
	int tos;
	
	Stack(){
		tos = -1;
	}
	
	//push method
	void push(int data)
	{
		if(tos==arr.length-1)
			System.out.println("Stack is overflow.");
		else{
			tos++;
			arr[tos] = data;
		}
	}
	
	//pop method
	void pop()
	{
		if(tos==-1)
			System.out.println("Stack is underflow.");
		else{
			System.out.println(arr[tos] + " is removed from stack.");
			tos--;
			if(tos!=-1){
				System.out.println("Now the Stack is:");
				for(int i=tos; i>=0; i--)
					System.out.println(arr[i]);
			}else
				System.out.println("Now the stack is empty.");
		}
	}
}

class MainClass
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Stack ob = new Stack();
		boolean exit = false;
		
		while(!exit){
			System.out.println("\n1.Push an element in stack");
			System.out.println("2.Pop an element from stack");
			System.out.println("3.Exit from program");
			System.out.println("Enter your choice:");
			int choice;
			choice = scan.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Enter an element to insert in stack:");
					int n = scan.nextInt();
					ob.push(n);
					break;
				case 2:
					ob.pop();
					break;
				case 3:
					exit = true;
					break;
				default:
					System.out.println("Select Right Choice");
			}
		}
		scan.close();
	}		
}