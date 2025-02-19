; Definir una funció que suma dos nombres
(define (suma a b) (+ a b))
(display (suma 5 10)) ; Hauria d'imprimir 15
(newline)

; Definir una funció que multiplica tres nombres
(define (multiplica a b c) (* (* a b) c))
(display (multiplica 2 3 4)) ; Hauria d'imprimir 24
(newline)

; Cas extrem: funció sense paràmetres
(define (constant) 42)
(display (constant)) ; Hauria d'imprimir 42
(newline)

; Funció amb una llista com a argument
(define (suma-llista lst)
  (if (null? lst)
      0
      (+ (car lst) (suma-llista (cdr lst)))))
(display (suma-llista '(1 2 3 4 5))) ; Hauria d'imprimir 15
(newline)

; Funció amb condicional
(define (es-par x) 
  (if (= (mod x 2) 0) 
      "#t" 
      "#f"))
(display (es-par 10)) ; Hauria d'imprimir #t
(newline)
(display (es-par 7)) ; Hauria d'imprimir #f
(newline)