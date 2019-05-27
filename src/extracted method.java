private double amountFor(Rental each){
    double result = 0;
    //determine amounts for each line
 
    thisAmount = each.getCharge();
 
       // add frequent renter points
       frequentRenterPoints ++;
       // add bonus for a two day new release rental
       if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
          each.getDaysRented() > 1) frequentRenterPoints ++;
 
       //show figures for this rental
       result += "\t" + each.getMovie().getTitle()+ "\t" +
           String.valueOf(thisAmount) + "\n";
       totalAmount += thisAmount;
    } 
    //add footer lines
    result +=  "Amount owed is " + String.valueOf(totalAmount) + "\n";
    result += "You earned " + String.valueOf(frequentRenterPoints) +
             " frequent renter points";
    return result;
 }