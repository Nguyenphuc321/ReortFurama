package Data;


import Model.House;
import Model.Room;
import Model.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncWriteFileCSV {
    private static final char DEFAULT_SEPARATOR = ',';
    private static final char DEFAULT_QUOTE = '"';
    private static final String pathVilla = "src/Data/Villa.csv";
    private static final String pathHouse = "src/Data/House.csv";
    private static final String pathRoom = "src/Data/Room.csv";
    private static String[] headerRecordVilla = new String[]{"NameServices", " Areaused", " rentalcosts", "amountofpeople", "typeofrent", "id", "Roomstandard", "Comfortdescription",
            " Numberoffloors", "Poolarea"};
    private static String[] headerRecordHouse = new String[]{"NameServices", " Areaused", " rentalcosts", "amountofpeople", "typeofrent", "id", "Roomstandard", "Comfortdescription",
            " Numberoffloors"};
    private static String[] headerRecordRoom = new String[]{"NameServices", " Areaused", " rentalcosts", "amountofpeople", "typeofrent", "id", "Freeserviceincluded"};
    private static final int NUM_OF_LINE_SKIP = 1;

    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR
                     , CSVWriter.NO_QUOTE_CHARACTER
                     , CSVWriter.NO_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{villa.getNameServices(),
                        String.valueOf(villa.getAreaused()),
                        String.valueOf(villa.getRentalcosts()),
                        String.valueOf(villa.getAmountofpeople()),
                        String.valueOf(villa.getTypeofrent()),
                        villa.getId(),
                        villa.getRoomstandard(),
                        villa.getComfortdescription(),
                        String.valueOf(villa.getNumberoffloors()),
                        String.valueOf(villa.getPoolarea())
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static void writeHoseToFileCSV(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR
                     , CSVWriter.NO_QUOTE_CHARACTER
                     , CSVWriter.NO_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordHouse);
            for (House houe : arrayList) {
                csvWriter.writeNext(new String[]{houe.getNameServices(),
                        String.valueOf(houe.getAreaused()),
                        String.valueOf(houe.getRentalcosts()),
                        String.valueOf(houe.getAmountofpeople()),
                        String.valueOf(houe.getTypeofrent()),
                        houe.getId(),
                        houe.getRoomstandard(),
                        houe.getComfortdescription(),
                        String.valueOf(houe.getNumberoffloors()),
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeRoomToFileCSV(ArrayList<Room> arrayList) {
        try (Writer writer = new FileWriter(pathRoom);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR
                     , CSVWriter.NO_QUOTE_CHARACTER
                     , CSVWriter.NO_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{room.getNameServices(),
                        String.valueOf(room.getAreaused()),
                        String.valueOf(room.getRentalcosts()),
                        String.valueOf(room.getAmountofpeople()),
                        String.valueOf(room.getTypeofrent()),
                        room.getId(),
                        room.getFreeserviceincluded()
                });
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ArrayList<Villa> getVillaFromCSV() {
        Path path = Paths.get(pathVilla);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathVilla);

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Villa.class);
        strategy.setColumnMapping(headerRecordVilla);
        CsvToBean<Villa> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Villa>) csvToBean.parse();
    }
    public static ArrayList<House> getHouseFromCSV() {
        Path path = Paths.get(pathHouse);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathHouse);

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);
        CsvToBean<House> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }
    public static ArrayList<Room> getRoomFromCSV() {
        Path path = Paths.get(pathRoom);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(pathRoom);

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Room> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Room.class);
        strategy.setColumnMapping(headerRecordRoom);
        CsvToBean<Room> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<Room>(new FileReader(pathRoom))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Room>) csvToBean.parse();
    }
}