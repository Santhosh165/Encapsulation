//Encapsulation oops 
class Account {
    private long Acc_no;
    private String name, email;
    private float amount;

    public long getAcc_no() {
        return Acc_no;
    }

    public void setAcc_no(long Acc_no) {
        this.Acc_no = Acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }
}

public class Test {
    public static void main(String args[]) {
        Account acc = new Account();
        acc.setAcc_no(2549565658L);
        acc.setName("santhosh");
        acc.setEmail("santhosh@gmail.com");
        acc.setAmount(560000f);
        System.out.println(
                "Name:" + acc.getName() + "\n" + "Acc_no:" + acc.getAcc_no() + "\n" + "Email:" + acc.getEmail() + "\n"
                        + "Amount:" + acc.getAmount());
    }
}
