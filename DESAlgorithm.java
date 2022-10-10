import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JOptionPane;
public class DES{
public static void main(String[] args) throws Exception {
KeyGenerator keygen = KeyGenerator.getInstance("DES");
// create a key
SecretKey secretkey = keygen.generateKey();
Cipher cip = Cipher.getInstance("DES");
// initialise cipher to with secret key
cip.init(Cipher.ENCRYPT_MODE, secretkey);
String inputText = JOptionPane.showInputDialog("Give Input: ");
byte[] encrypted = cip.doFinal(inputText.getBytes());
cip.init(Cipher.DECRYPT_MODE, secretkey);
byte[] decrypted = cip.doFinal(encrypted);
JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
"encrypted : " + new String(encrypted) + "\n" +
"decrypted : " + new String(decrypted));
System.exit(0);
}
}
