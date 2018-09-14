
public class LetterProject {

	public static void main(String[] args) 
	{
		EssayOne();
		EssayTwo();
		EssayThree();
	}
	
	public static void ParagraphTwo()
	{
		System.out.println("This is paragraph Two!!! ");
	}
	
	public static void Signature()
	{
		System.out.println("This is my signature!!! \n");
	}
	
	public static void EssayOne()
	{
		System.out.println("This is paragraph one!!! essay one");
		ParagraphTwo();
		System.out.println("This is my farwell!!! ");
		Signature();
	}
	
	public static void EssayTwo()
	{
		System.out.println("This is paragraph one!!! essay two ");
		ParagraphTwo();
		System.out.println("This is my farwell!!! number two");
		Signature();
	}
	
	public static void EssayThree()
	{
		System.out.println("This is paragraph one!!! essay three");
		ParagraphTwo();
		System.out.println("This is my farwell!!! number three");
		Signature();
	}

}
