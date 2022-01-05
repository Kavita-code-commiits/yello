public class CountOccurenceOfCharacter{

public static void main(String [] args)
{

String value="My name is kavita";
int count=0;
int size=value.length();
char [] mh=new char[size];
char [] ch=new char[size];
for(int j=0;j<size;j++)
{
 mh[j]=value.charAt(j);
}
for(int i=0;i<size;i++)
{
 ch[i]=value.charAt(i);
}



for(int i=0;i<size;i++ )
{
 
 for(int j=0;j<size;j++)
{ 

  
  if(mh[i]==ch[j])
   {    count+=1;}

	
  		

}
System.out.println(mh[i]+":repeats:"+count);
count=0;



}

}
}