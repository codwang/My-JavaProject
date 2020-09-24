/**
 * 
 */
package day05;

/**
 * @author 13093
 *
 */
public class Clock {

	int hour;
	int sec;
	int min;
	public void showtime() 
	{
		while(true)
		{
		System.out.println("当前时间"+hour+":"+min+":"+sec);
		try {
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		addsec();
		}
		
	}
		
	
	public void addsec()
	{
		sec++;
		if(sec==60)
		{
			addmin();
			sec=0;
		}
	}
	public void addmin()
	{
		min++;
		if(min==60)
		{
			addhour();
			min=0;
		}
	}
	public void addhour()
	{
		hour++;
		if(hour==24)
		{
			hour=0;
		}
	}
	
}
