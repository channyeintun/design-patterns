package reducingIfElse;

public interface Rule {

    boolean evaluate(Expression expression);

    Result getResult();
}
