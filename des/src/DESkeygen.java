import java.io.File;
import java.io.FileWriter;

public class DESkeygen {


    private final File file = new File("C:\\Users\\trehl\\OneDrive\\Рабочий стол\\DESkey.txt");
    private final int KEY_LENGTH = 16;
    private final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public DESkeygen() {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("");
            for (int i = 0 ; i < KEY_LENGTH ; i++) {
                double random = Math.random();
                int index = (int) (random * 16);
                fileWriter.append(hexArray[index]);
                fileWriter.flush();
            }
            fileWriter.close();
            System.out.println("Key generated and saved in " + file.getName());
        } catch(Exception exp) {
            exp.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DESkeygen();
    }


}
