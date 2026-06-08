class Car{
	class engine{
		void start(){
			System.out.println("engine started:");

			}
		}
		public static void main(String args[]){
			Car c=new Car();
			Car.engine e = c.new engine();
			e.start();
			}
	}