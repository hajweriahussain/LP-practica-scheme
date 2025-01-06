from antlr4 import *
from schemeLexer import schemeLexer
from schemeParser import schemeParser
from EvalVisitor import EvalVisitor
import sys

def run_interpreter():
    """Executa el intérpret interactiu per a Scheme."""
    print("MiniScheme Interpreter. Escriu 'exit' per sortir.")
    visitor = EvalVisitor()
    while True:
        try:
            line = input(">> ").strip()
            if line.lower() == "exit":
                break
            if line == "":
                continue
            
            # Crear el lexer y parser desde la línea de entrada
            input_stream = InputStream(line)
            lexer = schemeLexer(input_stream)
            token_stream = CommonTokenStream(lexer)
            parser = schemeParser(token_stream)
            tree = parser.root()
            
            # Visitar el árbol sintáctico
            result = visitor.visit(tree)
            if result is not None:  # Mostrar el resultado si existe
                print(result)
        except Exception as e:
            print(f"Error: {e}")

def main():
    if len(sys.argv) > 2:
        print("Usage: python3 scheme.py [<fitxer.scm>]")
        sys.exit(1)

    if len(sys.argv) == 2:
        filename = sys.argv[1]
        try:
            # Leer el archivo .scm
            input_stream = FileStream(filename, encoding='utf-8')
        except FileNotFoundError:
            print(f"Fitxer {filename} no trobat.")
            sys.exit(1)

        lexer = schemeLexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        parser = schemeParser(token_stream)
        tree = parser.root()

        # print(tree.toStringTree(recog=parser))  # Opcional: Muestra el árbol sintáctico.

        visitor = EvalVisitor()
        try:
            result = visitor.visit(tree)
            if result is not None:  # Muestra el resultado si existe
                print(result)
        except Exception as e:
            print(f"Error: {e}")
    else:
        # No se pasó archivo, ejecuta el intérprete interactivo
        run_interpreter()

if __name__ == "__main__":
    main()
