package Constants;

public enum Suits {
    Hearts,
    Tiles,
    Clovers,
    Pikes;

    @Override
    public String toString() {
        if(this.equals(Hearts)) return "Hearts";
        else if(this.equals(Tiles)) return "Tiles";
        else if(this.equals(Clovers)) return "Clovers";
        else if(this.equals(Pikes)) return "Pikes";
        else {
            System.out.println(Messages.ERROR_OCCURRED);
            System.out.println(Messages.ERROR_DECLARE+Messages.ERROR_TYPE_INVALID_SUITS_TYPE);
            System.exit(0);
            return "EASTER EGG!!!";
        }
    }
}
