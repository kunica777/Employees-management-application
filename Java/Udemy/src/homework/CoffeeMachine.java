package homework;

    class CoffeeMachine {

        public static enum CoffeeType { ESPRESSO, AMERICANO, LATTE, FLAT_WHITE }

        public static void main(String... args) {
            CoffeeMachine coffeeMachine = new CoffeeMachine(0.2, 5.0, 10);
            coffeeMachine.brewCoffee(CoffeeType.LATTE);
        }//end of main method

        private double milk;
        private double water;
        private int beans;

        public CoffeeMachine(double milk, double water, int beans) {
            this.milk = milk;
            this.water = water;
            this.beans = beans;
        }

        public void brewCoffee(CoffeeType coffeeType) {
            Double waterLeft;
            Double milkLeft;
            int beansLeft;
            boolean brew=false;

            switch(coffeeType){
                case ESPRESSO:  // Espresso requires: 1.25 water, 11 beans
                    if(water>=1.25 && beans>=11){brew=true;}
                    else{
                        System.out.println("Sorry, cannot make "+coffeeType);
                        printState();}
                    break;
                case AMERICANO: // Americano requires: 1.95 water, 9 beans
                    if(water>=1.95 && beans>=9){brew=true;}
                    else{
                        System.out.println("Sorry, cannot make "+coffeeType);
                        printState();}
                    break;
                case FLAT_WHITE: // Flat white requires: 1.4 water, 0.45 milk, 10 beans
                    if(water>=1.4 && milk>=0.45 && beans>=10){brew=true;}
                    else{
                        System.out.println("Sorry, cannot make "+coffeeType);
                        printState();}
                    break;
                case LATTE: // Latte requires: 1.1 water, 0.75 milk. 10 beans
                    if(water>=1.1 && milk>=0.75 && beans>=10){brew=true;}
                    else{
                        System.out.println("Sorry, cannot make "+coffeeType);
                        printState();}
                    break;
                default: //invalid coffee type
                    System.out.println("Sorry coffee machine does not have recipe for this coffee type.");
                    break;}
            if(brew==true){
                System.out.println(coffeeType+" is ready.");
                System.out.println("Enjoy!");
            }}

        public void printState() {
            Double espresso[] = new Double[]{water-1.25, 0.0, beans-11.0};
            Double americano[] = new Double[]{water-1.95, 0.0, beans-9.0};
            Double flatWhite[] = new Double[]{water-1.4, milk-0.45, beans-10.0};
            Double latte[]= new Double[]{water-1.1, milk-0.75, beans-10.0};
            String suppliesNames[] = new String[] {"water", "milk", "beans"};
            int index = 0;
            for(Double ingridient: espresso){
                if(ingridient<0.0){System.out.print("No "+suppliesNames[index]+ " ");}
                index++;}
            for(Double ingridient: americano){
                if(ingridient<0.0){System.out.print("No "+suppliesNames[index]+ " ");}
                index++;}
            for(Double ingridient: flatWhite){
                if(ingridient<0.0){System.out.print("No "+suppliesNames[index]+ " ");}
                index++;}
            for(Double ingridient: latte){
                if(ingridient<0.0){System.out.print("No "+suppliesNames[index]+ " ");}
                index++;}
        }

    }//end of class

