package studyComposition;

public class Processor {

	
	private String brand;
	private String series;
	private String generation;
	private int core ; 
	private int thread;
	private String chacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxFrequency;
	
	public Processor() {
		this.brand = "Intel";
		this.series = "i5 7200u";
		this.generation = "8";
		this.core = 2;
		this.thread = 4;
		this.chacheMemory = "3mb";
		this.frequency ="3.5hz";
		this.minFrequency ="2.5";
		this.maxFrequency = "3.1ghz";
		
	}
	public Processor(String brand, String series, String generation, int core, int thread, String chacheMemory,
			String frequency, String minFrequency, String maxFrequency) {
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.core = core;
		this.thread = thread;
		this.chacheMemory = chacheMemory;
		this.frequency = frequency;
		this.minFrequency = minFrequency;
		this.maxFrequency = maxFrequency;
	}
	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", core=" + core
				+ ", thread=" + thread + ", chacheMemory=" + chacheMemory + ", frequency=" + frequency
				+ ", minFrequency=" + minFrequency + ", maxFrequency=" + maxFrequency + "]";
	}
	public String getBrand() {
		return brand;
	}
	public String getSeries() {
		return series;
	}
	public String getGeneration() {
		return generation;
	}
	public int getCore() {
		return core;
	}
	public int getThread() {
		return thread;
	}
	public String getChacheMemory() {
		return chacheMemory;
	}
	public String getFrequency() {
		return frequency;
	}
	public String getMinFrequency() {
		return minFrequency;
	}
	public String getMaxFrequency() {
		return maxFrequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	
	
   
}
