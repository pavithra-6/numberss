package guvi;
import java.util.Scanner;
public class numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int sum=0;
int n;
System.out.println("enter the arry of element");
Scanner s=new Scanner(System.in);
System.out.println("enter all element");
n=s.nextInt();
int a[]=new int[n];
for(int j=0;j<n;j++)
{
		a[j]=s.nextInt();
	}
	for(int i=0;i<n;i++){
	if(a[i]%2==0){
	sum=sum+a[i];
      }
	}

System.out.println(sum);
	}

}

