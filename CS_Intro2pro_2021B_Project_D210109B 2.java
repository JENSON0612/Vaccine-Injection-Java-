/**
 * NAME 		     	 : CHAN KHENG SANG
 * STUDENT ID 	 	     : D210109B
 * BATCH 	       	     : CS21B
 * SUBMISSIOM DATE 	     : 30/8/2021
**/

import java.util.Scanner;

public class CS_Intro2pro_2021B_Project_D210109B {
		
		public static void main (String []args) {
			Scanner input  	  	 = new Scanner(System.in);
			int choice	   	  	 = 0;
			int choice2    	  	 = 0;
			int choice3			 = 0;
			int choice4			 = 0;
			int disease			 = 0;
			String name    	 	 = "";
			int age		  	  	 = 0;
			String icNumber  	 = "";
			int	vaccine    		 = 0;
			int day  	   	  	 = 0;
			int time	      	 = 0;
			
			//Display the selection to the user
			while(true){
				System.out.println("1.Apply for injection  2.Check the application  3.Edit your application 4.Exit the programe ");
				
				
			choice = input.nextInt();
			switch(choice){			
						//Prompt the user to enter their name
				case 1: System.out.println("Please enter your name: ");
						name = input.next();
						//User need to input their age and if their age are under 18 they will be not abble to apply for vaccination
						System.out.println("Please enter you age: ");
						age = input.nextInt();
						//If the user are below 18 years old the program will stop
						while(age < 18){
							System.out.println("Sorry. You are underaged not suitable for vacinnation.");
							System.exit(0);
						}
						//Get user IC number
						System.out.println("Enter your IC number: ");
						icNumber = input.next();
						//Prompt the user to let the programme know either the user have any disease
						System.out.println("Do you have any disease?");
						System.out.println("1.YES 2.NO");
						disease = input.nextInt();
						//If the user have any disease the program will stop
						while(disease == 1){
							System.out.println("Sorry.You are not suitable for vaccine injection");
							System.exit(0);
						}
						
						// Prompt the use to choose the date
						System.out.println("Choose a day to get your vaccine injection ");
						System.out.println("1.Monday 2.Tuesday 3.Wednesday 4.Thursday 5.Friday 6.Satudurday 7.Sunday ");
						day = input.nextInt();
						
						//User have to choose the time for getting the vaccine injection
						System.out.println("Choose a time to get your vaccine injection ");
						System.out.println("1.1200pm 2.1330pm 3.1500pm 4.1630pm 5.1800pm ");
						time = input.nextInt();
						
						// Let the user choose the type of vaccine that they want
						System.out.println("Choose a type of vaccine for your injection ");
						System.out.println("1.Pfizer 2.Astraeneca(AZ) 3.Moderna  4. Johnson&Johnson	");
						vaccine = input.nextInt();
						System.out.println("Do you confirm your selection? ");
						System.out.println("1.YES 2.NO");
						choice2 = input.nextInt();
						
						if(choice2 == 1)
							break;
						//if the user choose NO. The programme will bring the user to re-apply again
						else
							// Prompt the use to choose the date
							System.out.println("Choose a day to get your vaccine injection ");
							System.out.println("1.Monday 2.Tuesday 3.Wednesday 4.Thursday 5.Friday 6.Satudurday 7.Sunday ");
							day = input.nextInt();
							//User have to choose the time for getting the vaccine injection
							System.out.println("Choose a time to get your vaccine injection ");
							System.out.println("1.1200pm 2.1330pm 3.1500pm 4.1630pm 5.1800pm ");
							time = input.nextInt();
							// Let the user choose the type of vaccine that they want
							System.out.println("Choose a type of vaccine for your injection ");
							System.out.println("1.Pfizer 2.AstraZeneca(AZ) 3.Moderna  4. Johnson&Johnson	");
							vaccine = input.nextInt();
							
							System.out.println("Do you confirm your choice? ");
							System.out.println("1.YES 2.NO");
							choice2 = input.nextInt();
							break;
							
				//The user can check the date,time and the type of vaccine that they have chosen during application
				case 2:	//Display the user name, IC number and age
						System.out.println("NAME: " + name );
						System.out.println("AGE: " + age );
						System.out.println("IC number: " + icNumber );
						//Display the day to the user based on the selection of the user
						switch(day){
							case 1:System.out.println("The day for vaccine injection : Monday");
								   break;
							case 2:System.out.println("The day for vaccine injection : Tuesday");
								   break;	   
							case 3:System.out.println("The day for vaccine injection : Wednesday");
								   break;
							case 4:System.out.println("The day for vaccine injection : Thursday");
								   break;
							case 5:System.out.println("The day for vaccine injection : Friday");
								   break;	   	   
							case 6:System.out.println("The day for vaccine injection : Saturday");
								   break; 
							case 7:System.out.println("The day for vaccine injection : Sunday");
								   break;	   	   	   
							}
						//Display the type of vaccine that they have chosen
						switch(vaccine){
							case 1:System.out.println("Type of vaccine : Pfizer");
								   break;
							case 2:System.out.println("Type of vaccine : AstraZeneca(AZ)");
								   break;
							case 3:System.out.println("Type of vaccine : Moderna");
								   break;	   
							case 4:System.out.println("Type of vaccine : Johnson&Johnson");
								   break;	   
						}
						//Display the time that the user have chosen for injection
						switch(time){
							case 1:System.out.println("Time for vaccine injection : 1200pm");
								   break;
							case 2:System.out.println("Time for vaccine injection : 1330pm");
								   break;	   
							case 3:System.out.println("Time for vaccine injection : 1500pm");
								   break;	   
							case 4:System.out.println("Time for vaccine injection : 1630pm");
								   break;	
							case 5:System.out.println("Time for vaccine injection : 1800pm");
								   break;	   	   
						}				
					    	break;// Continue back to the while loop
				
				case 3://Display the selection to the user
					   System.out.println("NAME:" + name);
					   System.out.println("AGE:" + age);
					   System.out.println("IC number:" + icNumber);
					   System.out.println("What would you like to change?");
					   System.out.println("1.Day 2.Time 3.Vaccine");
					   choice3 = input.nextInt();
					   
					   //The prorgam works based on the user options
					   switch(choice3){
					   	case 1:System.out.println("Choose a day to get your vaccine injection ");
							   System.out.println("1.Monday 2.Tuesday 3.Wednesday 4.Thursday 5.Friday 6.Satudurday 7.Sunday ");
							   day = input.nextInt();
							   break;
						case 2:System.out.println("Choose a time to get your vaccine injection ");
							   System.out.println("1.1200pm 2.1330pm 3.1500pm 4.1630pm 5.1800pm ");
							   time = input.nextInt();
							   break;
						case 3:System.out.println("1.Pfizer 2.AstraZeneca(AZ) 3.Moderna  4. Johnson&Johnson	");
							   vaccine = input.nextInt();
							   System.out.println("Is " + vaccine + " your selection? ");
							   System.out.println("1.YES 2.NO");
							   choice4 = input.nextInt();
							   
								//continue back to the while loop
								if(choice4 == 1)
									break;
								//if the user choose "NO". The programme will bring the user to re-apply again
								else
									System.out.println("1.Pfizer 2.AstraZeneca(AZ) 3.Moderna  4. Johnson&Johnson	");
									vaccine = input.nextInt();
									System.out.println("Is " + vaccine + " your selection? ");
									System.out.println("1.YES 2.NO");
									choice4 = input.nextInt();
									break;
					   				 }
					   				break;//continue to the while loop
					   //Exit the programme
				case 4:System.out.println("Congratulation!Your application is completed");
						System.exit(0);
							
					   
				
						}
				}
			}
		}