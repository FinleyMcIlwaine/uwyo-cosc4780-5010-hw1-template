import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import bnfc.calc.Yylex;
import bnfc.calc.parser;

class Main {
    public static void main(String[] args) {
        Yylex l;
        parser p;
        Reader input = new InputStreamReader(System.in);
        l = new Yylex(input);
        p = new parser(l, l.getSymbolFactory());
        bnfc.calc.Absyn.Exp ast;
        try {
            ast = p.pExp();
            // Evaluate here!
        } catch (IOException e) {
            System.err.println("i/o error! oh no!");
            System.exit(1);
        } catch (Throwable e) {
            System.err.println("parse error (or something else)! try testing with the bnfc generated modules (`make parse`)");
            e.printStackTrace();
            System.exit(1);
        }
    }
}