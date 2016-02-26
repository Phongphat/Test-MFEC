package testM_fec;

import java.io.*;
import java.nio.file.Files;
import java.text.*;
import java.util.*;
import java.math.RoundingMode;

public class Produck {

    private static final String FILE_ENCODE = "UTF-8";

    public static void main(String[] args) throws ParseException {
        
        BufferedReader dataIns = null;
        String string = "";
        String file = "D:\\อบรมต่างๆ\\ข้อสอบ mfec\\ข้อสอบ Dev\\2.import.log";

        try {
            dataIns = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file), FILE_ENCODE));
            InputStream ips = new FileInputStream(file);
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] items = line.split("\\|");
                String t1 = items[0];
                String t2 = items[1];
                String t3 = items[2];
                String t4 = items[3];
                //String dateIn = (t1 + "/" + t2);
                //String dateOut = (t3 + "/" + t4);
                //DateFormat formatT = new SimpleDateFormat("dd/MM/yyyy/HH:mm");
                //  Date din = formatT.parse(dateIn);
                // Date dout = formatT.parse(dateOut);
                System.out.println("ชื่อ : " + t1);
                System.out.println("ราคา : " + t2);
                System.out.println(" จำนวน : " + t3);
                System.out.println("ขายออกวันที่ : " + t4);
                System.out.println("------------------------------------------");
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
