package practice;

public class Anonymous1 {
	Worker field = new Worker() {
		@Override
		public void start() {
			System.out.println("Designing");
		} // start
	};
	
	void method1() {
		Worker localVar = new Worker() {
			@Override
			public void start() {
				System.out.println("Developing");
			} // start
		};
		
		localVar.start();
	} // method1
	
	void method2(Worker worker) {
		worker.start();
	} // method2
	
} // end class
