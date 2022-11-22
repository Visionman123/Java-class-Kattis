package Frankfurt.Exercise.Week3.Question_5;

public class TestSimpleTimeClient {
	public static void main(String []args) {
		SimpleTimeClient client1=new SimpleTimeClient();
		SimpleTimeClient client2=new SimpleTimeClient();
		
		System.out.println(client1.toString());
		System.out.println(client2.toString());
		
		SimpleTimeClient client3=null;
		try {
			client3 = (SimpleTimeClient) client1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(client3.toString());
		System.out.println(client1.toString());
		
		
		System.out.println(client1.hashCode());
		System.out.println(client1.getClass());
		System.out.println(client1.equals(client2));
		System.out.println(client1.equals(client3));
	}
}
