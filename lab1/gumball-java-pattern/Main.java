
public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5,Constants.MACH_THREE);
    
        System.out.println(gumballMachine);

	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();

	System.out.println(gumballMachine);

	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	gumballMachine.insertQuarter();
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();

	System.out.println(gumballMachine);
	
	for(int i=0; i<5; i++) gumballMachine.insertDime();
	gumballMachine.turnCrank();
	
	gumballMachine.insertNickel();
	gumballMachine.insertQuarter();
	gumballMachine.insertQuarter();
	gumballMachine.ejectCoins();
	gumballMachine.turnCrank();
	
	gumballMachine.insertQuarter();
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	
	System.out.println(gumballMachine);
	
	for(int i=0; i<6; i++) gumballMachine.insertNickel();
	gumballMachine.insertQuarter();
	gumballMachine.ejectCoins();
	
	System.out.println(gumballMachine);
	
	gumballMachine.insertDollar();
	gumballMachine.turnCrank();
	
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	
	gumballMachine.setMachine(Constants.MACH_TWO);
	System.out.println(gumballMachine);
	
	gumballMachine.insertQuarter();
	gumballMachine.insertDime();
	gumballMachine.insertNickel();
	gumballMachine.turnCrank();
	gumballMachine.insertQuarter();
	gumballMachine.turnCrank();
	
	System.out.println(gumballMachine);
	
	gumballMachine.refill(10);
	
	System.out.println(gumballMachine);
    }
}
