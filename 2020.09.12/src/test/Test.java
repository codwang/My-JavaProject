/**
 * 
 */
package test;

import java.util.Scanner;
class Account
{
	 String CardId="123456";
	 String Name="zhangsan";
	 String Password="090765";
	 double Balance=20.0;
//	 public Account(String CardId,String Name,String Password,double Balance)
//	 {
//		 this.CardId=CardId;
//		 this.Name=Name;
//		 this.Password=Password;
//		 this.Balance=Balance;
//	 }
	public String GetCardId()
	{
		return CardId;
	}
	public String GetName()
	{
		return Name;
	}
	public String GetPassword()
	{
		return Password;
	}
	public double GetBalance()
	{
		return Balance;
	}
	public void Sub_Balance(double x) //ȡ
	{
		Balance=Balance-x;
		
	}
	public void Add_Balance(double x) //��
	{
		Balance=Balance+x;
	}
}
class ATM
{
	String Id;
	String Password;
	Account ac=new Account();
	//ATM at=new ATM();
	Scanner sc=new Scanner(System.in);
	public void Welcome()
	{
		System.out.println("-----------------��ӭ���٣�------------------");
		System.out.println("--------------����ATM��ȡϵͳ----------------");
		System.out.println("                1.��¼");
		System.out.println("                2.��ѯ���");
		System.out.println("                3.��Ǯ");
		System.out.println("                4.ȡǮ");
		System.out.println("                0.�˳�        ");
		System.out.println("��ѡ��[0-4]              ");
	}
	public void Load_Sys()//��¼
	{
		
		System.out.println("�����뿨��:");
			Id=sc.next();
		System.out.println("����������:");
		 Password=sc.next();
	}
	public void IsRight()
	{
		if(Id.equals(ac.CardId)&&Password.equals(ac.Password))
		{
			System.out.println("��½�ɹ�!");
		}
		else
		{
			System.out.println("�˺Ż���������,�����³���!");
			
		}
	}
	public void Inqu_Info()//��ѯ�û��˻�
	{
		System.out.println("Name:"+ac.GetName());
		System.out.println("CardId:"+ac.GetCardId());
		System.out.println("Password:"+ac.GetPassword());
		System.out.println("Balance:"+ac.GetBalance());
		
	}
	public void BetBalance()//ȡ��
	{
		System.out.println("������Ҫȡ�������:");
		double money=sc.nextDouble();
		if(IsBalance(money)==1)
		{
			ac.Sub_Balance(money);
			System.out.println("ȡ��ɹ�!�����˻����Ϊ:"+ac.GetBalance());
		}
		else
		{
			System.out.println("����,�������!");
		}	
	}
	public void AddBalance()//���
	{
		System.out.println("������Ҫ���������:");
		double money=sc.nextDouble();
		ac.Add_Balance(money);
		System.out.println("���ɹ�!�����˻����Ϊ:"+ac.GetBalance());
	}
	public int IsBalance(double money)//�ж�����Ƿ��㹻
	{
		if(money<ac.GetBalance())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public void SysOpter() //�����û���������������
	{
		int select;
		do
		{
			Welcome();
			select=sc.nextInt();
			switch(select)
			{
				case 1:
					Load_Sys();
					IsRight();
					break;
				case 2:
					Inqu_Info();
					break;
				case 3:
					AddBalance();
					break;
				case 4:
					BetBalance();
					break;
				case 0:
					System.out.println("�ڴ������´ι���!");
					break;
					default :
						System.out.println("������������,������ѡ��!");
						break;
			}
		}while(select!=0);	
	}
}
public class Test {

	public static void main(String[] args) {
		ATM at=new ATM();
		at.SysOpter();
		
	}

}
