import java.lang.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
class Player
{
	private String name;
	private int age;
	private String gender;
	private String place;
	private int total;
	public Player()
	{
		name=" ";
		age=0;
		gender=" ";
		place=" ";
		total=0;
	}
	public Player(String n,int a,String g,String p)
	{
		name=n;
		age=a;
		gender=g;
		place=p;
		total=0;
	}
	public void setTotal(int val)
	{
		total=val;
	}
	public int getTotal()
	{
		return total;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getGender()
	{
		return gender;
	}
	public String getPlace()
	{
		return place;
	}
}
class Question
{
	private String ques,c1,c2,c3,c4,original;
	private int answer;
	private int money;
	public Question()
	{
		ques=" ";
		c1=" ";
		c2=" ";
		c3=" ";
		c4=" ";
		answer=0;
		original=" ";
		money=0;
	}
	public Question(String q,String a,String b,String c,String d,int m)
	{
		ques=q;
		c1=a;
		c2=b;
		c3=c;
		c4=d;
		answer=0;
		money=m;
	}
	public void setQues(String q)
	{
		ques=q;
	}
	public void setChoice1(String a)
	{
		c1=a;
	}
	public void setChoice2(String b)
	{
		c2=b;
	}
	public void setChoice3(String c)
	{
		c3=c;
	}
	public void setChoice4(String c)
	{
		c4=c;
	}
	public void setOriginalAnswer(String e)
	{
		original=e;
	}
	public void setAnswer(int ans)
	{
		answer=ans;
	}
	public void setMoney(int mon)
	{
		money=mon;
	}
	public String getQues()
	{
		return ques;
	}
	public String getChoice1()
	{
		return c1;
	}
	public String getChoice2()
	{
		return c2;
	}
	public String getChoice3()
	{
		return c3;
	}
	public String getChoice4()
	{
		return c4;
	}
	public String getOriginalAnswer()
	{
        return original;
	}
	public int getAnswer()
	{
		return answer;
	}
	public int getMoney()
	{
		return money;
	}
}
public class Mod1 {
	private static final Random randnum=new Random();
	private static int  fincount;
    public static void clear()
    {
    	System.out.flush();
    }
    public static void space()
    {
		for(int i=1;i<=10;i++)
		{
			System.out.println();
		}
    }
    public static void slp(int val)
    {
    	try
		{
		Thread.sleep(val);
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured");
		}
    }
    public static void assignQuestion(Question q,int val)
    {
    	switch(val+1)
    	{
    	case 1:
    		q.setQues("Who was recently conferred the CHEVALIAR AWARD of the French Government?");
    		q.setChoice1("1.Shah Rukh Khan");
    		q.setChoice2("2.Kamal Hasan");
    		q.setChoice3("3.Amitabh Bachan");
    		q.setChoice4("4.Rajinikanth");
    		q.setOriginalAnswer("2.Kamal Hasan");
    		q.setAnswer(2);
    		q.setMoney(1000);
    		break;
    	case 2:
    		q.setQues("Who is the opponent for Donald Trumph in the upcoming US elections?");
    		q.setChoice1("1.Barack Obama");
    		q.setChoice2("2.Ted Cruaz");
    		q.setChoice3("3.Bernie Sanders");
    		q.setChoice4("4.Hilary Clinton");
    		q.setOriginalAnswer("4.Hilary Clinton");
    		q.setAnswer(4);
    		q.setMoney(2000);
    		break;
    	case 3:
    		q.setQues("Who is the author of 'PONNIYIN SELVAN'?");
    		q.setChoice1("1.Kalki");
    		q.setChoice2("2.Kalaignar Karunanathi");
    		q.setChoice3("3.Jaya Kanthan");
    		q.setChoice4("4.Sujatha");
    		q.setOriginalAnswer("1.Kalki");
    		q.setAnswer(1);
    		q.setMoney(5000);
    		break;
    	case 4:
    		q.setQues("From which place did Titanic begin from?");
    		q.setChoice1("1.Northampton");
    		q.setChoice2("2.Cambridge");
    		q.setChoice3("3.London");
    		q.setChoice4("4.Southampton");
    		q.setOriginalAnswer("4.Southampton");
    		q.setAnswer(4);
    		q.setMoney(10000);
    		break;
    	case 5:
    		q.setQues("What is the name of the current Pope?");
    		q.setChoice1("1.Pope Alexandar 1");
    		q.setChoice2("2.Pope Francis 2");
    		q.setChoice3("3.Pope Victor");
    		q.setChoice4("4.Pope George 14");
    		q.setOriginalAnswer("2.Pope Francis 2");
    		q.setAnswer(2);
    		q.setMoney(20000);
    		break;
    	case 6:
    		q.setQues("What is the capital of Brunei?");
    		q.setChoice1("1.Bandar Seri Begawan");
    		q.setChoice2("2.Minsk");
    		q.setChoice3("3.Ulanbator");
    		q.setChoice4("4.Sana");
    		q.setOriginalAnswer("1.Bandar Seri Begawan");
    		q.setAnswer(1);
    		q.setMoney(40000);
    		break;
    	case 7:
    		q.setQues("You have a house in the north pole.Which direction will the house face?");
    		q.setChoice1("1.North");
    		q.setChoice2("2.East");
    		q.setChoice3("3.West");
    		q.setChoice4("4.South");
    		q.setOriginalAnswer("4.South");
    		q.setAnswer(4);
    		q.setMoney(80000);
    		break;
      	case 8:
    		q.setQues("Who is the current CFO of FaceBook?");
    		q.setChoice1("1.Mark Zuckerberg");
    		q.setChoice2("2.Eduardo Saverin");
    		q.setChoice3("3.David Wehner");
    		q.setChoice4("4.Andrew McCullum");
    		q.setOriginalAnswer("3.David Wehner");
    		q.setAnswer(3);
    		q.setMoney(160000);
    		break;
    	case 9:
    		q.setQues("Which team has won the second most number of FIFA world cup?");
    		q.setChoice1("1.Italy");
    		q.setChoice2("2.Germany");
    		q.setChoice3("3.Uruguay");
    		q.setChoice4("4.Argentina");
    		q.setOriginalAnswer("1.Italy");
    		q.setAnswer(1);
    		q.setMoney(320000);
    		break;
    	case 10:
    		q.setQues("Which cricketer has the nickname 'Jammy'");
    		q.setChoice1("1.M.S.Dhoni");
    		q.setChoice2("2.Ajay Jadeja");
    		q.setChoice3("3.Rahul Dravid");
    		q.setChoice4("4.Roger Binny");
    		q.setOriginalAnswer("3.Rahul Dravid");
    		q.setAnswer(3);
    		q.setMoney(640000);
    		break;
    	case 11:
    		q.setQues("Who is the third MUSKETEER");
    		q.setChoice1("1.Aramis");
    		q.setChoice2("2.Dumos");
    		q.setChoice3("3.Arthos");
    		q.setChoice4("4.Pothos");
    		q.setOriginalAnswer("1.Aramis");
    		q.setAnswer(1);
    		q.setMoney(1000000);
    		break;
    	}
    }
    public static void lifeLine1(Question q,int i)
    {
    	int num=randnum.nextInt(4);
    	num=num%4+1;
    	if(num==q.getAnswer())
    	{
    		num=num%4+1;
    	}
    	Mod1.space();
    	Mod1.space();
    	Mod1.space();
    	Mod1.slp(1000);
    	System.out.printf("Question %d\n\n",i+1);
    	Mod1.slp(1000);
    	System.out.printf("	   %s\n\n",q.getQues());
    	if(q.getAnswer()>num)
    	{
    		switch(num)
    		{
    		case 1:
    			Mod1.slp(1000);
    			System.out.printf("		%s\n",q.getChoice1());
    			break;
    		case 2:
    			Mod1.slp(1000);
    			System.out.printf("		%s\n",q.getChoice2());
    			break;
    		case 3:
    			Mod1.slp(1000);
    			System.out.printf("		%s\n",q.getChoice3());
    			break;
    		case 4:
    			Mod1.slp(1000);
    			System.out.printf("		%s\n",q.getChoice4());
    			break;
    		}
    		Mod1.slp(1000);
    		    System.out.printf("		%s\n",q.getOriginalAnswer());
    	}
    	else
    	{
    		Mod1.slp(1000);
    		    System.out.printf("		%s\n",q.getOriginalAnswer());
    		switch(num)
    		{
    		case 1:
    			Mod1.slp(1000);
    			System.out.printf("		%s\n",q.getChoice1());
    			break;
    		case 2:
    			Mod1.slp(1000);
    			System.out.printf("		%s\n",q.getChoice2());
    			break;
    		case 3:
    			Mod1.slp(1000);
    			System.out.printf("		%s\n",q.getChoice3());
    			break;
    		case 4:
    			Mod1.slp(1000);
    			System.out.printf("		%s\n",q.getChoice4());
    			break;
    		}
    	}
    }
    public static void lifeLine2(int answer)
    {
    	System.out.println();
    	Mod1.slp(2000);
    	int val=randnum.nextInt(2);
    	val=val%2;
    		System.out.printf("\n		The Audience think that the correct answer is Option %d\n",answer);
    }
    public static void lifeLine3(Question q,int i,Player p)
    {
    	String in;
    	Scanner input=new Scanner(System.in);
    	Mod1.slp(2000);
    	Mod1.space();
    	Mod1.space();
    	Mod1.space();
    	System.out.printf("Question %d\n",i+1);
		System.out.println();
		Mod1.slp(1000);
		System.out.printf("     %s\n\n",q.getQues());
		Mod1.slp(1000);
		System.out.printf("		%s\n",q.getChoice1());
		Mod1.slp(1000);
		System.out.printf("		%s\n",q.getChoice2());
		Mod1.slp(1000);
		System.out.printf("		%s\n",q.getChoice3());
		Mod1.slp(1000);
		System.out.printf("		%s\n\n",q.getChoice4());
		Mod1.slp(1000);
		System.out.printf("	  The value for this question is %s\n",q.getMoney());
		Mod1.slp(1000);
		System.out.printf("\n	Make your First Guess....");
		int guess1=input.nextInt();
		if(guess1==q.getAnswer())
		{
			fincount++;
			System.out.print("\nYou Have Answered it RIGHT!!!!\n\n");
			Mod1.slp(1000);
			System.out.printf("CONGRATULATIONS!!!YOU WON Rs.%d\n\n",q.getMoney());
			Mod1.slp(1000);
			p.setTotal(q.getMoney());
			if(fincount==11)
			{
				System.out.printf("			CONGRATULATIONS!!!YOU ARE NOW A MILLIONAIRE!!!\n\n");
				Mod1.slp(10000);
				System.out.printf("         Thank you for playing...");
				Mod1.slp(5000);
				System.exit(0);
			}
			System.out.print("Press ENTER to continue...");
			 in=input.nextLine();
			 in=input.nextLine();
			Mod1.space();
			Mod1.space();
			Mod1.space();
			return;
		}
		else
		{
			
			Mod1.slp(1000);
			System.out.print("\n\nThat is a Wrong Answer.Make Your Second Guess...");
			int guess2=input.nextInt();
			if(guess2==q.getAnswer())
			{
				fincount++;
				System.out.print("\nYou Have Answered it RIGHT!!!!\n\n");
				Mod1.slp(1000);
				System.out.printf("CONGRATULATIONS!!!YOU WON Rs.%d\n\n",q.getMoney());
				Mod1.slp(1000);
				p.setTotal(q.getMoney());
				if(fincount==11)
				{
					
					System.out.printf("			CONGRATULATIONS!!!YOU ARE NOW A MILLIONAIRE!!!\n\n");
					Mod1.slp(10000);
					System.out.printf("         Thank you for playing...");
					Mod1.slp(5000);
					System.exit(0);
				}
				System.out.print("Press ENTER to continue...");
				 in=input.nextLine();
				 in=input.nextLine();
				Mod1.space();
				Mod1.space();
				Mod1.space();
				return;
			}
			else
			{
				System.out.print("\nWRONG ANSWER and You are OUT!!\n\n");
				Mod1.slp(1000);
				System.out.printf("CONGRATULATIONS!!YOU MANAGED TO WIN Rs.%d\n\n",p.getTotal());
				Mod1.slp(5000);
				System.out.printf("         Thank you for playing...");
				Mod1.slp(5000);
				System.exit(0);
			}
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String name,gen,place;
		int age;
		//Timer timer=new Timer();
		//timer.schedule(ne
	// TimerTask(){@Override public void run(){System.out.println("hi");}},5000);
		Mod1.space();
		System.out.println("                                                        Welcome to the Game Of");
		Mod1.slp(2000);
		System.out.println();
		System.out.println("                                                  'WHO DARES TO BECOME A MILLIONAIRE'");
		System.out.println();
		Mod1.slp(2000);
		System.out.println("                                                        Created by : S.GANESH");
		Mod1.slp(2000);
		Mod1.space();
		System.out.println("Press ENTER to continue.........");
		String in=input.nextLine();
		Mod1.space();
		Mod1.space();
		Mod1.space();
		System.out.print(" 		Enter Your Name   : ");
		name=input.next();
		System.out.print(" 		Enter Your Age    : ");
		age=input.nextInt();
		System.out.print(" 		Enter Your Gender : ");
		gen=input.next();
		System.out.print(" 		Enter Your Place  : ");
		place=input.next();
		Player p1=new Player(name,age,gen,place);
		Mod1.slp(2000);
		System.out.println();
		System.out.println();
		System.out.print("Now....Are You Ready to get in to the game?(Y/N)....");
		char ch=input.next().charAt(0);
		if(ch=='N')
		{
			Mod1.space();
			Mod1.space();
			System.out.println(" 		GOOD BYE and YOU MISSED THE OPPORTUNITY TO BECOME A MILLIONAIRE");
			System.exit(0);
		}
		Mod1.space();
		Mod1.space();
		Mod1.space();
		System.out.println("RULES OF THE GAME");
		System.out.println();
		Mod1.slp(2000);
		System.out.println("1.Only one Player should play the Game");
		Mod1.slp(2000);
		System.out.println("2.Strictly...No Googling");
		Mod1.slp(2000);
		System.out.println("3.You have 11 Questions to answer and I will give a certain amount of MONEY to you after completing each question");
		Mod1.slp(2000);
		System.out.println("4.You can have three lifelines each only once during the game");
		Mod1.slp(2000);
		System.out.println("   (1) Fifty-Fifty");
		Mod1.slp(2000);
		System.out.println("   (2) Ask The Audience");
		Mod1.slp(2000);
		System.out.println("   (3) Two Time Guessing");
		Mod1.slp(2000);
		System.out.println();
		System.out.println();
		System.out.println("(1) Fifty-Fifty");
		Mod1.slp(2000);
		System.out.println("       Sometimes you are perplexed with four choices.If you use this lifeline then the number of choices will become two.");
		Mod1.slp(2000);
		System.out.println("(2) Ask The Audience");
		Mod1.slp(2000);
		System.out.println("       If you are not certain with your answer make the AUDIENCE answer it.  (CAREFUL...It can also be wrong)");
		Mod1.slp(2000);
		System.out.println("(3) Two Time Guessing");
		Mod1.slp(2000);
		System.out.println("       Why Guess once..Guess it twice to get it right.");
		Mod1.slp(2000);
		System.out.println();
		System.out.println();
		System.out.println("Press Enter to begin the game....");
		in=input.nextLine();
		in=input.nextLine();
		Mod1.space();
		Mod1.space();
		Mod1.space();
		System.out.printf("So %s Lets Begin the quest to become a Millionaire...\n\n",p1.getName());
		Mod1.slp(2000);
		Question [] q=new Question[15];
		for(int i=0;i<11;i++)
		{
			q[i]=new Question();
		Mod1.assignQuestion(q[i],i);
		}
		int [] visited=new int[5];
		for(int j=1;j<5;j++)
		{
			visited[j]=0;
		}
		for(int i=0;i<11;i++)
		{
			int flag=0;
		System.out.printf("Question %d\n",i+1);
		System.out.println();
		Mod1.slp(1000);
		System.out.printf("     %s\n\n",q[i].getQues());
		Mod1.slp(1000);
		System.out.printf("		%s\n",q[i].getChoice1());
		Mod1.slp(1000);
		System.out.printf("		%s\n",q[i].getChoice2());
		Mod1.slp(1000);
		System.out.printf("		%s\n",q[i].getChoice3());
		Mod1.slp(1000);
		System.out.printf("		%s\n\n",q[i].getChoice4());
		Mod1.slp(1000);
		System.out.printf("	  The value for this question is Rs.%d\n",q[i].getMoney());
		
		while(true)
		{
			System.out.println();
			System.out.println();
			Mod1.slp(1000);
		System.out.print("Press 1 to Answer or 2 for Lifelines......");
		int cho=input.nextInt();
		if(cho==1)
		{
			System.out.print("Enter Your Answer(Option) : ");
			int ans=input.nextInt();
			if(ans==q[i].getAnswer())
			{
				fincount++;
				System.out.print("\nYou Have Answered it RIGHT!!!!\n\n");
				Mod1.slp(1000);
				System.out.printf("CONGRATULATIONS!!!YOU WON Rs.%d\n\n",q[i].getMoney());
				Mod1.slp(1000);
				p1.setTotal(q[i].getMoney());
				if(fincount==11)
				{
					System.out.printf("			CONGRATULATIONS!!!YOU ARE NOW A MILLIONAIRE!!!\n\n");
					Mod1.slp(10000);
					System.out.printf("         Thank you for playing...");
					Mod1.slp(5000);
					System.exit(0);
				}
				System.out.print("Press ENTER to continue...");
				in=input.nextLine();
				in=input.nextLine();
				Mod1.space();
				Mod1.space();
				Mod1.space();
				break;
			}
			else
			{
				System.out.print("WRONG ANSWER and You are OUT!!\n\n");
				Mod1.slp(1000);
				System.out.printf("CONGRATULATIONS!!YOU MANAGED TO WIN Rs.%d\n\n",p1.getTotal());
				Mod1.slp(5000);
				System.out.printf("         Thank you for playing...");
				Mod1.slp(5000);
				System.exit(0);
			}
		}
		
		else if(cho==2)
		{
			int count=0;
			System.out.println("\nLIFELINES\n");
			Mod1.slp(1000);
				System.out.printf("		%d) Fifty-Fifty\n",++count);
				Mod1.slp(1000);
				System.out.printf("		%d) Ask The Audience\n",++count);
				Mod1.slp(1000);
				System.out.printf("		%d) Two Time Guessing\n",++count);
				Mod1.slp(1000);
				System.out.printf("		%d) Back\n",++count);
				System.out.println();
				System.out.println();
				System.out.print(" 	Select an option : ");
				int op=input.nextInt();
				
				switch(op)
				{
				case 1:
					if(visited[1]==1)
					{
						System.out.print("\n\nChoose Another Lifeline....");
						continue;
					}
					visited[1]=1;
					Mod1.lifeLine1(q[i],i);
					continue;					
				case 2:
					if(visited[2]==1)
					{
						System.out.print("\n\nChoose Another Lifeline....");
						continue;
					}
					visited[2]=1;
					Mod1.lifeLine2(q[i].getAnswer());
					continue;
					
				case 3:
					if(visited[3]==1)
					{
						System.out.print("\n\nChoose Another Lifeline....");
						continue;
					}
					visited[3]=1;
				Mod1.lifeLine3(q[i],i,p1);
				flag=1;
				break;
				case 4:
					continue;
		}
		}
		if(flag==1)
			break;
	}
		
}
}
	
}
