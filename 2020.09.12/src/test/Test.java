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
	public void Sub_Balance(double x) //取
	{
		Balance=Balance-x;
		
	}
	public void Add_Balance(double x) //存
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
		System.out.println("-----------------欢迎光临！------------------");
		System.out.println("--------------银行ATM存取系统----------------");
		System.out.println("                1.登录");
		System.out.println("                2.查询余额");
		System.out.println("                3.存钱");
		System.out.println("                4.取钱");
		System.out.println("                0.退出        ");
		System.out.println("请选择[0-4]              ");
	}
	public void Load_Sys()//登录
	{
		
		System.out.println("请输入卡号:");
			Id=sc.next();
		System.out.println("请输入密码:");
		 Password=sc.next();
	}
	public void IsRight()
	{
		if(Id.equals(ac.CardId)&&Password.equals(ac.Password))
		{
			System.out.println("登陆成功!");
		}
		else
		{
			System.out.println("账号或密码有误,请重新尝试!");
			
		}
	}
	public void Inqu_Info()//查询用户账户
	{
		System.out.println("Name:"+ac.GetName());
		System.out.println("CardId:"+ac.GetCardId());
		System.out.println("Password:"+ac.GetPassword());
		System.out.println("Balance:"+ac.GetBalance());
		
	}
	public void BetBalance()//取款
	{
		System.out.println("请输入要取款的数量:");
		double money=sc.nextDouble();
		if(IsBalance(money)==1)
		{
			ac.Sub_Balance(money);
			System.out.println("取款成功!您的账户余额为:"+ac.GetBalance());
		}
		else
		{
			System.out.println("余额不足,请检查余额!");
		}	
	}
	public void AddBalance()//存款
	{
		System.out.println("请输入要存入的数量:");
		double money=sc.nextDouble();
		ac.Add_Balance(money);
		System.out.println("存款成功!您的账户余额为:"+ac.GetBalance());
	}
	public int IsBalance(double money)//判断余额是否足够
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
	
	public void SysOpter() //根据用户输入进行任务调度
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
					System.out.println("期待您的下次光临!");
					break;
					default :
						System.out.println("您的输入有误,请重新选择!");
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
