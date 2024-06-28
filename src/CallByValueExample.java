
// Java is call by value. For object references, the value of the reference is copied, not the object itself. This can make it appear as though Java is call by reference when, in fact, it is not.
public class CallByValueExample {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Before method call, a = " + a);
		modifyPrimitive(a);
		System.out.println("After method call, a = " + a);

		MyObject obj = new MyObject();
		obj.value = 10;
		System.out.println("Before method call, obj.value = " + obj.value);
		modifyObject(obj);
		System.out.println("After method call, obj.value = " + obj.value);

		MyObject newObj = new MyObject();
		newObj.value = 10;
		System.out.println("Before method call, newObj.value = " + newObj.value);
		reassignObject(newObj);
		System.out.println("After method call, newObj.value = " + newObj.value);
	}

	public static void modifyPrimitive(int x) {
		x = 20; // This change is local to the method
	}

	public static void modifyObject(MyObject o) {
		o.value = 20; // This change affects the original object because the reference is copied
	}

	public static void reassignObject(MyObject o) {
		o = new MyObject(); // This change is local to the method, it does not affect the original reference
		o.value = 30; // This new object's value is set to 30, but this new object is local to the
						// method
	}
}

class MyObject {
	int value;
	
	Thread a;
	
}
