public class RailFence {
public static void main(String args[])
{
String input = "inputstring";
String output = "";
int len = input.length(),flag = 0;
System.out.println("Input String : " + input);
for(int i=0;i<len;i+=2) {
output += input.charAt(i);
}
for(int i=1;i<len;i+=2) {
output += input.charAt(i);
}
System.out.println("Ciphered Text : "+output);
}
}
