# Makefile per compilar la gramàtica amb ANTLR i netejar els fitxers generats
# Compila la gramàtica amb ANTLR
antlr:
	java -jar antlr-4.13.2-complete.jar -Dlanguage=Python3 -visitor -no-listener scheme.g4


# Elimina els fitxers generats per ANTLR, però conserva EvalVisitor.py
clean:
	# Eliminar archivos .class generados
	rm -f *.class

	# Eliminar archivos .tokens generados
	rm -f *.tokens

	# Eliminar archivos .interp generados
	rm -f *.interp

	# Eliminar archivos .java generados
	rm -f *.java

	rm -f schemeLexer.py schemeParser.py schemeVisitor.py schemeListener.py

	# Eliminar directorios "__pycache__"
	rm -rf __pycache__

	# Eliminar archivos Python compilados (*.pyc), pero excluir scheme.py
	find . -type f -name "*.pyc" -exec rm -f {} \;

# Comanda per defecte
all: antlr
