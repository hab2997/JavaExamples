// Java code to illustrate
// Reading CSV File with different separator
public static void readDataFromCustomSeperator(String file)
{
    try {
        // Create an object of file reader class with CSV file as a parameter.
        FileReader filereader = new FileReader(file);
 
        // create csvParser object with
        // custom seperator semi-colon
        CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
 
        // create csvReader object with parameter
        // filereader and parser
        CSVReader csvReader = new CSVReaderBuilder(filereader)
                                  .withCSVParser(parser)
                                  .build();
 
        // Read all data at once
        List<String[]> allData = csvReader.readAll();
 
        // Print Data.
        for (String[] row : allData) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}