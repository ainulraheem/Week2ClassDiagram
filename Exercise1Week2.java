public class Exercise1Week2 {

	public static void main(String [] arg) {

		//1. Declare and initialize a byte with a value of 128
		//Observe NetBean's complaint
		byte value1 = 127;

		//1. Declare and initialize a short with a value of 128
		short value2 = 128;
		//Create a print statement that casts this short to a byte
		System.out.println( (byte)value2 ); //overflow

		//Declare and initailize a byte with a value of 127
		byte value3 = 127;
		//Add 1 to this variable and print it
		value3 += 1; //overflow
		System.out.println(value3);
		//Add 1 to this variable again and print it again
		value3 += 1;
		System.out.println(value3);

	}
}


