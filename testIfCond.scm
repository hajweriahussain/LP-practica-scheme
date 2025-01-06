; Condicional simple
(display (if (= 1 1) "Cert" "Fals")) ; Hauria d'imprimir "Cert"
(newline)

; Condicional complex
(define (és-parell? x) (if (= (mod x 2) 0) "#t" "#f"))
(display (és-parell? 4)) ; Hauria d'imprimir #t
(display (és-parell? 5)) ; Hauria d'imprimir #f
(newline)

; Ús de `cond`
(define (classifica-nombre x)
  (cond
    ((< x 0) "Negatiu")
    ((= x 0) "Zero")
    (else "Positiu")))
(display (classifica-nombre -5)) ; Hauria d'imprimir "Negatiu"
(display (classifica-nombre 0)) ; Hauria d'imprimir "Zero"
(display (classifica-nombre 7)) ; Hauria d'imprimir "Positiu"
(newline)
