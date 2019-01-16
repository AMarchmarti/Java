package dni;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCasesDni {

    private ArrayList fileToList() throws Exception {
        File file = new File("dnicorrectos.txt");
        Scanner test = new Scanner(file);
        ArrayList casosTest = new ArrayList();
        while (test.hasNextLine()) {
            String caso = test.nextLine();
            casosTest.add(caso);
        }
        return casosTest;
    }
}

