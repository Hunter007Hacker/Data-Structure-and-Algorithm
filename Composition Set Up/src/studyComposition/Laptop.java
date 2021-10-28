package studyComposition;

public class Laptop {
	private float screen;
	private Processor processor;  //complex property like Processor
	private String ram;
	private String hardDrive ;
	private GraphicCard graphicCard;  // complex property like GraphicCard
	private String opticalDrive;
	private String keyboard;
	
	public Laptop() {
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive ="2Tb";
		this.graphicCard =new GraphicCard();
		this.opticalDrive = "MLT LAYER";
		this.keyboard ="Backlid";
	}
	
	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicCard graphicCard,
			String opticalDrive, String keyboard) {
	
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicCard = graphicCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}
	

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
				+ ", graphicCard=" + graphicCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
	}


	public Processor getProcessor() {
		return processor;
	}

	public float getScreen() {
		return screen;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public GraphicCard getGraphicCard() {
		return graphicCard;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public String gamingMode() {
		processor.setFrequency(processor.getMaxFrequency());
		return "success";
	}
	
	

}
