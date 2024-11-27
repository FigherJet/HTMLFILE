public class Loop5 
{
	public static void main(String[] args) {
		int s=5;
		for(int r=2;r<=10000;r++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(r+" x "+i+" = " +(r*i));
			}
			System.out.println("");
		}
	}

}