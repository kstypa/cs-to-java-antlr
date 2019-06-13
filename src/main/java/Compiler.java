import antlr4.CSLexer;
import main.java.antlr4.CSParserBaseListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;

public class Compiler {
    public static void compileCode(String sourceCode, BufferedWriter writer) {
        CommonTokenStream tokens = createToken(sourceCode);

        antlr4.CSParser parser = new antlr4.CSParser(tokens);
        ParseTree parseTree = parser.file();
        int size = 1024;
        generateOutput(writer, parseTree, size);

    }

    private static CommonTokenStream createToken(String code) {
        CharStream stream = new ANTLRInputStream(code);
        CSLexer lexer = new CSLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return tokens;
    }

    private static void generateOutput(BufferedWriter writer, ParseTree tree, int size) {
        CSParserBaseListener listener = new CSParserBaseListener(writer, size);
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(listener, tree);
    }
}