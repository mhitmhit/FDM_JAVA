package Exercise_3;

public class AverageCalculator {
	
	private long total;
	private long count;
	
	public long getTotal() {
		return total;	
	}
	
	public long getCount() {
		return count;
	}
	
	public synchronized void addToTotal(int number) {
		count++;
		total = total + number;
	}
	
	public double calcluateAverage() {
		return (double)total/count;
	}
	
}
