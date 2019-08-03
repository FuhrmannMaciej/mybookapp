package com.fuhrmannmaciej.mybookapp.service;

//public class WriteCsvToResponse {
//    private static final Logger LOGGER = LoggerFactory.getLogger(WriteCsvToResponse.class);
//
//    public static void writeBooks(PrintWriter writer, List<Book> books)  {
//
//        try {
//
//            ColumnPositionMappingStrategy mapStrategy
//                    = new ColumnPositionMappingStrategy();
//
//            mapStrategy.setType(Book.class);
//            mapStrategy.generateHeader(books);
//
//            String[] columns = new String[]{"item_id", "book_author", "item_year_of_release","item_title","item_rating"};
//            mapStrategy.setColumnMapping(columns);
//
//            StatefulBeanToCsv btcsv = new StatefulBeanToCsvBuilder(writer)
//                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
//                    .withMappingStrategy(mapStrategy)
//                    .withSeparator(',')
//                    .build();
//
//            btcsv.write(books);
//
//        } catch (CsvException ex) {
//
//            LOGGER.error("Error mapping Bean to CSV", ex);
//        }
//    }
//
//    public static void writeBook(PrintWriter writer, Book book) {
//
//        try {
//
//            ColumnPositionMappingStrategy mapStrategy
//                    = new ColumnPositionMappingStrategy();
//
//            mapStrategy.setType(Book.class);
//
//            String[] columns = new String[]{"item_id", "book_author", "item_year_of_release","item_title","item_rating"};
//            mapStrategy.setColumnMapping(columns);
//
//            StatefulBeanToCsv btcsv = new StatefulBeanToCsvBuilder(writer)
//                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
//                    .withMappingStrategy(mapStrategy)
//                    .withSeparator(',')
//                    .build();
//
//            btcsv.write(book);
//
//        } catch (CsvException ex) {
//
//            LOGGER.error("Error mapping Bean to CSV", ex);
//        }
//    }
//}
