package strings;

// Insert a character at the first, last, and Kth position in a string.

public class InsertCharInString {
public static void main(String[] args) {
    String str = "Hello world";
    char ch = '*';
    int pos = 7;
    
   System.out.println("After char insert " + insertCharAt(str, pos, ch));

}

public static String insertCharAt(String str, int index, char c) {
    if (index < 0 || index > str.length()) {
        throw new IndexOutOfBoundsException("Index out of bounds");
    }
    StringBuilder sb = new StringBuilder();
    sb.append(c);
    sb.append(str.substring(0, index-1));
    sb.append(c);
    sb.append(str.substring(index-1));
    sb.append(c);
    return sb.toString();
}
    
}