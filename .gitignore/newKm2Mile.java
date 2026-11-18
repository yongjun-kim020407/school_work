class Km2Mile extends Converter{
    private String SrcString = "Km";
    private String DestString= "mile";

    
    Km2Mile(double ratio){
        this.ratio = ratio;
    }

    @Override
    protected double convert(double src){
        return src  / ratio ;    
    }
    @Override
    protected String getSrcString(){
        return SrcString;
    } 

    @Override
    protected String getDestString(){
        return DestString;
    }

}

public class newKm2Mile{
    public static void main(String[] args){
            Km2Mile Km = new Km2Mile(1.6);
            Km.run();
    }
}