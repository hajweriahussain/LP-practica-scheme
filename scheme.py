from antlr4 import *
from schemeLexer import schemeLexer
from schemeParser import schemeParser
from EvalVisitor import EvalVisitor
import sys

def main():
    if len(sys.argv) != 2:
        print("Usage: python3 scheme.py <filename.scm>")
        sys.exit(1)

    filename = sys.argv[1]
    
    try:
        # Utilizar FileStream para leer el archivo
        input_stream = FileStream(filename, encoding='utf-8')
    except FileNotFoundError:
        print(f"File {filename} not found.")
        sys.exit(1)

    lexer = schemeLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = schemeParser(token_stream)
    tree = parser.root()

    print(tree.toStringTree(recog=parser))  # Opcional: Muestra el árbol sintáctico.

    visitor = EvalVisitor()
    result = visitor.visit(tree)

    print(result)

if __name__ == "__main__":
    main()