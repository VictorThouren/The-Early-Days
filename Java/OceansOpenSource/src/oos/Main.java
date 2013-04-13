package oos;
import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        int mates=5;
        int jackers=0;
        int conmen=0;
        int gangsters=5;
        int gunits=0;
        int bestmates=1;
        int userpickscity=0;
        int sedans=0;
        int pickuptrucks=0;
        int vans=0;
        int tanks=0;
        int helicopters=0;
        int racecars=0;
        int armoredvans=0;
        int hummers=0;
        int bikes=0;
        long civilians=0;
        long money=500;
        boolean ownsbroadcastingcompany=false;
        int politicalpower=0;
        int criminalmissionchoice=0;
        int criminalmissionpage=1;
        int choosecriminalmission=0;
        int criminalmissionpagemax=2;
        int criminalmissionmax=5;
        int acceptcriminalmission=0;
        int numberofgangsterstosend=0;
        int numberofjackerstosend=0;
        int numberofconmentosend=0;
        int criminalmissionrandomnumber1=((1) * (int) (Math.random() * (100)));
        int criminalmissionrandomnumber2=((1) * (int) (Math.random() * (100)));
        int criminalmissionrandomnumber3=((1) * (int) (Math.random() * (100)));
        int criminalmissionrandomnumber4=((1) * (int) (Math.random() * (100)));
        int typeofvehiclestosend=0;
        int numberofvehiclestosend=0;
        int numberoftier1vehicles=0;
        int numberoftier2vehicles=0;
        int gangsterwon=0;
        int gangsterarrested=0;
        int gangsterescaped=0;
        int moneygainedinmission=0;
        int moneygainedinturn=0;
        boolean startmission=false;
        
        /*
         * First FOR loop of the entire game. :)
         * This loop is just character creation.
         * A FOR loop is used so that you can easily quit the loop whenever I feel like it.
         * And so that if the user fucks around and inputs the wrong thing,
         * it'll just reloop and start from the top.
         */
        for(int counter=0;counter<999999;counter++){
            System.out.println("What City do you wish to start in?");
            System.out.println("1. Detroit, +5 Mates and +1 Best Mate.");
            System.out.println("2. Lansing, +5 Conmen and +10000 Civilians.");
            System.out.println("3. Grand Rapids, +2 Jackers, 2 Sedans, and 1 Van.");
            userpickscity = scan.nextInt();
            if(userpickscity == 1){
                System.out.println("Detroit selected.");
                mates=mates+5;
                gangsters=gangsters+5;
                bestmates=bestmates+1;
                break;
            }
            else if(userpickscity == 2){
                System.out.println("Lansing selected.");
                mates=mates+5;
                conmen=conmen+5;
                civilians = civilians+10000;
                break;
            }
            else if(userpickscity == 3){
                System.out.println("Grand Rapids selected.");
                mates=mates+2;
                jackers=jackers+2;
                sedans=sedans+2;
                vans=vans+1;
                break;
            }
            else{
                System.out.println("You didn't pick one of the choices.\nTry Again.");
                continue;
            }
        }



        /*
         * Yeah, this is where the broadcasting missions start.
         * On game turn start, first you get asked if you want to do broadcasting missions
         * if you own a broadcasting company, which you won't in the very beginning.
         * It's attached to a boolean that won't turn on until you do own one,
         * so some players may never know that a whole 'nother set of missions
         * because they never owned a BC company.
         */
        if(ownsbroadcastingcompany){
            System.out.println("Broadcasting Mission");
            for(int counter=0;counter<999999;counter++){
                System.out.println("We gonna code allll this shit in later.");
                break;
                /*Broadcasting Missions go here.
                 * We should focus on a variety of if->then statements that ask you
                 * to do things at each seperate broadcasting company. This way, adding
                 * in new broadcasting companies won't be that hard.
                 * It will also allow you to do mass broadcasting on ALL your
                 * stations in one turn, which sounds more realistic then one at a time.
                 */
            }
        }
        
        /*
         * And that ends the broadcasting company loop. Woohoo.
         */
        
        
        /*
         * The Criminal missions start up next. These start up from game start, so the for loop ALWAYS
         * occurs. This loop is going to get convuluted quick, so comments are going to be placed
         * fuckin' everywhere.
         */
        
        
        System.out.println("Criminal Mission");/*only pops up once a turn because it's outside of the loop. This way, if the loop restarts because of bad input, this message won't show up again.*/
        for(int counter=0;counter<999999;counter++){
            System.out.println("You currently have " + mates + " Mates, " + bestmates + " Best Mates and " + money + " dollars.");
            System.out.println("To pick a mission, input 1.\nTo look at the breakdown of your Mates, input 2.");
            criminalmissionchoice=scan.nextInt();


            /*Alright, so the user chooses to whether see how many Jackers, Gangsters, etc he has, OR he can start looking at missions.
             * Both of these are tied to IF's, so it gets repeatedly complicated.
             */

            /*Beneath this is the IF statement for the Mission Picker Book thing.
             * This automatically starts on page 1 every turn.
             */


            if(criminalmissionchoice==1){
                criminalmissionpage=1;/*Causes the book to start on page 1 only once a turn.*/
                
                
                
                for(int counter1=1;counter1<999999;counter1++){/*this is the monstrous for loop that handles picking and running missions.*/

                    /*Beneath this is a switch that handles displaying the book. Quite simply, depending on the value of the variable
                     * criminalmissionpage, a different set of Print commands will run. I chose a switch, because I figured
                     * it'd be easier to add more pages that way, but it still requires changing a few variables also.
                     */

                    switch(criminalmissionpage){
                       case 1: System.out.println("1. EASY: Steal From Oi Girls\n2. EASY: Steal a Bike\n3. EASY: Smuggle In Canadian Weed\n4. EASY: Prevent Canadian Pollution\n5. EASY: Shake Down a Drug Dealer\nChoose one of the Missions, or input 101 to switch pages, or input 100 to cancel.");break;
                       
                   }

                    /*
                     * This is one of those variables you change if you want to add more pages.
                     * Changing whatever's on the other side of the == to a number that is one
                     * greater than the amount of pages will allow you to prevent players from breaking the game
                     * because when they hit the first nonexistent page, they get bumped back to
                     * the first page, and the whole loop restarts.
                     */


                   if(criminalmissionpage==2){
                       System.out.println("End of Mission list. Restarting from beginning.");
                       criminalmissionpage=1;
                       continue;
                   }

                    /*
                     * Scans for what mission you're choosing.
                     */

                   choosecriminalmission=scan.nextInt();

                   /*
                    * If you choose the 101 command and you're not on the last page, then you flip to the next page
                    * by increasing criminalmissionpage up by one, and then restarting
                    * the loop.
                    */
                   
                   
                   if((choosecriminalmission == 101) && (criminalmissionpagemax > criminalmissionpage)){
                       criminalmissionpage = criminalmissionpage+1;
                       continue;
                   }
                   
                   /*OR, if you choose the good 'ole Cancel command, the monstrous for
                    * loop is quit. I think. 
                    * 
                    */
                   else if(choosecriminalmission == 100){
                       break;
                   }
                   
                   /*
                    * If you haven't flipped the page or quit the program, then
                    * it tests to make sure you've actually chosen a freaking mission.
                    * I hate dumb people.
                    * Anyway, to add more missions, increase the criminalmissionmax.
                    */
                   
                   else if(choosecriminalmission <= criminalmissionmax){
                       
                       /*
                        * This switch is very important, as it's basically the mission debriefing screens.
                        * Once again, I went with a switch statement to make adding news one possible.
                        * DON'T FORGET THE BREAK STATEMENT AT THE END OF EACH CASE!!!!
                        */
                       switch(choosecriminalmission){
                           case 1:System.out.println("EASY: Steal From Oi Girls\nOi Girls don't make much money, but the police don't care much if they get robbed, so they're usually easy targets.\nThis mission requires at least 3 Gangsters.\nVehicles are not required.\nLoot: $5-$100 per Gangster that undertakes this mission.\nTo accept, input 1. Otherwise, input 0.");break;
                           case 2:System.out.println("EASY: Steal a Bike\nBikes are useful if you don't have any other vehicles, and can be sold for some money.\nThis mission requires at least 1 Jacker.\nVehicles are not required.\nLoot: 1 Bike per Jacker, 1-3 Bikes per Driving Jacker.\nTo accept, input 1. Otherwise, input 0.");break;
                           case 3:System.out.println("EASY: Smuggle in Canadian Weed\nThis mission consists of organizing Canadians to send small amounts of Weed through the mail to P.O. Boxes.\nThis mission requires at least 2 Gangsters and 2 Conmen.\nVehicles are not required.\nLoot: 2-4lbs of Canadian Weed per Gangster.\nTo accept, input 1. Otherwise, input 0.");break;
                           case 4:System.out.println("EASY: Prevent Canadian Pollution\nCanadians are now allowed to dump their trash within Michigan. Show them how we feel about this by disabling a garbage truck.\nThis mission requires at least 3 Gangsters.\nAt least 1 Vehicle is required.\nLoot: $300-$1000.\nTo accept, input 1. Otherwise, input 0.");break;
                           case 5:System.out.println("EASY: Shake Down a Drug Dealer\nDrug Dealers are like walking banks, and robbing them is normally pretty easy for a group of people.\nThis mission requires at least 3 Gangsters.\nVehicles are not required.\nLoot: $25-$250 per Gangster that undertakes this mission up to 5 Gangsters, and 2-10lbs of Canadian Weed.\nTo accept, input 1. Otherwise, input 0.");break;
                       }
                       
                       /*
                        * Then, a good little scanner scans to see if you want to 
                        * take the mission you selected, and stores the answer in
                        * acceptcriminalmission. 1 is Yes, 0 is no.
                        */
                       
                       acceptcriminalmission=scan.nextInt();
                       
                       /*
                        * If they don't accept, then the loop is restarted so they can pick another one.
                        * Note that it is restarted on the last page they were on. :)
                        */
                       
                       if(acceptcriminalmission==0){
                           continue;
                       }
                       /*
                        * If, by some grace of god, they accept the mission, then
                        * another for loop starts off. I know. FOR loops are overused in this program.
                        * Sue me.
                        */
                       
                       else if(acceptcriminalmission==1){
                           
                           /*
                            * The for loop, because i'll forget where it is.
                            */
                           
                           for(int counter2=0;counter2<999999;counter2++){
                               
                               /*
                                * Now, this is where it gets interesting. ONE if-then statement is used per mission.
                                * Basically, what goes down is an if statement checks to see if they want mission 1, 3
                                * 4, etc, until it finds the one that they actually want.
                                * And it then starts the mission.
                                */
                               
                               /*
                                * This is starting the FIRST mission.
                                */
                               if(choosecriminalmission==1){
                                   
                                   /*
                                    * Asks the player how many Gangsters they want to use for this mission,
                                    * which is robbing hookers.
                                    */
                                   System.out.println("How many Gangsters do you want to send? (Min 3)");
                                   numberofgangsterstosend = scan.nextInt();
                                   
                                   /*
                                    * If it's a good number they've inputted, we'll continue.
                                    */
                                   
                                   if((numberofgangsterstosend >= 3) && (numberofgangsterstosend <= gangsters)){
                                       
                                       /*
                                        * And we start up another for loop to be able to easily restart the vehicle choosing 
                                        * part of the mission because users are retarded.
                                        */
                                       
                                       for(int counter3=0;counter<999999;counter++){
                                           
                                           /*
                                            * It asks the user what type of vehicle they want to use for this mission.
                                            */
                                           
                                           System.out.println("How many of what kind of vehicle do you wish to send?");
                                           System.out.println("1. Sedan\n2. Van\n3. Pickup Truck\n4. Hummer\n5. Civilian Race Cars\n6. Armored Van\n7. None.");
                                           typeofvehiclestosend = scan.nextInt();
                                           
                                           /*
                                            * If the user actually inputs the right thing, the process 
                                            * continues.
                                            */
                                                 
                                           if((typeofvehiclestosend <= 7) && (typeofvehiclestosend >= 1)){
                                               
                                               /*
                                                * This if statement now runs through every possible choice you could have
                                                * made, finding out which one you picked. Each of these are basically the exact same, and 
                                                * they're all fairly simple, so I'm just going to point out what they are and
                                                * move on.
                                                */
                                               
                                               /*
                                                * This is the Sedan programming.
                                                */
                                               if(typeofvehiclestosend == 1){
                                                   if(sedans == 0){
                                                       System.out.println("No sedans to send. Try again.");
                                                       continue;
                                                   }
                                                   System.out.println("How many Sedans do you wish to send out of " + sedans + " Total Sedans?");
                                                   numberofvehiclestosend = scan.nextInt();
                                                   if((numberofvehiclestosend <= sedans) && (numberofvehiclestosend <= numberofgangsterstosend)){
                                                       System.out.println(numberofgangsterstosend + " are being sent in " + numberofvehiclestosend + " sedans.");
                                                       try{
                                                           Thread.sleep(3500);
                                                          }
                                                       catch(InterruptedException e){
                                                       }
                                                       numberoftier1vehicles=numberofvehiclestosend;
                                                       startmission=true;
                                                       break;
                                                   }
                                                   else{
                                                       System.out.println("You either inputted more vehicles than you own, or you inputted more vehicles than people.");
                                                       continue;
                                                   }
                                               }
                                               
                                               /*
                                                * Van Programming
                                                */
                                               
                                               if(typeofvehiclestosend == 2){
                                                   if(vans == 0){
                                                       System.out.println("No Vans to send. Try again.");
                                                       continue;
                                                   }
                                                   System.out.println("How many Vans do you wish to send out of " + vans + " Total Vans?");
                                                   numberofvehiclestosend = scan.nextInt();
                                                   if((numberofvehiclestosend <= vans) && (numberofvehiclestosend <= numberofgangsterstosend)){
                                                       System.out.println(numberofgangsterstosend + " are being sent in " + numberofvehiclestosend + " vans.");
                                                       try{
                                                           Thread.sleep(3500);
                                                          }
                                                       catch(InterruptedException e){
                                                       }
                                                       numberoftier1vehicles=numberofvehiclestosend;
                                                       startmission=true;
                                                       break;
                                                   }
                                                   else{
                                                       System.out.println("You either inputted more vehicles than you own, or you inputted more vehicles than people.");
                                                       continue;
                                                   }
                                               }
                                               
                                               /*
                                                * Pickup Truck Programming
                                                */
                                               
                                               if(typeofvehiclestosend == 3){
                                                   if(pickuptrucks == 0){
                                                       System.out.println("No pickup trucks to send. Try again.");
                                                       continue;
                                                   }
                                                   System.out.println("How many pickup trucks do you wish to send out of " + pickuptrucks + " Total pickup trucks?");
                                                   numberofvehiclestosend = scan.nextInt();
                                                   if((numberofvehiclestosend <= pickuptrucks) && (numberofvehiclestosend <= numberofgangsterstosend)){
                                                       System.out.println(numberofgangsterstosend + " are being sent in " + numberofvehiclestosend + " pickup trucks.");
                                                       try{
                                                           Thread.sleep(3500);
                                                          }
                                                       catch(InterruptedException e){
                                                       }
                                                       numberoftier1vehicles=numberofvehiclestosend;
                                                       startmission=true;
                                                       break;
                                                   }
                                                   else{
                                                       System.out.println("You either inputted more vehicles than you own, or you inputted more vehicles than people.");
                                                       continue;
                                                   }
                                               }
                                               
                                               /*
                                                * Hummer Programming
                                                */
                                               
                                               if(typeofvehiclestosend == 4){
                                                   if(hummers == 0){
                                                       System.out.println("No Hummers to send. Try again.");
                                                       continue;
                                                   }
                                                   System.out.println("How many Hummers do you wish to send out of " + hummers + " Total Hummers?");
                                                   numberofvehiclestosend = scan.nextInt();
                                                   if((numberofvehiclestosend <= hummers) && (numberofvehiclestosend <= numberofgangsterstosend)){
                                                       System.out.println(numberofgangsterstosend + " are being sent in " + numberofvehiclestosend + " hummers.");
                                                       try{
                                                           Thread.sleep(3500);
                                                          }
                                                       catch(InterruptedException e){
                                                       }
                                                       numberoftier2vehicles=numberofvehiclestosend;
                                                       startmission=true;
                                                       break;
                                                   }
                                                   else{
                                                       System.out.println("You either inputted more vehicles than you own, or you inputted more vehicles than people.");
                                                       continue;
                                                   }
                                               }
                                               
                                               /*
                                                * Civilian Race Cars Programming
                                                */
                                               
                                               if(typeofvehiclestosend == 5){
                                                   if(racecars == 0){
                                                       System.out.println("No civilian race cars to send. Try again.");
                                                       continue;
                                                   }
                                                   System.out.println("How many Civilian Race Cars do you wish to send out of " + racecars + " Total Civilian Race Cars?");
                                                   numberofvehiclestosend = scan.nextInt();
                                                   if((numberofvehiclestosend <= racecars) && (numberofvehiclestosend <= numberofgangsterstosend)){
                                                       System.out.println(numberofgangsterstosend + " are being sent in " + numberofvehiclestosend + " civilian race cars.");
                                                       try{
                                                           Thread.sleep(3500);
                                                          }
                                                       catch(InterruptedException e){
                                                       }
                                                       numberoftier2vehicles=numberofvehiclestosend;
                                                       startmission=true;
                                                       break;
                                                   }
                                                   else{
                                                       System.out.println("You either inputted more vehicles than you own, or you inputted more vehicles than people.");
                                                       continue;
                                                   }
                                               }
                                               
                                               /*
                                                * Armored Van Programming
                                                */
                                               
                                               if(typeofvehiclestosend == 6){
                                                   if(armoredvans == 0){
                                                       System.out.println("No armored vans to send. Try again.");
                                                       continue;
                                                   }
                                                   System.out.println("How many Armored Vans do you wish to send out of " + armoredvans + " Total Armored Vans?");
                                                   numberofvehiclestosend = scan.nextInt();
                                                   if((numberofvehiclestosend <= armoredvans) && (numberofvehiclestosend <= numberofgangsterstosend)){
                                                       System.out.println(numberofgangsterstosend + " are being sent in " + numberofvehiclestosend + " armored vans.");
                                                       try{
                                                           Thread.sleep(3500);
                                                          }
                                                       catch(InterruptedException e){
                                                       }
                                                       numberoftier2vehicles=numberofvehiclestosend;
                                                       startmission=true;
                                                       break;
                                                   }
                                                   else{
                                                       System.out.println("You either inputted more vehicles than you own, or you inputted more vehicles than people.");
                                                       continue;
                                                   }
                                               }
                                               
                                               /*
                                                * And if you're not driving, then this slightly 
                                                * shorter if statement runs.
                                                */
                                               
                                               if(typeofvehiclestosend == 7){
                                                   System.out.println(numberofgangsterstosend + " are being sent in no vehicles.");
                                                       try{
                                                           Thread.sleep(3500);
                                                          }
                                                       catch(InterruptedException e){
                                                       }
                                                       startmission=true;
                                                       break;
                                               }

                                           }
                                           /*
                                            * This else statement is a fucking perfect
                                            * representation of losing continuity. 
                                            * This else statement actually is the logical NEXT STEP
                                            * for the IF statement that checks to make sure
                                            * you actually picked a right number when selecting 
                                            * the type of car. All it does is restart the FOR loop if the idiot
                                            * doesn't type 1-7.
                                            */
                                           else{
                                               System.out.println("Yeah, you inputted something wrong.\nTry Again.\n");
                                               continue;
                                           }
                                       }
                                       /*
                                        * The startmission boolean actually is what controls whether or not
                                        * the mission starts. The boolean will not become true until you finish picking a vehicle,
                                        * as you can see in all of the Vehicle Programming IF statements, it's one of the last things that happens.
                                        * However, this if statement below it may be redundant, because as I was programming it I became confused and 
                                        * added a break statement within each of the IF statements, which should close out of the loop before you even
                                        * get to this point....
                                        * Hmmm...
                                        */
                                       if(startmission){
                                           
                                       }

                                       }

                                   /*
                                    * Formatting and spacing are fucked up here because I disobeyed the program's flow and
                                    * originally had the rest of mission 1 completely outside the mission for loop.
                                    */

                                   /*
                                    * This next part, moneygainedinmission, needs to be added to a group that's automatically set to 0
                                    * at the start of every turn so we don't have retarded problems.
                                    */

                                    moneygainedinmission = 0;

                                    /*
                                     * A for loop who's one goal is every loop to generate another random number between 1 and 75. Think of it like a really big dice roll.
                                     */

                           for(int randomnumber=((1) * (int) (Math.random() * (100)));randomnumber<999999;randomnumber=((1) * (int) (Math.random() * (100)))){
                               /*
                                * This IF Statement runs if you have any tier 1 vehicles left, and of course if you have people left.
                                * The second part is a bit redundant, as you can't have more vehicles than people, but I added it just in case.
                                */
                               if((numberoftier1vehicles >= 1) && (numberofgangsterstosend >= 1)){
                                   /*
                                    * What happens is if you roll between these two numbers, that one guy "wins". He completes the mission.
                                    * It also eats up him, and one vehicle, and figures out how much money you gained that turn. It then
                                    * restarts the loop.
                                    */
                                   if((randomnumber <= 75) && (randomnumber>= 1)){
                                       gangsterwon = gangsterwon + 1;
                                       numberoftier1vehicles = numberoftier1vehicles - 1;
                                       numberofgangsterstosend = numberofgangsterstosend - 1;
                                       moneygainedinturn = ((1) * (int) (Math.random() * (95))) + 5;
                                       moneygainedinmission = moneygainedinmission + moneygainedinturn;
                                       continue;
                                   }
                                   /*
                                    * If he's got bad luck, he gets arrested.
                                    */
                                   if((randomnumber <= 85) && (randomnumber >= 76)){
                                       gangsterarrested = gangsterarrested + 1;
                                       numberoftier1vehicles = numberoftier1vehicles - 1;
                                       numberofgangsterstosend = numberofgangsterstosend - 1;
                                       continue;
                                   }
                                   /*
                                    * And finally, if he escapes, everything gets eaten up.
                                    */
                                   if((randomnumber <= 100) && (randomnumber >= 86)){
                                       gangsterescaped = gangsterescaped + 1;
                                       numberoftier1vehicles = numberoftier1vehicles - 1;
                                       numberofgangsterstosend = numberofgangsterstosend - 1;
                                       continue;
                                   }
                               }
                               /*
                                * This is the IF statement for tier 2 vehicles and people.
                                * It's basically identical the one above, but with different
                                * possibilities because tier 2 is a larger bonus.
                                */
                               if((numberoftier2vehicles >= 1) && (numberofgangsterstosend >= 1)){
                                   if((randomnumber <= 75) && (randomnumber>= 1)){
                                       gangsterwon = gangsterwon + 1;
                                       numberoftier2vehicles = numberoftier2vehicles - 1;
                                       numberofgangsterstosend = numberofgangsterstosend - 1;
                                       moneygainedinturn = ((1) * (int) (Math.random() * (95))) + 5;
                                       moneygainedinmission = moneygainedinmission + moneygainedinturn;
                                       continue;
                                   }
                                   if((randomnumber <= 82) && (randomnumber >= 76)){
                                       gangsterarrested = gangsterarrested + 1;
                                       numberoftier2vehicles = numberoftier2vehicles - 1;
                                       numberofgangsterstosend = numberofgangsterstosend - 1;
                                       continue;
                                   }
                                   if((randomnumber <= 100) && (randomnumber >= 83)){
                                       gangsterescaped = gangsterescaped + 1;
                                       numberoftier2vehicles = numberoftier2vehicles - 1;
                                       numberofgangsterstosend = numberofgangsterstosend - 1;
                                       continue;
                                   }
                               }
                               /*
                                * And if you either didn't bring any vehicles or are out of them, it shifts down to this one,
                                * which is basically identical, but with crappy chances of success.
                                */
                               if(numberofgangsterstosend >= 1){
                                   if((randomnumber <= 75) && (randomnumber>= 1)){
                                       gangsterwon = gangsterwon + 1;
                                       numberofgangsterstosend = numberofgangsterstosend - 1;
                                       moneygainedinturn = ((1) * (int) (Math.random() * (95))) + 5;
                                       moneygainedinmission = moneygainedinmission + moneygainedinturn;
                                       continue;
                                   }
                                   if((randomnumber <= 89) && (randomnumber >= 76)){
                                       gangsterarrested = gangsterarrested + 1;
                                       numberofgangsterstosend = numberofgangsterstosend - 1;
                                       continue;
                                   }
                                   if((randomnumber <= 100) && (randomnumber >= 90)){
                                       gangsterescaped = gangsterescaped + 1;
                                       numberofgangsterstosend = numberofgangsterstosend - 1;
                                       continue;
                                   }
                               }
                               /*
                                * And, if the loop runs and everyone's gone, then it tells you how your crew did.
                                */
                               if(numberofgangsterstosend==0){
                                   System.out.println("\n" + gangsterwon + " Gangsters successfully robbed Oi Girls, gaining you " + moneygainedinmission + " dollars.");
                                   /*
                                    * The only drawback with this system is that while it will not tell you that 0 people were arrested if 0
                                    * people were arrested, it will tell you if 0 people were successful. Being that there's a 75% of success, most people won't notice it, but it's there.
                                    * I'm not going to change it though.
                                    */
                                   if(gangsterarrested > 0){
                                       System.out.println(gangsterarrested + " Gangsters were arrested while doing the mission.");
                                   }
                                   if(gangsterescaped > 0){
                                       System.out.println(gangsterescaped + " Gangsters were chased by authorities while doing the mission, but escaped and returned empty handed.");
                                   }
                                   System.out.println("\n");
                                   /*
                                    * Removes gangsters and the Mate count if anyone got arrested, cause they ain't with us anymore.
                                    */
                                   gangsters = gangsters - gangsterarrested;
                                   mates = mates - gangsterarrested;
                                   /*
                                    * Adds money to the bank.
                                    */
                                   money = money + moneygainedinmission;
                                   
                                   break;
                               }//->End of the 4th primary if statement.
                           }//<- For Loop for the actual mission playing.
                                    



                                   }//End of the first mission's if-then statement.
                               
                               /*
                                * Start new missions else if statement HERE.
                                */
                               
                               /*
                                * The else in this one that restarts picking a mission if you input shit.
                                */
                                   else{
                                   System.out.println("You inputted something weird.");
                                   continue;
                                   }
                              
                                     
                            
                               }//<-End of Criminal Mission's For loop.
                           

                           }
                       

                       }/* All this shit has to be coded better, it basically ties up loose ends and ends the mission part of the turn.
                                     * Should be placed up at the beginning of the mission for loop so I don't have ot do this for EVERY
                                     * mission.
                                     * And find a more elegant solution for quitting these things.
                         * Also, so much shit ends, it's hard to understand. Basically, the unmarked braces are to be ignored
                         * and are off limits, because it's like a tangled wire wrapped around a pole at this point.
                                     */
                   
                                if(startmission){
                                                   moneygainedinmission = 0;
                                                   moneygainedinturn = 0;
                                                   gangsterwon = 0;
                                                   gangsterarrested = 0;
                                                   gangsterescaped = 0;
                                                   numberofgangsterstosend=0;
                                                   numberoftier1vehicles = 0;
                                                   numberoftier2vehicles = 0;
                                                   startmission = false;
                                                   break;
                                               }
                  }
                
            }
            /*
             * And if you select to see the breakdown of your mates, allllll that other shit is skipped and you get thrown down here.
             */
            if(criminalmissionchoice==2){
                if(bestmates > 0){
                    System.out.println("You have " + bestmates + " Best Mates.");
                }
                if(gangsters > 0){
                    System.out.println("You have " + gangsters + " Gangsters.");
                }
                if(jackers > 0){
                    System.out.println("You have " + jackers + " Jackers.");
                }
                if(conmen > 0){
                    System.out.println("You have " + conmen + " Conmen.");
                }
                if(vans > 0){
                    System.out.println("You have " + vans + " Vans.");
                }
                if(sedans > 0){
                    System.out.println("You have " + sedans + " Sedans.");
                }
                if(pickuptrucks > 0){
                    System.out.println("You have " + pickuptrucks + " Pickup Trucks.");
                }
                if(hummers > 0){
                    System.out.println("You have " + hummers + " Hummers.");
                }
                if(armoredvans > 0){
                    System.out.println("You have " + armoredvans + " Armored Vans.");
                }
                if(racecars > 0){
                    System.out.println("You have " + racecars + " Civilian Race Cars.");
                }
                if(tanks > 0){
                    System.out.println("You have " + tanks + " Tanks.");
                }
                if(helicopters > 0){
                    System.out.println("You have " + helicopters + " Helicopters.");
                }
                System.out.println("Anything not shown is at Zero.");
                continue;
            }
            /*
             * If you choose to skip the criminal mission part, it just restarts the loop at this point because I haven't added the third or fourth
             * phases of the turns.
             */
            else if(choosecriminalmission == 100){
                continue;
            }
            /*
             * And if you fuck up and input the wrong thing, it also restarts the turn.
             */
            else{
                continue;
            }
            
        }
        


        

    }

}
