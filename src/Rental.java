class Rental...
   int getFrequentRenterPoints() {
       if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
          return 2;
       else
          return 1;
   }