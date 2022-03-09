public class Car {

  private String brand;
  private String model;
  private String honk;

void setBrand(String b){
  brand = b;
}

void setModel(String m){
  model = m;
}

void setHonk(String h){
  honk = h;
}

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public String getHonk() {
    return honk;
  }

  Car(String brand, String model, String honk){

  setBrand("BMW");
  setModel("model1");
  setHonk("dyt");

}

public void sound(){
  System.out.println(honk);
}
public void drive(){
  System.out.println(brand + " " + model + " is driving");
}

public void park(){
  System.out.println(brand + " " + model + " is parked");
}
}
