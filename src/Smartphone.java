public class Smartphone extends Phone implements Camera, Clock {

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePhoto(){
        System.out.println("Se está tomando una foto");
    }

    @Override
    public void alarm(){
        System.out.println("Está sonando la alarma");
    }

}
