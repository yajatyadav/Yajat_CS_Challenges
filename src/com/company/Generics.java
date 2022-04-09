package src.com.company;


/* This is wrapper class...
 Objective would be to push more functionality into this Class to enforce consistent definition
 */

public abstract class Generics {
	public final String masterType = "Generic";
	private String type;	// extender should define themself

	// generic enumerated interface
	public interface KeyTypes {
		String name();
	}

	public void setType(String s){type = s;}
	public String getType(){return type;}
	protected abstract KeyTypes getKey();  	// this method helps force usage of KeyTypes

	// this method is used to establish key order
	public abstract String toString();

	// static print method used by extended classes
	public static void print(Generics[] objs) {
		// print 'Object' properties
		System.out.println(objs.getClass() + " " + objs.length);

		// print 'Generics' properties
//		if (objs.length > 0) {
//			Generics obj = objs[0];	// Look at properties of 1st element
//			System.out.println(
//					obj.getMasterType() +
//					":" + obj.getType() +
//					" listed by " +
//					obj.getKey());
//		}

		// print 'Object'
		for(Object o : objs)
			System.out.println(o);

		System.out.println();
	}
}