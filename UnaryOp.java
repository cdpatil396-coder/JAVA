class UnaryOp{

	public static void main(String []args){
		int a = 5;
		System.out.println("initial values a:"+a);
		// 1)Post-Increment --> a++
		// 2)Pre-Increment  --> ++a
		System.out.println("Post-Increment:(a++) "+	(a++));
		System.out.println("After Post-Increment:" + a);
		System.out.println("Pre-Increment(++a)"+(++a));

		// 1)Post-Decrement --> a--
		// 2)Pre-Decrement  --> --a
		System.out.println("Post-Decrement:(a--) "+	(a--));
		System.out.println("After Post-Decrement:" + a);
		System.out.println("Pre-Decrement(--a)"+(--a));

		}
}