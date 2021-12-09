public class Work {

    static int counter = 1;

    private String ziSapt;
    private String grMusc;
    private String tipEx;
    private String nrRep;
    int id = counter++;


    public Work(String ziSapt, String grMusc, String tipEx, String nrRep) {
        this.ziSapt = ziSapt;
        this.grMusc = grMusc;
        this.tipEx = tipEx;
        this.nrRep = nrRep;
    }

    public Work() {

    }

    public String getZiSapt() {
        return ziSapt;
    }

    public void setZiSapt(String ziSapt) {
        this.ziSapt = ziSapt;
    }

    public String getGrMusc() {
        return grMusc;
    }

    public void setGrMusc(String grMusc) {
        this.grMusc = grMusc;
    }

    public String getTipEx() {
        return tipEx;
    }

    public void setTipEx(String tipEx) {
        this.tipEx = tipEx;
    }

    public String getNrRep() {
        return nrRep;
    }

    public void setNrRep(String nrRep) {
        this.nrRep = nrRep;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Work{" +
                "ziSapt='" + ziSapt + '\'' +
                ", grMusc='" + grMusc + '\'' +
                ", tipEx='" + tipEx + '\'' +
                ", nrRep='" + nrRep + '\'' +
                ", id=" + id +
                '}' + '\n' ;
    }
}

