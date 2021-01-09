/**
 * 
 */
package labwork;

/**
 * @author Akhila
 * Create a method that can accept an array of String objects and sort in alphabetical order. 
 * The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case. Return the resulting array.
 *
 */

	import java.util.*;
	public class Exercise2 {
		public static void main(String[] args) {
			String []array=getInputArray();
			int length = array.length;
			System.out.print("Sorted Array"+ sortStrings(array));
		}

		private static String sortStrings(String[] array) {
			StringBuilder sb =new StringBuilder();
			Arrays.sort(array);
			int size = array.length;
			if(size%2!=0) {
				for(int index=0;index<size;index++) {
					if(index<(size/2)+1) {
						array[index]=array[index].toUpperCase();
						sb.append(array[index]+" ");
					}
					else{
						array[index]=array[index].toLowerCase();
						sb.append(array[index]+" ");
					}
				}
			}
			else {
				for(int index=0;index<size;index++) {
					if(index<(size/2)) {
						array[index]=array[index].toUpperCase();
						sb.append(array[index]+" ");
					}
					else{
						array[index]=array[index].toLowerCase();
						sb.append(array[index]+" ");
					}
				}	
			}
			return sb.toString();
		}

		private static String[] getInputArray() {
			Scanner sc = new Scanner(System.in);
			int size;
			System.out.println("Enter size of array");
			size = sc.nextInt();
			String [] array = new String[size];
			System.out.println("Enter strings");
			for(int index=0;index<size;index++) {
				array[index]=sc.next();
			}
			return array;
		}
	}

