package dni;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class TestCasesDni {

    private ArrayList<String> test = null;

    private void setTest(ArrayList<String> test) {
        this.test = test;
    }

    public ArrayList getTest() {
        return this.test;
    }

    private ArrayList<String> fileToList() throws Exception {
        File file = new File("dnicorrectos.txt");
        Scanner test = new Scanner(file);
        ArrayList<String> casosTest = new ArrayList();
        while (test.hasNextLine()) {
            String caso = test.nextLine();
            casosTest.add(caso);
        }
        setTest(casosTest);
        return casosTest;
    }
}

