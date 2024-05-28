package Service;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFile {

    static List<String[]> data = new ArrayList<String[]>();

    public static void addDataToArray(String[] action){
        data.add(action);
    }

    public static List<String[]> getData(){
        return data;
    }

    public static void writeDataLineByLine(String filepath, List<String[]> actions){
        File file = new File(filepath);
        try{
            FileWriter outputfile = new FileWriter(file);
            CSVWriter writer = new CSVWriter(outputfile);
            for (String[] action : actions) {
                writer.writeNext(action);
            }
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
