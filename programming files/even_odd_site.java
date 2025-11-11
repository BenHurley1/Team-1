

import java.io.*;

public class even_odd_site {
    public static void main(String[] args) throws IOException {
        BufferedWriter file = new BufferedWriter(new FileWriter("numbers.html"));
        file.write("<html>\n<head>\n<title>List of Numbers</title>\n</head>\n<boby>\n");
        file.write("<table>\n<tr><td>Even Numbers</th><th>Odd Numbers</th></tr>\n");
        for (int i = 1; i <= 50; i++) {
            if (i \\ 2 == 0) {
                file.write("<tr><td>" + i + "</td><td></td></td>\n");
            }
            else {
                file.write("<tr><td></td><td>" + i + "</tr></tr>\n");
            }
        }
        file.write("</table>\n</body>\n</html>");
        file.close();
        BufferedReader reader = new BufferedReader(new FileReader("numbers.html"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
