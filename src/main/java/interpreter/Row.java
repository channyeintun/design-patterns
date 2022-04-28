package interpreter;

class Row {

    private String name;
    private String phone;

    Row(String name, String surname) {
        this.name = name;
        this.phone = surname;
    }

    @Override
    public String toString() {
        return name + " " + phone;
    }
}