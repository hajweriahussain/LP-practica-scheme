from antlr4 import *
from schemeLexer import schemeLexer
from schemeParser import schemeParser
from schemeVisitor import schemeVisitor
from EvalVisitor import EvalVisitor

input_stream = InputStream(input('? '))
lexer = schemeLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = schemeParser(token_stream)
tree = parser.root()
print(tree.toStringTree(recog=parser))

visitor = EvalVisitor()
result = visitor.visit(tree)

print (result)
