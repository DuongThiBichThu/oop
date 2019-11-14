
package Ex3_4;
public class MyTime{
	private  int hour;
	private int minute;
	private int second;
	
	public MyTime() {
		this.hour=0;
		this.minute=0;
		this.second=0;
	}

	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return hour+":"+minute+":"+second;
	}
	public MyTime nextSecond() {
		if(second==59 && minute<59 && hour <23) {
			minute++;
			second=0;
		}
		else if(second ==59 && minute==59 && hour<23) {
			hour++;
			second=0;
			minute=0;
		}
		else if(second==59 && minute==59 && hour==23) {
			hour=0;
			minute=0;
			second=0;
		}
		else 
			second++;
		return this;
	}
	public MyTime nextMinute() {
		if(this.minute<59 && this.hour<23) {
			minute++;
		}
		else if(this.minute==59 && this.hour<23) {
			minute=0;
			hour++;
		}
		else if(this.minute==59 && this.hour==23) {
			minute=0;
			hour=0;
		}
		return this;
	}
	public MyTime nextHour() {
		if(this.hour==23) {
			hour=0;
		}
		else
			hour++;
		return this;
	}
	public MyTime previousSecond() {
		if(this.second==0 && this.minute>0 && this.hour>0 ) {
			minute--;
			second=59;
		}
		else if(this.second ==0 && this.minute==0 && this.hour >0) {
			hour--;
			second=59;
			minute=59;
		}
		else if(this.second==0 && this.minute==0 && this.hour == 0) {
			hour=23;
			minute=59;
			second=59;
		}
		else
			second--;
		return this;
	}
	public MyTime previousMinute() {
		if(this.minute==0 && this.hour>0) {
			hour--;
			minute=59;
		}
		else if(this.minute==0 && this.hour==0) {
			hour=23;
			minute=59;
		}
		return this;
	}
	public MyTime previousHour() {
		if(this.hour==0) {
			hour=23;
		}
		else
			hour--;
		return this;
	}	
	
}