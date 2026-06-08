class ControlStructure{
	public static void main(String [] args){
		System.out.println(" **CONTROL STATEMENTS** \n-->[1]JAVA SELECTION STATEMENT'S \n1) IF STATEMENT");
		int a=5,b=7,c=9;
		if(a>b && a>c){
			System.out.println("a is big");
			}
		else if(b<c){
			System.out.println("c is big");
			}
		else{
			System.out.println("b is big");
			}

			System.out.println("2) SWITCH STATEMENT");
			char color = 'r';
			switch (color){
				case 'r': System.out.println("Red");
				break;
				case 'g': System.out.println("Green");
				break;
				case 'b': System.out.println("Blue");
				break;
				case 'y': System.out.println("Yellow");
				break;
				case 'w': System.out.println("White");
				break;
				default: System.out.println("No Color Selected:");
				}

			System.out.println("-->[2]JAVA ITERATION STATEMENTS \n1)While Loop \n2)Do-While Loop \n3)For-Loop");
			System.out.println("1)While Loop");
			int i=1;
				while(i<=20){
					System.out.println(i);
					i++;
					}

			System.out.println("2)Do-While Loop");
			int j=1;
				do{
					System.out.println(j);
					j++;
				  }while(j<=10);

			int number = 10;
				do{
					System.out.println("it runs at least once:");
					System.out.println(number);
				  }while(number < 5);

			System.out.println("3)For-Loop");
				int m;
				for(m=20; m<=40; m++){
					System.out.print(m +"\t");
				}

			System.out.println("[3]JAVA'S JUMP STATEMENTS");
		}
}