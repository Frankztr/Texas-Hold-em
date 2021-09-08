package Constants;

public enum Suits {
    Hearts,
    Spade,
    Club,
    Diamond;

    //This method is used to turn the enum object into String
    @Override
    public String toString() {
        if(this.equals(Hearts)) return "Hearts";
        else if(this.equals(Spade)) return "Spade";
        else if(this.equals(Club)) return "Club";
        else if(this.equals(Diamond)) return "Diamond";
        else {
            System.out.println(Messages.ERROR_OCCURRED);
            System.out.println(Messages.ERROR_DECLARE+Messages.ERROR_TYPE_INVALID_SUITS_TYPE);
            System.exit(0);
            return "EASTER EGG!!!";
        }
    }
}
