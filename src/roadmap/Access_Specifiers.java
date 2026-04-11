package roadmap;

public class Access_Specifiers {

	public static void main(String[] args) {
		public class Clock {
		    private long time = 0;
		}
		
		public class Clock {
		    private long time = 0;

		    public long getTime() {
		        return this.time;
		    }

		    public void setTime(long theTime) {
		        this.time = theTime;
		    }
		}
		
		public class Clock {

		    private long time = 0;

		    private Clock(long time) {
		        this.time = time;
		    }

		    public Clock(long time, long timeOffset) {
		        this(time);
		        this.time += timeOffset;
		    }

		    public static Clock newClock() {
		        return new Clock(System.currentTimeMillis());
		    }

		}
		
		public class Clock {
		    long time = 0;
		}


		public class ClockReader {
		    Clock clock = new Clock();

		    public long readClock{
		        return clock.time;
		    }
		}
		
		public class Clock {
		    protected long time = 0;    // time in milliseconds
		}


		public class SmartClock() extends Clock{

		    public long getTimeInSeconds() {
		        return this.time / 1000;
		    }
		}
		
		public class Clock {
		    public long time = 0;
		}


		public class ClockReader {
		    Clock clock = new Clock();

		    public long readClock{
		        return clock.time;
		    }
		}
		
		
		
	}

}
