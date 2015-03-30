package lingi2132;

public abstract class FibonacciGenerator {
	
	protected String outputDir;
	
	public void generateClass() {}
	
	public FibonacciGenerator(String outputDir) {
		this.outputDir = outputDir;
	}
	
	public static void main(String [] args) {
		
		FibonacciGenerator gen = new Generator(args[0]);
		gen.generateClass();
		
	}
}
