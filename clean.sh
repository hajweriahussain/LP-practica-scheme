#!/bin/bash

# Eliminar archivos .class generados
rm -f *.class

# Eliminar archivos .tokens generados
rm -f *.tokens

# Eliminar archivos .interp generados
rm -f *.interp

# Eliminar archivos .java generados
rm -f *.java

rm -f schemeLexer.py schemeParser.py schemeVisitor.py

# Eliminar directorios "__pycache__"
rm -rf __pycache__

# Eliminar archivos Python compilados (*.pyc), pero excluir scheme.py
find . -type f -name "*.pyc" -exec rm -f {} \;

echo "Archivos generados por ANTLR eliminados, excepto scheme.py"