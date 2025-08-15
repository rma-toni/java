package JavaBasics;

public class VarType {
    public static void main(String[] args) {
        //You can use the var type to declare a local variable.
        //The compiler decide what is the real typo of the variable.

        //ex

        var number = 321;
        var phrase = "Hello";
        var bool = 32.4f;

        //Restrictions:
        //Only for local variables declared in methods, constructors and initializer blocks
        //var cannot be used for fields(parameters)
        //The compiler must be able to choose a type when the variable is declared

    }
}
