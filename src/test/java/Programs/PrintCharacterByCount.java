package Programs;

public class PrintCharacterByCount {

	public static void main(String[] args) 
	{
		String st="a2b3c4";
		for(int i=0;i<st.length();i++)
		{
			if(Character.isAlphabetic(st.charAt(i)))
			{
				System.out.print(st.charAt(i));
			}
			else
			{
				int charCount=Character.getNumericValue(st.charAt(i));
				for(int j=0;j<charCount-1;j++)
				{
					System.out.print(st.charAt(i-1));
				}
			}
		}

	}

}
