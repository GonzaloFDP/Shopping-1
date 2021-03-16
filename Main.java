import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void print(String word) {
        System.out.println(word);
    }
    public static ArrayList<String> thingsBoughtInTotal = new ArrayList<String>();
    public static ArrayList<String> itemsPossible = new ArrayList<String>();
    public static ArrayList<String> itemsBought = new ArrayList<String>();
    public static ArrayList<String> list = new ArrayList<String>();
    public static int length = 0;
    public static int whatStoreRepeatLoop = 0;
    public static int readyToEndLoop = 0;
    public static int whatAisleRepeatLoop = 0;
    public static int whatMaterialRepeatLoop = 0;
    public static int proceedToCheckoutRepeatLoop = 0;
    static Scanner scanningStore = new Scanner(System.in);
    static Scanner scanningAisle = new Scanner(System.in);
    static Scanner scanningMaterials = new Scanner(System.in);
    static Scanner scanningCheckout = new Scanner(System.in);
    static Scanner scanningFinish = new Scanner(System.in);
    public static int store = 0;
    public static int aisle = 0;
    public static int material = 0;
    public static int checkoutOrNo = 0;
    public static int finishShopping = 0;
    public static int winCheckCounter = 0;

//    String[][] TheHomeDepotAisles = new String[2][4];

    public static String[][] TheHomeDepotAisles  =  {  
        {  "screwdriver",  "wrench", "hammer", "chisel", "pliers", "saw" },
        {  "soil", "plants",  "fertilizer",  "hoe" , "pickaxe", "shovel"},
        {  "sink", "faucet",  "bathtub",  "toilet", "shower head", "toilet paper" },
        {  "pan", "fork",  "knife",  "spoon", "plate", "pot" },
        {  "chainsaw", "drill", "grinder", "sander", "jackhammer", "leaf blower"}
     //  { -5, -2,  2, -9 }
    };
    public static String[][] SafewayAisles  =  {  
        {  "milk",  "eggs", "yogurt", "cheese", "butter", "ice cream" },
        {  "bread", "cereal", "cookie", "pasta", "cake", "waffer"},
        {  "lettuce", "carrot",  "broccoli",  "tomato", "onion", "beet" },
        {  "ground beef", "sausage",  "pork chop",  "steak", "ham", "salami" },
        {  "apple", "orange", "banana", "pomegrante", "mango", "cherry" },
     //  { -5, -2,  2, -9 }
    };
    /*TheHomeDepotAisles[0][0] = "screwdriver";
    TheHomeDepotAisles[0][1] = "wrench";
    TheHomeDepotAisles[0][2] = "plier";
    TheHomeDepotAisles[0][3] = "hammer";
    gardening
    TheHomeDepotAisles[1][0] = "soil";
    TheHomeDepotAisles[1][1] = "plants";
    TheHomeDepotAisles[1][2] = "fertilizer";
    TheHomeDepotAisles[1][3] = "hoe";
*/
    public static void load() {
        
        itemsPossible.add("screwdriver");
        itemsPossible.add("wrench");
        itemsPossible.add("hammer");
        itemsPossible.add("chisel");
        itemsPossible.add("pliers");
        itemsPossible.add("saw");
        itemsPossible.add("sink");
        itemsPossible.add("faucet");
        itemsPossible.add("bathtub");
        itemsPossible.add("toilet");
        itemsPossible.add("shower head");
        itemsPossible.add("toilet paper");
        itemsPossible.add("chainsaw");
        itemsPossible.add("drill");
        itemsPossible.add("grinder");
        itemsPossible.add("sander");
        itemsPossible.add("jackhammer");
        itemsPossible.add("leaf blower");
        itemsPossible.add("milk");
        itemsPossible.add("eggs");
        itemsPossible.add("yogurt");
        itemsPossible.add("cheese");
        itemsPossible.add("butter");
        itemsPossible.add("ice cream");
        itemsPossible.add("lettuce");
        itemsPossible.add("carrot");
        itemsPossible.add("broccoli");
        itemsPossible.add("tomato");
        itemsPossible.add("onion");
        itemsPossible.add("beet");
        itemsPossible.add("apple");
        itemsPossible.add("orange");
        itemsPossible.add("banana");
        itemsPossible.add("pomegrante");
        itemsPossible.add("mango");
        itemsPossible.add("cherry");
        itemsPossible.add("soil");
        itemsPossible.add("plants");
        itemsPossible.add("fertilizer");
        itemsPossible.add("hoe");
        itemsPossible.add("pickaxe");
        itemsPossible.add("shovel");
        itemsPossible.add("pan");
        itemsPossible.add("fork");
        itemsPossible.add("knife");
        itemsPossible.add("spoon");
        itemsPossible.add("plate");
        itemsPossible.add("pot");
        itemsPossible.add("bread");
        itemsPossible.add("cereal");
        itemsPossible.add("cookie");
        itemsPossible.add("pasta");
        itemsPossible.add("cake");
        itemsPossible.add("waffer");
        itemsPossible.add("ground beef");
        itemsPossible.add("sausage");
        itemsPossible.add("pork chop");
        itemsPossible.add("steak");
        itemsPossible.add("ham");
        itemsPossible.add("salami");

        length = itemsPossible.size();
        // System.out.println(itemsPossible);
    }

    public static void shoppingList(int lengthy) {
        Random rand = new Random();
        for (int i = 0; i < lengthy; i++) {
            int rand_int = rand.nextInt(3);
            if (rand_int == 1) {
                list.add(itemsPossible.get(i));
            }
        }
        System.out.println(list);
    }

    public static int whatStore() {
        whatStoreRepeatLoop = 0;
        while (whatStoreRepeatLoop == 0) {
            print("What store do you want to go to, The Home Depot(1) or Safeway(2)?");
            store = scanningStore.nextInt();
            if (store == 1 || store == 2) {
                whatStoreRepeatLoop = 1;
                return store;
       
            } else {
                print("\nThat store does not exist.");
                whatStoreRepeatLoop = 0;
            }
        
      }
      return 1;
    }

    public static void checkout(String storeCheckout, int numOfThingsBought, ArrayList<String> thingsBought){
        readyToEndLoop = 0;
        print("Thank you for coming to " + storeCheckout + ". You bought " + numOfThingsBought + " things. Those things are " + thingsBought + ".");
        itemsBought.clear();
        print("*You exit the store*");
        while (readyToEndLoop == 0){
            print("Would you like to Keep shopping(1) or Finish(2)?");
            finishShopping = scanningFinish.nextInt();
            if(finishShopping == 1){
                readyToEndLoop = 1;
                runWhatStoreAndAisle();
            } else if(finishShopping == 2){
                print("Let's see if you won");
                readyToEndLoop = 1;
                winCheck();
            } else {
                print("\nThat is not a valid function.");
                readyToEndLoop = 0;
            }
        }
    }

    public static void whatAisle(int storey) {
        whatAisleRepeatLoop = 0;
        whatMaterialRepeatLoop = 0;
        proceedToCheckoutRepeatLoop = 0;
        if (storey == 1) {
            
            
            while(whatAisleRepeatLoop == 0){
                print(
                    "Aisle List:\n 1 - Hand Tools \n 2 - Yard Work \n 3 - Bath \n 4 - Kitchenware \n 5 - Power Tools \n 6 - Outdoor Tools");
                print("What aisle?");
                aisle = scanningAisle.nextInt();
                if(aisle <= 5){
                    whatAisleRepeatLoop = 1;
                } else {
                    print("\nThat aisle is not available.");
                    whatAisleRepeatLoop = 0;
                }
            }
            
            
            while(whatMaterialRepeatLoop == 0){
                for (int i = 0; i<TheHomeDepotAisles[aisle-1].length; i++){
                System.out.println(i+1 + " - " + TheHomeDepotAisles[aisle-1][i]);
                }
                print("What do you want to buy?");
                material = scanningMaterials.nextInt();
                if(material <= 6){
                    whatMaterialRepeatLoop = 1;
                } else {
                    print("\nThat is not available.");
                    whatMaterialRepeatLoop = 0;
                }
            }
            itemsBought.add(TheHomeDepotAisles[aisle-1][material-1]);
            thingsBoughtInTotal.add(TheHomeDepotAisles[aisle-1][material-1]);
            
            while(proceedToCheckoutRepeatLoop == 0){
                print("You are going to buy a(n) " + TheHomeDepotAisles[aisle-1][material-1] + ". \nDo you want to Proceed to checkout(1) or Keep shopping(2)?");
                checkoutOrNo = scanningCheckout.nextInt();
                if(checkoutOrNo == 1){
                    proceedToCheckoutRepeatLoop = 1;
                    checkout("The Home Depot", itemsBought.size(), itemsBought);
                } else if (checkoutOrNo == 2){
                    proceedToCheckoutRepeatLoop = 1;
                    whatAisle(1);
                } else{
                    proceedToCheckoutRepeatLoop = 0;
                }
            }
        } else if (storey == 2){
           
            
            while(whatAisleRepeatLoop == 0){
                print(
                    "Aisle List:\n 1 - Dairy \n 2 - Wheat Products \n 3 - Vegetables \n 4 - Meat \n 5 - Fruit");
                print("What aisle?");
                aisle = scanningAisle.nextInt();
                if(aisle <= 5){
                    whatAisleRepeatLoop = 1;
                } else {
                    print("\nThat aisle is not available.");
                    whatAisleRepeatLoop = 0;
                }
            }
            
            
            while(whatMaterialRepeatLoop == 0){
                for (int i = 0; i<SafewayAisles[aisle-1].length; i++){
                System.out.println(i+1 + " - " + SafewayAisles[aisle-1][i]);
                }
                print("What do you want to buy?");
                material = scanningMaterials.nextInt();
                if(material <= 6){
                    whatMaterialRepeatLoop = 1;
                } else {
                    print("\nThat is not available.");
                    whatMaterialRepeatLoop = 0;
                }
            }
            itemsBought.add(SafewayAisles[aisle-1][material-1]);
            thingsBoughtInTotal.add(TheHomeDepotAisles[aisle-1][material-1]);
            
            while(proceedToCheckoutRepeatLoop == 0){
                print("You are going to buy a(n) " + SafewayAisles[aisle-1][material-1] + ". \nDo you want to Proceed to checkout(1) or Keep shopping(2)?");
                checkoutOrNo = scanningCheckout.nextInt();
                if(checkoutOrNo == 1){
                    proceedToCheckoutRepeatLoop = 1;
                    checkout("Safeway", itemsBought.size(), itemsBought);
                } else if (checkoutOrNo == 2){
                    proceedToCheckoutRepeatLoop = 1;
                    whatAisle(2);
                } else{
                    print("\nThat is not a valid function.");
                    proceedToCheckoutRepeatLoop = 0;
                }
            }
            
        }
    }

    public static void runWhatStoreAndAisle(){
        whatStore();
        whatAisle(store);
    }

    public static void winCheck(){
        //System.out.println(thingsBoughtInTotal);
        //System.out.println(list);
        if (thingsBoughtInTotal.size()  == list.size()){
            for (int i = 0; i < thingsBoughtInTotal.size(); i++){
                if(thingsBoughtInTotal.get(i).equals(list.get(i))){
                  winCheckCounter ++;  
                } else {
                    break;
                }
            }
            if(winCheckCounter == list.size()){
                print("You win :D");
            } else {
                print("You lose. Better luck next");
            }

        } else {
            print("You lost. Better luck next time");
        }
    }

    public static void main(String[] args) {
        print("\nWelcome to ShoppingSim, a game of remembering and using your B R A I N.\n \nBut don't mess up, because then you'll have to do it all over again. ;) ");
        print("\nGet the following items in the given order:");
        load();
        shoppingList(length);
        runWhatStoreAndAisle();
    }
}