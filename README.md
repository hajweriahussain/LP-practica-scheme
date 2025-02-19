
# Interpret Scheme

Scheme és un llenguatge de programació senzill i flexible, basat en expressions i funcions. Aquest intèrpret permet executar codi Scheme, incloent-hi operacions amb funcions de primer ordre, manipulació de llistes i control condicional. Amb suport per a diverses funcionalitats bàsiques de Scheme estàndard, és ideal per a l'aprenentatge i l'exploració de conceptes de programació

## Ús
Per utilitzar l'intèrpret de Scheme, segueix aquests passos:

1. **Compila l'intèrpret**  
   Utilitza la comanda següent per compilar l'intèrpret:
   ```bash
   make
2. **Executa l'intèrpret**  
Pots executar-lo amb un fitxer Scheme específic o directament per introduir codi de manera interactiva.

- Executar amb un fitxer Scheme (`.scm`)
    ```bash
    python3 scheme.py fitxer.scm
    ```
- Executar de manera interactiva
    ```bash
    python3 scheme.py 
    ```
3. **Clean del projecte**
Si necessites esborrar els arxius generats per ANTLR executa:
```bash
make clean
```
## Estructura del projecte
- `scheme.g4`: Gramàtica de Mini Scheme per a ANTLR.
- `scheme.py`: Programa principal de l'intèrpret.
- `EvalVisitor.py`: Implementació del visitador per avaluar l'AST.
- `Makefile`: Fitxer per generar el lexer i el parser.
- `test_*.scm`: Conjunts de proves que inclouen exemples de programes escrits en Scheme.
- `entrada_*.inp`: Fitxers que inclouen els valors o dades que el programa necessita com a entrada durant la seva execució. Per exemple, si el codi utilitza la funció `read`, aquests fitxers contindran els valors que l'intèrpret llegirà.
- `sortida_*.out`: Fitxers on es desa la sortida generada després d'executar el programa Scheme amb una entrada determinada.

## Descripció de la gramàtica

La regla `root` representa el punt d'entrada del programa, permetent una seqüència opcional de declaracions (statement) seguida del final de fitxer (`EOF`). La regla `statement` inclou tres branques:   
- **ExpressionStatement**  
    Representa qualsevol expressió que no estigui vinculada directament a la declaració d'una variable o funció. Aquest tipus de declaració permet executar expressions que poden retornar valors sense la necessitat de fer assignacions. Aquesta esta formada per la regla `expression`que explicaré més endavant.  
- **DefineVar** 
    Les declaracions de variables associen un identificador (VAR) a un valor mitjançant la paraula clau define. Aquesta forma només admet una expressió única com a valor assignat.  
- **DefineFunction**: 
    Les definicions de funcions permeten declarar funcions amb paràmetres i un o més cossos d'expressió. Les funcions definides poden ser cridades més tard, i s'executaran amb els arguments proporcionats. Cada crida de funció genera un nou entorn d'execució que mapeja els paràmetres als valors passats.

He decidit separar les declaracions (statement) de les expressions generals perque crec que es diferencien en el fet de si són estructures que afecten l'entorn o el context del programa, com ara definir variables (DefineVar) o funcions (DefineFunction). Aquestes no produeixen un valor directament, sinó que creen associacions de noms o funcionalitats reutilitzables.

La regla `expression` te diferents branques.
- **VAR (Variable)** 
    Aquesta regla defineix el patró per als noms de variables vàlids en Scheme. Una variable ha de començar amb una lletra (majúscula o minúscula) o un guió baix (_) i pot incloure lletres, números, guions baixos (_), guions (-) o símbols de pregunta (?) després del primer caràcter. 
- **NUM (Nombre)** 
    Aquesta regla identifica nombres enters. Un nombre pot incloure un signe negatiu (-) al principi per indicar valors negatius, seguit d'una o més xifres (0-9). No es consideren nombres decimals ni formats avançats, ja que es limita a valors enters.
- **STRING (Cadena de text)** 
    Aquesta regla descriu les cadenes de text, delimitades per cometes dobles ("). El contingut de la cadena pot incloure qualsevol caràcter excepte cometes dobles (") o salts de línia (\r o \n). Això permet treballar amb textos en les expressions sense trencar la sintaxi del llenguatge.

- **Operacions bàsiques**
    ```bash
    LPAREN operation expression+ RPAREN 
    ```
    Representa operacions aritmètiques o comparatives que impliquen un operador (operation) seguit d'una o més expressions com a operands, delimitats per parèntesis.
    
    ```scheme
    (+ 10 20) ; Hauria d'imprimir 30
    (- -20 5) ; Hauria d'imprimir -25
    ```
    Per a provar aquesta funcionalitat: `testOp.scm`

- **Definició de variables**  
    ```bash
    LPAREN DEFINE VAR expression RPAREN 
    ```
    Es poden definir variables o constants utilitzant define, que emmagatzema valors per a un ús posterior. 

    ```scheme
    ; Definició d'una constant
    (define x 5)
    (define y "Hola, mundo")
    ```
    Per a provar aquesta funcionalitat: `testVars.scm`

- **Definició de funcions** 
    ```bash
    LPAREN DEFINE LPAREN VAR VAR* RPAREN expression+ RPAREN 
    ``` 
    És possible definir funcions personalitzades amb paràmetres i cossos d'expressió. Aquestes funcions es poden cridar posteriorment amb els arguments adequats. El sistema gestiona automàticament els escenaris d'assignació de paràmetres a valors i manté un entorn independent per a cada crida.

    ```scheme
    ; Definició d'una funció
    (define (suma a b) (+ a b))
    (display (suma 5 10)) ; Hauria d'imprimir 15
    ```
    Per a provar aquesta funcionalitat: `testFuncions.scm`
    - **Recursivitat**  
    També es poden implementar funcions recursives.
    ```scheme
    (define (suma-llista llista)
        (if (null? llista)
            0
            (+ (car llista) (suma-llista (cdr llista)))))
    ```

    Per a provar aquesta funcionalitat: `testRec.scm`
    - **Funcions d'ordre superior**
    A més, també podem tenir funcions d'ordre superior.
    ```scheme
    (define (aplica-dos-cops f x)
        (f (f x)))

    (define (dobla x) (* x 2))
    (aplica-dos-cops dobla 5)  ; Resultat: 20
    ```
    Per a provar aquesta funcionalitat: `testFuncionesPO.scm`

- **Condicionals**
    ```bash
    LPAREN IF expression expression expression RPAREN
    ``` 
    Una estructura condicional que avalua una expressió de condició. Si és certa, retorna la segona expressió; en cas contrari, retorna la tercera. Permet executar diferents camins d'execució segons una condició.
    ```scheme
    (display (if (= 1 1) "Cert" "Fals")) ; Hauria d'imprimir "Cert"
    ```

    Per a provar aquesta funcionalitat: `testIfCond.scm`
- **Condicions múltiples amb `cond`**  
    ```bash
    LPAREN COND condClause+ RPAREN 
    ``` 
    Permet avaluar múltiples condicions mitjançant la forma cond, on cada condClause conté una condició i una expressió associada. Retorna la primera expressió associada a una condició certa.. Proporciona una estructura avançada per avaluar múltiples condicions fins que una sigui certa.
    ```scheme
    ; Ús de `cond`
    (define (classifica-nombre x)
    (cond
        ((< x 0) "Negatiu")
        ((= x 0) "Zero")
        (else "Positiu")))
    (display (classifica-nombre -5)) ; Hauria d'imprimir "Negatiu"
    ```
    Per a provar aquesta funcionalitat: `testIfCond.scm`
- **Llistes**  
    ```bash
    LPAREN CAR expression RPAREN
    LPAREN CDR expression RPAREN
    LPAREN CONS expression expression RPAREN
    LPAREN NULL expression RPAREN 
    SLASH LPAREN expression* RPAREN  
    ``` 
    
    L'intèrpret implementa funcions fonamentals per a la manipulació de llistes, com ara:

    - **car**: Obté el primer element d'una llista.
    - **cdr**: Retorna la llista sense el primer element.
    - **cons**: Afegeix un element al principi d'una llista.
    - **null?**: Verifica si una llista és buida.

    ```scheme
    ; Crear una llista i manipular-la
    (display (cons 1 '(2 3 4))) ; Hauria d'imprimir '(1 2 3 4)

    (display (car '(10 20 30))) ; Hauria d'imprimir 10

    (display (cdr '(10 20 30))) ; Hauria d'imprimir '(20 30)

    (display (null? '())) ; Hauria d'imprimir #t
    (display (null? '(1 2))) ; Hauria d'imprimir #f
    ```
    Per a provar aquesta funcionalitat: `testLists.scm`

- **Expressions `let`**  
    ```bash
    LPAREN LET LPAREN letPair+ RPAREN expression+ RPAREN
    ``` 
    Defineix variables locals dins d'un bloc let, on cada letPair associa un identificador amb una expressió. Aquestes variables són accessibles només dins del bloc. 
    ```scheme
    (let ((a 10)
         (b 20))
    (display "La suma és: ")
    (display (+ a b))
    (newline))
    ```
    Per a provar aquesta funcionalitat: `testLet.scm`

- **Gestió d'Entrada/Sortida**  
    ```bash
    LPAREN DISPLAY expression RPAREN
    LPAREN NEWLINE RPAREN
    LPAREN READ RPAREN
    ``` 
    - **read**: Llegeix entrades de l'usuari en temps d'execució, suportant valors simples i llistes en format Scheme.
    - **display**: Imprimeix valors a la consola, incloent llistes formatades en estil Scheme.
    - **newline**: Genera un salt de línia.

    ```scheme
    (define (sumar-dos-valors)
    (display "Introdueix dos valors: ")
    (let ((val1 (read))
            (val2 (read)))
        (display "La suma és: ")
        (display (+ val1 val2))
        (newline)))
    ```

    Per a provar aquesta funcionalitat: `testIO.scm` amb la seva corresponent `testIO_entrada.inp`
    En el cas del read, es pot verificar el que hauria de sortir en el fitxer `testIO_sortida.out`

- **Booleans** 
    ```bash
    LPAREN AND expression+ RPAREN                         
    LPAREN OR expression+ RPAREN
    LPAREN NOT expression RPAREN   
    ``` 
    ```scheme
    (and (> 3 2) (< 5 10))  ; Resultat: #t
    (or (> 3 2) (< 1 0))    ; Resultat: #t
    (not (> 3 2))           ; Resultat: #f
    ```
    Per a provar aquesta funcionalitat: `testExpr.scm`

## Nota al corrector

### Implementacions Extra
Voldria destacar algunes petites millores extres que he fet. 
- **Lectura de Llistes amb read:**  
    La funció read ara és capaç de reconèixer i processar llistes escrites en format Scheme. Això permet introduir llistes directament durant l'execució, convertint-les automàticament a estructures de dades adequades per a la seva manipulació interna. 

- **Gestió de Llistes en Format Scheme:**  
    Les llistes es mostren en el format tradicional de Scheme (element1 element2 ...), en lloc del format per defecte de Python [element1, element2, ...].

- **Missatges d'error:**  
    S'han afegit missatges d'error clars i detallats per millorar l'experiència de depuració. Per exemple, errors específics com "Divisió per zero" o "Variable no definida" ara es reporten.

### Limitaciones
Actualment l'interpret no dona suport per a llistes de llistes.