; Crear una llista i manipular-la
(display (cons 1 '(2 3 4))) ; Hauria d'imprimir '(1 2 3 4)
(newline)

(display (car '(10 20 30))) ; Hauria d'imprimir 10
(newline)

(display (cdr '(10 20 30))) ; Hauria d'imprimir '(20 30)
(newline)

(display (null? '())) ; Hauria d'imprimir #t
(display (null? '(1 2))) ; Hauria d'imprimir #f
(newline)

; Funció per calcular la llargada d'una llista
(define (length lst)
  (if (null? lst)
      0
      (+ 1 (length (cdr lst)))))

(display "Longitud d'una llista:")
(display (length '(10 20 30 40 50))) ; Hauria d'imprimir 5
(newline)

; Funció per verificar si un element és a una llista
(define (element-a-la-llista? element lst)
  (if (null? lst)
      "#f"
      (if (= element (car lst))
          "#t"
          (element-a-la-llista? element (cdr lst)))))

(display "És '3' a la llista '(1 2 3 4)? ")
(display (element-a-la-llista? 3 '(1 2 3 4))) ; Hauria d'imprimir #t
(newline)

(display "És '5' a la llista '(1 2 3 4)? ")
(display (element-a-la-llista? 5 '(1 2 3 4))) ; Hauria d'imprimir #f
(newline)
