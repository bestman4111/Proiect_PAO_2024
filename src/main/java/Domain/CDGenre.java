package Domain;

public enum CDGenre {
    METAL("Metal"),
    ROCK("Rock"),
    POP("Pop"),
    CLASSICAL("Classical"),
    ELECTRONIC("Electronic"),
    JAZZ("Jazz"),
    RAP("Rap"),
    OTHER("Other");

    public String label;

    private CDGenre(String label) {
        this.label = label;
    }

    public void setCDGenre(final String label){
        this.label = label;
    }

    public String getCDGenre(){
        return label;
    }

    public static CDGenre getEnumByString(String s){
        for(CDGenre e : CDGenre.values()){
            if(s.equals(e.toString())){
                return e;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return label;
    }
}

