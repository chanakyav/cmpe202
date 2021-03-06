
public class HasMoneyState implements State {
    GumballMachine gumballMachine;
    
    public HasMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
   
    private void updateMoneyState(int value) {
        if (gumballMachine.getMoney() >= gumballMachine.getCost()) {
            System.out.println("You can't insert more coins");
        } else {
            gumballMachine.setMoney(value);
            String s = (gumballMachine.getMoney() < gumballMachine.getCost()) ?
                        " Add more money" : "";
            System.out.println("You inserted " + gumballMachine.getMoney() +
                               " cents in total." + s);
        }
    }
    
    public void insertNickel() {
        if (gumballMachine.getMachine() == Constants.MACH_THREE) {
            updateMoneyState(Constants.NICKEL);
        } else {
            System.out.println("Please insert a quarter");
        }
    }
    
    public void insertDime() {
        if (gumballMachine.getMachine() == Constants.MACH_THREE) {
            updateMoneyState(Constants.DIME);
        } else {
            System.out.println("Please insert a quarter");
        }
    }
    
    public void insertQuarter() {
        updateMoneyState(Constants.QUARTER);
    }
    
    public void insertDollar() {
        if (gumballMachine.getMachine() == Constants.MACH_THREE) {
            updateMoneyState(Constants.DOLLAR);
        } else {
            System.out.println("Please insert a quarter");
        }
    }
    
    public void ejectCoins() {
        System.out.println("Your money is returned");
        gumballMachine.setMoney(-gumballMachine.getMoney());
        gumballMachine.setState(gumballMachine.getNoMoneyState());
    }
    
    public void turnCrank() {
        if (gumballMachine.getMoney() < gumballMachine.getCost()) {
            System.out.println("You can't turn, you don't have enough money");
        } else {
            System.out.println("You turned...");
            gumballMachine.setMoney(-gumballMachine.getMoney());
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
    
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
    public void reset() {
        System.out.println("Resetting to new machine");
        ejectCoins();
    }
    
    public String toString() {
        if (gumballMachine.getMachine() != Constants.MACH_THREE) {
            return "waiting for turn of crank";
        }
        else if (gumballMachine.getMoney() < gumballMachine.getCost()) {
            return "waiting for more coins";
        } else return "waiting for turn of crank";
    }
}
