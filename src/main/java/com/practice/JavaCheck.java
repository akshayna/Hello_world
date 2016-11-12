package com.practice;

public class JavaCheck {
	public static void main(String[] args) throws Throwable {
		Runtime runtime = Runtime.getRuntime();
		int mb = 1024 * 1024;

		// for (int i = 0; i < 4; i++) {
		Person person = new Person();
		person.setId("1");
		person.setName("abcd");
		// }
		// Person person = null;
		// List<Person> list = new CustomArrayList<>();
		// for (int i = 0; i < 10000; i++) {
		// // String str = Integer.toString(i);
		// String str = "1";
		// byte[] b = str.getBytes("UTF-8");
		// list.add(person);
		// // System.out.println("Length" + b.length);
		// // System.out.println(i + " " + runtime.freeMemory());
		// }
		// person.finalize();
		System.out.println(runtime.freeMemory() / mb);
		Person person1 = new Person(); 
		person = person1;
		System.out.println(person.getId());
		System.gc();
		// list.finalize();
		System.out.println(runtime.freeMemory() / mb);
	}
}

/**
 * Example shows garbage collector in action Note that the finalize() method of
 * object GC1 runs without being specifically called and that the id's of
 * garbage collected objects are not always sequential.
 */

class TestGC {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();

		System.out.println("Available Free Memory: " + rt.freeMemory());

		for (int i = 0; i < 4; i++) {
			GC1 x = new GC1(i);
		}

		System.out.println("Free Memory before call to gc(): " + rt.freeMemory());
		System.runFinalization();
		System.gc();
		System.out.println(" Free Memory after call to gc(): " + rt.freeMemory());

	}
}

class GC1 {

	String str;
	int id;

	GC1(int i) {
		this.str = new String("abcdefghijklmnopqrstuvwxyz");
		this.id = i;
	}

	protected void finalize() {
		System.out.println("GC1 object " + id + " has been finalized.");
	}

}
