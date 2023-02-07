public class Phone {
    private String model;
    private String number;
    private boolean isBuzy;


    public boolean isBuzy() {
        return isBuzy;
    }

    public void setBuzy(boolean buzy) {
        isBuzy = buzy;
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
        this.isBuzy = false;

    }

    public void call(Phone phone) {
        this.isBuzy = true;
        phone.setBuzy(true);
        System.out.println("Calling to nuber " + phone.getNumber());
    }

    public void sendMessage(Phone phone, String message) {
        System.out.println("Sending message " + message + "to number " + getNumber());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
